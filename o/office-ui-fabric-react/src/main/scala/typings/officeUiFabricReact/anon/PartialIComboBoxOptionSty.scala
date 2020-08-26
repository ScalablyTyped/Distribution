package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ComboBox/ComboBox.types.IComboBoxOptionStyles> */
@js.native
trait PartialIComboBoxOptionSty extends js.Object {
  var description: js.UndefOr[IStyle] = js.native
  var descriptionChecked: js.UndefOr[IStyle] = js.native
  var descriptionDisabled: js.UndefOr[IStyle] = js.native
  var descriptionHovered: js.UndefOr[IStyle] = js.native
  var descriptionPressed: js.UndefOr[IStyle] = js.native
  var flexContainer: js.UndefOr[IStyle] = js.native
  var icon: js.UndefOr[IStyle] = js.native
  var iconChecked: js.UndefOr[IStyle] = js.native
  var iconDisabled: js.UndefOr[IStyle] = js.native
  var iconExpanded: js.UndefOr[IStyle] = js.native
  var iconExpandedHovered: js.UndefOr[IStyle] = js.native
  var iconHovered: js.UndefOr[IStyle] = js.native
  var iconPressed: js.UndefOr[IStyle] = js.native
  var label: js.UndefOr[IStyle] = js.native
  var labelChecked: js.UndefOr[IStyle] = js.native
  var labelDisabled: js.UndefOr[IStyle] = js.native
  var labelHovered: js.UndefOr[IStyle] = js.native
  var menuIcon: js.UndefOr[IStyle] = js.native
  var menuIconChecked: js.UndefOr[IStyle] = js.native
  var menuIconDisabled: js.UndefOr[IStyle] = js.native
  var menuIconExpanded: js.UndefOr[IStyle] = js.native
  var menuIconExpandedHovered: js.UndefOr[IStyle] = js.native
  var menuIconHovered: js.UndefOr[IStyle] = js.native
  var menuIconPressed: js.UndefOr[IStyle] = js.native
  var optionText: js.UndefOr[IStyle] = js.native
  var optionTextWrapper: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var rootChecked: js.UndefOr[IStyle] = js.native
  var rootCheckedDisabled: js.UndefOr[IStyle] = js.native
  var rootCheckedHovered: js.UndefOr[IStyle] = js.native
  var rootCheckedPressed: js.UndefOr[IStyle] = js.native
  var rootDisabled: js.UndefOr[IStyle] = js.native
  var rootExpanded: js.UndefOr[IStyle] = js.native
  var rootExpandedHovered: js.UndefOr[IStyle] = js.native
  var rootFocused: js.UndefOr[IStyle] = js.native
  var rootHasMenu: js.UndefOr[IStyle] = js.native
  var rootHovered: js.UndefOr[IStyle] = js.native
  var rootPressed: js.UndefOr[IStyle] = js.native
  var screenReaderText: js.UndefOr[IStyle] = js.native
  var secondaryText: js.UndefOr[IStyle] = js.native
  var splitButtonContainer: js.UndefOr[IStyle] = js.native
  var splitButtonContainerChecked: js.UndefOr[IStyle] = js.native
  var splitButtonContainerCheckedHovered: js.UndefOr[IStyle] = js.native
  var splitButtonContainerDisabled: js.UndefOr[IStyle] = js.native
  var splitButtonContainerFocused: js.UndefOr[IStyle] = js.native
  var splitButtonContainerHovered: js.UndefOr[IStyle] = js.native
  var splitButtonDivider: js.UndefOr[IStyle] = js.native
  var splitButtonDividerDisabled: js.UndefOr[IStyle] = js.native
  var splitButtonFlexContainer: js.UndefOr[IStyle] = js.native
  var splitButtonMenuButton: js.UndefOr[IStyle] = js.native
  var splitButtonMenuButtonChecked: js.UndefOr[IStyle] = js.native
  var splitButtonMenuButtonDisabled: js.UndefOr[IStyle] = js.native
  var splitButtonMenuButtonExpanded: js.UndefOr[IStyle] = js.native
  var splitButtonMenuIcon: js.UndefOr[IStyle] = js.native
  var splitButtonMenuIconDisabled: js.UndefOr[IStyle] = js.native
  var textContainer: js.UndefOr[IStyle] = js.native
}

object PartialIComboBoxOptionSty {
  @scala.inline
  def apply(): PartialIComboBoxOptionSty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIComboBoxOptionSty]
  }
  @scala.inline
  implicit class PartialIComboBoxOptionStyOps[Self <: PartialIComboBoxOptionSty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: IStyle): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setDescriptionChecked(value: IStyle): Self = this.set("descriptionChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionChecked: Self = this.set("descriptionChecked", js.undefined)
    @scala.inline
    def setDescriptionCheckedNull: Self = this.set("descriptionChecked", null)
    @scala.inline
    def setDescriptionDisabled(value: IStyle): Self = this.set("descriptionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionDisabled: Self = this.set("descriptionDisabled", js.undefined)
    @scala.inline
    def setDescriptionDisabledNull: Self = this.set("descriptionDisabled", null)
    @scala.inline
    def setDescriptionHovered(value: IStyle): Self = this.set("descriptionHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionHovered: Self = this.set("descriptionHovered", js.undefined)
    @scala.inline
    def setDescriptionHoveredNull: Self = this.set("descriptionHovered", null)
    @scala.inline
    def setDescriptionPressed(value: IStyle): Self = this.set("descriptionPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionPressed: Self = this.set("descriptionPressed", js.undefined)
    @scala.inline
    def setDescriptionPressedNull: Self = this.set("descriptionPressed", null)
    @scala.inline
    def setFlexContainer(value: IStyle): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    @scala.inline
    def setFlexContainerNull: Self = this.set("flexContainer", null)
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setIconChecked(value: IStyle): Self = this.set("iconChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconChecked: Self = this.set("iconChecked", js.undefined)
    @scala.inline
    def setIconCheckedNull: Self = this.set("iconChecked", null)
    @scala.inline
    def setIconDisabled(value: IStyle): Self = this.set("iconDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconDisabled: Self = this.set("iconDisabled", js.undefined)
    @scala.inline
    def setIconDisabledNull: Self = this.set("iconDisabled", null)
    @scala.inline
    def setIconExpanded(value: IStyle): Self = this.set("iconExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconExpanded: Self = this.set("iconExpanded", js.undefined)
    @scala.inline
    def setIconExpandedNull: Self = this.set("iconExpanded", null)
    @scala.inline
    def setIconExpandedHovered(value: IStyle): Self = this.set("iconExpandedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconExpandedHovered: Self = this.set("iconExpandedHovered", js.undefined)
    @scala.inline
    def setIconExpandedHoveredNull: Self = this.set("iconExpandedHovered", null)
    @scala.inline
    def setIconHovered(value: IStyle): Self = this.set("iconHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHovered: Self = this.set("iconHovered", js.undefined)
    @scala.inline
    def setIconHoveredNull: Self = this.set("iconHovered", null)
    @scala.inline
    def setIconPressed(value: IStyle): Self = this.set("iconPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPressed: Self = this.set("iconPressed", js.undefined)
    @scala.inline
    def setIconPressedNull: Self = this.set("iconPressed", null)
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setLabelChecked(value: IStyle): Self = this.set("labelChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelChecked: Self = this.set("labelChecked", js.undefined)
    @scala.inline
    def setLabelCheckedNull: Self = this.set("labelChecked", null)
    @scala.inline
    def setLabelDisabled(value: IStyle): Self = this.set("labelDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDisabled: Self = this.set("labelDisabled", js.undefined)
    @scala.inline
    def setLabelDisabledNull: Self = this.set("labelDisabled", null)
    @scala.inline
    def setLabelHovered(value: IStyle): Self = this.set("labelHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHovered: Self = this.set("labelHovered", js.undefined)
    @scala.inline
    def setLabelHoveredNull: Self = this.set("labelHovered", null)
    @scala.inline
    def setMenuIcon(value: IStyle): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIcon: Self = this.set("menuIcon", js.undefined)
    @scala.inline
    def setMenuIconNull: Self = this.set("menuIcon", null)
    @scala.inline
    def setMenuIconChecked(value: IStyle): Self = this.set("menuIconChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconChecked: Self = this.set("menuIconChecked", js.undefined)
    @scala.inline
    def setMenuIconCheckedNull: Self = this.set("menuIconChecked", null)
    @scala.inline
    def setMenuIconDisabled(value: IStyle): Self = this.set("menuIconDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconDisabled: Self = this.set("menuIconDisabled", js.undefined)
    @scala.inline
    def setMenuIconDisabledNull: Self = this.set("menuIconDisabled", null)
    @scala.inline
    def setMenuIconExpanded(value: IStyle): Self = this.set("menuIconExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconExpanded: Self = this.set("menuIconExpanded", js.undefined)
    @scala.inline
    def setMenuIconExpandedNull: Self = this.set("menuIconExpanded", null)
    @scala.inline
    def setMenuIconExpandedHovered(value: IStyle): Self = this.set("menuIconExpandedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconExpandedHovered: Self = this.set("menuIconExpandedHovered", js.undefined)
    @scala.inline
    def setMenuIconExpandedHoveredNull: Self = this.set("menuIconExpandedHovered", null)
    @scala.inline
    def setMenuIconHovered(value: IStyle): Self = this.set("menuIconHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconHovered: Self = this.set("menuIconHovered", js.undefined)
    @scala.inline
    def setMenuIconHoveredNull: Self = this.set("menuIconHovered", null)
    @scala.inline
    def setMenuIconPressed(value: IStyle): Self = this.set("menuIconPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconPressed: Self = this.set("menuIconPressed", js.undefined)
    @scala.inline
    def setMenuIconPressedNull: Self = this.set("menuIconPressed", null)
    @scala.inline
    def setOptionText(value: IStyle): Self = this.set("optionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionText: Self = this.set("optionText", js.undefined)
    @scala.inline
    def setOptionTextNull: Self = this.set("optionText", null)
    @scala.inline
    def setOptionTextWrapper(value: IStyle): Self = this.set("optionTextWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionTextWrapper: Self = this.set("optionTextWrapper", js.undefined)
    @scala.inline
    def setOptionTextWrapperNull: Self = this.set("optionTextWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setRootChecked(value: IStyle): Self = this.set("rootChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootChecked: Self = this.set("rootChecked", js.undefined)
    @scala.inline
    def setRootCheckedNull: Self = this.set("rootChecked", null)
    @scala.inline
    def setRootCheckedDisabled(value: IStyle): Self = this.set("rootCheckedDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootCheckedDisabled: Self = this.set("rootCheckedDisabled", js.undefined)
    @scala.inline
    def setRootCheckedDisabledNull: Self = this.set("rootCheckedDisabled", null)
    @scala.inline
    def setRootCheckedHovered(value: IStyle): Self = this.set("rootCheckedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootCheckedHovered: Self = this.set("rootCheckedHovered", js.undefined)
    @scala.inline
    def setRootCheckedHoveredNull: Self = this.set("rootCheckedHovered", null)
    @scala.inline
    def setRootCheckedPressed(value: IStyle): Self = this.set("rootCheckedPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootCheckedPressed: Self = this.set("rootCheckedPressed", js.undefined)
    @scala.inline
    def setRootCheckedPressedNull: Self = this.set("rootCheckedPressed", null)
    @scala.inline
    def setRootDisabled(value: IStyle): Self = this.set("rootDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDisabled: Self = this.set("rootDisabled", js.undefined)
    @scala.inline
    def setRootDisabledNull: Self = this.set("rootDisabled", null)
    @scala.inline
    def setRootExpanded(value: IStyle): Self = this.set("rootExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootExpanded: Self = this.set("rootExpanded", js.undefined)
    @scala.inline
    def setRootExpandedNull: Self = this.set("rootExpanded", null)
    @scala.inline
    def setRootExpandedHovered(value: IStyle): Self = this.set("rootExpandedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootExpandedHovered: Self = this.set("rootExpandedHovered", js.undefined)
    @scala.inline
    def setRootExpandedHoveredNull: Self = this.set("rootExpandedHovered", null)
    @scala.inline
    def setRootFocused(value: IStyle): Self = this.set("rootFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootFocused: Self = this.set("rootFocused", js.undefined)
    @scala.inline
    def setRootFocusedNull: Self = this.set("rootFocused", null)
    @scala.inline
    def setRootHasMenu(value: IStyle): Self = this.set("rootHasMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootHasMenu: Self = this.set("rootHasMenu", js.undefined)
    @scala.inline
    def setRootHasMenuNull: Self = this.set("rootHasMenu", null)
    @scala.inline
    def setRootHovered(value: IStyle): Self = this.set("rootHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootHovered: Self = this.set("rootHovered", js.undefined)
    @scala.inline
    def setRootHoveredNull: Self = this.set("rootHovered", null)
    @scala.inline
    def setRootPressed(value: IStyle): Self = this.set("rootPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPressed: Self = this.set("rootPressed", js.undefined)
    @scala.inline
    def setRootPressedNull: Self = this.set("rootPressed", null)
    @scala.inline
    def setScreenReaderText(value: IStyle): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    @scala.inline
    def setScreenReaderTextNull: Self = this.set("screenReaderText", null)
    @scala.inline
    def setSecondaryText(value: IStyle): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setSecondaryTextNull: Self = this.set("secondaryText", null)
    @scala.inline
    def setSplitButtonContainer(value: IStyle): Self = this.set("splitButtonContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonContainer: Self = this.set("splitButtonContainer", js.undefined)
    @scala.inline
    def setSplitButtonContainerNull: Self = this.set("splitButtonContainer", null)
    @scala.inline
    def setSplitButtonContainerChecked(value: IStyle): Self = this.set("splitButtonContainerChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonContainerChecked: Self = this.set("splitButtonContainerChecked", js.undefined)
    @scala.inline
    def setSplitButtonContainerCheckedNull: Self = this.set("splitButtonContainerChecked", null)
    @scala.inline
    def setSplitButtonContainerCheckedHovered(value: IStyle): Self = this.set("splitButtonContainerCheckedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonContainerCheckedHovered: Self = this.set("splitButtonContainerCheckedHovered", js.undefined)
    @scala.inline
    def setSplitButtonContainerCheckedHoveredNull: Self = this.set("splitButtonContainerCheckedHovered", null)
    @scala.inline
    def setSplitButtonContainerDisabled(value: IStyle): Self = this.set("splitButtonContainerDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonContainerDisabled: Self = this.set("splitButtonContainerDisabled", js.undefined)
    @scala.inline
    def setSplitButtonContainerDisabledNull: Self = this.set("splitButtonContainerDisabled", null)
    @scala.inline
    def setSplitButtonContainerFocused(value: IStyle): Self = this.set("splitButtonContainerFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonContainerFocused: Self = this.set("splitButtonContainerFocused", js.undefined)
    @scala.inline
    def setSplitButtonContainerFocusedNull: Self = this.set("splitButtonContainerFocused", null)
    @scala.inline
    def setSplitButtonContainerHovered(value: IStyle): Self = this.set("splitButtonContainerHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonContainerHovered: Self = this.set("splitButtonContainerHovered", js.undefined)
    @scala.inline
    def setSplitButtonContainerHoveredNull: Self = this.set("splitButtonContainerHovered", null)
    @scala.inline
    def setSplitButtonDivider(value: IStyle): Self = this.set("splitButtonDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonDivider: Self = this.set("splitButtonDivider", js.undefined)
    @scala.inline
    def setSplitButtonDividerNull: Self = this.set("splitButtonDivider", null)
    @scala.inline
    def setSplitButtonDividerDisabled(value: IStyle): Self = this.set("splitButtonDividerDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonDividerDisabled: Self = this.set("splitButtonDividerDisabled", js.undefined)
    @scala.inline
    def setSplitButtonDividerDisabledNull: Self = this.set("splitButtonDividerDisabled", null)
    @scala.inline
    def setSplitButtonFlexContainer(value: IStyle): Self = this.set("splitButtonFlexContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonFlexContainer: Self = this.set("splitButtonFlexContainer", js.undefined)
    @scala.inline
    def setSplitButtonFlexContainerNull: Self = this.set("splitButtonFlexContainer", null)
    @scala.inline
    def setSplitButtonMenuButton(value: IStyle): Self = this.set("splitButtonMenuButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuButton: Self = this.set("splitButtonMenuButton", js.undefined)
    @scala.inline
    def setSplitButtonMenuButtonNull: Self = this.set("splitButtonMenuButton", null)
    @scala.inline
    def setSplitButtonMenuButtonChecked(value: IStyle): Self = this.set("splitButtonMenuButtonChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuButtonChecked: Self = this.set("splitButtonMenuButtonChecked", js.undefined)
    @scala.inline
    def setSplitButtonMenuButtonCheckedNull: Self = this.set("splitButtonMenuButtonChecked", null)
    @scala.inline
    def setSplitButtonMenuButtonDisabled(value: IStyle): Self = this.set("splitButtonMenuButtonDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuButtonDisabled: Self = this.set("splitButtonMenuButtonDisabled", js.undefined)
    @scala.inline
    def setSplitButtonMenuButtonDisabledNull: Self = this.set("splitButtonMenuButtonDisabled", null)
    @scala.inline
    def setSplitButtonMenuButtonExpanded(value: IStyle): Self = this.set("splitButtonMenuButtonExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuButtonExpanded: Self = this.set("splitButtonMenuButtonExpanded", js.undefined)
    @scala.inline
    def setSplitButtonMenuButtonExpandedNull: Self = this.set("splitButtonMenuButtonExpanded", null)
    @scala.inline
    def setSplitButtonMenuIcon(value: IStyle): Self = this.set("splitButtonMenuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuIcon: Self = this.set("splitButtonMenuIcon", js.undefined)
    @scala.inline
    def setSplitButtonMenuIconNull: Self = this.set("splitButtonMenuIcon", null)
    @scala.inline
    def setSplitButtonMenuIconDisabled(value: IStyle): Self = this.set("splitButtonMenuIconDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuIconDisabled: Self = this.set("splitButtonMenuIconDisabled", js.undefined)
    @scala.inline
    def setSplitButtonMenuIconDisabledNull: Self = this.set("splitButtonMenuIconDisabled", null)
    @scala.inline
    def setTextContainer(value: IStyle): Self = this.set("textContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContainer: Self = this.set("textContainer", js.undefined)
    @scala.inline
    def setTextContainerNull: Self = this.set("textContainer", null)
  }
  
}

