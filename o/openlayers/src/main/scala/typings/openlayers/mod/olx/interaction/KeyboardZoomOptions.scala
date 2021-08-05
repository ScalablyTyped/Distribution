package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardZoomOptions extends StObject {
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object KeyboardZoomOptions {
  
  inline def apply(): KeyboardZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardZoomOptions]
  }
  
  extension [Self <: KeyboardZoomOptions](x: Self) {
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
