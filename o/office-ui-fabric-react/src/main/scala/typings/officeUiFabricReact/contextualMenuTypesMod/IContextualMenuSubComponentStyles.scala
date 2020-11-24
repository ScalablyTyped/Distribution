package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyleProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuSubComponentStyles extends js.Object {
  
  /** Styles for the callout that hosts the ContextualMenu options. */
  var callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _] = js.native
  
  /** Styles for each menu item. */
  var menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _] = js.native
}
object IContextualMenuSubComponentStyles {
  
  @scala.inline
  def apply(
    callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _],
    menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]
  ): IContextualMenuSubComponentStyles = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], menuItem = menuItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuSubComponentStyles]
  }
  
  @scala.inline
  implicit class IContextualMenuSubComponentStylesOps[Self <: IContextualMenuSubComponentStyles] (val x: Self) extends AnyVal {
    
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
    def setCalloutFunction1(value: ICalloutContentStyleProps => DeepPartial[_]): Self = this.set("callout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallout(value: IStyleFunctionOrObject[ICalloutContentStyleProps, _]): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemFunction1(value: IContextualMenuItemStyleProps => DeepPartial[_]): Self = this.set("menuItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuItem(value: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]): Self = this.set("menuItem", value.asInstanceOf[js.Any])
  }
}
