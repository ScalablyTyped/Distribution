package typings.officeUiFabricReact.tooltipHostBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipHostState extends js.Object {
  var isAriaPlaceholderRendered: Boolean
  var isTooltipVisible: Boolean
}

object ITooltipHostState {
  @scala.inline
  def apply(isAriaPlaceholderRendered: Boolean, isTooltipVisible: Boolean): ITooltipHostState = {
    val __obj = js.Dynamic.literal(isAriaPlaceholderRendered = isAriaPlaceholderRendered.asInstanceOf[js.Any], isTooltipVisible = isTooltipVisible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITooltipHostState]
  }
}

