package typings
package officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod

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
  sealed trait Parent
    extends officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode
  
  /** Only show tooltip if tooltip host's content is overflowing */
  @js.native
  sealed trait Self
    extends officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode
  
  /* 0 */ val Parent: Parent with scala.Double = js.native
  /* 1 */ val Self: Self with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode with scala.Double
  ] = js.native
}

