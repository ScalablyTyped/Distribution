package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotateImageRequest extends js.Object {
  
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
  implicit class AnnotateImageRequestOps[Self <: AnnotateImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageContext(value: ImageContext): Self = this.set("imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageContext: Self = this.set("imageContext", js.undefined)
  }
}
