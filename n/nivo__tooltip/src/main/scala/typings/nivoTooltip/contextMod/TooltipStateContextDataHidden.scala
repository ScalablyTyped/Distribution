package typings.nivoTooltip.contextMod

import typings.nivoTooltip.nivoTooltipBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipStateContextDataHidden extends TooltipStateContextData {
  
  var anchor: Null = js.native
  
  var content: Null = js.native
  
  var isVisible: `false` = js.native
  
  var position: js.Tuple2[Null, Null] = js.native
}
object TooltipStateContextDataHidden {
  
  @scala.inline
  def apply(anchor: Null, content: Null, isVisible: `false`, position: js.Tuple2[Null, Null]): TooltipStateContextDataHidden = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipStateContextDataHidden]
  }
  
  @scala.inline
  implicit class TooltipStateContextDataHiddenOps[Self <: TooltipStateContextDataHidden] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Null): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Null): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: `false`): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Tuple2[Null, Null]): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
