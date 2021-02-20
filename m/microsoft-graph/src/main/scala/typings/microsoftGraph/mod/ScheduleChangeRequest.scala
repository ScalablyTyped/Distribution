package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleChangeRequest extends ChangeTrackedEntity {
  
  var assignedTo: js.UndefOr[NullableOption[ScheduleChangeRequestActor]] = js.native
  
  var managerActionDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var managerActionMessage: js.UndefOr[NullableOption[String]] = js.native
  
  var managerUserId: js.UndefOr[NullableOption[String]] = js.native
  
  var senderDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var senderMessage: js.UndefOr[NullableOption[String]] = js.native
  
  var senderUserId: js.UndefOr[NullableOption[String]] = js.native
  
  var state: js.UndefOr[NullableOption[ScheduleChangeState]] = js.native
}
object ScheduleChangeRequest {
  
  @scala.inline
  def apply(): ScheduleChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleChangeRequest]
  }
  
  @scala.inline
  implicit class ScheduleChangeRequestMutableBuilder[Self <: ScheduleChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTo(value: NullableOption[ScheduleChangeRequestActor]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    @scala.inline
    def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    @scala.inline
    def setManagerActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "managerActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerActionDateTimeNull: Self = StObject.set(x, "managerActionDateTime", null)
    
    @scala.inline
    def setManagerActionDateTimeUndefined: Self = StObject.set(x, "managerActionDateTime", js.undefined)
    
    @scala.inline
    def setManagerActionMessage(value: NullableOption[String]): Self = StObject.set(x, "managerActionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerActionMessageNull: Self = StObject.set(x, "managerActionMessage", null)
    
    @scala.inline
    def setManagerActionMessageUndefined: Self = StObject.set(x, "managerActionMessage", js.undefined)
    
    @scala.inline
    def setManagerUserId(value: NullableOption[String]): Self = StObject.set(x, "managerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerUserIdNull: Self = StObject.set(x, "managerUserId", null)
    
    @scala.inline
    def setManagerUserIdUndefined: Self = StObject.set(x, "managerUserId", js.undefined)
    
    @scala.inline
    def setSenderDateTime(value: NullableOption[String]): Self = StObject.set(x, "senderDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderDateTimeNull: Self = StObject.set(x, "senderDateTime", null)
    
    @scala.inline
    def setSenderDateTimeUndefined: Self = StObject.set(x, "senderDateTime", js.undefined)
    
    @scala.inline
    def setSenderMessage(value: NullableOption[String]): Self = StObject.set(x, "senderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderMessageNull: Self = StObject.set(x, "senderMessage", null)
    
    @scala.inline
    def setSenderMessageUndefined: Self = StObject.set(x, "senderMessage", js.undefined)
    
    @scala.inline
    def setSenderUserId(value: NullableOption[String]): Self = StObject.set(x, "senderUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUserIdNull: Self = StObject.set(x, "senderUserId", null)
    
    @scala.inline
    def setSenderUserIdUndefined: Self = StObject.set(x, "senderUserId", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[ScheduleChangeState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
