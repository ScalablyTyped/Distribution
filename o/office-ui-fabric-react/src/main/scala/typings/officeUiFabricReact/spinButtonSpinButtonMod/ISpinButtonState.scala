package typings.officeUiFabricReact.spinButtonSpinButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButtonState extends js.Object {
  /**
    * Is true when the control has focus.
    */
  var isFocused: Boolean
  /**
    * keyboard spin direction, used to style the up or down button
    * as active when up/down arrow is pressed
    */
  var keyboardSpinDirection: KeyboardSpinDirection
  /**
    * the value of the spin button
    */
  var value: String
}

object ISpinButtonState {
  @scala.inline
  def apply(isFocused: Boolean, keyboardSpinDirection: KeyboardSpinDirection, value: String): ISpinButtonState = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], keyboardSpinDirection = keyboardSpinDirection.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonState]
  }
}

