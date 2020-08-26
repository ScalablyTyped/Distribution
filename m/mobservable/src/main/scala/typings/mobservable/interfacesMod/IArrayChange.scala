package typings.mobservable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArrayChange[T] extends js.Object {
  var index: Double = js.native
  var `object`: IObservableArray[T] = js.native
  var oldValue: T = js.native
  var `type`: String = js.native
}

object IArrayChange {
  @scala.inline
  def apply[T](index: Double, `object`: IObservableArray[T], oldValue: T, `type`: String): IArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayChange[T]]
  }
  @scala.inline
  implicit class IArrayChangeOps[Self <: IArrayChange[_], T] (val x: Self with IArrayChange[T]) extends AnyVal {
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
    def setObject(value: IObservableArray[T]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: T): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

