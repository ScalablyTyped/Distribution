package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderStartEvent extends StObject {
  
  var slider: Slider = js.native
}
object SliderStartEvent {
  
  @scala.inline
  def apply(slider: Slider): SliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStartEvent]
  }
  
  @scala.inline
  implicit class SliderStartEventMutableBuilder[Self <: SliderStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
  }
}
