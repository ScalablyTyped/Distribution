package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.circle
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.gap
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.line
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShimmerElementType with Double] = js.native
  /* 2 */ @js.native
  object circle extends TopLevel[circle with Double]
  
  /* 3 */ @js.native
  object gap extends TopLevel[gap with Double]
  
  /* 1 */ @js.native
  object line extends TopLevel[line with Double]
  
}

