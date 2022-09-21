package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRecordRequest extends StObject {
  
  /** The current time when this update was sent, in milliseconds, since 1970 UTC (Unix Epoch). */
  var currentTimeMillis: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventRecordRequest`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The request ID used to identify this attempt to record events. */
  var requestId: js.UndefOr[String] = js.undefined
  
  /** A list of the time period updates being made in this request. */
  var timePeriods: js.UndefOr[js.Array[EventPeriodUpdate]] = js.undefined
}
object EventRecordRequest {
  
  inline def apply(): EventRecordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRecordRequest]
  }
  
  extension [Self <: EventRecordRequest](x: Self) {
    
    inline def setCurrentTimeMillis(value: String): Self = StObject.set(x, "currentTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeMillisUndefined: Self = StObject.set(x, "currentTimeMillis", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTimePeriods(value: js.Array[EventPeriodUpdate]): Self = StObject.set(x, "timePeriods", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodsUndefined: Self = StObject.set(x, "timePeriods", js.undefined)
    
    inline def setTimePeriodsVarargs(value: EventPeriodUpdate*): Self = StObject.set(x, "timePeriods", js.Array(value*))
  }
}
