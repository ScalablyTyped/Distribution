package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntuneBrand extends js.Object {
  // Email address of the person/organization responsible for IT support.
  var contactITEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  // Name of the person/organization responsible for IT support.
  var contactITName: js.UndefOr[java.lang.String] = js.undefined
  // Text comments regarding the person/organization responsible for IT support.
  var contactITNotes: js.UndefOr[java.lang.String] = js.undefined
  // Phone number of the person/organization responsible for IT support.
  var contactITPhoneNumber: js.UndefOr[java.lang.String] = js.undefined
  // Logo image displayed in Company Portal apps which have a dark background behind the logo.
  var darkBackgroundLogo: js.UndefOr[MimeContent] = js.undefined
  // Company/organization name that is displayed to end users.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Logo image displayed in Company Portal apps which have a light background behind the logo.
  var lightBackgroundLogo: js.UndefOr[MimeContent] = js.undefined
  // Display name of the company/organization’s IT helpdesk site.
  var onlineSupportSiteName: js.UndefOr[java.lang.String] = js.undefined
  // URL to the company/organization’s IT helpdesk site.
  var onlineSupportSiteUrl: js.UndefOr[java.lang.String] = js.undefined
  // URL to the company/organization’s privacy policy.
  var privacyUrl: js.UndefOr[java.lang.String] = js.undefined
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showDisplayNameNextToLogo: js.UndefOr[scala.Boolean] = js.undefined
  // Boolean that represents whether the administrator-supplied logo images are shown or not shown.
  var showLogo: js.UndefOr[scala.Boolean] = js.undefined
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showNameNextToLogo: js.UndefOr[scala.Boolean] = js.undefined
  // Primary theme color used in the Company Portal applications and web portal.
  var themeColor: js.UndefOr[RgbColor] = js.undefined
}

object IntuneBrand {
  @scala.inline
  def apply(
    contactITEmailAddress: java.lang.String = null,
    contactITName: java.lang.String = null,
    contactITNotes: java.lang.String = null,
    contactITPhoneNumber: java.lang.String = null,
    darkBackgroundLogo: MimeContent = null,
    displayName: java.lang.String = null,
    lightBackgroundLogo: MimeContent = null,
    onlineSupportSiteName: java.lang.String = null,
    onlineSupportSiteUrl: java.lang.String = null,
    privacyUrl: java.lang.String = null,
    showDisplayNameNextToLogo: js.UndefOr[scala.Boolean] = js.undefined,
    showLogo: js.UndefOr[scala.Boolean] = js.undefined,
    showNameNextToLogo: js.UndefOr[scala.Boolean] = js.undefined,
    themeColor: RgbColor = null
  ): IntuneBrand = {
    val __obj = js.Dynamic.literal()
    if (contactITEmailAddress != null) __obj.updateDynamic("contactITEmailAddress")(contactITEmailAddress)
    if (contactITName != null) __obj.updateDynamic("contactITName")(contactITName)
    if (contactITNotes != null) __obj.updateDynamic("contactITNotes")(contactITNotes)
    if (contactITPhoneNumber != null) __obj.updateDynamic("contactITPhoneNumber")(contactITPhoneNumber)
    if (darkBackgroundLogo != null) __obj.updateDynamic("darkBackgroundLogo")(darkBackgroundLogo)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (lightBackgroundLogo != null) __obj.updateDynamic("lightBackgroundLogo")(lightBackgroundLogo)
    if (onlineSupportSiteName != null) __obj.updateDynamic("onlineSupportSiteName")(onlineSupportSiteName)
    if (onlineSupportSiteUrl != null) __obj.updateDynamic("onlineSupportSiteUrl")(onlineSupportSiteUrl)
    if (privacyUrl != null) __obj.updateDynamic("privacyUrl")(privacyUrl)
    if (!js.isUndefined(showDisplayNameNextToLogo)) __obj.updateDynamic("showDisplayNameNextToLogo")(showDisplayNameNextToLogo)
    if (!js.isUndefined(showLogo)) __obj.updateDynamic("showLogo")(showLogo)
    if (!js.isUndefined(showNameNextToLogo)) __obj.updateDynamic("showNameNextToLogo")(showNameNextToLogo)
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor)
    __obj.asInstanceOf[IntuneBrand]
  }
}

