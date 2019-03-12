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
    enabled: () => scala.Boolean,
    hide: TooltipHideOptions => scala.Unit,
    move: TooltipMoveOptions => scala.Unit,
    show: TooltipShowOptions => scala.Unit
  ): ITooltipService = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), hide = js.Any.fromFunction1(hide), move = js.Any.fromFunction1(move), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[ITooltipService]
  }
}

