package typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Divider
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Header
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
  /* 1 */ @js.native
  object Divider extends TopLevel[Divider with Double]
  
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

