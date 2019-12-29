package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShimmerElementsDefaultHeights extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementsDefaultHeights")
@js.native
object ShimmerElementsDefaultHeights extends js.Object {
  /**
    * Default height of the circle element when not provided by user: 24px
    */
  @js.native
  sealed trait circle extends ShimmerElementsDefaultHeights
  
  /**
    * Default height of the gap element when not provided by user: 16px
    */
  @js.native
  sealed trait gap extends ShimmerElementsDefaultHeights
  
  /**
    * Default height of the line element when not provided by user: 16px
    */
  @js.native
  sealed trait line extends ShimmerElementsDefaultHeights
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShimmerElementsDefaultHeights with Double] = js.native
  /* 24 */ @js.native
  object circle extends TopLevel[circle with Double]
  
  /* 16 */ @js.native
  object gap extends TopLevel[gap with Double]
  
  /* 16 */ @js.native
  object line extends TopLevel[line with Double]
  
}

