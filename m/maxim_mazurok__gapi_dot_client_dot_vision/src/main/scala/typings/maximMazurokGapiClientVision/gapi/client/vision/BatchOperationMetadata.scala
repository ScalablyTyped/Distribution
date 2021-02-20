package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchOperationMetadata extends StObject {
  
  /** The time when the batch request is finished and google.longrunning.Operation.done is set to true. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The current state of the batch operation. */
  var state: js.UndefOr[String] = js.native
  
  /** The time when the batch request was submitted to the server. */
  var submitTime: js.UndefOr[String] = js.native
}
object BatchOperationMetadata {
  
  @scala.inline
  def apply(): BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchOperationMetadata]
  }
  
  @scala.inline
  implicit class BatchOperationMetadataMutableBuilder[Self <: BatchOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
