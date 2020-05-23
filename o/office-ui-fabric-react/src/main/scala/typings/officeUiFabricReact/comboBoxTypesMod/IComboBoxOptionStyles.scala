package typings.officeUiFabricReact.comboBoxTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxOptionStyles extends IButtonStyles {
  /**
    * Styles for the text inside the comboBox option.
    * This should be used instead of the description
    * inside IButtonStyles because we custom render the text
    * in the comboBox options.
    */
  var optionText: IStyle
  /**
    * Styles for the comboBox option text's wrapper.
    */
  var optionTextWrapper: IStyle
}

object IComboBoxOptionStyles {
  @scala.inline
  def apply(
    description: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionChecked: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionHovered: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionPressed: js.UndefOr[Null | IStyle] = js.undefined,
    flexContainer: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    iconChecked: js.UndefOr[Null | IStyle] = js.undefined,
    iconDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    iconExpanded: js.UndefOr[Null | IStyle] = js.undefined,
    iconExpandedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    iconHovered: js.UndefOr[Null | IStyle] = js.undefined,
    iconPressed: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    labelChecked: js.UndefOr[Null | IStyle] = js.undefined,
    labelDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    labelHovered: js.UndefOr[Null | IStyle] = js.undefined,
    menuIcon: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconChecked: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconExpanded: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconExpandedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconHovered: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconPressed: js.UndefOr[Null | IStyle] = js.undefined,
    optionText: js.UndefOr[Null | IStyle] = js.undefined,
    optionTextWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    rootChecked: js.UndefOr[Null | IStyle] = js.undefined,
    rootCheckedDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    rootCheckedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    rootCheckedPressed: js.UndefOr[Null | IStyle] = js.undefined,
    rootDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    rootExpanded: js.UndefOr[Null | IStyle] = js.undefined,
    rootExpandedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    rootFocused: js.UndefOr[Null | IStyle] = js.undefined,
    rootHasMenu: js.UndefOr[Null | IStyle] = js.undefined,
    rootHovered: js.UndefOr[Null | IStyle] = js.undefined,
    rootPressed: js.UndefOr[Null | IStyle] = js.undefined,
    screenReaderText: js.UndefOr[Null | IStyle] = js.undefined,
    secondaryText: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonContainer: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonContainerChecked: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonContainerCheckedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonContainerDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonContainerFocused: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonContainerHovered: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonDivider: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonDividerDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonFlexContainer: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonMenuButton: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonMenuButtonChecked: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonMenuButtonDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonMenuButtonExpanded: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonMenuIcon: js.UndefOr[Null | IStyle] = js.undefined,
    splitButtonMenuIconDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    textContainer: js.UndefOr[Null | IStyle] = js.undefined
  ): IComboBoxOptionStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionChecked)) __obj.updateDynamic("descriptionChecked")(descriptionChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionDisabled)) __obj.updateDynamic("descriptionDisabled")(descriptionDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionHovered)) __obj.updateDynamic("descriptionHovered")(descriptionHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionPressed)) __obj.updateDynamic("descriptionPressed")(descriptionPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconChecked)) __obj.updateDynamic("iconChecked")(iconChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(iconDisabled)) __obj.updateDynamic("iconDisabled")(iconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(iconExpanded)) __obj.updateDynamic("iconExpanded")(iconExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(iconExpandedHovered)) __obj.updateDynamic("iconExpandedHovered")(iconExpandedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(iconHovered)) __obj.updateDynamic("iconHovered")(iconHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(iconPressed)) __obj.updateDynamic("iconPressed")(iconPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelChecked)) __obj.updateDynamic("labelChecked")(labelChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(labelDisabled)) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHovered)) __obj.updateDynamic("labelHovered")(labelHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIcon)) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconChecked)) __obj.updateDynamic("menuIconChecked")(menuIconChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconDisabled)) __obj.updateDynamic("menuIconDisabled")(menuIconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconExpanded)) __obj.updateDynamic("menuIconExpanded")(menuIconExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconExpandedHovered)) __obj.updateDynamic("menuIconExpandedHovered")(menuIconExpandedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconHovered)) __obj.updateDynamic("menuIconHovered")(menuIconHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconPressed)) __obj.updateDynamic("menuIconPressed")(menuIconPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(optionText)) __obj.updateDynamic("optionText")(optionText.asInstanceOf[js.Any])
    if (!js.isUndefined(optionTextWrapper)) __obj.updateDynamic("optionTextWrapper")(optionTextWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rootChecked)) __obj.updateDynamic("rootChecked")(rootChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(rootCheckedDisabled)) __obj.updateDynamic("rootCheckedDisabled")(rootCheckedDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(rootCheckedHovered)) __obj.updateDynamic("rootCheckedHovered")(rootCheckedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(rootCheckedPressed)) __obj.updateDynamic("rootCheckedPressed")(rootCheckedPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(rootDisabled)) __obj.updateDynamic("rootDisabled")(rootDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(rootExpanded)) __obj.updateDynamic("rootExpanded")(rootExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(rootExpandedHovered)) __obj.updateDynamic("rootExpandedHovered")(rootExpandedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(rootFocused)) __obj.updateDynamic("rootFocused")(rootFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(rootHasMenu)) __obj.updateDynamic("rootHasMenu")(rootHasMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(rootHovered)) __obj.updateDynamic("rootHovered")(rootHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(rootPressed)) __obj.updateDynamic("rootPressed")(rootPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderText)) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryText)) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonContainer)) __obj.updateDynamic("splitButtonContainer")(splitButtonContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonContainerChecked)) __obj.updateDynamic("splitButtonContainerChecked")(splitButtonContainerChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonContainerCheckedHovered)) __obj.updateDynamic("splitButtonContainerCheckedHovered")(splitButtonContainerCheckedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonContainerDisabled)) __obj.updateDynamic("splitButtonContainerDisabled")(splitButtonContainerDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonContainerFocused)) __obj.updateDynamic("splitButtonContainerFocused")(splitButtonContainerFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonContainerHovered)) __obj.updateDynamic("splitButtonContainerHovered")(splitButtonContainerHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonDivider)) __obj.updateDynamic("splitButtonDivider")(splitButtonDivider.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonDividerDisabled)) __obj.updateDynamic("splitButtonDividerDisabled")(splitButtonDividerDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonFlexContainer)) __obj.updateDynamic("splitButtonFlexContainer")(splitButtonFlexContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonMenuButton)) __obj.updateDynamic("splitButtonMenuButton")(splitButtonMenuButton.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonMenuButtonChecked)) __obj.updateDynamic("splitButtonMenuButtonChecked")(splitButtonMenuButtonChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonMenuButtonDisabled)) __obj.updateDynamic("splitButtonMenuButtonDisabled")(splitButtonMenuButtonDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonMenuButtonExpanded)) __obj.updateDynamic("splitButtonMenuButtonExpanded")(splitButtonMenuButtonExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonMenuIcon)) __obj.updateDynamic("splitButtonMenuIcon")(splitButtonMenuIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButtonMenuIconDisabled)) __obj.updateDynamic("splitButtonMenuIconDisabled")(splitButtonMenuIconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(textContainer)) __obj.updateDynamic("textContainer")(textContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxOptionStyles]
  }
}

