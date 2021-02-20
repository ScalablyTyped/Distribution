package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse extends StObject {
  
  /** The output location and metadata from AsyncAnnotateFileRequest. */
  var outputConfig: js.UndefOr[GoogleCloudVisionV1p1beta1OutputConfig] = js.native
}
object GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponseMutableBuilder[Self <: GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudVisionV1p1beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
