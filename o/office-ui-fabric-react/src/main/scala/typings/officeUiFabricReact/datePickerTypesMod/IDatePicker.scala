package typings.officeUiFabricReact.datePickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends js.Object {
  /** Sets focus to the text field */
  def focus(): Unit
  /** Reset the state of the picker to the default */
  def reset(): Unit
}

object IDatePicker {
  @scala.inline
  def apply(focus: () => Unit, reset: () => Unit): IDatePicker = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IDatePicker]
  }
}

