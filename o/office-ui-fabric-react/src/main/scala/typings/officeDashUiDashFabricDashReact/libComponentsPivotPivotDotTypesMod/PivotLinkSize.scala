package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.large
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotLinkSize with Double] = js.native
  /* 1 */ @js.native
  object large extends TopLevel[large with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

