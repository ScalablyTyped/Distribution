package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumber extends js.Object {
  var Value: Double = js.native
  def Clone(): INumber = js.native
}

object INumber {
  @scala.inline
  def apply(Clone: () => INumber, Value: Double): INumber = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
  @scala.inline
  implicit class INumberOps[Self <: INumber] (val x: Self) extends AnyVal {
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
    def setClone(value: () => INumber): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

