package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedNotificationMessage extends Entity {
  /**
    * Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset,
    * set this property to true on another Localized Notification Message.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The Locale for which this message is destined.
  var locale: js.UndefOr[String] = js.native
  // The Message Template content.
  var messageTemplate: js.UndefOr[String] = js.native
  // The Message Template Subject.
  var subject: js.UndefOr[String] = js.native
}

object LocalizedNotificationMessage {
  @scala.inline
  def apply(): LocalizedNotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedNotificationMessage]
  }
  @scala.inline
  implicit class LocalizedNotificationMessageOps[Self <: LocalizedNotificationMessage] (val x: Self) extends AnyVal {
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
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

