package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDefinition
  extends StObject
     with PropertyDefinition {
  
  var events: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  
  var request: js.UndefOr[RequestDefinition] = js.undefined
  
  var response: js.UndefOr[js.Array[ResponseDefinition]] = js.undefined
}
object ItemDefinition {
  
  inline def apply(): ItemDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemDefinition] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: js.Array[EventDefinition]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: EventDefinition*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setRequest(value: RequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: js.Array[ResponseDefinition]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponseVarargs(value: ResponseDefinition*): Self = StObject.set(x, "response", js.Array(value*))
  }
}
