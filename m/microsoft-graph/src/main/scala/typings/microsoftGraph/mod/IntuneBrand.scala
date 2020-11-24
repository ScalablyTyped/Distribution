package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntuneBrand extends js.Object {
  
  // Email address of the person/organization responsible for IT support.
  var contactITEmailAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the person/organization responsible for IT support.
  var contactITName: js.UndefOr[NullableOption[String]] = js.native
  
  // Text comments regarding the person/organization responsible for IT support.
  var contactITNotes: js.UndefOr[NullableOption[String]] = js.native
  
  // Phone number of the person/organization responsible for IT support.
  var contactITPhoneNumber: js.UndefOr[NullableOption[String]] = js.native
  
  // Logo image displayed in Company Portal apps which have a dark background behind the logo.
  var darkBackgroundLogo: js.UndefOr[NullableOption[MimeContent]] = js.native
  
  // Company/organization name that is displayed to end users.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Logo image displayed in Company Portal apps which have a light background behind the logo.
  var lightBackgroundLogo: js.UndefOr[NullableOption[MimeContent]] = js.native
  
  // Display name of the company/organization’s IT helpdesk site.
  var onlineSupportSiteName: js.UndefOr[NullableOption[String]] = js.native
  
  // URL to the company/organization’s IT helpdesk site.
  var onlineSupportSiteUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // URL to the company/organization’s privacy policy.
  var privacyUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showDisplayNameNextToLogo: js.UndefOr[Boolean] = js.native
  
  // Boolean that represents whether the administrator-supplied logo images are shown or not shown.
  var showLogo: js.UndefOr[Boolean] = js.native
  
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showNameNextToLogo: js.UndefOr[Boolean] = js.native
  
  // Primary theme color used in the Company Portal applications and web portal.
  var themeColor: js.UndefOr[NullableOption[RgbColor]] = js.native
}
object IntuneBrand {
  
  @scala.inline
  def apply(): IntuneBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntuneBrand]
  }
  
  @scala.inline
  implicit class IntuneBrandOps[Self <: IntuneBrand] (val x: Self) extends AnyVal {
    
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
    def setContactITEmailAddress(value: NullableOption[String]): Self = this.set("contactITEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactITEmailAddress: Self = this.set("contactITEmailAddress", js.undefined)
    
    @scala.inline
    def setContactITEmailAddressNull: Self = this.set("contactITEmailAddress", null)
    
    @scala.inline
    def setContactITName(value: NullableOption[String]): Self = this.set("contactITName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactITName: Self = this.set("contactITName", js.undefined)
    
    @scala.inline
    def setContactITNameNull: Self = this.set("contactITName", null)
    
    @scala.inline
    def setContactITNotes(value: NullableOption[String]): Self = this.set("contactITNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactITNotes: Self = this.set("contactITNotes", js.undefined)
    
    @scala.inline
    def setContactITNotesNull: Self = this.set("contactITNotes", null)
    
    @scala.inline
    def setContactITPhoneNumber(value: NullableOption[String]): Self = this.set("contactITPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactITPhoneNumber: Self = this.set("contactITPhoneNumber", js.undefined)
    
    @scala.inline
    def setContactITPhoneNumberNull: Self = this.set("contactITPhoneNumber", null)
    
    @scala.inline
    def setDarkBackgroundLogo(value: NullableOption[MimeContent]): Self = this.set("darkBackgroundLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkBackgroundLogo: Self = this.set("darkBackgroundLogo", js.undefined)
    
    @scala.inline
    def setDarkBackgroundLogoNull: Self = this.set("darkBackgroundLogo", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setLightBackgroundLogo(value: NullableOption[MimeContent]): Self = this.set("lightBackgroundLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightBackgroundLogo: Self = this.set("lightBackgroundLogo", js.undefined)
    
    @scala.inline
    def setLightBackgroundLogoNull: Self = this.set("lightBackgroundLogo", null)
    
    @scala.inline
    def setOnlineSupportSiteName(value: NullableOption[String]): Self = this.set("onlineSupportSiteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlineSupportSiteName: Self = this.set("onlineSupportSiteName", js.undefined)
    
    @scala.inline
    def setOnlineSupportSiteNameNull: Self = this.set("onlineSupportSiteName", null)
    
    @scala.inline
    def setOnlineSupportSiteUrl(value: NullableOption[String]): Self = this.set("onlineSupportSiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlineSupportSiteUrl: Self = this.set("onlineSupportSiteUrl", js.undefined)
    
    @scala.inline
    def setOnlineSupportSiteUrlNull: Self = this.set("onlineSupportSiteUrl", null)
    
    @scala.inline
    def setPrivacyUrl(value: NullableOption[String]): Self = this.set("privacyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyUrl: Self = this.set("privacyUrl", js.undefined)
    
    @scala.inline
    def setPrivacyUrlNull: Self = this.set("privacyUrl", null)
    
    @scala.inline
    def setShowDisplayNameNextToLogo(value: Boolean): Self = this.set("showDisplayNameNextToLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDisplayNameNextToLogo: Self = this.set("showDisplayNameNextToLogo", js.undefined)
    
    @scala.inline
    def setShowLogo(value: Boolean): Self = this.set("showLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLogo: Self = this.set("showLogo", js.undefined)
    
    @scala.inline
    def setShowNameNextToLogo(value: Boolean): Self = this.set("showNameNextToLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNameNextToLogo: Self = this.set("showNameNextToLogo", js.undefined)
    
    @scala.inline
    def setThemeColor(value: NullableOption[RgbColor]): Self = this.set("themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeColor: Self = this.set("themeColor", js.undefined)
    
    @scala.inline
    def setThemeColorNull: Self = this.set("themeColor", null)
  }
}
