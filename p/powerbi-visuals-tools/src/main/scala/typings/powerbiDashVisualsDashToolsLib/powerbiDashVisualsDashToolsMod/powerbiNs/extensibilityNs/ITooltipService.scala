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

