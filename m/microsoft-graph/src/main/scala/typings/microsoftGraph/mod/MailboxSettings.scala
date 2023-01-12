package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxSettings extends StObject {
  
  // Folder ID of an archive folder for the user.
  var archiveFolder: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
  var automaticRepliesSetting: js.UndefOr[NullableOption[AutomaticRepliesSetting]] = js.undefined
  
  // The date format for the user's mailbox.
  var dateFormat: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting
    * messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal,
    * sendToDelegateAndPrincipal, sendToDelegateOnly.
    */
  var delegateMeetingMessageDeliveryOptions: js.UndefOr[NullableOption[DelegateMeetingMessageDeliveryOptions]] = js.undefined
  
  // The locale information for the user, including the preferred language and country/region.
  var language: js.UndefOr[NullableOption[LocaleInfo]] = js.undefined
  
  // The time format for the user's mailbox.
  var timeFormat: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default time zone for the user's mailbox.
  var timeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  var userPurpose: js.UndefOr[NullableOption[UserPurpose]] = js.undefined
  
  // The days of the week and hours in a specific time zone that the user works.
  var workingHours: js.UndefOr[NullableOption[WorkingHours]] = js.undefined
}
object MailboxSettings {
  
  inline def apply(): MailboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailboxSettings] (val x: Self) extends AnyVal {
    
    inline def setArchiveFolder(value: NullableOption[String]): Self = StObject.set(x, "archiveFolder", value.asInstanceOf[js.Any])
    
    inline def setArchiveFolderNull: Self = StObject.set(x, "archiveFolder", null)
    
    inline def setArchiveFolderUndefined: Self = StObject.set(x, "archiveFolder", js.undefined)
    
    inline def setAutomaticRepliesSetting(value: NullableOption[AutomaticRepliesSetting]): Self = StObject.set(x, "automaticRepliesSetting", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRepliesSettingNull: Self = StObject.set(x, "automaticRepliesSetting", null)
    
    inline def setAutomaticRepliesSettingUndefined: Self = StObject.set(x, "automaticRepliesSetting", js.undefined)
    
    inline def setDateFormat(value: NullableOption[String]): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatNull: Self = StObject.set(x, "dateFormat", null)
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDelegateMeetingMessageDeliveryOptions(value: NullableOption[DelegateMeetingMessageDeliveryOptions]): Self = StObject.set(x, "delegateMeetingMessageDeliveryOptions", value.asInstanceOf[js.Any])
    
    inline def setDelegateMeetingMessageDeliveryOptionsNull: Self = StObject.set(x, "delegateMeetingMessageDeliveryOptions", null)
    
    inline def setDelegateMeetingMessageDeliveryOptionsUndefined: Self = StObject.set(x, "delegateMeetingMessageDeliveryOptions", js.undefined)
    
    inline def setLanguage(value: NullableOption[LocaleInfo]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setTimeFormat(value: NullableOption[String]): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatNull: Self = StObject.set(x, "timeFormat", null)
    
    inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
    
    inline def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUserPurpose(value: NullableOption[UserPurpose]): Self = StObject.set(x, "userPurpose", value.asInstanceOf[js.Any])
    
    inline def setUserPurposeNull: Self = StObject.set(x, "userPurpose", null)
    
    inline def setUserPurposeUndefined: Self = StObject.set(x, "userPurpose", js.undefined)
    
    inline def setWorkingHours(value: NullableOption[WorkingHours]): Self = StObject.set(x, "workingHours", value.asInstanceOf[js.Any])
    
    inline def setWorkingHoursNull: Self = StObject.set(x, "workingHours", null)
    
    inline def setWorkingHoursUndefined: Self = StObject.set(x, "workingHours", js.undefined)
  }
}
