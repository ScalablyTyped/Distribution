package typings.nivoTooltip.contextMod

import typings.nivoTooltip.nivoTooltipBooleans.`true`
import typings.nivoTooltip.typesMod.TooltipAnchor
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipStateContextDataVisible extends TooltipStateContextData {
  
  var anchor: TooltipAnchor = js.native
  
  var content: Element = js.native
  
  var isVisible: `true` = js.native
  
  var position: js.Tuple2[Double, Double] = js.native
}
object TooltipStateContextDataVisible {
  
  @scala.inline
  def apply(anchor: TooltipAnchor, content: Element, isVisible: `true`, position: js.Tuple2[Double, Double]): TooltipStateContextDataVisible = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipStateContextDataVisible]
  }
  
  @scala.inline
  implicit class TooltipStateContextDataVisibleOps[Self <: TooltipStateContextDataVisible] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: TooltipAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Element): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: `true`): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Tuple2[Double, Double]): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
