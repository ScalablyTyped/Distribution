package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardPanOptions extends StObject {
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var pixelDelta: js.UndefOr[Double] = js.undefined
}
object KeyboardPanOptions {
  
  @scala.inline
  def apply(): KeyboardPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardPanOptions]
  }
  
  @scala.inline
  implicit class KeyboardPanOptionsMutableBuilder[Self <: KeyboardPanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setPixelDelta(value: Double): Self = StObject.set(x, "pixelDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDeltaUndefined: Self = StObject.set(x, "pixelDelta", js.undefined)
  }
}
