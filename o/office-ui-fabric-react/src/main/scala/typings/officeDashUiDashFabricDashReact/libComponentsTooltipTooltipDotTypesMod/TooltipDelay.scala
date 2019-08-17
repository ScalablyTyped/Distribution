package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TooltipDelay extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.types", "TooltipDelay")
@js.native
object TooltipDelay extends js.Object {
  @js.native
  sealed trait long extends TooltipDelay
  
  @js.native
  sealed trait medium extends TooltipDelay
  
  @js.native
  sealed trait zero extends TooltipDelay
  
  /* 2 */ val long: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.long with Double = js.native
  /* 1 */ val medium: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.medium with Double = js.native
  /* 0 */ val zero: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.zero with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TooltipDelay with Double] = js.native
}

