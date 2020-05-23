package typings.officeUiFabricReact.comboBoxTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    callout: js.UndefOr[Null | IStyle] = js.undefined,
    container: js.UndefOr[Null | IStyle] = js.undefined,
    divider: js.UndefOr[Null | IStyle] = js.undefined,
    errorMessage: js.UndefOr[Null | IStyle] = js.undefined,
    header: js.UndefOr[Null | IStyle] = js.undefined,
    input: js.UndefOr[Null | IStyle] = js.undefined,
    inputDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    labelDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    optionsContainer: js.UndefOr[Null | IStyle] = js.undefined,
    optionsContainerWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    rootDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    rootDisallowFreeForm: js.UndefOr[Null | IStyle] = js.undefined,
    rootError: js.UndefOr[Null | IStyle] = js.undefined,
    rootFocused: js.UndefOr[Null | IStyle] = js.undefined,
    rootHovered: js.UndefOr[Null | IStyle] = js.undefined,
    rootPressed: js.UndefOr[Null | IStyle] = js.undefined,
    screenReaderText: js.UndefOr[Null | IStyle] = js.undefined
  ): IComboBoxStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (!js.isUndefined(errorMessage)) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(inputDisabled)) __obj.updateDynamic("inputDisabled")(inputDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelDisabled)) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsContainer)) __obj.updateDynamic("optionsContainer")(optionsContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsContainerWrapper)) __obj.updateDynamic("optionsContainerWrapper")(optionsContainerWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rootDisabled)) __obj.updateDynamic("rootDisabled")(rootDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(rootDisallowFreeForm)) __obj.updateDynamic("rootDisallowFreeForm")(rootDisallowFreeForm.asInstanceOf[js.Any])
    if (!js.isUndefined(rootError)) __obj.updateDynamic("rootError")(rootError.asInstanceOf[js.Any])
    if (!js.isUndefined(rootFocused)) __obj.updateDynamic("rootFocused")(rootFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(rootHovered)) __obj.updateDynamic("rootHovered")(rootHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(rootPressed)) __obj.updateDynamic("rootPressed")(rootPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderText)) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxStyles]
  }
}

