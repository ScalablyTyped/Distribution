package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderEndEvent extends StObject {
  
  var slider: Slider
  
  var step: SliderStep
}
object SliderEndEvent {
  
  @scala.inline
  def apply(slider: Slider, step: SliderStep): SliderEndEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderEndEvent]
  }
  
  @scala.inline
  implicit class SliderEndEventMutableBuilder[Self <: SliderEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
