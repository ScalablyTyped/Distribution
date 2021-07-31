package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Kinetic
import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragPanOptions extends StObject {
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var kinetic: js.UndefOr[Kinetic] = js.undefined
}
object DragPanOptions {
  
  @scala.inline
  def apply(): DragPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragPanOptions]
  }
  
  @scala.inline
  implicit class DragPanOptionsMutableBuilder[Self <: DragPanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setKinetic(value: Kinetic): Self = StObject.set(x, "kinetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKineticUndefined: Self = StObject.set(x, "kinetic", js.undefined)
  }
}
