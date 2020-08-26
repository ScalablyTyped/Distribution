package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewValueObject[T] extends ISetDidChange[T] {
  var newValue: T = js.native
  var `object`: ObservableSet[T] = js.native
  var `type`: add = js.native
}

object NewValueObject {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): NewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueObject[T]]
  }
  @scala.inline
  implicit class NewValueObjectOps[Self <: NewValueObject[_], T] (val x: Self with NewValueObject[T]) extends AnyVal {
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
    def setNewValue(value: T): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ObservableSet[T]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: add): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

