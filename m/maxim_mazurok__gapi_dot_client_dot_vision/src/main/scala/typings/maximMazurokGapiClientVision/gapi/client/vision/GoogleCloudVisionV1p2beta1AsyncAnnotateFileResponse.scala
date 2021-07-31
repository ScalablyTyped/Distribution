package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse extends StObject {
  
  /** The output location and metadata from AsyncAnnotateFileRequest. */
  var outputConfig: js.UndefOr[GoogleCloudVisionV1p2beta1OutputConfig] = js.undefined
}
object GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponseMutableBuilder[Self <: GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudVisionV1p2beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
