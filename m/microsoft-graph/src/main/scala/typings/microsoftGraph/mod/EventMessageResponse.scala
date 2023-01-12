package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMessageResponse
  extends StObject
     with EventMessage {
  
  var proposedNewTime: js.UndefOr[NullableOption[TimeSlot]] = js.undefined
  
  var responseType: js.UndefOr[NullableOption[ResponseType]] = js.undefined
}
object EventMessageResponse {
  
  inline def apply(): EventMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventMessageResponse] (val x: Self) extends AnyVal {
    
    inline def setProposedNewTime(value: NullableOption[TimeSlot]): Self = StObject.set(x, "proposedNewTime", value.asInstanceOf[js.Any])
    
    inline def setProposedNewTimeNull: Self = StObject.set(x, "proposedNewTime", null)
    
    inline def setProposedNewTimeUndefined: Self = StObject.set(x, "proposedNewTime", js.undefined)
    
    inline def setResponseType(value: NullableOption[ResponseType]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
