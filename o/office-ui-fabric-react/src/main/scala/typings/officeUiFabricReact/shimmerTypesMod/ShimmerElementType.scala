package typings.officeUiFabricReact.shimmerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShimmerElementType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementType")
@js.native
object ShimmerElementType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShimmerElementType with Double] = js.native
  
  /**
    * Circle element type
    */
  @js.native
  sealed trait circle extends ShimmerElementType
  /* 2 */ @js.native
  object circle extends TopLevel[circle with Double]
  
  /**
    * Gap element type
    */
  @js.native
  sealed trait gap extends ShimmerElementType
  /* 3 */ @js.native
  object gap extends TopLevel[gap with Double]
  
  /**
    * Line element type
    */
  @js.native
  sealed trait line extends ShimmerElementType
  /* 1 */ @js.native
  object line extends TopLevel[line with Double]
}
