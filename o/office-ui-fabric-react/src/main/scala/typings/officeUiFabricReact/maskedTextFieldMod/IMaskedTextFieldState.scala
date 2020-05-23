package typings.officeUiFabricReact.maskedTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaskedTextFieldState extends js.Object {
  /**
    * The mask string formatted with the input value.
    * This is what is displayed inside the TextField
    * @example
    *  `Phone Number: 12_ - 4___`
    */
  var displayValue: String
  /** The index into the rendered value of the first unfilled format character */
  var maskCursorPosition: js.UndefOr[Double] = js.undefined
}

object IMaskedTextFieldState {
  @scala.inline
  def apply(displayValue: String, maskCursorPosition: js.UndefOr[Double] = js.undefined): IMaskedTextFieldState = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any])
    if (!js.isUndefined(maskCursorPosition)) __obj.updateDynamic("maskCursorPosition")(maskCursorPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaskedTextFieldState]
  }
}

