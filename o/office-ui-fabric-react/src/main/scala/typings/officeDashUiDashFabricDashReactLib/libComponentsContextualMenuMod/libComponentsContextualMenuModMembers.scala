package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu", JSImport.Namespace)
@js.native
object libComponentsContextualMenuModMembers extends js.Object {
  val ContextualMenu: js.Function1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  val ContextualMenuItem: js.Function1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  def canAnyMenuItemsCheck(
    items: js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
    ]
  ): scala.Boolean = js.native
  def getSubmenuItems(
    item: officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
  ): js.Any = js.native
}

