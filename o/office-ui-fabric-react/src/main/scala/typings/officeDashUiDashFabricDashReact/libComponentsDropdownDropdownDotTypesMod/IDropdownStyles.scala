package typings.officeDashUiDashFabricDashReact.libComponentsDropdownDropdownDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownStyles extends js.Object {
  /** Refers to the callout that hosts Dropdown options in larger viewports. */
  var callout: IStyle
  /** Refers to the downward pointing caret icon users click on to expand the Dropdown. */
  var caretDown: IStyle
  /** Refers to the wrapping container around the downward pointing caret users click on to expand the Dropdown. */
  var caretDownWrapper: IStyle
  /** Refers to the actual Dropdown element. */
  var dropdown: IStyle
  /** Refers to the dropdown separator. */
  var dropdownDivider: IStyle
  /** Refers to the individual dropdown item. */
  var dropdownItem: IStyle
  /** Style for a dropdown item when it is disabled. */
  var dropdownItemDisabled: IStyle
  /** Refers to the individual dropdown items that are being rendered as a header. */
  var dropdownItemHeader: IStyle
  /** Style for a dropdown item when it is hidden */
  var dropdownItemHidden: IStyle
  /** Style for a dropdown item when it is being selected. */
  var dropdownItemSelected: IStyle
  /** Style for a dropdown item when it is both selected and disabled. */
  var dropdownItemSelectedAndDisabled: IStyle
  /** Refers to the FocusZone wrapping the individual dropdown items. */
  var dropdownItems: IStyle
  /** Refers to the element that wraps `dropdownItems`. */
  var dropdownItemsWrapper: IStyle
  /**
    * Refers to the text element that renders the actual dropdown item/option text. This would be wrapped by the element
    * referred to by `dropdownItem`.
    */
  var dropdownOptionText: IStyle
  /** Refers to the error message being rendered under the Dropdown (if any). */
  var errorMessage: IStyle
  /** Refers to the label associated with the dropdown. This is enclosed by the root. */
  var label: IStyle
  /**
    * Refers to the panel that hosts the Dropdown options in small viewports.
    * Note: This will be deprecated when Panel supports JS Styling.
    */
  var panel: IStyle
  /** Root element of the Dropdown (includes Label and the actual Dropdown). */
  var root: IStyle
  /** Subcomponent styles. */
  var subComponentStyles: IDropdownSubComponentStyles
  /** Refers to the primary title of the Dropdown (rendering the selected options/placeholder/etc.). */
  var title: IStyle
}

object IDropdownStyles {
  @scala.inline
  def apply(
    callout: IStyle,
    caretDown: IStyle,
    caretDownWrapper: IStyle,
    dropdown: IStyle,
    dropdownDivider: IStyle,
    dropdownItem: IStyle,
    dropdownItemDisabled: IStyle,
    dropdownItemHeader: IStyle,
    dropdownItemHidden: IStyle,
    dropdownItemSelected: IStyle,
    dropdownItemSelectedAndDisabled: IStyle,
    dropdownItems: IStyle,
    dropdownItemsWrapper: IStyle,
    dropdownOptionText: IStyle,
    errorMessage: IStyle,
    label: IStyle,
    panel: IStyle,
    root: IStyle,
    subComponentStyles: IDropdownSubComponentStyles,
    title: IStyle
  ): IDropdownStyles = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], caretDown = caretDown.asInstanceOf[js.Any], caretDownWrapper = caretDownWrapper.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], dropdownDivider = dropdownDivider.asInstanceOf[js.Any], dropdownItem = dropdownItem.asInstanceOf[js.Any], dropdownItemDisabled = dropdownItemDisabled.asInstanceOf[js.Any], dropdownItemHeader = dropdownItemHeader.asInstanceOf[js.Any], dropdownItemHidden = dropdownItemHidden.asInstanceOf[js.Any], dropdownItemSelected = dropdownItemSelected.asInstanceOf[js.Any], dropdownItemSelectedAndDisabled = dropdownItemSelectedAndDisabled.asInstanceOf[js.Any], dropdownItems = dropdownItems.asInstanceOf[js.Any], dropdownItemsWrapper = dropdownItemsWrapper.asInstanceOf[js.Any], dropdownOptionText = dropdownOptionText.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subComponentStyles = subComponentStyles, title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDropdownStyles]
  }
}

