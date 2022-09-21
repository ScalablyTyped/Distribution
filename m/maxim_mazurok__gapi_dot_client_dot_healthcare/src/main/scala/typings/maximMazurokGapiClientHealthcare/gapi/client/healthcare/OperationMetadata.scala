package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadata extends StObject {
  
  /** The name of the API method that initiated the operation. */
  var apiMethodName: js.UndefOr[String] = js.undefined
  
  /** Specifies if cancellation was requested for the operation. */
  var cancelRequested: js.UndefOr[Boolean] = js.undefined
  
  var counter: js.UndefOr[ProgressCounter] = js.undefined
  
  /** The time at which the operation was created by the API. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The time at which execution was completed. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * A link to audit and error logs in the log viewer. Error logs are generated only by some operations, listed at [Viewing error logs in Cloud
    * Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
    */
  var logsUrl: js.UndefOr[String] = js.undefined
}
object OperationMetadata {
  
  inline def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  extension [Self <: OperationMetadata](x: Self) {
    
    inline def setApiMethodName(value: String): Self = StObject.set(x, "apiMethodName", value.asInstanceOf[js.Any])
    
    inline def setApiMethodNameUndefined: Self = StObject.set(x, "apiMethodName", js.undefined)
    
    inline def setCancelRequested(value: Boolean): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
    
    inline def setCancelRequestedUndefined: Self = StObject.set(x, "cancelRequested", js.undefined)
    
    inline def setCounter(value: ProgressCounter): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLogsUrl(value: String): Self = StObject.set(x, "logsUrl", value.asInstanceOf[js.Any])
    
    inline def setLogsUrlUndefined: Self = StObject.set(x, "logsUrl", js.undefined)
  }
}
