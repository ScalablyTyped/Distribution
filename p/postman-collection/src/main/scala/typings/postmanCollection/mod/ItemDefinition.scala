package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemDefinition extends PropertyDefinition {
  
  var events: js.UndefOr[js.Array[EventDefinition]] = js.native
  
  var request: js.UndefOr[RequestDefinition] = js.native
  
  var response: js.UndefOr[js.Array[ResponseDefinition]] = js.native
}
object ItemDefinition {
  
  @scala.inline
  def apply(): ItemDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemDefinition]
  }
  
  @scala.inline
  implicit class ItemDefinitionMutableBuilder[Self <: ItemDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[EventDefinition]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: EventDefinition*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: RequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Array[ResponseDefinition]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setResponseVarargs(value: ResponseDefinition*): Self = StObject.set(x, "response", js.Array(value :_*))
  }
}
