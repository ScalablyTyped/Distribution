package typings.officeDashUiDashFabricDashReact.libComponentsDropdownDropdownDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsLabelLabelDotTypesMod.ILabelStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.IPanelStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownSubComponentStyles extends js.Object {
  /** Refers to the primary label for the Dropdown. */
  var label: IStyleFunctionOrObject[ILabelStyleProps, _]
  /** Refers to the individual dropdown item when the multiSelect prop is true. */
  var multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, _]
  /** Refers to the panel that hosts the Dropdown options in small viewports. */
  var panel: IStyleFunctionOrObject[IPanelStyleProps, _]
}

object IDropdownSubComponentStyles {
  @scala.inline
  def apply(
    label: IStyleFunctionOrObject[ILabelStyleProps, _],
    multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, _],
    panel: IStyleFunctionOrObject[IPanelStyleProps, _]
  ): IDropdownSubComponentStyles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], multiSelectItem = multiSelectItem.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDropdownSubComponentStyles]
  }
}

