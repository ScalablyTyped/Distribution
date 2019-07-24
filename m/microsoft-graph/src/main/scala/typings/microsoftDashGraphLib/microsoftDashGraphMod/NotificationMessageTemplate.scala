package typings
package microsoftDashGraphLib.microsoftDashGraphMod

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
  var defaultLocale: js.UndefOr[java.lang.String] = js.undefined
  // Display name for the Notification Message Template.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The list of localized messages for this Notification Message Template.
  var localizedNotificationMessages: js.UndefOr[js.Array[LocalizedNotificationMessage]] = js.undefined
}

object NotificationMessageTemplate {
  @scala.inline
  def apply(
    brandingOptions: NotificationTemplateBrandingOptions = null,
    defaultLocale: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    localizedNotificationMessages: js.Array[LocalizedNotificationMessage] = null
  ): NotificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (brandingOptions != null) __obj.updateDynamic("brandingOptions")(brandingOptions)
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (localizedNotificationMessages != null) __obj.updateDynamic("localizedNotificationMessages")(localizedNotificationMessages)
    __obj.asInstanceOf[NotificationMessageTemplate]
  }
}

