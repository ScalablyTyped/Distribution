package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverBehaviorDelay extends StObject {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}
object HoverBehaviorDelay {
  
  inline def apply(): HoverBehaviorDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverBehaviorDelay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverBehaviorDelay] (val x: Self) extends AnyVal {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelayUndefined: Self = StObject.set(x, "hoverBehaviorDelay", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
  }
}
