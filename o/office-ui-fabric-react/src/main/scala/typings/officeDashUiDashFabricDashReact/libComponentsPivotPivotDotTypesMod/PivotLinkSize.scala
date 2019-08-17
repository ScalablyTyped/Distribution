package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotLinkSize extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkSize")
@js.native
object PivotLinkSize extends js.Object {
  /**
    * Display links using large font size
    */
  @js.native
  sealed trait large extends PivotLinkSize
  
  /**
    * Display Link using normal font size
    */
  @js.native
  sealed trait normal extends PivotLinkSize
  
  /* 1 */ val large: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.large with Double = js.native
  /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotLinkSize with Double] = js.native
}

