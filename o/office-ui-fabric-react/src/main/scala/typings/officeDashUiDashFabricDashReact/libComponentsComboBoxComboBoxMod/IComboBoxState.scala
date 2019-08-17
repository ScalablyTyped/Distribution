package typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxMod

import typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxState extends js.Object {
  /** The options currently available for the callout */
  var currentOptions: js.Array[IComboBoxOption]
  /** When taking input, this will store the actual text that is being entered */
  var currentPendingValue: js.UndefOr[String] = js.undefined
  /**
    * When taking input, this will store the index that the options input matches
    * (-1 if no input or match)
    */
  var currentPendingValueValidIndex: Double
  /**
    * Stores the hovered over value in the dropdown
    * (used for styling the options without updating the input)
    */
  var currentPendingValueValidIndexOnHover: Double
  /** The focused state of the comboBox */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** The open state */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /** The currently selected indices */
  var selectedIndices: js.UndefOr[js.Array[Double]] = js.undefined
  /** This value is used for the autocomplete hint value */
  var suggestedDisplayValue: js.UndefOr[String] = js.undefined
}

object IComboBoxState {
  @scala.inline
  def apply(
    currentOptions: js.Array[IComboBoxOption],
    currentPendingValueValidIndex: Double,
    currentPendingValueValidIndexOnHover: Double,
    currentPendingValue: String = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    selectedIndices: js.Array[Double] = null,
    suggestedDisplayValue: String = null
  ): IComboBoxState = {
    val __obj = js.Dynamic.literal(currentOptions = currentOptions, currentPendingValueValidIndex = currentPendingValueValidIndex, currentPendingValueValidIndexOnHover = currentPendingValueValidIndexOnHover)
    if (currentPendingValue != null) __obj.updateDynamic("currentPendingValue")(currentPendingValue)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (selectedIndices != null) __obj.updateDynamic("selectedIndices")(selectedIndices)
    if (suggestedDisplayValue != null) __obj.updateDynamic("suggestedDisplayValue")(suggestedDisplayValue)
    __obj.asInstanceOf[IComboBoxState]
  }
}

