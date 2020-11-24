package typings.officeUiFabricReact.tooltipTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TooltipDelay extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.types", "TooltipDelay")
@js.native
object TooltipDelay extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TooltipDelay with Double] = js.native
  
  /** 500 ms delay before showing the tooltip */
  @js.native
  sealed trait long extends TooltipDelay
  /* 2 */ @js.native
  object long extends TopLevel[long with Double]
  
  /** 300 ms delay before showng the tooltip */
  @js.native
  sealed trait medium extends TooltipDelay
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  @js.native
  sealed trait zero extends TooltipDelay
  /* 0 */ @js.native
  object zero extends TopLevel[zero with Double]
}
