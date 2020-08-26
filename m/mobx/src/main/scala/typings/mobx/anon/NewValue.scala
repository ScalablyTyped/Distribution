package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewValue[K, V] extends IMapDidChange[K, V] {
  var name: K = js.native
  var newValue: V = js.native
  var `object`: ObservableMap[K, V] = js.native
  var `type`: add = js.native
}

object NewValue {
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): NewValue[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue[K, V]]
  }
  @scala.inline
  implicit class NewValueOps[Self <: NewValue[_, _], K, V] (val x: Self with (NewValue[K, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: V): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ObservableMap[K, V]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: add): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

