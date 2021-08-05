package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntuneBrand extends StObject {
  
  // Email address of the person/organization responsible for IT support.
  var contactITEmailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the person/organization responsible for IT support.
  var contactITName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Text comments regarding the person/organization responsible for IT support.
  var contactITNotes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Phone number of the person/organization responsible for IT support.
  var contactITPhoneNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Logo image displayed in Company Portal apps which have a dark background behind the logo.
  var darkBackgroundLogo: js.UndefOr[NullableOption[MimeContent]] = js.undefined
  
  // Company/organization name that is displayed to end users.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Logo image displayed in Company Portal apps which have a light background behind the logo.
  var lightBackgroundLogo: js.UndefOr[NullableOption[MimeContent]] = js.undefined
  
  // Display name of the company/organization’s IT helpdesk site.
  var onlineSupportSiteName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL to the company/organization’s IT helpdesk site.
  var onlineSupportSiteUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL to the company/organization’s privacy policy.
  var privacyUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showDisplayNameNextToLogo: js.UndefOr[Boolean] = js.undefined
  
  // Boolean that represents whether the administrator-supplied logo images are shown or not shown.
  var showLogo: js.UndefOr[Boolean] = js.undefined
  
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showNameNextToLogo: js.UndefOr[Boolean] = js.undefined
  
  // Primary theme color used in the Company Portal applications and web portal.
  var themeColor: js.UndefOr[NullableOption[RgbColor]] = js.undefined
}
object IntuneBrand {
  
  inline def apply(): IntuneBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntuneBrand]
  }
  
  extension [Self <: IntuneBrand](x: Self) {
    
    inline def setContactITEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "contactITEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setContactITEmailAddressNull: Self = StObject.set(x, "contactITEmailAddress", null)
    
    inline def setContactITEmailAddressUndefined: Self = StObject.set(x, "contactITEmailAddress", js.undefined)
    
    inline def setContactITName(value: NullableOption[String]): Self = StObject.set(x, "contactITName", value.asInstanceOf[js.Any])
    
    inline def setContactITNameNull: Self = StObject.set(x, "contactITName", null)
    
    inline def setContactITNameUndefined: Self = StObject.set(x, "contactITName", js.undefined)
    
    inline def setContactITNotes(value: NullableOption[String]): Self = StObject.set(x, "contactITNotes", value.asInstanceOf[js.Any])
    
    inline def setContactITNotesNull: Self = StObject.set(x, "contactITNotes", null)
    
    inline def setContactITNotesUndefined: Self = StObject.set(x, "contactITNotes", js.undefined)
    
    inline def setContactITPhoneNumber(value: NullableOption[String]): Self = StObject.set(x, "contactITPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setContactITPhoneNumberNull: Self = StObject.set(x, "contactITPhoneNumber", null)
    
    inline def setContactITPhoneNumberUndefined: Self = StObject.set(x, "contactITPhoneNumber", js.undefined)
    
    inline def setDarkBackgroundLogo(value: NullableOption[MimeContent]): Self = StObject.set(x, "darkBackgroundLogo", value.asInstanceOf[js.Any])
    
    inline def setDarkBackgroundLogoNull: Self = StObject.set(x, "darkBackgroundLogo", null)
    
    inline def setDarkBackgroundLogoUndefined: Self = StObject.set(x, "darkBackgroundLogo", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLightBackgroundLogo(value: NullableOption[MimeContent]): Self = StObject.set(x, "lightBackgroundLogo", value.asInstanceOf[js.Any])
    
    inline def setLightBackgroundLogoNull: Self = StObject.set(x, "lightBackgroundLogo", null)
    
    inline def setLightBackgroundLogoUndefined: Self = StObject.set(x, "lightBackgroundLogo", js.undefined)
    
    inline def setOnlineSupportSiteName(value: NullableOption[String]): Self = StObject.set(x, "onlineSupportSiteName", value.asInstanceOf[js.Any])
    
    inline def setOnlineSupportSiteNameNull: Self = StObject.set(x, "onlineSupportSiteName", null)
    
    inline def setOnlineSupportSiteNameUndefined: Self = StObject.set(x, "onlineSupportSiteName", js.undefined)
    
    inline def setOnlineSupportSiteUrl(value: NullableOption[String]): Self = StObject.set(x, "onlineSupportSiteUrl", value.asInstanceOf[js.Any])
    
    inline def setOnlineSupportSiteUrlNull: Self = StObject.set(x, "onlineSupportSiteUrl", null)
    
    inline def setOnlineSupportSiteUrlUndefined: Self = StObject.set(x, "onlineSupportSiteUrl", js.undefined)
    
    inline def setPrivacyUrl(value: NullableOption[String]): Self = StObject.set(x, "privacyUrl", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUrlNull: Self = StObject.set(x, "privacyUrl", null)
    
    inline def setPrivacyUrlUndefined: Self = StObject.set(x, "privacyUrl", js.undefined)
    
    inline def setShowDisplayNameNextToLogo(value: Boolean): Self = StObject.set(x, "showDisplayNameNextToLogo", value.asInstanceOf[js.Any])
    
    inline def setShowDisplayNameNextToLogoUndefined: Self = StObject.set(x, "showDisplayNameNextToLogo", js.undefined)
    
    inline def setShowLogo(value: Boolean): Self = StObject.set(x, "showLogo", value.asInstanceOf[js.Any])
    
    inline def setShowLogoUndefined: Self = StObject.set(x, "showLogo", js.undefined)
    
    inline def setShowNameNextToLogo(value: Boolean): Self = StObject.set(x, "showNameNextToLogo", value.asInstanceOf[js.Any])
    
    inline def setShowNameNextToLogoUndefined: Self = StObject.set(x, "showNameNextToLogo", js.undefined)
    
    inline def setThemeColor(value: NullableOption[RgbColor]): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorNull: Self = StObject.set(x, "themeColor", null)
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
