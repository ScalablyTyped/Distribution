package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectableOptionMenuItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/selectableOption/SelectableOption.types", "SelectableOptionMenuItemType")
@js.native
object SelectableOptionMenuItemType extends js.Object {
  @js.native
  sealed trait Divider
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType
  
  @js.native
  sealed trait Header
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType
  
  @js.native
  sealed trait Normal
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType
  
  /* 1 */ val Divider: Divider with scala.Double = js.native
  /* 2 */ val Header: Header with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType with scala.Double
  ] = js.native
}

