package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationMessageTemplate extends Entity {
  /**
    * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none,
    * includeCompanyLogo, includeCompanyName, includeContactInformation.
    */
  var brandingOptions: js.UndefOr[NotificationTemplateBrandingOptions] = js.native
  // The default locale to fallback onto when the requested locale is not available.
  var defaultLocale: js.UndefOr[String] = js.native
  // Display name for the Notification Message Template.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The list of localized messages for this Notification Message Template.
  var localizedNotificationMessages: js.UndefOr[js.Array[LocalizedNotificationMessage]] = js.native
}

object NotificationMessageTemplate {
  @scala.inline
  def apply(): NotificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationMessageTemplate]
  }
  @scala.inline
  implicit class NotificationMessageTemplateOps[Self <: NotificationMessageTemplate] (val x: Self) extends AnyVal {
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
    def setBrandingOptions(value: NotificationTemplateBrandingOptions): Self = this.set("brandingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandingOptions: Self = this.set("brandingOptions", js.undefined)
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setLocalizedNotificationMessagesVarargs(value: LocalizedNotificationMessage*): Self = this.set("localizedNotificationMessages", js.Array(value :_*))
    @scala.inline
    def setLocalizedNotificationMessages(value: js.Array[LocalizedNotificationMessage]): Self = this.set("localizedNotificationMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedNotificationMessages: Self = this.set("localizedNotificationMessages", js.undefined)
  }
  
}

