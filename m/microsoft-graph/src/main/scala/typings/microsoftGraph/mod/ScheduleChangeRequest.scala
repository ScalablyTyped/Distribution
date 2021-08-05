package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleChangeRequest
  extends StObject
     with ChangeTrackedEntity {
  
  var assignedTo: js.UndefOr[NullableOption[ScheduleChangeRequestActor]] = js.undefined
  
  var managerActionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var managerActionMessage: js.UndefOr[NullableOption[String]] = js.undefined
  
  var managerUserId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var senderDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var senderMessage: js.UndefOr[NullableOption[String]] = js.undefined
  
  var senderUserId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var state: js.UndefOr[NullableOption[ScheduleChangeState]] = js.undefined
}
object ScheduleChangeRequest {
  
  inline def apply(): ScheduleChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleChangeRequest]
  }
  
  extension [Self <: ScheduleChangeRequest](x: Self) {
    
    inline def setAssignedTo(value: NullableOption[ScheduleChangeRequestActor]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setManagerActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "managerActionDateTime", value.asInstanceOf[js.Any])
    
    inline def setManagerActionDateTimeNull: Self = StObject.set(x, "managerActionDateTime", null)
    
    inline def setManagerActionDateTimeUndefined: Self = StObject.set(x, "managerActionDateTime", js.undefined)
    
    inline def setManagerActionMessage(value: NullableOption[String]): Self = StObject.set(x, "managerActionMessage", value.asInstanceOf[js.Any])
    
    inline def setManagerActionMessageNull: Self = StObject.set(x, "managerActionMessage", null)
    
    inline def setManagerActionMessageUndefined: Self = StObject.set(x, "managerActionMessage", js.undefined)
    
    inline def setManagerUserId(value: NullableOption[String]): Self = StObject.set(x, "managerUserId", value.asInstanceOf[js.Any])
    
    inline def setManagerUserIdNull: Self = StObject.set(x, "managerUserId", null)
    
    inline def setManagerUserIdUndefined: Self = StObject.set(x, "managerUserId", js.undefined)
    
    inline def setSenderDateTime(value: NullableOption[String]): Self = StObject.set(x, "senderDateTime", value.asInstanceOf[js.Any])
    
    inline def setSenderDateTimeNull: Self = StObject.set(x, "senderDateTime", null)
    
    inline def setSenderDateTimeUndefined: Self = StObject.set(x, "senderDateTime", js.undefined)
    
    inline def setSenderMessage(value: NullableOption[String]): Self = StObject.set(x, "senderMessage", value.asInstanceOf[js.Any])
    
    inline def setSenderMessageNull: Self = StObject.set(x, "senderMessage", null)
    
    inline def setSenderMessageUndefined: Self = StObject.set(x, "senderMessage", js.undefined)
    
    inline def setSenderUserId(value: NullableOption[String]): Self = StObject.set(x, "senderUserId", value.asInstanceOf[js.Any])
    
    inline def setSenderUserIdNull: Self = StObject.set(x, "senderUserId", null)
    
    inline def setSenderUserIdUndefined: Self = StObject.set(x, "senderUserId", js.undefined)
    
    inline def setState(value: NullableOption[ScheduleChangeState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
