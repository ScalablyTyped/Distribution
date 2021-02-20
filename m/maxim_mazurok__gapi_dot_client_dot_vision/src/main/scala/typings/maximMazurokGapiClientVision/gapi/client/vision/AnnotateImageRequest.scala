package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotateImageRequest extends StObject {
  
  /** Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.native
  
  /** The image to be processed. */
  var image: js.UndefOr[Image] = js.native
  
  /** Additional context that may accompany the image. */
  var imageContext: js.UndefOr[ImageContext] = js.native
}
object AnnotateImageRequest {
  
  @scala.inline
  def apply(): AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateImageRequest]
  }
  
  @scala.inline
  implicit class AnnotateImageRequestMutableBuilder[Self <: AnnotateImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContext(value: ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
