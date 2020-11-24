package typings.officeUiFabricReact

import typings.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper/ContextualMenuItemWrapper", JSImport.Namespace)
@js.native
object contextualMenuItemWrapperContextualMenuItemWrapperMod extends js.Object {
  
  @js.native
  class ContextualMenuItemWrapper protected ()
    extends Component[IContextualMenuItemWrapperProps, js.Object, js.Any] {
    def this(props: IContextualMenuItemWrapperProps) = this()
    
    /* protected */ def _getSubMenuId(item: IContextualMenuItem): js.UndefOr[String] = js.native
    
    /* protected */ def _getSubmenuTarget(): js.UndefOr[HTMLElement] = js.native
    
    /* protected */ def _onItemClick(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    /* protected */ def _onItemKeyDown(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseEnter(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    /* protected */ def _onItemMouseLeave(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    /* protected */ def _onItemMouseMove(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MContextualMenuItemWrapper(newProps: IContextualMenuItemWrapperProps): Boolean = js.native
  }
}
