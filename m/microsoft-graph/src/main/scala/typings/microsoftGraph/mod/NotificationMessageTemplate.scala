package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationMessageTemplate extends Entity {
  /**
    * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none,
    * includeCompanyLogo, includeCompanyName, includeContactInformation.
    */
  var brandingOptions: js.UndefOr[NotificationTemplateBrandingOptions] = js.undefined
  // The default locale to fallback onto when the requested locale is not available.
  var defaultLocale: js.UndefOr[String] = js.undefined
  // Display name for the Notification Message Template.
  var displayName: js.UndefOr[String] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // The list of localized messages for this Notification Message Template.
  var localizedNotificationMessages: js.UndefOr[js.Array[LocalizedNotificationMessage]] = js.undefined
}

object NotificationMessageTemplate {
  @scala.inline
  def apply(
    brandingOptions: NotificationTemplateBrandingOptions = null,
    defaultLocale: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    localizedNotificationMessages: js.Array[LocalizedNotificationMessage] = null
  ): NotificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (brandingOptions != null) __obj.updateDynamic("brandingOptions")(brandingOptions.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (localizedNotificationMessages != null) __obj.updateDynamic("localizedNotificationMessages")(localizedNotificationMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessageTemplate]
  }
}

