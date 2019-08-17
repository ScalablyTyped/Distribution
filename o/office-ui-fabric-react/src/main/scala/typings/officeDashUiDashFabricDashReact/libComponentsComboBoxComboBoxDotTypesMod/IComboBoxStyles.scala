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
}

object IComboBoxStyles {
  @scala.inline
  def apply(
    callout: IStyle,
    container: IStyle,
    divider: IStyle,
    errorMessage: IStyle,
    header: IStyle,
    input: IStyle,
    inputDisabled: IStyle,
    label: IStyle,
    labelDisabled: IStyle,
    optionsContainer: IStyle,
    optionsContainerWrapper: IStyle,
    root: IStyle,
    rootDisabled: IStyle,
    rootDisallowFreeForm: IStyle,
    rootError: IStyle,
    rootFocused: IStyle,
    rootHovered: IStyle,
    rootPressed: IStyle
  ): IComboBoxStyles = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelDisabled = labelDisabled.asInstanceOf[js.Any], optionsContainer = optionsContainer.asInstanceOf[js.Any], optionsContainerWrapper = optionsContainerWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootDisabled = rootDisabled.asInstanceOf[js.Any], rootDisallowFreeForm = rootDisallowFreeForm.asInstanceOf[js.Any], rootError = rootError.asInstanceOf[js.Any], rootFocused = rootFocused.asInstanceOf[js.Any], rootHovered = rootHovered.asInstanceOf[js.Any], rootPressed = rootPressed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IComboBoxStyles]
  }
}

