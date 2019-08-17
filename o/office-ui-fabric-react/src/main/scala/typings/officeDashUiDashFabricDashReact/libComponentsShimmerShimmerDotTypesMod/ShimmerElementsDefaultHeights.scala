package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod

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
  
  /* 24 */ val circle: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
  /* 16 */ val gap: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
  /* 16 */ val line: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShimmerElementsDefaultHeights with Double] = js.native
}

