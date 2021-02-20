package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBatchRecordFailure extends StObject {
  
  /** The cause for the update failure. */
  var failureCause: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventBatchRecordFailure`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The time range which was rejected; empty for a request-wide failure. */
  var range: js.UndefOr[EventPeriodRange] = js.native
}
object EventBatchRecordFailure {
  
  @scala.inline
  def apply(): EventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBatchRecordFailure]
  }
  
  @scala.inline
  implicit class EventBatchRecordFailureMutableBuilder[Self <: EventBatchRecordFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRange(value: EventPeriodRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
