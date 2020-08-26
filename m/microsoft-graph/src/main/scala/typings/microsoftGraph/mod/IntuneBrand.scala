package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntuneBrand extends js.Object {
  // Email address of the person/organization responsible for IT support.
  var contactITEmailAddress: js.UndefOr[String] = js.native
  // Name of the person/organization responsible for IT support.
  var contactITName: js.UndefOr[String] = js.native
  // Text comments regarding the person/organization responsible for IT support.
  var contactITNotes: js.UndefOr[String] = js.native
  // Phone number of the person/organization responsible for IT support.
  var contactITPhoneNumber: js.UndefOr[String] = js.native
  // Logo image displayed in Company Portal apps which have a dark background behind the logo.
  var darkBackgroundLogo: js.UndefOr[MimeContent] = js.native
  // Company/organization name that is displayed to end users.
  var displayName: js.UndefOr[String] = js.native
  // Logo image displayed in Company Portal apps which have a light background behind the logo.
  var lightBackgroundLogo: js.UndefOr[MimeContent] = js.native
  // Display name of the company/organization’s IT helpdesk site.
  var onlineSupportSiteName: js.UndefOr[String] = js.native
  // URL to the company/organization’s IT helpdesk site.
  var onlineSupportSiteUrl: js.UndefOr[String] = js.native
  // URL to the company/organization’s privacy policy.
  var privacyUrl: js.UndefOr[String] = js.native
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showDisplayNameNextToLogo: js.UndefOr[Boolean] = js.native
  // Boolean that represents whether the administrator-supplied logo images are shown or not shown.
  var showLogo: js.UndefOr[Boolean] = js.native
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showNameNextToLogo: js.UndefOr[Boolean] = js.native
  // Primary theme color used in the Company Portal applications and web portal.
  var themeColor: js.UndefOr[RgbColor] = js.native
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
    def setContactITEmailAddress(value: String): Self = this.set("contactITEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactITEmailAddress: Self = this.set("contactITEmailAddress", js.undefined)
    @scala.inline
    def setContactITName(value: String): Self = this.set("contactITName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactITName: Self = this.set("contactITName", js.undefined)
    @scala.inline
    def setContactITNotes(value: String): Self = this.set("contactITNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactITNotes: Self = this.set("contactITNotes", js.undefined)
    @scala.inline
    def setContactITPhoneNumber(value: String): Self = this.set("contactITPhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactITPhoneNumber: Self = this.set("contactITPhoneNumber", js.undefined)
    @scala.inline
    def setDarkBackgroundLogo(value: MimeContent): Self = this.set("darkBackgroundLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkBackgroundLogo: Self = this.set("darkBackgroundLogo", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLightBackgroundLogo(value: MimeContent): Self = this.set("lightBackgroundLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightBackgroundLogo: Self = this.set("lightBackgroundLogo", js.undefined)
    @scala.inline
    def setOnlineSupportSiteName(value: String): Self = this.set("onlineSupportSiteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlineSupportSiteName: Self = this.set("onlineSupportSiteName", js.undefined)
    @scala.inline
    def setOnlineSupportSiteUrl(value: String): Self = this.set("onlineSupportSiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlineSupportSiteUrl: Self = this.set("onlineSupportSiteUrl", js.undefined)
    @scala.inline
    def setPrivacyUrl(value: String): Self = this.set("privacyUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacyUrl: Self = this.set("privacyUrl", js.undefined)
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
    def setThemeColor(value: RgbColor): Self = this.set("themeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeColor: Self = this.set("themeColor", js.undefined)
  }
  
}

