package typings
package officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutofill extends js.Object {
  /**
    * The current index of the cursor in the input area. Returns -1 if the input element
    * is not ready.
    */
  var cursorLocation: scala.Double | scala.Null
  /**
    * The current input element.
    */
  var inputElement: reactLib.HTMLInputElement | scala.Null
  /**
    * A boolean for whether or not there is a value selected in the input area.
    */
  var isValueSelected: scala.Boolean
  /**
    * the current index of where the selection ends. Returns -1 if the input element
    * is not ready.
    */
  var selectionEnd: scala.Double | scala.Null
  /**
    * The current index of where the selection starts. Returns -1 if the input element
    * is not ready.
    */
  var selectionStart: scala.Double | scala.Null
  /**
    * The current text value that the user has entered.
    */
  var value: java.lang.String
  /**
    * Clear all text in the input. Sets value to '';
    */
  def clear(): scala.Unit
  /**
    * Focus the input element.
    */
  def focus(): scala.Unit
}

