package typings.officeUiFabricReact

import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuItemBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItem.base", "ContextualMenuItemBase")
  @js.native
  class ContextualMenuItemBase protected ()
    extends Component[IContextualMenuItemProps, js.Object, js.Any] {
    def this(props: IContextualMenuItemProps) = this()
    
    /* private */ var _renderLayout: js.Any = js.native
    
    def dismissMenu(): Unit = js.native
    def dismissMenu(dismissAll: Boolean): Unit = js.native
    
    def dismissSubMenu(): Unit = js.native
    
    def openSubMenu(): Unit = js.native
  }
}
