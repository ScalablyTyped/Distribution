package typings.mobx.observablearrayMod

import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArrayWillChange[T] extends js.Object {
  var index: Double = js.native
  var newValue: T = js.native
  var `object`: IObservableArray[T] = js.native
  var `type`: update = js.native
}

object IArrayWillChange {
  @scala.inline
  def apply[T](index: Double, newValue: T, `object`: IObservableArray[T], `type`: update): IArrayWillChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayWillChange[T]]
  }
  @scala.inline
  implicit class IArrayWillChangeOps[Self <: IArrayWillChange[_], T] (val x: Self with IArrayWillChange[T]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: T): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: IObservableArray[T]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: update): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

