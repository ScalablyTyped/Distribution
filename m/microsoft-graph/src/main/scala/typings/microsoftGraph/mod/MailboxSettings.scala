package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailboxSettings extends js.Object {
  
  // Folder ID of an archive folder for the user.
  var archiveFolder: js.UndefOr[NullableOption[String]] = js.native
  
  // Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
  var automaticRepliesSetting: js.UndefOr[NullableOption[AutomaticRepliesSetting]] = js.native
  
  // The date format for the user's mailbox.
  var dateFormat: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting
    * messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal,
    * sendToDelegateAndPrincipal, sendToDelegateOnly.
    */
  var delegateMeetingMessageDeliveryOptions: js.UndefOr[NullableOption[DelegateMeetingMessageDeliveryOptions]] = js.native
  
  // The locale information for the user, including the preferred language and country/region.
  var language: js.UndefOr[NullableOption[LocaleInfo]] = js.native
  
  // The time format for the user's mailbox.
  var timeFormat: js.UndefOr[NullableOption[String]] = js.native
  
  // The default time zone for the user's mailbox.
  var timeZone: js.UndefOr[NullableOption[String]] = js.native
  
  // The days of the week and hours in a specific time zone that the user works.
  var workingHours: js.UndefOr[NullableOption[WorkingHours]] = js.native
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
    def setArchiveFolder(value: NullableOption[String]): Self = this.set("archiveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveFolder: Self = this.set("archiveFolder", js.undefined)
    
    @scala.inline
    def setArchiveFolderNull: Self = this.set("archiveFolder", null)
    
    @scala.inline
    def setAutomaticRepliesSetting(value: NullableOption[AutomaticRepliesSetting]): Self = this.set("automaticRepliesSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticRepliesSetting: Self = this.set("automaticRepliesSetting", js.undefined)
    
    @scala.inline
    def setAutomaticRepliesSettingNull: Self = this.set("automaticRepliesSetting", null)
    
    @scala.inline
    def setDateFormat(value: NullableOption[String]): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDateFormatNull: Self = this.set("dateFormat", null)
    
    @scala.inline
    def setDelegateMeetingMessageDeliveryOptions(value: NullableOption[DelegateMeetingMessageDeliveryOptions]): Self = this.set("delegateMeetingMessageDeliveryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegateMeetingMessageDeliveryOptions: Self = this.set("delegateMeetingMessageDeliveryOptions", js.undefined)
    
    @scala.inline
    def setDelegateMeetingMessageDeliveryOptionsNull: Self = this.set("delegateMeetingMessageDeliveryOptions", null)
    
    @scala.inline
    def setLanguage(value: NullableOption[LocaleInfo]): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
    
    @scala.inline
    def setTimeFormat(value: NullableOption[String]): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setTimeFormatNull: Self = this.set("timeFormat", null)
    
    @scala.inline
    def setTimeZone(value: NullableOption[String]): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneNull: Self = this.set("timeZone", null)
    
    @scala.inline
    def setWorkingHours(value: NullableOption[WorkingHours]): Self = this.set("workingHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingHours: Self = this.set("workingHours", js.undefined)
    
    @scala.inline
    def setWorkingHoursNull: Self = this.set("workingHours", null)
  }
}
