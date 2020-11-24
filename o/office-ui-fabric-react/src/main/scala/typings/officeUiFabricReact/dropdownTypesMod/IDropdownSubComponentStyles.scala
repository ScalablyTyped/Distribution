package typings.officeUiFabricReact.dropdownTypesMod

import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyleProps
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyles
import typings.officeUiFabricReact.labelTypesMod.ILabelStyleProps
import typings.officeUiFabricReact.labelTypesMod.ILabelStyles
import typings.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typings.officeUiFabricReact.panelTypesMod.IPanelStyles
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDropdownSubComponentStyles extends js.Object {
  
  /** Refers to the primary label for the Dropdown. */
  var label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles] = js.native
  
  /** Refers to the individual dropdown item when the multiSelect prop is true. */
  var multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles] = js.native
  
  /** Refers to the panel that hosts the Dropdown options in small viewports. */
  var panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles] = js.native
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
  
  @scala.inline
  implicit class IDropdownSubComponentStylesOps[Self <: IDropdownSubComponentStyles] (val x: Self) extends AnyVal {
    
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
    def setLabelFunction1(value: ILabelStyleProps => DeepPartial[ILabelStyles]): Self = this.set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelectItemFunction1(value: ICheckboxStyleProps => DeepPartial[ICheckboxStyles]): Self = this.set("multiSelectItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiSelectItem(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = this.set("multiSelectItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelFunction1(value: IPanelStyleProps => DeepPartial[IPanelStyles]): Self = this.set("panel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanel(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = this.set("panel", value.asInstanceOf[js.Any])
  }
}
