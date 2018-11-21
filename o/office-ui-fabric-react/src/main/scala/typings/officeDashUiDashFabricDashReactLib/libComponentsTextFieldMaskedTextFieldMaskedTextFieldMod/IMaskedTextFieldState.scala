package typings
package officeDashUiDashFabricDashReactLib.libComponentsTextFieldMaskedTextFieldMaskedTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMaskedTextFieldState extends js.Object {
  /**
       * The mask string formatted with the input value.
       * This is what is displayed inside the TextField
       * Example:
       *  'Phone Number: 12_ - 4___'
       */
  var displayValue: java.lang.String
  /** The index into the rendered value of the first unfilled format character */
  var maskCursorPosition: js.UndefOr[scala.Double] = js.undefined
}

