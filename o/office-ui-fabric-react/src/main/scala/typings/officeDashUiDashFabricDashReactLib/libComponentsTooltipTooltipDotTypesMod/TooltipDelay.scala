package typings
package officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TooltipDelay extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.types", "TooltipDelay")
@js.native
object TooltipDelay extends js.Object {
  @js.native
  sealed trait long
    extends officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod.TooltipDelay
  
  @js.native
  sealed trait medium
    extends officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod.TooltipDelay
  
  @js.native
  sealed trait zero
    extends officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod.TooltipDelay
  
  /* 2 */ val long: long with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  /* 0 */ val zero: zero with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod.TooltipDelay with scala.Double
  ] = js.native
}

