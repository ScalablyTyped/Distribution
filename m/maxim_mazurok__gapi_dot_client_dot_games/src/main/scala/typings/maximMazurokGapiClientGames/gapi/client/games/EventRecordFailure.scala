package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventRecordFailure extends StObject {
  
  /** The ID of the event that was not updated. */
  var eventId: js.UndefOr[String] = js.native
  
  /** The cause for the update failure. */
  var failureCause: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventRecordFailure`. */
  var kind: js.UndefOr[String] = js.native
}
object EventRecordFailure {
  
  @scala.inline
  def apply(): EventRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRecordFailure]
  }
  
  @scala.inline
  implicit class EventRecordFailureMutableBuilder[Self <: EventRecordFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
