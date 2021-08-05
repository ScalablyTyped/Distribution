package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncAnnotateFileRequest extends StObject {
  
  /** Required. Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  
  /** Additional context that may accompany the image(s) in the file. */
  var imageContext: js.UndefOr[ImageContext] = js.undefined
  
  /** Required. Information about the input file. */
  var inputConfig: js.UndefOr[InputConfig] = js.undefined
  
  /** Required. The desired output location and metadata (e.g. format). */
  var outputConfig: js.UndefOr[OutputConfig] = js.undefined
}
object AsyncAnnotateFileRequest {
  
  inline def apply(): AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncAnnotateFileRequest]
  }
  
  extension [Self <: AsyncAnnotateFileRequest](x: Self) {
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setImageContext(value: ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    inline def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
