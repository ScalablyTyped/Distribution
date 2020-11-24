package typings.officeUiFabricReact.shimmerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShimmerElementsDefaultHeights extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementsDefaultHeights")
@js.native
object ShimmerElementsDefaultHeights extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShimmerElementsDefaultHeights with Double] = js.native
  
  /**
    * Default height of the circle element when not provided by user: 24px
    */
  @js.native
  sealed trait circle extends ShimmerElementsDefaultHeights
  /* 24 */ @js.native
  object circle extends TopLevel[circle with Double]
  
  /**
    * Default height of the gap element when not provided by user: 16px
    */
  @js.native
  sealed trait gap extends ShimmerElementsDefaultHeights
  /* 16 */ @js.native
  object gap extends TopLevel[gap with Double]
  
  /**
    * Default height of the line element when not provided by user: 16px
    */
  @js.native
  sealed trait line extends ShimmerElementsDefaultHeights
  /* 16 */ @js.native
  object line extends TopLevel[line with Double]
}
