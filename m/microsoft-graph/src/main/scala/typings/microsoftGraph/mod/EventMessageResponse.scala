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
  
  @scala.inline
  def apply(): EventMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessageResponse]
  }
  
  @scala.inline
  implicit class EventMessageResponseMutableBuilder[Self <: EventMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposedNewTime(value: NullableOption[TimeSlot]): Self = StObject.set(x, "proposedNewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedNewTimeNull: Self = StObject.set(x, "proposedNewTime", null)
    
    @scala.inline
    def setProposedNewTimeUndefined: Self = StObject.set(x, "proposedNewTime", js.undefined)
    
    @scala.inline
    def setResponseType(value: NullableOption[ResponseType]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
