package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

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
  sealed trait links extends PivotLinkFormat
  
  /**
    * Display Pivot Links as Tabs
    */
  @js.native
  sealed trait tabs extends PivotLinkFormat
  
  /* 0 */ val links: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.links with Double = js.native
  /* 1 */ val tabs: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.tabs with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotLinkFormat with Double] = js.native
}

