package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", "SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait multiple
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  
  @js.native
  sealed trait single
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  
  /* 2 */ val multiple: multiple with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode with scala.Double
  ] = js.native
}

