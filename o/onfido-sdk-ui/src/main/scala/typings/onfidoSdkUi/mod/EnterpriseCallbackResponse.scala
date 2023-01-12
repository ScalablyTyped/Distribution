package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseCallbackResponse extends StObject {
  
  var continueWithOnfidoSubmission: js.UndefOr[Boolean] = js.undefined
  
  var onfidoSuccessResponse: js.UndefOr[DocumentImageResponse | UploadFileResponse | FaceVideoResponse] = js.undefined
}
object EnterpriseCallbackResponse {
  
  inline def apply(): EnterpriseCallbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseCallbackResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseCallbackResponse] (val x: Self) extends AnyVal {
    
    inline def setContinueWithOnfidoSubmission(value: Boolean): Self = StObject.set(x, "continueWithOnfidoSubmission", value.asInstanceOf[js.Any])
    
    inline def setContinueWithOnfidoSubmissionUndefined: Self = StObject.set(x, "continueWithOnfidoSubmission", js.undefined)
    
    inline def setOnfidoSuccessResponse(value: DocumentImageResponse | UploadFileResponse | FaceVideoResponse): Self = StObject.set(x, "onfidoSuccessResponse", value.asInstanceOf[js.Any])
    
    inline def setOnfidoSuccessResponseUndefined: Self = StObject.set(x, "onfidoSuccessResponse", js.undefined)
  }
}
