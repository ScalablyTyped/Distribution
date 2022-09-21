package typings.onfleetNodeOnfleet.tasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskCompletionDetails extends StObject {
  
  var actions: js.UndefOr[js.Array[Any]] = js.undefined
  
  var events: js.Array[CompletionEvent]
  
  var failureNotes: js.UndefOr[String] = js.undefined
  
  var failureReason: js.UndefOr[String] = js.undefined
  
  var firstLocation: js.UndefOr[js.Array[Any]] = js.undefined
  
  var lastLocation: js.UndefOr[js.Array[Any]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[Boolean] = js.undefined
  
  var time: Double | Null
  
  var unavailableAttachments: js.UndefOr[js.Array[Any]] = js.undefined
}
object TaskCompletionDetails {
  
  inline def apply(events: js.Array[CompletionEvent]): TaskCompletionDetails = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], time = null)
    __obj.asInstanceOf[TaskCompletionDetails]
  }
  
  extension [Self <: TaskCompletionDetails](x: Self) {
    
    inline def setActions(value: js.Array[Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Any*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setEvents(value: js.Array[CompletionEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: CompletionEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFailureNotes(value: String): Self = StObject.set(x, "failureNotes", value.asInstanceOf[js.Any])
    
    inline def setFailureNotesUndefined: Self = StObject.set(x, "failureNotes", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFirstLocation(value: js.Array[Any]): Self = StObject.set(x, "firstLocation", value.asInstanceOf[js.Any])
    
    inline def setFirstLocationUndefined: Self = StObject.set(x, "firstLocation", js.undefined)
    
    inline def setFirstLocationVarargs(value: Any*): Self = StObject.set(x, "firstLocation", js.Array(value*))
    
    inline def setLastLocation(value: js.Array[Any]): Self = StObject.set(x, "lastLocation", value.asInstanceOf[js.Any])
    
    inline def setLastLocationUndefined: Self = StObject.set(x, "lastLocation", js.undefined)
    
    inline def setLastLocationVarargs(value: Any*): Self = StObject.set(x, "lastLocation", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setUnavailableAttachments(value: js.Array[Any]): Self = StObject.set(x, "unavailableAttachments", value.asInstanceOf[js.Any])
    
    inline def setUnavailableAttachmentsUndefined: Self = StObject.set(x, "unavailableAttachments", js.undefined)
    
    inline def setUnavailableAttachmentsVarargs(value: Any*): Self = StObject.set(x, "unavailableAttachments", js.Array(value*))
  }
}
