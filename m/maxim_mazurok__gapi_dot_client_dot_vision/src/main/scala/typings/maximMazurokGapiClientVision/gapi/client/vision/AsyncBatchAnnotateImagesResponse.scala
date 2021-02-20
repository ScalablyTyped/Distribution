package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncBatchAnnotateImagesResponse extends StObject {
  
  /** The output location and metadata from AsyncBatchAnnotateImagesRequest. */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
}
object AsyncBatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class AsyncBatchAnnotateImagesResponseMutableBuilder[Self <: AsyncBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
