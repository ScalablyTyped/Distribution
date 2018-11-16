package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISpinButtonState extends js.Object {
  /**
       * Is true when the control has focus.
       */
  var isFocused: scala.Boolean
  /**
       * keyboard spin direction, used to style the up or down button
       * as active when up/down arrow is pressed
       */
  var keyboardSpinDirection: KeyboardSpinDirection
  /**
       * The calculated precision for the value.
       */
  var precision: scala.Double
  /**
       * the value of the spin button
       */
  var value: java.lang.String
}

