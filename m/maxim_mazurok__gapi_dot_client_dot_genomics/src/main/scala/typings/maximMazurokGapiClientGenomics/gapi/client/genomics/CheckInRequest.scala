package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckInRequest extends StObject {
  
  /** The deadline has expired and the worker needs more time. */
  var deadlineExpired: js.UndefOr[Any] = js.undefined
  
  /** A workflow specific event occurred. */
  var event: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** A list of timestamped events. */
  var events: js.UndefOr[js.Array[TimestampedEvent]] = js.undefined
  
  /** The operation has finished with the given result. */
  var result: js.UndefOr[Status] = js.undefined
  
  /** An SOS report for an unexpected VM failure. */
  var sosReport: js.UndefOr[String] = js.undefined
  
  /** Data about the status of the worker VM. */
  var workerStatus: js.UndefOr[WorkerStatus] = js.undefined
}
object CheckInRequest {
  
  inline def apply(): CheckInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckInRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckInRequest] (val x: Self) extends AnyVal {
    
    inline def setDeadlineExpired(value: Any): Self = StObject.set(x, "deadlineExpired", value.asInstanceOf[js.Any])
    
    inline def setDeadlineExpiredUndefined: Self = StObject.set(x, "deadlineExpired", js.undefined)
    
    inline def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEvents(value: js.Array[TimestampedEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: TimestampedEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setResult(value: Status): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSosReport(value: String): Self = StObject.set(x, "sosReport", value.asInstanceOf[js.Any])
    
    inline def setSosReportUndefined: Self = StObject.set(x, "sosReport", js.undefined)
    
    inline def setWorkerStatus(value: WorkerStatus): Self = StObject.set(x, "workerStatus", value.asInstanceOf[js.Any])
    
    inline def setWorkerStatusUndefined: Self = StObject.set(x, "workerStatus", js.undefined)
  }
}
