package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveLayer extends js.Object {
  var tooltip: Tooltip = js.native
}

object InteractiveLayer {
  @scala.inline
  def apply(tooltip: Tooltip): InteractiveLayer = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLayer]
  }
  @scala.inline
  implicit class InteractiveLayerOps[Self <: InteractiveLayer] (val x: Self) extends AnyVal {
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
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

