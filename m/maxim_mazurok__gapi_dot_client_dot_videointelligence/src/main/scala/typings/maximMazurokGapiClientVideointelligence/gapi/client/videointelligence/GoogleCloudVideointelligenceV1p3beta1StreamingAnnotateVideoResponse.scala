package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends StObject {
  
  /** Streaming annotation results. */
  var annotationResults: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] = js.undefined
  
  /**
    * Google Cloud Storage URI that stores annotation results of one streaming session in JSON format. It is the annotation_result_storage_directory from the request followed by
    * '/cloud_project_number-session_id'.
    */
  var annotationResultsUri: js.UndefOr[String] = js.undefined
  
  /** If set, returns a google.rpc.Status message that specifies the error for the operation. */
  var error: js.UndefOr[GoogleRpcStatus] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse] (val x: Self) extends AnyVal {
    
    inline def setAnnotationResults(value: GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    inline def setAnnotationResultsUri(value: String): Self = StObject.set(x, "annotationResultsUri", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUriUndefined: Self = StObject.set(x, "annotationResultsUri", js.undefined)
    
    inline def setError(value: GoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
