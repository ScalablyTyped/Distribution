package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResetMultipleForAllRequest extends js.Object {
  
  /** The IDs of events to reset. */
  var event_ids: js.UndefOr[js.Array[String]] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#eventsResetMultipleForAllRequest`. */
  var kind: js.UndefOr[String] = js.native
}
object EventsResetMultipleForAllRequest {
  
  @scala.inline
  def apply(): EventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsResetMultipleForAllRequest]
  }
  
  @scala.inline
  implicit class EventsResetMultipleForAllRequestOps[Self <: EventsResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
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
    def setEvent_idsVarargs(value: String*): Self = this.set("event_ids", js.Array(value :_*))
    
    @scala.inline
    def setEvent_ids(value: js.Array[String]): Self = this.set("event_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_ids: Self = this.set("event_ids", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
