package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod

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
  sealed trait circle extends ShimmerElementType
  
  /**
    * Gap element type
    */
  @js.native
  sealed trait gap extends ShimmerElementType
  
  /**
    * Line element type
    */
  @js.native
  sealed trait line extends ShimmerElementType
  
  /* 2 */ val circle: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.circle with Double = js.native
  /* 3 */ val gap: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.gap with Double = js.native
  /* 1 */ val line: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.line with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShimmerElementType with Double] = js.native
}

