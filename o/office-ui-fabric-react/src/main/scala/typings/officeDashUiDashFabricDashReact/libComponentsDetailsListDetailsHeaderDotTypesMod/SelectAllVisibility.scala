package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectAllVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types", "SelectAllVisibility")
@js.native
object SelectAllVisibility extends js.Object {
  @js.native
  sealed trait hidden extends SelectAllVisibility
  
  @js.native
  sealed trait none extends SelectAllVisibility
  
  @js.native
  sealed trait visible extends SelectAllVisibility
  
  /* 1 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.hidden with Double = js.native
  /* 0 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.none with Double = js.native
  /* 2 */ val visible: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectAllVisibility with Double] = js.native
}

