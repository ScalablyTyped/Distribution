package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStartEvent extends StObject {
  
  var slider: Slider
}
object SliderStartEvent {
  
  inline def apply(slider: Slider): SliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStartEvent]
  }
  
  extension [Self <: SliderStartEvent](x: Self) {
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
  }
}
