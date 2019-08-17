package typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectableOptionMenuItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/selectableOption/SelectableOption.types", "SelectableOptionMenuItemType")
@js.native
object SelectableOptionMenuItemType extends js.Object {
  @js.native
  sealed trait Divider extends SelectableOptionMenuItemType
  
  @js.native
  sealed trait Header extends SelectableOptionMenuItemType
  
  @js.native
  sealed trait Normal extends SelectableOptionMenuItemType
  
  /* 1 */ val Divider: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
  /* 2 */ val Header: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
  /* 0 */ val Normal: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
}

