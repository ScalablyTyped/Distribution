package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.hidden
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.visible
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollapseAllVisibility with Double] = js.native
  /* 0 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 1 */ @js.native
  object visible extends TopLevel[visible with Double]
  
}

