package typings
package officeDashUiDashFabricDashReactLib.libComponentsComboBoxComboBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxState extends js.Object {
  /** The options currently available for the callout */
  var currentOptions: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxOption
  ]
  /** When taking input, this will store the actual text that is being entered */
  var currentPendingValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When taking input, this will store the index that the options input matches
    * (-1 if no input or match)
    */
  var currentPendingValueValidIndex: scala.Double
  /**
    * Stores the hovered over value in the dropdown
    * (used for styling the options without updating the input)
    */
  var currentPendingValueValidIndexOnHover: scala.Double
  /** The focused state of the comboBox */
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  /** The open state */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** The currently selected indices */
  var selectedIndices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** This value is used for the autocomplete hint value */
  var suggestedDisplayValue: js.UndefOr[java.lang.String] = js.undefined
}

