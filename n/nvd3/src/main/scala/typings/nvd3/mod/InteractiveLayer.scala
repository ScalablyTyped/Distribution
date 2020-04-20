package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveLayer extends js.Object {
  var tooltip: Tooltip
}

object InteractiveLayer {
  @scala.inline
  def apply(tooltip: Tooltip): InteractiveLayer = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLayer]
  }
}

