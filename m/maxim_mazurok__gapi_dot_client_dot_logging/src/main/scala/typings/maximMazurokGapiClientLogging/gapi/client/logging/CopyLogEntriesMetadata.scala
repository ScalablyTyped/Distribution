package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyLogEntriesMetadata extends StObject {
  
  /** Identifies whether the user has requested cancellation of the operation. */
  var cancellationRequested: js.UndefOr[Boolean] = js.undefined
  
  /** The end time of an operation. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Estimated progress of the operation (0 - 100%). */
  var progress: js.UndefOr[Double] = js.undefined
  
  /** CopyLogEntries RPC request. */
  var request: js.UndefOr[CopyLogEntriesRequest] = js.undefined
  
  /** The create time of an operation. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** State of an operation. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The IAM identity of a service account that must be granted access to the destination.If the service account is not granted permission to the destination within an hour, the
    * operation will be cancelled.For example: "serviceAccount:foo@bar.com"
    */
  var writerIdentity: js.UndefOr[String] = js.undefined
}
object CopyLogEntriesMetadata {
  
  inline def apply(): CopyLogEntriesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyLogEntriesMetadata]
  }
  
  extension [Self <: CopyLogEntriesMetadata](x: Self) {
    
    inline def setCancellationRequested(value: Boolean): Self = StObject.set(x, "cancellationRequested", value.asInstanceOf[js.Any])
    
    inline def setCancellationRequestedUndefined: Self = StObject.set(x, "cancellationRequested", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRequest(value: CopyLogEntriesRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWriterIdentity(value: String): Self = StObject.set(x, "writerIdentity", value.asInstanceOf[js.Any])
    
    inline def setWriterIdentityUndefined: Self = StObject.set(x, "writerIdentity", js.undefined)
  }
}
