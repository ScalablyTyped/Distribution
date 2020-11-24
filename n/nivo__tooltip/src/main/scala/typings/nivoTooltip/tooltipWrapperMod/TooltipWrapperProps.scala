package typings.nivoTooltip.tooltipWrapperMod

import typings.nivoTooltip.typesMod.TooltipAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipWrapperProps extends js.Object {
  
  var anchor: TooltipAnchor = js.native
  
  var position: js.Tuple2[Double, Double] = js.native
}
object TooltipWrapperProps {
  
  @scala.inline
  def apply(anchor: TooltipAnchor, position: js.Tuple2[Double, Double]): TooltipWrapperProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipWrapperProps]
  }
  
  @scala.inline
  implicit class TooltipWrapperPropsOps[Self <: TooltipWrapperProps] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: js.Tuple2[Double, Double]): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
