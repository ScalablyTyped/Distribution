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
  
  /** The app_id matches with the type of the mobile_device_ids being uploaded. Only applicable to audience_type `CUSTOMER_MATCH_DEVICE_ID` */
  var appId: js.UndefOr[String] = js.undefined
  
  /** Output only. The source of the audience. */
  var audienceSource: js.UndefOr[String] = js.undefined
  
  /** The type of the audience. */
  var audienceType: js.UndefOr[String] = js.undefined
  
  /** Input only. A list of contact information to define the initial audience members. Only applicable to audience_type `CUSTOMER_MATCH_CONTACT_INFO` */
  var contactInfoList: js.UndefOr[ContactInfoList] = js.undefined
  
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
  
  /** Whether the audience is a first or third party audience. */
  var firstAndThirdPartyAudienceType: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated audience size for Gmail network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise, the
    * number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var gmailAudienceSize: js.UndefOr[String] = js.undefined
  
  /**
    * The duration in days that an entry remains in the audience after the qualifying event. If the audience has no expiration, set the value of this field to 10000. Otherwise, the set
    * value must be greater than 0 and less than or equal to 540. Only applicable to first party audiences. This field is required if one of the following audience_type is used: *
    * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
    */
  var membershipDurationDays: js.UndefOr[String] = js.undefined
  
  /** Input only. A list of mobile device IDs to define the initial audience members. Only applicable to audience_type `CUSTOMER_MATCH_DEVICE_ID` */
  var mobileDeviceIdList: js.UndefOr[MobileDeviceIdList] = js.undefined
  
  /** Output only. The resource name of the first and third party audience. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The estimated audience size for YouTube network. If the size is less than 1000, the number will be hidden and 0 will be returned due to privacy reasons. Otherwise, the
    * number will be rounded off to two significant digits. Only applicable to first party audiences. Only returned in GET request.
    */
  var youtubeAudienceSize: js.UndefOr[String] = js.undefined
}
object FirstAndThirdPartyAudience {
  
  inline def apply(): FirstAndThirdPartyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudience]
  }
  
  extension [Self <: FirstAndThirdPartyAudience](x: Self) {
    
    inline def setActiveDisplayAudienceSize(value: String): Self = StObject.set(x, "activeDisplayAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setActiveDisplayAudienceSizeUndefined: Self = StObject.set(x, "activeDisplayAudienceSize", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAudienceSource(value: String): Self = StObject.set(x, "audienceSource", value.asInstanceOf[js.Any])
    
    inline def setAudienceSourceUndefined: Self = StObject.set(x, "audienceSource", js.undefined)
    
    inline def setAudienceType(value: String): Self = StObject.set(x, "audienceType", value.asInstanceOf[js.Any])
    
    inline def setAudienceTypeUndefined: Self = StObject.set(x, "audienceType", js.undefined)
    
    inline def setContactInfoList(value: ContactInfoList): Self = StObject.set(x, "contactInfoList", value.asInstanceOf[js.Any])
    
    inline def setContactInfoListUndefined: Self = StObject.set(x, "contactInfoList", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayAudienceSize(value: String): Self = StObject.set(x, "displayAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setDisplayAudienceSizeUndefined: Self = StObject.set(x, "displayAudienceSize", js.undefined)
    
    inline def setDisplayDesktopAudienceSize(value: String): Self = StObject.set(x, "displayDesktopAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setDisplayDesktopAudienceSizeUndefined: Self = StObject.set(x, "displayDesktopAudienceSize", js.undefined)
    
    inline def setDisplayMobileAppAudienceSize(value: String): Self = StObject.set(x, "displayMobileAppAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setDisplayMobileAppAudienceSizeUndefined: Self = StObject.set(x, "displayMobileAppAudienceSize", js.undefined)
    
    inline def setDisplayMobileWebAudienceSize(value: String): Self = StObject.set(x, "displayMobileWebAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setDisplayMobileWebAudienceSizeUndefined: Self = StObject.set(x, "displayMobileWebAudienceSize", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    inline def setFirstAndThirdPartyAudienceType(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceType", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceTypeUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceType", js.undefined)
    
    inline def setGmailAudienceSize(value: String): Self = StObject.set(x, "gmailAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setGmailAudienceSizeUndefined: Self = StObject.set(x, "gmailAudienceSize", js.undefined)
    
    inline def setMembershipDurationDays(value: String): Self = StObject.set(x, "membershipDurationDays", value.asInstanceOf[js.Any])
    
    inline def setMembershipDurationDaysUndefined: Self = StObject.set(x, "membershipDurationDays", js.undefined)
    
    inline def setMobileDeviceIdList(value: MobileDeviceIdList): Self = StObject.set(x, "mobileDeviceIdList", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceIdListUndefined: Self = StObject.set(x, "mobileDeviceIdList", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setYoutubeAudienceSize(value: String): Self = StObject.set(x, "youtubeAudienceSize", value.asInstanceOf[js.Any])
    
    inline def setYoutubeAudienceSizeUndefined: Self = StObject.set(x, "youtubeAudienceSize", js.undefined)
  }
}
