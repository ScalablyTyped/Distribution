package typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButtonStyles extends js.Object {
  /**
    * Styles for the arrowButtonsContainer
    */
  var arrowButtonsContainer: IStyle
  /**
    * Style override for the arrowButtonsContainer when spin button is disabled.
    */
  var arrowButtonsContainerDisabled: IStyle
  /**
    * Style for the icon.
    */
  var icon: IStyle
  /**
    * Style for the icon.
    */
  var iconDisabled: IStyle
  /**
    * Styles for the input.
    */
  var input: IStyle
  /**
    * Style override when spinButton is disabled.
    */
  var inputDisabled: IStyle
  /**
    * Style override for ::selection
    */
  var inputTextSelected: IStyle
  /**
    * Style for the label text
    */
  var label: IStyle
  /**
    * Style for the label text
    * @deprecated Disabled styles taken care by `Label` component.
    */
  var labelDisabled: IStyle
  /**
    * Style for the label wrapper element of the component.
    * The label wrapper contains the icon and the label.
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
    * Styles for the root of the spin button component.
    */
  var root: IStyle
  /**
    * Style for spinButtonWrapper when enabled.
    */
  var spinButtonWrapper: IStyle
  /**
    * Style override when spinButton is disabled.
    */
  var spinButtonWrapperDisabled: IStyle
  /**
    * Style override when spinButton is enabled/focused.
    */
  var spinButtonWrapperFocused: IStyle
  /**
    * Style override when spinButton is enabled/hovered.
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
    arrowButtonsContainer: IStyle = null,
    arrowButtonsContainerDisabled: IStyle = null,
    icon: IStyle = null,
    iconDisabled: IStyle = null,
    input: IStyle = null,
    inputDisabled: IStyle = null,
    inputTextSelected: IStyle = null,
    label: IStyle = null,
    labelDisabled: IStyle = null,
    labelWrapper: IStyle = null,
    labelWrapperBottom: IStyle = null,
    labelWrapperEnd: IStyle = null,
    labelWrapperStart: IStyle = null,
    labelWrapperTop: IStyle = null,
    root: IStyle = null,
    spinButtonWrapper: IStyle = null,
    spinButtonWrapperDisabled: IStyle = null,
    spinButtonWrapperFocused: IStyle = null,
    spinButtonWrapperHovered: IStyle = null,
    spinButtonWrapperTopBottom: IStyle = null
  ): ISpinButtonStyles = {
    val __obj = js.Dynamic.literal()
    if (arrowButtonsContainer != null) __obj.updateDynamic("arrowButtonsContainer")(arrowButtonsContainer.asInstanceOf[js.Any])
    if (arrowButtonsContainerDisabled != null) __obj.updateDynamic("arrowButtonsContainerDisabled")(arrowButtonsContainerDisabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconDisabled != null) __obj.updateDynamic("iconDisabled")(iconDisabled.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputDisabled != null) __obj.updateDynamic("inputDisabled")(inputDisabled.asInstanceOf[js.Any])
    if (inputTextSelected != null) __obj.updateDynamic("inputTextSelected")(inputTextSelected.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelDisabled != null) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (labelWrapper != null) __obj.updateDynamic("labelWrapper")(labelWrapper.asInstanceOf[js.Any])
    if (labelWrapperBottom != null) __obj.updateDynamic("labelWrapperBottom")(labelWrapperBottom.asInstanceOf[js.Any])
    if (labelWrapperEnd != null) __obj.updateDynamic("labelWrapperEnd")(labelWrapperEnd.asInstanceOf[js.Any])
    if (labelWrapperStart != null) __obj.updateDynamic("labelWrapperStart")(labelWrapperStart.asInstanceOf[js.Any])
    if (labelWrapperTop != null) __obj.updateDynamic("labelWrapperTop")(labelWrapperTop.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (spinButtonWrapper != null) __obj.updateDynamic("spinButtonWrapper")(spinButtonWrapper.asInstanceOf[js.Any])
    if (spinButtonWrapperDisabled != null) __obj.updateDynamic("spinButtonWrapperDisabled")(spinButtonWrapperDisabled.asInstanceOf[js.Any])
    if (spinButtonWrapperFocused != null) __obj.updateDynamic("spinButtonWrapperFocused")(spinButtonWrapperFocused.asInstanceOf[js.Any])
    if (spinButtonWrapperHovered != null) __obj.updateDynamic("spinButtonWrapperHovered")(spinButtonWrapperHovered.asInstanceOf[js.Any])
    if (spinButtonWrapperTopBottom != null) __obj.updateDynamic("spinButtonWrapperTopBottom")(spinButtonWrapperTopBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonStyles]
  }
}

