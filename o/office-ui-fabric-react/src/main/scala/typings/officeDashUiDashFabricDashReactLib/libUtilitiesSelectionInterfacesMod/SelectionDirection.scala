package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", "SelectionDirection")
@js.native
object SelectionDirection extends js.Object {
  @js.native
  sealed trait horizontal
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionDirection
  
  @js.native
  sealed trait vertical
    extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionDirection
  
  /* 0 */ val horizontal: horizontal with scala.Double = js.native
  /* 1 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionDirection with scala.Double
  ] = js.native
}

