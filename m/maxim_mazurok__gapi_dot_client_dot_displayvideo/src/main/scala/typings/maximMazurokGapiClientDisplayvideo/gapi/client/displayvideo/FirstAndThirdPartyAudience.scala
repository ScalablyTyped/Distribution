package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstAndThirdPartyAudience extends StObject {
  
  /**
    * Output only. The estimated audience size for the Display network in the past month. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy
    * reasons. Otherwise, the number will be rounded off to two significant digits. Only returned in GET request.
    */
  var activeDisplayAudienceSize: js.UndefOr[String] = js.undefined
  
  /** Output only. The source of the audience. */
  var audienceSource: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of the audience. */
  var audienceType: js.UndefOr[String] = js.undefined
  
  /** The user-provided description of the audience. Only applicable to first party audiences. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated audience size for the Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise,
    * the number will be rounded off to two significant digits. Only returned in GET request.
    */
  var displayAudienceSize: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated desktop audience size in Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons.
    * Otherwise, the number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var displayDesktopAudienceSize: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated mobile app audience size in Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons.
    * Otherwise, the number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var displayMobileAppAudienceSize: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated mobile web audience size in Display network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons.
    * Otherwise, the number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var displayMobileWebAudienceSize: js.UndefOr[String] = js.undefined
  
  /** The display name of the first and third party audience. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the first and third party audience. Assigned by the system. */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether the audience is a first or third party audience. */
  var firstAndThirdPartyAudienceType: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated audience size for Gmail network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise, the
    * number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var gmailAudienceSize: js.UndefOr[String] = js.undefined
  
  /** The duration in days that an entry remains in the audience after the qualifying event. Only applicable to first party audiences. */
  var membershipDurationDays: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the first and third party audience. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated audience size for YouTube network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise, the
    * number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var youtubeAudienceSize: js.UndefOr[String] = js.undefined
}
object FirstAndThirdPartyAudience {
  
  @scala.inline
  def apply(): FirstAndThirdPartyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudience]
  }
  
  @scala.inline
  implicit class FirstAndThirdPartyAudienceMutableBuilder[Self <: FirstAndThirdPartyAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDisplayAudienceSize(value: String): Self = StObject.set(x, "activeDisplayAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDisplayAudienceSizeUndefined: Self = StObject.set(x, "activeDisplayAudienceSize", js.undefined)
    
    @scala.inline
    def setAudienceSource(value: String): Self = StObject.set(x, "audienceSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceSourceUndefined: Self = StObject.set(x, "audienceSource", js.undefined)
    
    @scala.inline
    def setAudienceType(value: String): Self = StObject.set(x, "audienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceTypeUndefined: Self = StObject.set(x, "audienceType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayAudienceSize(value: String): Self = StObject.set(x, "displayAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAudienceSizeUndefined: Self = StObject.set(x, "displayAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayDesktopAudienceSize(value: String): Self = StObject.set(x, "displayDesktopAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDesktopAudienceSizeUndefined: Self = StObject.set(x, "displayDesktopAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayMobileAppAudienceSize(value: String): Self = StObject.set(x, "displayMobileAppAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMobileAppAudienceSizeUndefined: Self = StObject.set(x, "displayMobileAppAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayMobileWebAudienceSize(value: String): Self = StObject.set(x, "displayMobileWebAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMobileWebAudienceSizeUndefined: Self = StObject.set(x, "displayMobileWebAudienceSize", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    @scala.inline
    def setFirstAndThirdPartyAudienceType(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstAndThirdPartyAudienceTypeUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceType", js.undefined)
    
    @scala.inline
    def setGmailAudienceSize(value: String): Self = StObject.set(x, "gmailAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailAudienceSizeUndefined: Self = StObject.set(x, "gmailAudienceSize", js.undefined)
    
    @scala.inline
    def setMembershipDurationDays(value: String): Self = StObject.set(x, "membershipDurationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipDurationDaysUndefined: Self = StObject.set(x, "membershipDurationDays", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setYoutubeAudienceSize(value: String): Self = StObject.set(x, "youtubeAudienceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeAudienceSizeUndefined: Self = StObject.set(x, "youtubeAudienceSize", js.undefined)
  }
}
