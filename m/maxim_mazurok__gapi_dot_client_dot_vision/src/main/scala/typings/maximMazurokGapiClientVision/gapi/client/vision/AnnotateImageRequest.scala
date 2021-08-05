package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotateImageRequest extends StObject {
  
  /** Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  
  /** The image to be processed. */
  var image: js.UndefOr[Image] = js.undefined
  
  /** Additional context that may accompany the image. */
  var imageContext: js.UndefOr[ImageContext] = js.undefined
}
object AnnotateImageRequest {
  
  inline def apply(): AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateImageRequest]
  }
  
  extension [Self <: AnnotateImageRequest](x: Self) {
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageContext(value: ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    inline def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
