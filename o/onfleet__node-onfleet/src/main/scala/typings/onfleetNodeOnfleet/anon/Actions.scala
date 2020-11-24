package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
  var actions: js.Array[_] = js.native
  
  var events: js.Array[_] = js.native
  
  var failureNotes: String = js.native
  
  var failureReason: String = js.native
  
  var firstLocation: js.Array[_] = js.native
  
  var lastLocation: js.Array[_] = js.native
  
  var time: Double | Null = js.native
  
  var unavailableAttachments: js.Array[_] = js.native
}
object Actions {
  
  @scala.inline
  def apply(
    actions: js.Array[_],
    events: js.Array[_],
    failureNotes: String,
    failureReason: String,
    firstLocation: js.Array[_],
    lastLocation: js.Array[_],
    unavailableAttachments: js.Array[_]
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], failureNotes = failureNotes.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], firstLocation = firstLocation.asInstanceOf[js.Any], lastLocation = lastLocation.asInstanceOf[js.Any], unavailableAttachments = unavailableAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: js.Any*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[_]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureNotes(value: String): Self = this.set("failureNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLocationVarargs(value: js.Any*): Self = this.set("firstLocation", js.Array(value :_*))
    
    @scala.inline
    def setFirstLocation(value: js.Array[_]): Self = this.set("firstLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLocationVarargs(value: js.Any*): Self = this.set("lastLocation", js.Array(value :_*))
    
    @scala.inline
    def setLastLocation(value: js.Array[_]): Self = this.set("lastLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnavailableAttachmentsVarargs(value: js.Any*): Self = this.set("unavailableAttachments", js.Array(value :_*))
    
    @scala.inline
    def setUnavailableAttachments(value: js.Array[_]): Self = this.set("unavailableAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeNull: Self = this.set("time", null)
  }
}
