package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.contextualMenuTypesMod.IMenuItemStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuCnstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.cnstyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.cnstyles", "CONTEXTUAL_MENU_ITEM_HEIGHT")
  @js.native
  val CONTEXTUAL_MENU_ITEM_HEIGHT: /* 36 */ Double = js.native
  
  @scala.inline
  def getMenuItemStyles(theme: ITheme): IMenuItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[IMenuItemStyles]
}
