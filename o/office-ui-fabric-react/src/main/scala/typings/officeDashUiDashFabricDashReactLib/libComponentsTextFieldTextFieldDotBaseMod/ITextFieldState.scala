package typings
package officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldState extends js.Object {
  /**
    * The validation error message.
    *
    * - If there is no validation error or we have not validated the input value, errorMessage is an empty string.
    * - If we have done the validation and there is validation error, errorMessage is the validation error message.
    */
  var errorMessage: java.lang.String
  /** Is true when the control has focus. */
  var isFocused: scala.Boolean
  var value: java.lang.String
}

