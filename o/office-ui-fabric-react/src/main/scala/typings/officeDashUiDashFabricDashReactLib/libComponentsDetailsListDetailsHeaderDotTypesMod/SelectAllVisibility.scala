package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectAllVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types", "SelectAllVisibility")
@js.native
object SelectAllVisibility extends js.Object {
  @js.native
  sealed trait hidden
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility
  
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility
  
  @js.native
  sealed trait visible
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility
  
  /* 1 */ val hidden: hidden with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val visible: visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility with scala.Double
  ] = js.native
}

