package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverBehaviorDelay extends StObject {
  
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
  implicit class HoverBehaviorDelayMutableBuilder[Self <: HoverBehaviorDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelayUndefined: Self = StObject.set(x, "hoverBehaviorDelay", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
  }
}
