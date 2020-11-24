package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateShortDynamicLinkResponse extends js.Object {
  
  /** Preview link to show the link flow chart. (debug info.) */
  var previewLink: js.UndefOr[String] = js.native
  
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var shortLink: js.UndefOr[String] = js.native
  
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.native
}
object CreateShortDynamicLinkResponse {
  
  @scala.inline
  def apply(): CreateShortDynamicLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShortDynamicLinkResponse]
  }
  
  @scala.inline
  implicit class CreateShortDynamicLinkResponseOps[Self <: CreateShortDynamicLinkResponse] (val x: Self) extends AnyVal {
    
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
    def setPreviewLink(value: String): Self = this.set("previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewLink: Self = this.set("previewLink", js.undefined)
    
    @scala.inline
    def setShortLink(value: String): Self = this.set("shortLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortLink: Self = this.set("shortLink", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: DynamicLinkWarning*): Self = this.set("warning", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: js.Array[DynamicLinkWarning]): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
