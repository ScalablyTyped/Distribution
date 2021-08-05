package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.Array[js.Any]
  
  var events: js.Array[js.Any]
  
  var failureNotes: String
  
  var failureReason: String
  
  var firstLocation: js.Array[js.Any]
  
  var lastLocation: js.Array[js.Any]
  
  var time: Double | Null
  
  var unavailableAttachments: js.Array[js.Any]
}
object Actions {
  
  inline def apply(
    actions: js.Array[js.Any],
    events: js.Array[js.Any],
    failureNotes: String,
    failureReason: String,
    firstLocation: js.Array[js.Any],
    lastLocation: js.Array[js.Any],
    unavailableAttachments: js.Array[js.Any]
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], failureNotes = failureNotes.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], firstLocation = firstLocation.asInstanceOf[js.Any], lastLocation = lastLocation.asInstanceOf[js.Any], unavailableAttachments = unavailableAttachments.asInstanceOf[js.Any], time = null)
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: js.Array[js.Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: js.Any*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setEvents(value: js.Array[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setFailureNotes(value: String): Self = StObject.set(x, "failureNotes", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFirstLocation(value: js.Array[js.Any]): Self = StObject.set(x, "firstLocation", value.asInstanceOf[js.Any])
    
    inline def setFirstLocationVarargs(value: js.Any*): Self = StObject.set(x, "firstLocation", js.Array(value :_*))
    
    inline def setLastLocation(value: js.Array[js.Any]): Self = StObject.set(x, "lastLocation", value.asInstanceOf[js.Any])
    
    inline def setLastLocationVarargs(value: js.Any*): Self = StObject.set(x, "lastLocation", js.Array(value :_*))
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setUnavailableAttachments(value: js.Array[js.Any]): Self = StObject.set(x, "unavailableAttachments", value.asInstanceOf[js.Any])
    
    inline def setUnavailableAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "unavailableAttachments", js.Array(value :_*))
  }
}
