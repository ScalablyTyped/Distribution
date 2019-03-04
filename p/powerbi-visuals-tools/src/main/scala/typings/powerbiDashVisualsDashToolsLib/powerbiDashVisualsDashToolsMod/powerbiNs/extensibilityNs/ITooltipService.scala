package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipService extends js.Object {
  def enabled(): scala.Boolean
  def hide(options: TooltipHideOptions): scala.Unit
  def move(options: TooltipMoveOptions): scala.Unit
  def show(options: TooltipShowOptions): scala.Unit
}

object ITooltipService {
  @scala.inline
  def apply(
    enabled: js.Function0[scala.Boolean],
    hide: js.Function1[TooltipHideOptions, scala.Unit],
    move: js.Function1[TooltipMoveOptions, scala.Unit],
    show: js.Function1[TooltipShowOptions, scala.Unit]
  ): ITooltipService = {
    val __obj = js.Dynamic.literal(enabled = enabled, hide = hide, move = move, show = show)
  
    __obj.asInstanceOf[ITooltipService]
  }
}

