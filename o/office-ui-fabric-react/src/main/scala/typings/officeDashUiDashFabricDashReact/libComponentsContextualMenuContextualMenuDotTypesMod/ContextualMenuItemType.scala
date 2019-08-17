package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextualMenuItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "ContextualMenuItemType")
@js.native
object ContextualMenuItemType extends js.Object {
  @js.native
  sealed trait Divider extends ContextualMenuItemType
  
  @js.native
  sealed trait Header extends ContextualMenuItemType
  
  @js.native
  sealed trait Normal extends ContextualMenuItemType
  
  @js.native
  sealed trait Section extends ContextualMenuItemType
  
  /* 1 */ val Divider: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Divider with Double = js.native
  /* 2 */ val Header: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Header with Double = js.native
  /* 0 */ val Normal: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Normal with Double = js.native
  /* 3 */ val Section: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Section with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextualMenuItemType with Double] = js.native
}

