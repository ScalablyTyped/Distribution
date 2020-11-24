package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverBehaviorDelay extends js.Object {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
}
object HoverBehaviorDelay {
  
  @scala.inline
  def apply(): HoverBehaviorDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverBehaviorDelay]
  }
  
  @scala.inline
  implicit class HoverBehaviorDelayOps[Self <: HoverBehaviorDelay] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = this.set("hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBehaviorDelay: Self = this.set("hoverBehaviorDelay", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
  }
}
