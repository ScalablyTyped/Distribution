package typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxStyles extends js.Object {
  /**
    * Styles for the callout.
    */
  var callout: IStyle
  /**
    * Style for the container which has the ComboBox and the label
    */
  var container: IStyle
  /**
    * Styles for a divider in the options.
    */
  var divider: IStyle
  /**
    * Styles for the error Message text of the comboBox.
    */
  var errorMessage: IStyle
  /**
    * Styles for a header in the options.
    */
  var header: IStyle
  /**
    * Base styles for the input element - which contains the currently selected
    * option.
    */
  var input: IStyle
  /**
    * Style override for the input element when comboBox is disabled.
    */
  var inputDisabled: IStyle
  /**
    * Style for the label element of the ComboBox.
    */
  var label: IStyle
  /**
    * Style for the label element of the ComboBox in the disabled state.
    */
  var labelDisabled: IStyle
  /**
    * Styles for the container of all the Combobox options
    * Includes the headers and dividers.
    */
  var optionsContainer: IStyle
  /**
    * Styles for the optionsContainerWrapper.
    */
  var optionsContainerWrapper: IStyle
  /**
    * Base styles for the root element of all ComboBoxes.
    */
  var root: IStyle
  /**
    * Styles for when the comboBox is disabled. These styles override all the other styles.
    * NOTE : Hover (or) Focused (or) active styles are not applied for disabled comboBoxes.
    */
  var rootDisabled: IStyle
  /**
    * Styles for variant of ComboBox where allowFreeForm is false in the props.
    */
  var rootDisallowFreeForm: IStyle
  /**
    * Styles for the root element for variant of ComboBox with an errorMessage in the props.
    */
  var rootError: IStyle
  /**
    * Styles for when the ComboBox is focused. These styles are applied for all comboBoxes except when
    * the comboBox is disabled.
    */
  var rootFocused: IStyle
  /**
    * Styles for when the ComboBox is hovered. These styles are applied for all comboBoxes except when
    * the comboBox is disabled.
    */
  var rootHovered: IStyle
  /**
    * Styles for when the ComboBox is active. These styles are applied for all comboBoxes except when
    * the comboBox is disabled.
    */
  var rootPressed: IStyle
  /**
    * Styles for hidden screen reader text.
    */
  var screenReaderText: IStyle
}

object IComboBoxStyles {
  @scala.inline
  def apply(
    callout: IStyle = null,
    container: IStyle = null,
    divider: IStyle = null,
    errorMessage: IStyle = null,
    header: IStyle = null,
    input: IStyle = null,
    inputDisabled: IStyle = null,
    label: IStyle = null,
    labelDisabled: IStyle = null,
    optionsContainer: IStyle = null,
    optionsContainerWrapper: IStyle = null,
    root: IStyle = null,
    rootDisabled: IStyle = null,
    rootDisallowFreeForm: IStyle = null,
    rootError: IStyle = null,
    rootFocused: IStyle = null,
    rootHovered: IStyle = null,
    rootPressed: IStyle = null,
    screenReaderText: IStyle = null
  ): IComboBoxStyles = {
    val __obj = js.Dynamic.literal()
    if (callout != null) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputDisabled != null) __obj.updateDynamic("inputDisabled")(inputDisabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelDisabled != null) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (optionsContainer != null) __obj.updateDynamic("optionsContainer")(optionsContainer.asInstanceOf[js.Any])
    if (optionsContainerWrapper != null) __obj.updateDynamic("optionsContainerWrapper")(optionsContainerWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootDisabled != null) __obj.updateDynamic("rootDisabled")(rootDisabled.asInstanceOf[js.Any])
    if (rootDisallowFreeForm != null) __obj.updateDynamic("rootDisallowFreeForm")(rootDisallowFreeForm.asInstanceOf[js.Any])
    if (rootError != null) __obj.updateDynamic("rootError")(rootError.asInstanceOf[js.Any])
    if (rootFocused != null) __obj.updateDynamic("rootFocused")(rootFocused.asInstanceOf[js.Any])
    if (rootHovered != null) __obj.updateDynamic("rootHovered")(rootHovered.asInstanceOf[js.Any])
    if (rootPressed != null) __obj.updateDynamic("rootPressed")(rootPressed.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxStyles]
  }
}

