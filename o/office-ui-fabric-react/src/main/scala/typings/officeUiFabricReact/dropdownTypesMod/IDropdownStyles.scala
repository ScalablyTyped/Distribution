package typings.officeUiFabricReact.dropdownTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownStyles extends js.Object {
  /** Refers to the callout that hosts Dropdown options in larger viewports. */
  var callout: IStyle = js.native
  /** Refers to the downward pointing caret icon users click on to expand the Dropdown. */
  var caretDown: IStyle = js.native
  /** Refers to the wrapping container around the downward pointing caret users click on to expand the Dropdown. */
  var caretDownWrapper: IStyle = js.native
  /** Refers to the actual Dropdown element. */
  var dropdown: IStyle = js.native
  /** Refers to the dropdown separator. */
  var dropdownDivider: IStyle = js.native
  /** Refers to the individual dropdown item. */
  var dropdownItem: IStyle = js.native
  /** Style for a dropdown item when it is disabled. */
  var dropdownItemDisabled: IStyle = js.native
  /** Refers to the individual dropdown items that are being rendered as a header. */
  var dropdownItemHeader: IStyle = js.native
  /** Style for a dropdown item when it is hidden */
  var dropdownItemHidden: IStyle = js.native
  /** Style for a dropdown item when it is being selected. */
  var dropdownItemSelected: IStyle = js.native
  /** Style for a dropdown item when it is both selected and disabled. */
  var dropdownItemSelectedAndDisabled: IStyle = js.native
  /** Refers to the FocusZone wrapping the individual dropdown items. */
  var dropdownItems: IStyle = js.native
  /** Refers to the element that wraps `dropdownItems`. */
  var dropdownItemsWrapper: IStyle = js.native
  /**
    * Refers to the text element that renders the actual dropdown item/option text. This would be wrapped by the element
    * referred to by `dropdownItem`.
    */
  var dropdownOptionText: IStyle = js.native
  /** Refers to the error message being rendered under the Dropdown (if any). */
  var errorMessage: IStyle = js.native
  /** Refers to the label associated with the dropdown. This is enclosed by the root. */
  var label: IStyle = js.native
  /**
    * Refers to the panel that hosts the Dropdown options in small viewports.
    * @deprecated Use `subComponentStyles.panel` instead.
    */
  var panel: IStyle = js.native
  /** Root element of the Dropdown (includes Label and the actual Dropdown). */
  var root: IStyle = js.native
  /** Subcomponent styles. */
  var subComponentStyles: IDropdownSubComponentStyles = js.native
  /** Refers to the primary title of the Dropdown (rendering the selected options/placeholder/etc.). */
  var title: IStyle = js.native
}

object IDropdownStyles {
  @scala.inline
  def apply(subComponentStyles: IDropdownSubComponentStyles): IDropdownStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyles]
  }
  @scala.inline
  implicit class IDropdownStylesOps[Self <: IDropdownStyles] (val x: Self) extends AnyVal {
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
    def setSubComponentStyles(value: IDropdownSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallout(value: IStyle): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def setCalloutNull: Self = this.set("callout", null)
    @scala.inline
    def setCaretDown(value: IStyle): Self = this.set("caretDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretDown: Self = this.set("caretDown", js.undefined)
    @scala.inline
    def setCaretDownNull: Self = this.set("caretDown", null)
    @scala.inline
    def setCaretDownWrapper(value: IStyle): Self = this.set("caretDownWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretDownWrapper: Self = this.set("caretDownWrapper", js.undefined)
    @scala.inline
    def setCaretDownWrapperNull: Self = this.set("caretDownWrapper", null)
    @scala.inline
    def setDropdown(value: IStyle): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    @scala.inline
    def setDropdownNull: Self = this.set("dropdown", null)
    @scala.inline
    def setDropdownDivider(value: IStyle): Self = this.set("dropdownDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownDivider: Self = this.set("dropdownDivider", js.undefined)
    @scala.inline
    def setDropdownDividerNull: Self = this.set("dropdownDivider", null)
    @scala.inline
    def setDropdownItem(value: IStyle): Self = this.set("dropdownItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItem: Self = this.set("dropdownItem", js.undefined)
    @scala.inline
    def setDropdownItemNull: Self = this.set("dropdownItem", null)
    @scala.inline
    def setDropdownItemDisabled(value: IStyle): Self = this.set("dropdownItemDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItemDisabled: Self = this.set("dropdownItemDisabled", js.undefined)
    @scala.inline
    def setDropdownItemDisabledNull: Self = this.set("dropdownItemDisabled", null)
    @scala.inline
    def setDropdownItemHeader(value: IStyle): Self = this.set("dropdownItemHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItemHeader: Self = this.set("dropdownItemHeader", js.undefined)
    @scala.inline
    def setDropdownItemHeaderNull: Self = this.set("dropdownItemHeader", null)
    @scala.inline
    def setDropdownItemHidden(value: IStyle): Self = this.set("dropdownItemHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItemHidden: Self = this.set("dropdownItemHidden", js.undefined)
    @scala.inline
    def setDropdownItemHiddenNull: Self = this.set("dropdownItemHidden", null)
    @scala.inline
    def setDropdownItemSelected(value: IStyle): Self = this.set("dropdownItemSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItemSelected: Self = this.set("dropdownItemSelected", js.undefined)
    @scala.inline
    def setDropdownItemSelectedNull: Self = this.set("dropdownItemSelected", null)
    @scala.inline
    def setDropdownItemSelectedAndDisabled(value: IStyle): Self = this.set("dropdownItemSelectedAndDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItemSelectedAndDisabled: Self = this.set("dropdownItemSelectedAndDisabled", js.undefined)
    @scala.inline
    def setDropdownItemSelectedAndDisabledNull: Self = this.set("dropdownItemSelectedAndDisabled", null)
    @scala.inline
    def setDropdownItems(value: IStyle): Self = this.set("dropdownItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItems: Self = this.set("dropdownItems", js.undefined)
    @scala.inline
    def setDropdownItemsNull: Self = this.set("dropdownItems", null)
    @scala.inline
    def setDropdownItemsWrapper(value: IStyle): Self = this.set("dropdownItemsWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownItemsWrapper: Self = this.set("dropdownItemsWrapper", js.undefined)
    @scala.inline
    def setDropdownItemsWrapperNull: Self = this.set("dropdownItemsWrapper", null)
    @scala.inline
    def setDropdownOptionText(value: IStyle): Self = this.set("dropdownOptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownOptionText: Self = this.set("dropdownOptionText", js.undefined)
    @scala.inline
    def setDropdownOptionTextNull: Self = this.set("dropdownOptionText", null)
    @scala.inline
    def setErrorMessage(value: IStyle): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorMessageNull: Self = this.set("errorMessage", null)
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setPanel(value: IStyle): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setPanelNull: Self = this.set("panel", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setTitle(value: IStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

