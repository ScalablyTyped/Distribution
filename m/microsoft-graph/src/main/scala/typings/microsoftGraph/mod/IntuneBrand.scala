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
  
  @scala.inline
  def apply(): IntuneBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntuneBrand]
  }
  
  @scala.inline
  implicit class IntuneBrandMutableBuilder[Self <: IntuneBrand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactITEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "contactITEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactITEmailAddressNull: Self = StObject.set(x, "contactITEmailAddress", null)
    
    @scala.inline
    def setContactITEmailAddressUndefined: Self = StObject.set(x, "contactITEmailAddress", js.undefined)
    
    @scala.inline
    def setContactITName(value: NullableOption[String]): Self = StObject.set(x, "contactITName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactITNameNull: Self = StObject.set(x, "contactITName", null)
    
    @scala.inline
    def setContactITNameUndefined: Self = StObject.set(x, "contactITName", js.undefined)
    
    @scala.inline
    def setContactITNotes(value: NullableOption[String]): Self = StObject.set(x, "contactITNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactITNotesNull: Self = StObject.set(x, "contactITNotes", null)
    
    @scala.inline
    def setContactITNotesUndefined: Self = StObject.set(x, "contactITNotes", js.undefined)
    
    @scala.inline
    def setContactITPhoneNumber(value: NullableOption[String]): Self = StObject.set(x, "contactITPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactITPhoneNumberNull: Self = StObject.set(x, "contactITPhoneNumber", null)
    
    @scala.inline
    def setContactITPhoneNumberUndefined: Self = StObject.set(x, "contactITPhoneNumber", js.undefined)
    
    @scala.inline
    def setDarkBackgroundLogo(value: NullableOption[MimeContent]): Self = StObject.set(x, "darkBackgroundLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkBackgroundLogoNull: Self = StObject.set(x, "darkBackgroundLogo", null)
    
    @scala.inline
    def setDarkBackgroundLogoUndefined: Self = StObject.set(x, "darkBackgroundLogo", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLightBackgroundLogo(value: NullableOption[MimeContent]): Self = StObject.set(x, "lightBackgroundLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightBackgroundLogoNull: Self = StObject.set(x, "lightBackgroundLogo", null)
    
    @scala.inline
    def setLightBackgroundLogoUndefined: Self = StObject.set(x, "lightBackgroundLogo", js.undefined)
    
    @scala.inline
    def setOnlineSupportSiteName(value: NullableOption[String]): Self = StObject.set(x, "onlineSupportSiteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineSupportSiteNameNull: Self = StObject.set(x, "onlineSupportSiteName", null)
    
    @scala.inline
    def setOnlineSupportSiteNameUndefined: Self = StObject.set(x, "onlineSupportSiteName", js.undefined)
    
    @scala.inline
    def setOnlineSupportSiteUrl(value: NullableOption[String]): Self = StObject.set(x, "onlineSupportSiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineSupportSiteUrlNull: Self = StObject.set(x, "onlineSupportSiteUrl", null)
    
    @scala.inline
    def setOnlineSupportSiteUrlUndefined: Self = StObject.set(x, "onlineSupportSiteUrl", js.undefined)
    
    @scala.inline
    def setPrivacyUrl(value: NullableOption[String]): Self = StObject.set(x, "privacyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyUrlNull: Self = StObject.set(x, "privacyUrl", null)
    
    @scala.inline
    def setPrivacyUrlUndefined: Self = StObject.set(x, "privacyUrl", js.undefined)
    
    @scala.inline
    def setShowDisplayNameNextToLogo(value: Boolean): Self = StObject.set(x, "showDisplayNameNextToLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDisplayNameNextToLogoUndefined: Self = StObject.set(x, "showDisplayNameNextToLogo", js.undefined)
    
    @scala.inline
    def setShowLogo(value: Boolean): Self = StObject.set(x, "showLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLogoUndefined: Self = StObject.set(x, "showLogo", js.undefined)
    
    @scala.inline
    def setShowNameNextToLogo(value: Boolean): Self = StObject.set(x, "showNameNextToLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNameNextToLogoUndefined: Self = StObject.set(x, "showNameNextToLogo", js.undefined)
    
    @scala.inline
    def setThemeColor(value: NullableOption[RgbColor]): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorNull: Self = StObject.set(x, "themeColor", null)
    
    @scala.inline
    def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
