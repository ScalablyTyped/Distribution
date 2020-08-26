package typings.officeUiFabricReact.datePickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePicker extends js.Object {
  /** Sets focus to the text field */
  def focus(): Unit = js.native
  /** Reset the state of the picker to the default */
  def reset(): Unit = js.native
}

object IDatePicker {
  @scala.inline
  def apply(focus: () => Unit, reset: () => Unit): IDatePicker = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IDatePicker]
  }
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

