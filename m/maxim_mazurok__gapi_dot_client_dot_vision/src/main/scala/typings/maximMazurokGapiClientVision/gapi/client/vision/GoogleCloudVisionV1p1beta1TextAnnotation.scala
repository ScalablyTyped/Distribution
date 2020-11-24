package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1TextAnnotation extends js.Object {
  
  /** List of pages detected by OCR. */
  var pages: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1Page]] = js.native
  
  /** UTF-8 text detected on the pages. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p1beta1TextAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1TextAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1TextAnnotationOps[Self <: GoogleCloudVisionV1p1beta1TextAnnotation] (val x: Self) extends AnyVal {
    
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
    def setPagesVarargs(value: GoogleCloudVisionV1p1beta1Page*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[GoogleCloudVisionV1p1beta1Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
