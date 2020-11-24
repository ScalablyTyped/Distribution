package typings.playable.tooltipTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipStyles extends js.Object {
  
  var showAsElement: String = js.native
  
  var showAsText: String = js.native
  
  var tooltip: String = js.native
  
  var tooltipInner: String = js.native
  
  var tooltipVisible: String = js.native
}
object ITooltipStyles {
  
  @scala.inline
  def apply(
    showAsElement: String,
    showAsText: String,
    tooltip: String,
    tooltipInner: String,
    tooltipVisible: String
  ): ITooltipStyles = {
    val __obj = js.Dynamic.literal(showAsElement = showAsElement.asInstanceOf[js.Any], showAsText = showAsText.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipInner = tooltipInner.asInstanceOf[js.Any], tooltipVisible = tooltipVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStyles]
  }
  
  @scala.inline
  implicit class ITooltipStylesOps[Self <: ITooltipStyles] (val x: Self) extends AnyVal {
    
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
    def setShowAsElement(value: String): Self = this.set("showAsElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsText(value: String): Self = this.set("showAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipInner(value: String): Self = this.set("tooltipInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipVisible(value: String): Self = this.set("tooltipVisible", value.asInstanceOf[js.Any])
  }
}
