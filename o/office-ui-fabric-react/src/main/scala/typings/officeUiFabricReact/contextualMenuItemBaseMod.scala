package typings.officeUiFabricReact

import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItem.base", JSImport.Namespace)
@js.native
object contextualMenuItemBaseMod extends js.Object {
  @js.native
  class ContextualMenuItemBase protected ()
    extends Component[IContextualMenuItemProps, js.Object, js.Any] {
    def this(props: IContextualMenuItemProps) = this()
    def dismissMenu(): Unit = js.native
    def dismissMenu(dismissAll: Boolean): Unit = js.native
    def dismissSubMenu(): Unit = js.native
    def openSubMenu(): Unit = js.native
  }
  
}

