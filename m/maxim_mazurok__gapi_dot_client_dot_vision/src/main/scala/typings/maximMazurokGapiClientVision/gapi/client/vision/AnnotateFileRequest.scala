package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotateFileRequest extends js.Object {
  
  /** Required. Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.native
  
  /** Additional context that may accompany the image(s) in the file. */
  var imageContext: js.UndefOr[ImageContext] = js.native
  
  /** Required. Information about the input file. */
  var inputConfig: js.UndefOr[InputConfig] = js.native
  
  /**
    * Pages of the file to perform image annotation. Pages starts from 1, we assume the first page of the file is page 1. At most 5 pages are supported per request. Pages can be negative.
    * Page 1 means the first page. Page 2 means the second page. Page -1 means the last page. Page -2 means the second to the last page. If the file is GIF instead of PDF or TIFF, page
    * refers to GIF frames. If this field is empty, by default the service performs image annotation for the first 5 pages of the file.
    */
  var pages: js.UndefOr[js.Array[Double]] = js.native
}
object AnnotateFileRequest {
  
  @scala.inline
  def apply(): AnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateFileRequest]
  }
  
  @scala.inline
  implicit class AnnotateFileRequestOps[Self <: AnnotateFileRequest] (val x: Self) extends AnyVal {
    
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
    def setImageContext(value: ImageContext): Self = this.set("imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageContext: Self = this.set("imageContext", js.undefined)
    
    @scala.inline
    def setInputConfig(value: InputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: Double*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Double]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
  }
}
