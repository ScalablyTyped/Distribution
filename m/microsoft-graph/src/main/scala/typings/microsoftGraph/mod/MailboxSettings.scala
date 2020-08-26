package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailboxSettings extends js.Object {
  // Folder ID of an archive folder for the user.
  var archiveFolder: js.UndefOr[String] = js.native
  // Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
  var automaticRepliesSetting: js.UndefOr[AutomaticRepliesSetting] = js.native
  // The date format for the user's mailbox.
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting
    * messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal,
    * sendToDelegateAndPrincipal, sendToDelegateOnly.
    */
  var delegateMeetingMessageDeliveryOptions: js.UndefOr[DelegateMeetingMessageDeliveryOptions] = js.native
  // The locale information for the user, including the preferred language and country/region.
  var language: js.UndefOr[LocaleInfo] = js.native
  // The time format for the user's mailbox.
  var timeFormat: js.UndefOr[String] = js.native
  // The default time zone for the user's mailbox.
  var timeZone: js.UndefOr[String] = js.native
  // The days of the week and hours in a specific time zone that the user works.
  var workingHours: js.UndefOr[WorkingHours] = js.native
}

object MailboxSettings {
  @scala.inline
  def apply(): MailboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxSettings]
  }
  @scala.inline
  implicit class MailboxSettingsOps[Self <: MailboxSettings] (val x: Self) extends AnyVal {
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
    def setArchiveFolder(value: String): Self = this.set("archiveFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveFolder: Self = this.set("archiveFolder", js.undefined)
    @scala.inline
    def setAutomaticRepliesSetting(value: AutomaticRepliesSetting): Self = this.set("automaticRepliesSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticRepliesSetting: Self = this.set("automaticRepliesSetting", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDelegateMeetingMessageDeliveryOptions(value: DelegateMeetingMessageDeliveryOptions): Self = this.set("delegateMeetingMessageDeliveryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegateMeetingMessageDeliveryOptions: Self = this.set("delegateMeetingMessageDeliveryOptions", js.undefined)
    @scala.inline
    def setLanguage(value: LocaleInfo): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setWorkingHours(value: WorkingHours): Self = this.set("workingHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingHours: Self = this.set("workingHours", js.undefined)
  }
  
}

