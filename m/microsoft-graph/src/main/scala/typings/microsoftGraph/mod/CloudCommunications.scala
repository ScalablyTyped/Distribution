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
  
  inline def apply(): CloudCommunications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudCommunications]
  }
  
  extension [Self <: CloudCommunications](x: Self) {
    
    inline def setCallRecords(value: NullableOption[js.Array[CallRecord]]): Self = StObject.set(x, "callRecords", value.asInstanceOf[js.Any])
    
    inline def setCallRecordsNull: Self = StObject.set(x, "callRecords", null)
    
    inline def setCallRecordsUndefined: Self = StObject.set(x, "callRecords", js.undefined)
    
    inline def setCallRecordsVarargs(value: CallRecord*): Self = StObject.set(x, "callRecords", js.Array(value :_*))
    
    inline def setCalls(value: NullableOption[js.Array[Call]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsNull: Self = StObject.set(x, "calls", null)
    
    inline def setCallsUndefined: Self = StObject.set(x, "calls", js.undefined)
    
    inline def setCallsVarargs(value: Call*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    inline def setOnlineMeetings(value: NullableOption[js.Array[OnlineMeeting]]): Self = StObject.set(x, "onlineMeetings", value.asInstanceOf[js.Any])
    
    inline def setOnlineMeetingsNull: Self = StObject.set(x, "onlineMeetings", null)
    
    inline def setOnlineMeetingsUndefined: Self = StObject.set(x, "onlineMeetings", js.undefined)
    
    inline def setOnlineMeetingsVarargs(value: OnlineMeeting*): Self = StObject.set(x, "onlineMeetings", js.Array(value :_*))
  }
}
