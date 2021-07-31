package typings.microsoftGraph.mod

import typings.microsoftGraph.mod.CallRecords.CallRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudCommunications
  extends StObject
     with Entity {
  
  var callRecords: js.UndefOr[NullableOption[js.Array[CallRecord]]] = js.undefined
  
  var calls: js.UndefOr[NullableOption[js.Array[Call]]] = js.undefined
  
  var onlineMeetings: js.UndefOr[NullableOption[js.Array[OnlineMeeting]]] = js.undefined
}
object CloudCommunications {
  
  @scala.inline
  def apply(): CloudCommunications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudCommunications]
  }
  
  @scala.inline
  implicit class CloudCommunicationsMutableBuilder[Self <: CloudCommunications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallRecords(value: NullableOption[js.Array[CallRecord]]): Self = StObject.set(x, "callRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallRecordsNull: Self = StObject.set(x, "callRecords", null)
    
    @scala.inline
    def setCallRecordsUndefined: Self = StObject.set(x, "callRecords", js.undefined)
    
    @scala.inline
    def setCallRecordsVarargs(value: CallRecord*): Self = StObject.set(x, "callRecords", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: NullableOption[js.Array[Call]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallsNull: Self = StObject.set(x, "calls", null)
    
    @scala.inline
    def setCallsUndefined: Self = StObject.set(x, "calls", js.undefined)
    
    @scala.inline
    def setCallsVarargs(value: Call*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    @scala.inline
    def setOnlineMeetings(value: NullableOption[js.Array[OnlineMeeting]]): Self = StObject.set(x, "onlineMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineMeetingsNull: Self = StObject.set(x, "onlineMeetings", null)
    
    @scala.inline
    def setOnlineMeetingsUndefined: Self = StObject.set(x, "onlineMeetings", js.undefined)
    
    @scala.inline
    def setOnlineMeetingsVarargs(value: OnlineMeeting*): Self = StObject.set(x, "onlineMeetings", js.Array(value :_*))
  }
}
