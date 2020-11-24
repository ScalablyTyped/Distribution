package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1ImageAnnotationContext extends js.Object {
  
  /** If the file was a PDF or TIFF, this field gives the page number within the file used to produce the image. */
  var pageNumber: js.UndefOr[Double] = js.native
  
  /** The URI of the file used to produce the image. */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p2beta1ImageAnnotationContext {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1ImageAnnotationContext]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1ImageAnnotationContextOps[Self <: GoogleCloudVisionV1p2beta1ImageAnnotationContext] (val x: Self) extends AnyVal {
    
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
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
