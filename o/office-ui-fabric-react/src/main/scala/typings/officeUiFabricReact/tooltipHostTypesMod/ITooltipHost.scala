package typings.officeUiFabricReact.tooltipHostTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipHost extends js.Object {
  /**
    * Dismisses the tooltip.
    */
  def dismiss(): Unit = js.native
  /**
    * Shows the tooltip.
    */
  def show(): Unit = js.native
}

object ITooltipHost {
  @scala.inline
  def apply(dismiss: () => Unit, show: () => Unit): ITooltipHost = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ITooltipHost]
  }
  @scala.inline
  implicit class ITooltipHostOps[Self <: ITooltipHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDismiss(value: () => Unit): Self = this.set("dismiss", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

