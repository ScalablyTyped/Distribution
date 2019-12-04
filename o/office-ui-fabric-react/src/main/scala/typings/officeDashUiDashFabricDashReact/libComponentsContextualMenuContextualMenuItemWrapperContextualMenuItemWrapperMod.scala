package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperDotTypesMod.IContextualMenuItemWrapperProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper/ContextualMenuItemWrapper", JSImport.Namespace)
@js.native
object libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod extends js.Object {
  @js.native
  class ContextualMenuItemWrapper ()
    extends BaseComponent[IContextualMenuItemWrapperProps, js.Object] {
    /* protected */ def _getSubMenuId(item: IContextualMenuItem): js.UndefOr[String] = js.native
    /* protected */ def _getSubmenuTarget(): js.UndefOr[HTMLElement] = js.native
    /* protected */ def _onItemClick(ev: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    /* protected */ def _onItemKeyDown(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    /* protected */ def _onItemMouseEnter(ev: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    /* protected */ def _onItemMouseLeave(ev: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    /* protected */ def _onItemMouseMove(ev: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MContextualMenuItemWrapper(newProps: IContextualMenuItemWrapperProps): Boolean = js.native
  }
  
}

