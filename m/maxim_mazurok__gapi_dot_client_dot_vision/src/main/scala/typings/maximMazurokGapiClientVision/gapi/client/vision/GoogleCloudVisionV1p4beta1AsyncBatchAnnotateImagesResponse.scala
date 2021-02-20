package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse extends StObject {
  
  /** The output location and metadata from AsyncBatchAnnotateImagesRequest. */
  var outputConfig: js.UndefOr[GoogleCloudVisionV1p4beta1OutputConfig] = js.native
}
object GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponseMutableBuilder[Self <: GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudVisionV1p4beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
