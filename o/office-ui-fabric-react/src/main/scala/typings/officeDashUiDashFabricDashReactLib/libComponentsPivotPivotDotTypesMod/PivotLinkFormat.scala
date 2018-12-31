package typings
package officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotLinkFormat extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkFormat")
@js.native
object PivotLinkFormat extends js.Object {
  /**
    * Display Pivot Links as links
    */
  @js.native
  sealed trait links
    extends officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.PivotLinkFormat
  
  /**
    * Display Pivot Links as Tabs
    */
  @js.native
  sealed trait tabs
    extends officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.PivotLinkFormat
  
  /* 0 */ val links: links with scala.Double = js.native
  /* 1 */ val tabs: tabs with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.PivotLinkFormat with scala.Double
  ] = js.native
}

