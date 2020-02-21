package typings.officeUiFabricReact.dropdownTypesMod

import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyleProps
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyles
import typings.officeUiFabricReact.labelTypesMod.ILabelStyleProps
import typings.officeUiFabricReact.labelTypesMod.ILabelStyles
import typings.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typings.officeUiFabricReact.panelTypesMod.IPanelStyles
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownSubComponentStyles extends js.Object {
  /** Refers to the primary label for the Dropdown. */
  var label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]
  /** Refers to the individual dropdown item when the multiSelect prop is true. */
  var multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]
  /** Refers to the panel that hosts the Dropdown options in small viewports. */
  var panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]
}

object IDropdownSubComponentStyles {
  @scala.inline
  def apply(
    label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles],
    multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles],
    panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]
  ): IDropdownSubComponentStyles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], multiSelectItem = multiSelectItem.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDropdownSubComponentStyles]
  }
}

