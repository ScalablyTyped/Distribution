package typings.playable.tooltipTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipPosition extends js.Object {
  
  var placement: TooltipPositionPlacement = js.native
  
  var x: Double = js.native
}
object ITooltipPosition {
  
  @scala.inline
  def apply(placement: TooltipPositionPlacement, x: Double): ITooltipPosition = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipPosition]
  }
  
  @scala.inline
  implicit class ITooltipPositionOps[Self <: ITooltipPosition] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: TooltipPositionPlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
  }
}
