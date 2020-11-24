package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateManagedShortLinkResponse extends js.Object {
  
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var managedShortLink: js.UndefOr[ManagedShortLink] = js.native
  
  /** Preview link to show the link flow chart. (debug info.) */
  var previewLink: js.UndefOr[String] = js.native
  
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.native
}
object CreateManagedShortLinkResponse {
  
  @scala.inline
  def apply(): CreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedShortLinkResponse]
  }
  
  @scala.inline
  implicit class CreateManagedShortLinkResponseOps[Self <: CreateManagedShortLinkResponse] (val x: Self) extends AnyVal {
    
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
    def setManagedShortLink(value: ManagedShortLink): Self = this.set("managedShortLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedShortLink: Self = this.set("managedShortLink", js.undefined)
    
    @scala.inline
    def setPreviewLink(value: String): Self = this.set("previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewLink: Self = this.set("previewLink", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: DynamicLinkWarning*): Self = this.set("warning", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: js.Array[DynamicLinkWarning]): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
