package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudience extends js.Object {
  
  /**
    * Output only. The estimated audience size for the Display network in the past month. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy
    * reasons. Otherwise, the number will be rounded off to two significant digits. Only returned in GET request.
    */
  var activeDisplayAudienceSize: js.UndefOr[String] = js.native
  
  /** Output only. The source of the audience. */
  var audienceSource: js.UndefOr[String] = js.native
  
  /** Output only. The type of the audience. */
  var audienceType: js.UndefOr[String] = js.native
  
  /** The user-provided description of the audience. Only applicable to first party audiences. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Output only. The estimated audience size for the Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise,
    * the number will be rounded off to two significant digits. Only returned in GET request.
    */
  var displayAudienceSize: js.UndefOr[String] = js.native
  
  /**
    * Output only. The estimated desktop audience size in Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons.
    * Otherwise, the number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var displayDesktopAudienceSize: js.UndefOr[String] = js.native
  
  /**
    * Output only. The estimated mobile app audience size in Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons.
    * Otherwise, the number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var displayMobileAppAudienceSize: js.UndefOr[String] = js.native
  
  /**
    * Output only. The estimated mobile web audience size in Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons.
    * Otherwise, the number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var displayMobileWebAudienceSize: js.UndefOr[String] = js.native
  
  /** The display name of the first and third party audience. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the first and third party audience. Assigned by the system. */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.native
  
  /** Output only. Whether the audience is a first or third party audience. */
  var firstAndThirdPartyAudienceType: js.UndefOr[String] = js.native
  
  /**
    * Output only. The estimated audience size for Gmail network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise, the
    * number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var gmailAudienceSize: js.UndefOr[String] = js.native
  
  /** The duration in days that an entry remains in the audience after the qualifying event. Only applicable to first party audiences. */
  var membershipDurationDays: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the first and third party audience. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The estimated audience size for YouTube network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise, the
    * number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var youtubeAudienceSize: js.UndefOr[String] = js.native
}
object FirstAndThirdPartyAudience {
  
  @scala.inline
  def apply(): FirstAndThirdPartyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudience]
  }
  
  @scala.inline
  implicit class FirstAndThirdPartyAudienceOps[Self <: FirstAndThirdPartyAudience] (val x: Self) extends AnyVal {
    
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
    def setActiveDisplayAudienceSize(value: String): Self = this.set("activeDisplayAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDisplayAudienceSize: Self = this.set("activeDisplayAudienceSize", js.undefined)
    
    @scala.inline
    def setAudienceSource(value: String): Self = this.set("audienceSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceSource: Self = this.set("audienceSource", js.undefined)
    
    @scala.inline
    def setAudienceType(value: String): Self = this.set("audienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceType: Self = this.set("audienceType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayAudienceSize(value: String): Self = this.set("displayAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAudienceSize: Self = this.set("displayAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayDesktopAudienceSize(value: String): Self = this.set("displayDesktopAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDesktopAudienceSize: Self = this.set("displayDesktopAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayMobileAppAudienceSize(value: String): Self = this.set("displayMobileAppAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMobileAppAudienceSize: Self = this.set("displayMobileAppAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayMobileWebAudienceSize(value: String): Self = this.set("displayMobileWebAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMobileWebAudienceSize: Self = this.set("displayMobileWebAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFirstAndThirdPartyAudienceId(value: String): Self = this.set("firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstAndThirdPartyAudienceId: Self = this.set("firstAndThirdPartyAudienceId", js.undefined)
    
    @scala.inline
    def setFirstAndThirdPartyAudienceType(value: String): Self = this.set("firstAndThirdPartyAudienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstAndThirdPartyAudienceType: Self = this.set("firstAndThirdPartyAudienceType", js.undefined)
    
    @scala.inline
    def setGmailAudienceSize(value: String): Self = this.set("gmailAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmailAudienceSize: Self = this.set("gmailAudienceSize", js.undefined)
    
    @scala.inline
    def setMembershipDurationDays(value: String): Self = this.set("membershipDurationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipDurationDays: Self = this.set("membershipDurationDays", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setYoutubeAudienceSize(value: String): Self = this.set("youtubeAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoutubeAudienceSize: Self = this.set("youtubeAudienceSize", js.undefined)
  }
}
