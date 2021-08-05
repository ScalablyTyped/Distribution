package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1BatchOperationMetadata extends StObject {
  
  /** The time when the batch request is finished and google.longrunning.Operation.done is set to true. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The current state of the batch operation. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The time when the batch request was submitted to the server. */
  var submitTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p4beta1BatchOperationMetadata {
  
  inline def apply(): GoogleCloudVisionV1p4beta1BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1BatchOperationMetadata]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1BatchOperationMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
