package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShimmerElementType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementType")
@js.native
object ShimmerElementType extends js.Object {
  /**
       * Circle element type
       */
  @js.native
  sealed trait circle
    extends officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType
  
  /**
       * Gap element type
       */
  @js.native
  sealed trait gap
    extends officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType
  
  /**
       * Line element type
       */
  @js.native
  sealed trait line
    extends officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType
  
  /* 2 */ val circle: circle with scala.Double = js.native
  /* 3 */ val gap: gap with scala.Double = js.native
  /* 1 */ val line: line with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType with scala.Double
  ] = js.native
}

