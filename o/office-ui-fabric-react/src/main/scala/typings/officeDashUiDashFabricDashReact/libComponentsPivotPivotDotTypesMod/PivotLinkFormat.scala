package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.links
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.tabs
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotLinkFormat with Double] = js.native
  /* 0 */ @js.native
  object links extends TopLevel[links with Double]
  
  /* 1 */ @js.native
  object tabs extends TopLevel[tabs with Double]
  
}

