package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncBatchAnnotateImagesResponse extends StObject {
  
  /** The output location and metadata from AsyncBatchAnnotateImagesRequest. */
  var outputConfig: js.UndefOr[OutputConfig] = js.undefined
}
object AsyncBatchAnnotateImagesResponse {
  
  inline def apply(): AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
