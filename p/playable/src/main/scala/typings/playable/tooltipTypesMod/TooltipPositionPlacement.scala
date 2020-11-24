package typings.playable.tooltipTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TooltipPositionPlacement extends js.Object
@JSImport("playable/dist/src/modules/ui/core/tooltip/types", "TooltipPositionPlacement")
@js.native
object TooltipPositionPlacement extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TooltipPositionPlacement with String] = js.native
  
  @js.native
  sealed trait BOTTOM extends TooltipPositionPlacement
  /* "bottom" */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with String]
  
  @js.native
  sealed trait TOP extends TooltipPositionPlacement
  /* "top" */ @js.native
  object TOP extends TopLevel[TOP with String]
}
