package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod

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
  sealed trait circle
    extends officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights
  
  /**
    * Default height of the gap element when not provided by user: 16px
    */
  @js.native
  sealed trait gap
    extends officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights
  
  /**
    * Default height of the line element when not provided by user: 16px
    */
  @js.native
  sealed trait line
    extends officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights
  
  /* 24 */ val circle: circle with scala.Double = js.native
  /* 16 */ val gap: gap with scala.Double = js.native
  /* 16 */ val line: line with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights with scala.Double
  ] = js.native
}

