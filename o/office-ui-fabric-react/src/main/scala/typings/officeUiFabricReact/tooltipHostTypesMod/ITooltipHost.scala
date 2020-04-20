package typings.officeUiFabricReact.tooltipHostTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipHost extends js.Object {
  /**
    * Dismisses the tooltip.
    */
  def dismiss(): Unit
  /**
    * Shows the tooltip.
    */
  def show(): Unit
}

object ITooltipHost {
  @scala.inline
  def apply(dismiss: () => Unit, show: () => Unit): ITooltipHost = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ITooltipHost]
  }
}

