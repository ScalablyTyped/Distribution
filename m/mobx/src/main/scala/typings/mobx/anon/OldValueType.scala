package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldValueType[T] extends ISetWillChange[T] {
  var `object`: ObservableSet[T] = js.native
  var oldValue: T = js.native
  var `type`: delete = js.native
}

object OldValueType {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): OldValueType[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValueType[T]]
  }
  @scala.inline
  implicit class OldValueTypeOps[Self <: OldValueType[_], T] (val x: Self with OldValueType[T]) extends AnyVal {
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
    def setObject(value: ObservableSet[T]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: T): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: delete): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

