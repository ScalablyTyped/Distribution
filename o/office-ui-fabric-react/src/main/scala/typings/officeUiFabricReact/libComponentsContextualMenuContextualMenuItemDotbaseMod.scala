package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextualMenuContextualMenuItemDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItem.base", "ContextualMenuItemBase")
  @js.native
  open class ContextualMenuItemBase protected ()
    extends Component[IContextualMenuItemProps, js.Object, Any] {
    def this(props: IContextualMenuItemProps) = this()
    
    /* private */ var _renderLayout: Any = js.native
    
    def dismissMenu(): Unit = js.native
    def dismissMenu(dismissAll: Boolean): Unit = js.native
    
    def dismissSubMenu(): Unit = js.native
    
    def openSubMenu(): Unit = js.native
  }
}
