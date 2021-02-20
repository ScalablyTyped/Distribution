package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventRecordRequest extends StObject {
  
  /** The current time when this update was sent, in milliseconds, since 1970 UTC (Unix Epoch). */
  var currentTimeMillis: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventRecordRequest`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The request ID used to identify this attempt to record events. */
  var requestId: js.UndefOr[String] = js.native
  
  /** A list of the time period updates being made in this request. */
  var timePeriods: js.UndefOr[js.Array[EventPeriodUpdate]] = js.native
}
object EventRecordRequest {
  
  @scala.inline
  def apply(): EventRecordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRecordRequest]
  }
  
  @scala.inline
  implicit class EventRecordRequestMutableBuilder[Self <: EventRecordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTimeMillis(value: String): Self = StObject.set(x, "currentTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeMillisUndefined: Self = StObject.set(x, "currentTimeMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setTimePeriods(value: js.Array[EventPeriodUpdate]): Self = StObject.set(x, "timePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodsUndefined: Self = StObject.set(x, "timePeriods", js.undefined)
    
    @scala.inline
    def setTimePeriodsVarargs(value: EventPeriodUpdate*): Self = StObject.set(x, "timePeriods", js.Array(value :_*))
  }
}
