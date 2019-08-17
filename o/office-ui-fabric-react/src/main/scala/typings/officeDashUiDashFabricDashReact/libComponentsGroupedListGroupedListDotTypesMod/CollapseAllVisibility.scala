package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollapseAllVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.types", "CollapseAllVisibility")
@js.native
object CollapseAllVisibility extends js.Object {
  @js.native
  sealed trait hidden extends CollapseAllVisibility
  
  @js.native
  sealed trait visible extends CollapseAllVisibility
  
  /* 0 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.hidden with Double = js.native
  /* 1 */ val visible: typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollapseAllVisibility with Double] = js.native
}

