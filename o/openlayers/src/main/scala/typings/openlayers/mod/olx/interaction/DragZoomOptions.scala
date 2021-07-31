package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragZoomOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var out: js.UndefOr[Boolean] = js.undefined
}
object DragZoomOptions {
  
  @scala.inline
  def apply(): DragZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragZoomOptions]
  }
  
  @scala.inline
  implicit class DragZoomOptionsMutableBuilder[Self <: DragZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
  }
}
