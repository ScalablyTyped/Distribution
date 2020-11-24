package typings.officeUiFabricReact.tooltipHostTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TooltipOverflowMode extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.types", "TooltipOverflowMode")
@js.native
object TooltipOverflowMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TooltipOverflowMode with Double] = js.native
  
  /** Only show tooltip if parent DOM element is overflowing */
  @js.native
  sealed trait Parent extends TooltipOverflowMode
  /* 0 */ @js.native
  object Parent extends TopLevel[Parent with Double]
  
  /**
    * Only show tooltip if tooltip host's content is overflowing.
    * Note that this does not check the children for overflow, only the TooltipHost root.
    */
  @js.native
  sealed trait Self extends TooltipOverflowMode
  /* 1 */ @js.native
  object Self extends TopLevel[Self with Double]
}
