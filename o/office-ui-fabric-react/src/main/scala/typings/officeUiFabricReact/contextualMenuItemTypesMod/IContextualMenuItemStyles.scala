package typings.officeUiFabricReact.contextualMenuItemTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItemStyles extends IButtonStyles {
  /**
    * Styles for a menu item that is an anchor link.
    */
  var anchorLink: IStyle
  /**
    * Default style for checkmark icons.
    */
  var checkmarkIcon: IStyle
  /**
    * Styles for a divider item of a ContextualMenu.
    */
  var divider: IStyle
  /**
    * Default icon color style for known icons.
    */
  var iconColor: IStyle
  /**
    * Styles for the icon element of a menu item.
    */
  @JSName("icon")
  var icon_IContextualMenuItemStyles: IStyle
  /**
    * Styles for a menu item that is an anchor link.
    */
  var item: IStyle
  /**
    * Styles for the label of a menu item.
    */
  @JSName("label")
  var label_IContextualMenuItemStyles: IStyle
  /**
    * Styles for the content inside the button/link of the menuItem.
    */
  var linkContent: IStyle
  /**
    * Styles for a menu item that is a link.
    */
  var linkContentMenu: IStyle
  /**
    * Style for the root element.
    */
  @JSName("root")
  var root_IContextualMenuItemStyles: IStyle
  /**
    * Styles for the secondary text of a menu item.
    */
  @JSName("secondaryText")
  var secondaryText_IContextualMenuItemStyles: IStyle
  /**
    * Styles for the container of a split menu item.
    */
  var splitContainer: IStyle
  /**
    * Styles for the menu portion of a split menu item.
    */
  var splitMenu: IStyle
  /**
    * Styles for the primary portion of a split menu item.
    */
  var splitPrimary: IStyle
  /**
    * Styles for the submenu icon of a menu item.
    */
  var subMenuIcon: IStyle
}

object IContextualMenuItemStyles {
  @scala.inline
  def apply(
    anchorLink: js.UndefOr[Null | IStyle] = js.undefined,
    checkmarkIcon: js.UndefOr[Null | IStyle] = js.undefined,
    description: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionChecked: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionHovered: js.UndefOr[Null | IStyle] = js.undefined,
    descriptionPressed: js.UndefOr[Null | IStyle] = js.undefined,
    divider: js.UndefOr[Null | IStyle] = js.undefined,
    flexContainer: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    iconChecked: js.UndefOr[Null | IStyle] = js.undefined,
    iconColor: js.UndefOr[Null | IStyle] = js.undefined,
    iconDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    iconExpanded: js.UndefOr[Null | IStyle] = js.undefined,
    iconExpandedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    iconHovered: js.UndefOr[Null | IStyle] = js.undefined,
    iconPressed: js.UndefOr[Null | IStyle] = js.undefined,
    item: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    labelChecked: js.UndefOr[Null | IStyle] = js.undefined,
    labelDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    labelHovered: js.UndefOr[Null | IStyle] = js.undefined,
    linkContent: js.UndefOr[Null | IStyle] = js.undefined,
    linkContentMenu: js.UndefOr[Null | IStyle] = js.undefined,
    menuIcon: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconChecked: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconExpanded: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconExpandedHovered: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconHovered: js.UndefOr[Null | IStyle] = js.undefined,
    menuIconPressed: js.UndefOr[Null | IStyle] = js.undefined,
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
    splitContainer: js.UndefOr[Null | IStyle] = js.undefined,
    splitMenu: js.UndefOr[Null | IStyle] = js.undefined,
    splitPrimary: js.UndefOr[Null | IStyle] = js.undefined,
    subMenuIcon: js.UndefOr[Null | IStyle] = js.undefined,
    textContainer: js.UndefOr[Null | IStyle] = js.undefined
  ): IContextualMenuItemStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorLink)) __obj.updateDynamic("anchorLink")(anchorLink.asInstanceOf[js.Any])
    if (!js.isUndefined(checkmarkIcon)) __obj.updateDynamic("checkmarkIcon")(checkmarkIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionChecked)) __obj.updateDynamic("descriptionChecked")(descriptionChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionDisabled)) __obj.updateDynamic("descriptionDisabled")(descriptionDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionHovered)) __obj.updateDynamic("descriptionHovered")(descriptionHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptionPressed)) __obj.updateDynamic("descriptionPressed")(descriptionPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconChecked)) __obj.updateDynamic("iconChecked")(iconChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(iconColor)) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (!js.isUndefined(iconDisabled)) __obj.updateDynamic("iconDisabled")(iconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(iconExpanded)) __obj.updateDynamic("iconExpanded")(iconExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(iconExpandedHovered)) __obj.updateDynamic("iconExpandedHovered")(iconExpandedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(iconHovered)) __obj.updateDynamic("iconHovered")(iconHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(iconPressed)) __obj.updateDynamic("iconPressed")(iconPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelChecked)) __obj.updateDynamic("labelChecked")(labelChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(labelDisabled)) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHovered)) __obj.updateDynamic("labelHovered")(labelHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(linkContent)) __obj.updateDynamic("linkContent")(linkContent.asInstanceOf[js.Any])
    if (!js.isUndefined(linkContentMenu)) __obj.updateDynamic("linkContentMenu")(linkContentMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIcon)) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconChecked)) __obj.updateDynamic("menuIconChecked")(menuIconChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconDisabled)) __obj.updateDynamic("menuIconDisabled")(menuIconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconExpanded)) __obj.updateDynamic("menuIconExpanded")(menuIconExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconExpandedHovered)) __obj.updateDynamic("menuIconExpandedHovered")(menuIconExpandedHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconHovered)) __obj.updateDynamic("menuIconHovered")(menuIconHovered.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIconPressed)) __obj.updateDynamic("menuIconPressed")(menuIconPressed.asInstanceOf[js.Any])
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
    if (!js.isUndefined(splitContainer)) __obj.updateDynamic("splitContainer")(splitContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(splitMenu)) __obj.updateDynamic("splitMenu")(splitMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(splitPrimary)) __obj.updateDynamic("splitPrimary")(splitPrimary.asInstanceOf[js.Any])
    if (!js.isUndefined(subMenuIcon)) __obj.updateDynamic("subMenuIcon")(subMenuIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(textContainer)) __obj.updateDynamic("textContainer")(textContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemStyles]
  }
}

