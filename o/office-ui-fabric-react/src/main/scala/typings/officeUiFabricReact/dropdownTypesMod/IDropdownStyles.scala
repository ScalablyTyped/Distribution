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
    * @deprecated Use `subComponentStyles.panel` instead.
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
    callout: js.UndefOr[Null | IStyle] = js.undefined,
    caretDown: js.UndefOr[Null | IStyle] = js.undefined,
    caretDownWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    dropdown: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownDivider: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItem: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItemDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItemHeader: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItemHidden: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItemSelected: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItemSelectedAndDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItems: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownItemsWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownOptionText: js.UndefOr[Null | IStyle] = js.undefined,
    errorMessage: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    panel: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    title: js.UndefOr[Null | IStyle] = js.undefined
  ): IDropdownStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (!js.isUndefined(caretDown)) __obj.updateDynamic("caretDown")(caretDown.asInstanceOf[js.Any])
    if (!js.isUndefined(caretDownWrapper)) __obj.updateDynamic("caretDownWrapper")(caretDownWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownDivider)) __obj.updateDynamic("dropdownDivider")(dropdownDivider.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItem)) __obj.updateDynamic("dropdownItem")(dropdownItem.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItemDisabled)) __obj.updateDynamic("dropdownItemDisabled")(dropdownItemDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItemHeader)) __obj.updateDynamic("dropdownItemHeader")(dropdownItemHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItemHidden)) __obj.updateDynamic("dropdownItemHidden")(dropdownItemHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItemSelected)) __obj.updateDynamic("dropdownItemSelected")(dropdownItemSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItemSelectedAndDisabled)) __obj.updateDynamic("dropdownItemSelectedAndDisabled")(dropdownItemSelectedAndDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItems)) __obj.updateDynamic("dropdownItems")(dropdownItems.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownItemsWrapper)) __obj.updateDynamic("dropdownItemsWrapper")(dropdownItemsWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownOptionText)) __obj.updateDynamic("dropdownOptionText")(dropdownOptionText.asInstanceOf[js.Any])
    if (!js.isUndefined(errorMessage)) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(panel)) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyles]
  }
}

