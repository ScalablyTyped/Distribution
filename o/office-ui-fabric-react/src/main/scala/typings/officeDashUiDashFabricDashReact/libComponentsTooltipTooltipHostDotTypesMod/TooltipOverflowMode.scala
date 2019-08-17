package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TooltipOverflowMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.types", "TooltipOverflowMode")
@js.native
object TooltipOverflowMode extends js.Object {
  /** Only show tooltip if parent DOM element is overflowing */
  @js.native
  sealed trait Parent extends TooltipOverflowMode
  
  /** Only show tooltip if tooltip host's content is overflowing */
  @js.native
  sealed trait Self extends TooltipOverflowMode
  
  /* 0 */ val Parent: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode.Parent with Double = js.native
  /* 1 */ val Self: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode.Self with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TooltipOverflowMode with Double] = js.native
}

