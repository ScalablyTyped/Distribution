package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialMetaTagInfo extends js.Object {
  
  /** A short description of the link. Optional. */
  var socialDescription: js.UndefOr[String] = js.native
  
  /** An image url string. Optional. */
  var socialImageLink: js.UndefOr[String] = js.native
  
  /** Title to be displayed. Optional. */
  var socialTitle: js.UndefOr[String] = js.native
}
object SocialMetaTagInfo {
  
  @scala.inline
  def apply(): SocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialMetaTagInfo]
  }
  
  @scala.inline
  implicit class SocialMetaTagInfoOps[Self <: SocialMetaTagInfo] (val x: Self) extends AnyVal {
    
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
    def setSocialDescription(value: String): Self = this.set("socialDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialDescription: Self = this.set("socialDescription", js.undefined)
    
    @scala.inline
    def setSocialImageLink(value: String): Self = this.set("socialImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialImageLink: Self = this.set("socialImageLink", js.undefined)
    
    @scala.inline
    def setSocialTitle(value: String): Self = this.set("socialTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialTitle: Self = this.set("socialTitle", js.undefined)
  }
}
