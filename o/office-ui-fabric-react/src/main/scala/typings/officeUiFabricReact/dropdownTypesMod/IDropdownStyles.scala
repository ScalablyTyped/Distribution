package typings.officeUiFabricReact.dropdownTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    subComponentStyles: IDropdownSubComponentStyles,
    callout: IStyle = null,
    caretDown: IStyle = null,
    caretDownWrapper: IStyle = null,
    dropdown: IStyle = null,
    dropdownDivider: IStyle = null,
    dropdownItem: IStyle = null,
    dropdownItemDisabled: IStyle = null,
    dropdownItemHeader: IStyle = null,
    dropdownItemHidden: IStyle = null,
    dropdownItemSelected: IStyle = null,
    dropdownItemSelectedAndDisabled: IStyle = null,
    dropdownItems: IStyle = null,
    dropdownItemsWrapper: IStyle = null,
    dropdownOptionText: IStyle = null,
    errorMessage: IStyle = null,
    label: IStyle = null,
    panel: IStyle = null,
    root: IStyle = null,
    title: IStyle = null
  ): IDropdownStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (callout != null) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (caretDown != null) __obj.updateDynamic("caretDown")(caretDown.asInstanceOf[js.Any])
    if (caretDownWrapper != null) __obj.updateDynamic("caretDownWrapper")(caretDownWrapper.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (dropdownDivider != null) __obj.updateDynamic("dropdownDivider")(dropdownDivider.asInstanceOf[js.Any])
    if (dropdownItem != null) __obj.updateDynamic("dropdownItem")(dropdownItem.asInstanceOf[js.Any])
    if (dropdownItemDisabled != null) __obj.updateDynamic("dropdownItemDisabled")(dropdownItemDisabled.asInstanceOf[js.Any])
    if (dropdownItemHeader != null) __obj.updateDynamic("dropdownItemHeader")(dropdownItemHeader.asInstanceOf[js.Any])
    if (dropdownItemHidden != null) __obj.updateDynamic("dropdownItemHidden")(dropdownItemHidden.asInstanceOf[js.Any])
    if (dropdownItemSelected != null) __obj.updateDynamic("dropdownItemSelected")(dropdownItemSelected.asInstanceOf[js.Any])
    if (dropdownItemSelectedAndDisabled != null) __obj.updateDynamic("dropdownItemSelectedAndDisabled")(dropdownItemSelectedAndDisabled.asInstanceOf[js.Any])
    if (dropdownItems != null) __obj.updateDynamic("dropdownItems")(dropdownItems.asInstanceOf[js.Any])
    if (dropdownItemsWrapper != null) __obj.updateDynamic("dropdownItemsWrapper")(dropdownItemsWrapper.asInstanceOf[js.Any])
    if (dropdownOptionText != null) __obj.updateDynamic("dropdownOptionText")(dropdownOptionText.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyles]
  }
}

