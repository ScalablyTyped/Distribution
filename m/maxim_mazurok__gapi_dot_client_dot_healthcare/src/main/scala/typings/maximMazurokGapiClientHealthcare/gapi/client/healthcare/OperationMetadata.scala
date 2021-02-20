package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMetadata extends StObject {
  
  /** The name of the API method that initiated the operation. */
  var apiMethodName: js.UndefOr[String] = js.native
  
  /** Specifies if cancellation was requested for the operation. */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  
  var counter: js.UndefOr[ProgressCounter] = js.native
  
  /** The time at which the operation was created by the API. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The time at which execution was completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** A link to audit and error logs in the log viewer. Error logs are generated only by some operations, listed at [Viewing logs](/healthcare/docs/how-tos/logging). */
  var logsUrl: js.UndefOr[String] = js.native
}
object OperationMetadata {
  
  @scala.inline
  def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  @scala.inline
  implicit class OperationMetadataMutableBuilder[Self <: OperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiMethodName(value: String): Self = StObject.set(x, "apiMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMethodNameUndefined: Self = StObject.set(x, "apiMethodName", js.undefined)
    
    @scala.inline
    def setCancelRequested(value: Boolean): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelRequestedUndefined: Self = StObject.set(x, "cancelRequested", js.undefined)
    
    @scala.inline
    def setCounter(value: ProgressCounter): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setLogsUrl(value: String): Self = StObject.set(x, "logsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUrlUndefined: Self = StObject.set(x, "logsUrl", js.undefined)
  }
}
