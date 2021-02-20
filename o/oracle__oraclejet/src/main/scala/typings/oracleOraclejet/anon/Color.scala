package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[String] = js.native
  
  var diameter: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var endOpacity: js.UndefOr[Double] = js.native
  
  var offsetX: js.UndefOr[String] = js.native
  
  var offsetY: js.UndefOr[String] = js.native
  
  var startOpacity: js.UndefOr[Double] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDiameter(value: String): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEndOpacity(value: Double): Self = StObject.set(x, "endOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOpacityUndefined: Self = StObject.set(x, "endOpacity", js.undefined)
    
    @scala.inline
    def setOffsetX(value: String): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: String): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setStartOpacity(value: Double): Self = StObject.set(x, "startOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOpacityUndefined: Self = StObject.set(x, "startOpacity", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}
