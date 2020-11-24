package typings.mendixmodelsdk.anon

import typings.mendixmodelsdk.iworkingcopyeventMod.BuildResultStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventId extends js.Object {
  
  var eventId: Double = js.native
  
  var message: String = js.native
  
  var problems: js.Array[_] = js.native
  
  var status: BuildResultStatus = js.native
}
object EventId {
  
  @scala.inline
  def apply(eventId: Double, message: String, problems: js.Array[_], status: BuildResultStatus): EventId = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventId]
  }
  
  @scala.inline
  implicit class EventIdOps[Self <: EventId] (val x: Self) extends AnyVal {
    
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
    def setEventId(value: Double): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemsVarargs(value: js.Any*): Self = this.set("problems", js.Array(value :_*))
    
    @scala.inline
    def setProblems(value: js.Array[_]): Self = this.set("problems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BuildResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
