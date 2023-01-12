package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotateFileResponse extends StObject {
  
  /** If set, represents the error message for the failed request. The `responses` field will not be set in this case. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** Information about the file for which this response is generated. */
  var inputConfig: js.UndefOr[InputConfig] = js.undefined
  
  /** Individual responses to images found within the file. This field will be empty if the `error` field is set. */
  var responses: js.UndefOr[js.Array[AnnotateImageResponse]] = js.undefined
  
  /** This field gives the total number of pages in the file. */
  var totalPages: js.UndefOr[Double] = js.undefined
}
object AnnotateFileResponse {
  
  inline def apply(): AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotateFileResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setResponses(value: js.Array[AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
  }
}
