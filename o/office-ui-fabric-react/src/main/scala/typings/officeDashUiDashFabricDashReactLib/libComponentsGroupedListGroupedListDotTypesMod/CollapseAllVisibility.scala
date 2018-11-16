package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollapseAllVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.types", "CollapseAllVisibility")
@js.native
object CollapseAllVisibility extends js.Object {
  @js.native
  sealed trait hidden
    extends officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility
  
  @js.native
  sealed trait visible
    extends officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility
  
  /* 0 */ val hidden: hidden with scala.Double = js.native
  /* 1 */ val visible: visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility with scala.Double
  ] = js.native
}

