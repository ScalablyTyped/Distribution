package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntuneBrand extends js.Object {
  // Email address of the person/organization responsible for IT support.
  var contactITEmailAddress: js.UndefOr[String] = js.undefined
  // Name of the person/organization responsible for IT support.
  var contactITName: js.UndefOr[String] = js.undefined
  // Text comments regarding the person/organization responsible for IT support.
  var contactITNotes: js.UndefOr[String] = js.undefined
  // Phone number of the person/organization responsible for IT support.
  var contactITPhoneNumber: js.UndefOr[String] = js.undefined
  // Logo image displayed in Company Portal apps which have a dark background behind the logo.
  var darkBackgroundLogo: js.UndefOr[MimeContent] = js.undefined
  // Company/organization name that is displayed to end users.
  var displayName: js.UndefOr[String] = js.undefined
  // Logo image displayed in Company Portal apps which have a light background behind the logo.
  var lightBackgroundLogo: js.UndefOr[MimeContent] = js.undefined
  // Display name of the company/organization’s IT helpdesk site.
  var onlineSupportSiteName: js.UndefOr[String] = js.undefined
  // URL to the company/organization’s IT helpdesk site.
  var onlineSupportSiteUrl: js.UndefOr[String] = js.undefined
  // URL to the company/organization’s privacy policy.
  var privacyUrl: js.UndefOr[String] = js.undefined
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showDisplayNameNextToLogo: js.UndefOr[Boolean] = js.undefined
  // Boolean that represents whether the administrator-supplied logo images are shown or not shown.
  var showLogo: js.UndefOr[Boolean] = js.undefined
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showNameNextToLogo: js.UndefOr[Boolean] = js.undefined
  // Primary theme color used in the Company Portal applications and web portal.
  var themeColor: js.UndefOr[RgbColor] = js.undefined
}

object IntuneBrand {
  @scala.inline
  def apply(
    contactITEmailAddress: String = null,
    contactITName: String = null,
    contactITNotes: String = null,
    contactITPhoneNumber: String = null,
    darkBackgroundLogo: MimeContent = null,
    displayName: String = null,
    lightBackgroundLogo: MimeContent = null,
    onlineSupportSiteName: String = null,
    onlineSupportSiteUrl: String = null,
    privacyUrl: String = null,
    showDisplayNameNextToLogo: js.UndefOr[Boolean] = js.undefined,
    showLogo: js.UndefOr[Boolean] = js.undefined,
    showNameNextToLogo: js.UndefOr[Boolean] = js.undefined,
    themeColor: RgbColor = null
  ): IntuneBrand = {
    val __obj = js.Dynamic.literal()
    if (contactITEmailAddress != null) __obj.updateDynamic("contactITEmailAddress")(contactITEmailAddress.asInstanceOf[js.Any])
    if (contactITName != null) __obj.updateDynamic("contactITName")(contactITName.asInstanceOf[js.Any])
    if (contactITNotes != null) __obj.updateDynamic("contactITNotes")(contactITNotes.asInstanceOf[js.Any])
    if (contactITPhoneNumber != null) __obj.updateDynamic("contactITPhoneNumber")(contactITPhoneNumber.asInstanceOf[js.Any])
    if (darkBackgroundLogo != null) __obj.updateDynamic("darkBackgroundLogo")(darkBackgroundLogo.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (lightBackgroundLogo != null) __obj.updateDynamic("lightBackgroundLogo")(lightBackgroundLogo.asInstanceOf[js.Any])
    if (onlineSupportSiteName != null) __obj.updateDynamic("onlineSupportSiteName")(onlineSupportSiteName.asInstanceOf[js.Any])
    if (onlineSupportSiteUrl != null) __obj.updateDynamic("onlineSupportSiteUrl")(onlineSupportSiteUrl.asInstanceOf[js.Any])
    if (privacyUrl != null) __obj.updateDynamic("privacyUrl")(privacyUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisplayNameNextToLogo)) __obj.updateDynamic("showDisplayNameNextToLogo")(showDisplayNameNextToLogo.asInstanceOf[js.Any])
    if (!js.isUndefined(showLogo)) __obj.updateDynamic("showLogo")(showLogo.asInstanceOf[js.Any])
    if (!js.isUndefined(showNameNextToLogo)) __obj.updateDynamic("showNameNextToLogo")(showNameNextToLogo.asInstanceOf[js.Any])
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntuneBrand]
  }
}

