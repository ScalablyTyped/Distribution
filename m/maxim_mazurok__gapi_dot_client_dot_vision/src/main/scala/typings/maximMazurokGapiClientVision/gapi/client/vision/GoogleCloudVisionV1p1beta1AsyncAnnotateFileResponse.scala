package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse extends StObject {
  
  /** The output location and metadata from AsyncAnnotateFileRequest. */
  var outputConfig: js.UndefOr[GoogleCloudVisionV1p1beta1OutputConfig] = js.undefined
}
object GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse {
  
  inline def apply(): GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse](x: Self) {
    
    inline def setOutputConfig(value: GoogleCloudVisionV1p1beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
