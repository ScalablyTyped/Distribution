package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutContentStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuSubComponentStyles extends js.Object {
  /** Styles for the callout that hosts the ContextualMenu options. */
  var callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _]
  /** Styles for each menu item. */
  var menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]
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
}

