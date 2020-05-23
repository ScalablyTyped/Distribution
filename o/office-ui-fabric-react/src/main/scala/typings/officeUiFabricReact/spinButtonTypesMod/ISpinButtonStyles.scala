package typings.officeUiFabricReact.spinButtonTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButtonStyles extends js.Object {
  /**
    * Styles for the arrowButtonsContainer
    */
  var arrowButtonsContainer: IStyle
  /**
    * Style override for the arrowButtonsContainer when control is disabled.
    */
  var arrowButtonsContainerDisabled: IStyle
  /**
    * Style for the icon.
    */
  var icon: IStyle
  /**
    * Style for the icon when the control is disabled.
    */
  var iconDisabled: IStyle
  /**
    * Styles for the input.
    */
  var input: IStyle
  /**
    * Style override when control is disabled.
    */
  var inputDisabled: IStyle
  /**
    * Style override for ::selection
    */
  var inputTextSelected: IStyle
  /**
    * Style for the label text.
    */
  var label: IStyle
  /**
    * Style for the label text when the control is disabled.
    * @deprecated Disabled styles taken care by `Label` component.
    */
  var labelDisabled: IStyle
  /**
    * Style for the label wrapper element, which contains the icon and label.
    */
  var labelWrapper: IStyle
  /**
    * Style override when the label is positioned at the bottom.
    */
  var labelWrapperBottom: IStyle
  /**
    * Style override when the label is positioned at the end.
    */
  var labelWrapperEnd: IStyle
  /**
    * Style override when the label is positioned at the start.
    */
  var labelWrapperStart: IStyle
  /**
    * Style override when the label is positioned at the top.
    */
  var labelWrapperTop: IStyle
  /**
    * Styles for the root of the component.
    */
  var root: IStyle
  /**
    * Style for the wrapper element of the input field and arrow buttons.
    */
  var spinButtonWrapper: IStyle
  /**
    * Style override when control is disabled.
    */
  var spinButtonWrapperDisabled: IStyle
  /**
    * Style override when SpinButton is enabled/focused.
    */
  var spinButtonWrapperFocused: IStyle
  /**
    * Style override when control is enabled/hovered.
    */
  var spinButtonWrapperHovered: IStyle
  /**
    * Style override when label is positioned at the top/bottom.
    */
  var spinButtonWrapperTopBottom: IStyle
}

object ISpinButtonStyles {
  @scala.inline
  def apply(
    arrowButtonsContainer: js.UndefOr[Null | IStyle] = js.undefined,
    arrowButtonsContainerDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    iconDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    input: js.UndefOr[Null | IStyle] = js.undefined,
    inputDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    inputTextSelected: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    labelDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    labelWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    labelWrapperBottom: js.UndefOr[Null | IStyle] = js.undefined,
    labelWrapperEnd: js.UndefOr[Null | IStyle] = js.undefined,
    labelWrapperStart: js.UndefOr[Null | IStyle] = js.undefined,
    labelWrapperTop: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    spinButtonWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    spinButtonWrapperDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    spinButtonWrapperFocused: js.UndefOr[Null | IStyle] = js.undefined,
    spinButtonWrapperHovered: js.UndefOr[Null | IStyle] = js.undefined,
    spinButtonWrapperTopBottom: js.UndefOr[Null | IStyle] = js.undefined
  ): ISpinButtonStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowButtonsContainer)) __obj.updateDynamic("arrowButtonsContainer")(arrowButtonsContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowButtonsContainerDisabled)) __obj.updateDynamic("arrowButtonsContainerDisabled")(arrowButtonsContainerDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconDisabled)) __obj.updateDynamic("iconDisabled")(iconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(inputDisabled)) __obj.updateDynamic("inputDisabled")(inputDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(inputTextSelected)) __obj.updateDynamic("inputTextSelected")(inputTextSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelDisabled)) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrapper)) __obj.updateDynamic("labelWrapper")(labelWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrapperBottom)) __obj.updateDynamic("labelWrapperBottom")(labelWrapperBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrapperEnd)) __obj.updateDynamic("labelWrapperEnd")(labelWrapperEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrapperStart)) __obj.updateDynamic("labelWrapperStart")(labelWrapperStart.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrapperTop)) __obj.updateDynamic("labelWrapperTop")(labelWrapperTop.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(spinButtonWrapper)) __obj.updateDynamic("spinButtonWrapper")(spinButtonWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(spinButtonWrapperDisabled)) __obj.updateDynamic("spinButtonWrapperDisabled")(spinButtonWrapperDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(spinButtonWrapperFocused)) __obj.updateDynamic("spinButtonWrapperFocused")(spinButtonWrapperFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(spinButtonWrapperHovered)) __obj.updateDynamic("spinButtonWrapperHovered")(spinButtonWrapperHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(spinButtonWrapperTopBottom)) __obj.updateDynamic("spinButtonWrapperTopBottom")(spinButtonWrapperTopBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonStyles]
  }
}

