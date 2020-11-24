package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudience extends js.Object {
  
  /** Output only. The display name of the Google audience. . */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the Google audience. Assigned by the system. */
  var googleAudienceId: js.UndefOr[String] = js.native
  
  /** Output only. The type of Google audience. . */
  var googleAudienceType: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the google audience. */
  var name: js.UndefOr[String] = js.native
}
object GoogleAudience {
  
  @scala.inline
  def apply(): GoogleAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudience]
  }
  
  @scala.inline
  implicit class GoogleAudienceOps[Self <: GoogleAudience] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGoogleAudienceId(value: String): Self = this.set("googleAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAudienceId: Self = this.set("googleAudienceId", js.undefined)
    
    @scala.inline
    def setGoogleAudienceType(value: String): Self = this.set("googleAudienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAudienceType: Self = this.set("googleAudienceType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
