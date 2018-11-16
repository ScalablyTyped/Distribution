package typings
package officeDashUiDashFabricDashReactLib.libComponentsDropdownDropdownDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDropdownStyles extends js.Object {
  /** Refers to the callout that hosts Dropdown options in larger viewports. */
  var callout: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the downward pointing caret icon users click on to expand the Dropdown. */
  var caretDown: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the wrapping container around the downward pointing caret users click on to expand the Dropdown. */
  var caretDownWrapper: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the actual Dropdown element. */
  var dropdown: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the dropdown seperator. */
  var dropdownDivider: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the individual dropdown item. */
  var dropdownItem: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Style for a dropdown item when it is disabled. */
  var dropdownItemDisabled: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the individual dropdown items that are being rendered as a header. */
  var dropdownItemHeader: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Style for a dropdown item when it is being selected. */
  var dropdownItemSelected: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Style for a dropdown item when it is both selected and disabled. */
  var dropdownItemSelectedAndDisabled: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the FocusZone wrapping the individual dropdown items. */
  var dropdownItems: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the element that wraps `dropdownItems`. */
  var dropdownItemsWrapper: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /**
       * Refers to the text element that renders the actual dropdown item/option text. This would be wrapped by the element
       * referred to by `dropdownItem`.
       */
  var dropdownOptionText: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the error message being rendered under the Dropdown (if any). */
  var errorMessage: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Refers to the label associated with the dropdown. This is enclosed by the root. */
  var label: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /**
       * Refers to the panel that hosts the Dropdown options in small viewports.
       * Note: This will be deprecated when Panel supports JS Styling.
       */
  var panel: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Root element of the Dropdown (includes Label and the actual Dropdown). */
  var root: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
  /** Subcomponent styles. */
  var subComponentStyles: IDropdownSubComponentStyles
  /** Refers to the primary title of the Dropdown (rendering the selected options/placeholder/etc.). */
  var title: atUifabricMergeDashStylesLib.libIStyleMod.IStyle
}

