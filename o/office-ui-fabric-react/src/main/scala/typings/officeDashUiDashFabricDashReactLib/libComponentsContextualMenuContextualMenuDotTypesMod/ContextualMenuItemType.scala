package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextualMenuItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "ContextualMenuItemType")
@js.native
object ContextualMenuItemType extends js.Object {
  @js.native
  sealed trait Divider
    extends officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType
  
  @js.native
  sealed trait Header
    extends officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType
  
  @js.native
  sealed trait Normal
    extends officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType
  
  @js.native
  sealed trait Section
    extends officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType
  
  /* 1 */ val Divider: Divider with scala.Double = js.native
  /* 2 */ val Header: Header with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 3 */ val Section: Section with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType with scala.Double
  ] = js.native
}

