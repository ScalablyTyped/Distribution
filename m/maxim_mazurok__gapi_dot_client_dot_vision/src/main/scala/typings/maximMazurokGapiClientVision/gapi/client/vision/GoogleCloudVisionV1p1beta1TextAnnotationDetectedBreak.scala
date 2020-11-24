package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak extends js.Object {
  
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.native
  
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreakOps[Self <: GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak] (val x: Self) extends AnyVal {
    
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
    def setIsPrefix(value: Boolean): Self = this.set("isPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrefix: Self = this.set("isPrefix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
