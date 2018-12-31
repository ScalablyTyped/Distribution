package typings
package officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod

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
  sealed trait large
    extends officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.PivotLinkSize
  
  /**
    * Display Link using normal font size
    */
  @js.native
  sealed trait normal
    extends officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.PivotLinkSize
  
  /* 1 */ val large: large with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod.PivotLinkSize with scala.Double
  ] = js.native
}

