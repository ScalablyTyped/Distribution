package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailboxEnums {
  
  /**
    * Specifies the type of action in a notification message.
    *
    * [Api set: Mailbox Preview]
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ActionType & String] = js.native
    
    /* "showTaskPane" */ val ShowTaskPane: typings.officeJsPreview.Office.MailboxEnums.ActionType.ShowTaskPane & String = js.native
  }
  
  /**
    * Specifies the sensitivity type of an appointment.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.AppointmentSensitivityType")
  @js.native
  object AppointmentSensitivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType & String] = js.native
    
    /* "confidential" */ val Confidential: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Confidential & String = js.native
    
    /* "normal" */ val Normal: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Normal & String = js.native
    
    /* "personal" */ val Personal: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Personal & String = js.native
    
    /* "private" */ val Private: typings.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Private & String = js.native
  }
  
  /**
    * Specifies the formatting that applies to an attachment's content.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentContentFormat")
  @js.native
  object AttachmentContentFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat & String] = js.native
    
    /* "base64" */ val Base64: typings.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Base64 & String = js.native
    
    /* "eml" */ val Eml: typings.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Eml & String = js.native
    
    /* "iCalendar" */ val ICalendar: typings.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.ICalendar & String = js.native
    
    /* "url" */ val Url: typings.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Url & String = js.native
  }
  
  /**
    * Specifies whether an attachment was added to or removed from an item.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentStatus")
  @js.native
  object AttachmentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.AttachmentStatus & String] = js.native
    
    /* "added" */ val Added: typings.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Added & String = js.native
    
    /* "removed" */ val Removed: typings.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Removed & String = js.native
  }
  
  /**
    * Specifies an attachment's type.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentType")
  @js.native
  object AttachmentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.AttachmentType & String] = js.native
    
    /* "cloud" */ val Cloud: typings.officeJsPreview.Office.MailboxEnums.AttachmentType.Cloud & String = js.native
    
    /* "file" */ val File: typings.officeJsPreview.Office.MailboxEnums.AttachmentType.File & String = js.native
    
    /* "item" */ val Item: typings.officeJsPreview.Office.MailboxEnums.AttachmentType.Item & String = js.native
  }
  
  /**
    * Specifies the category color.
    *
    * **Note**: The actual color depends on how the Outlook client renders it.
    * In this case, the colors noted on each preset are for the Outlook desktop client.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.CategoryColor")
  @js.native
  object CategoryColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.CategoryColor & Double] = js.native
    
    /* 0 */ val None: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.None & Double = js.native
    
    /* 1 */ val Preset0: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset0 & Double = js.native
    
    /* 2 */ val Preset1: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset1 & Double = js.native
    
    /* 11 */ val Preset10: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset10 & Double = js.native
    
    /* 12 */ val Preset11: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset11 & Double = js.native
    
    /* 13 */ val Preset12: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset12 & Double = js.native
    
    /* 14 */ val Preset13: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset13 & Double = js.native
    
    /* 15 */ val Preset14: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset14 & Double = js.native
    
    /* 16 */ val Preset15: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset15 & Double = js.native
    
    /* 17 */ val Preset16: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset16 & Double = js.native
    
    /* 18 */ val Preset17: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset17 & Double = js.native
    
    /* 19 */ val Preset18: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset18 & Double = js.native
    
    /* 20 */ val Preset19: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset19 & Double = js.native
    
    /* 3 */ val Preset2: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset2 & Double = js.native
    
    /* 21 */ val Preset20: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset20 & Double = js.native
    
    /* 22 */ val Preset21: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset21 & Double = js.native
    
    /* 23 */ val Preset22: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset22 & Double = js.native
    
    /* 24 */ val Preset23: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset23 & Double = js.native
    
    /* 25 */ val Preset24: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset24 & Double = js.native
    
    /* 4 */ val Preset3: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset3 & Double = js.native
    
    /* 5 */ val Preset4: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset4 & Double = js.native
    
    /* 6 */ val Preset5: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset5 & Double = js.native
    
    /* 7 */ val Preset6: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset6 & Double = js.native
    
    /* 8 */ val Preset7: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset7 & Double = js.native
    
    /* 9 */ val Preset8: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset8 & Double = js.native
    
    /* 10 */ val Preset9: typings.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset9 & Double = js.native
  }
  
  /**
    * Compose type.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.ComposeType")
  @js.native
  object ComposeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ComposeType & String] = js.native
    
    /* "forward" */ val Forward: typings.officeJsPreview.Office.MailboxEnums.ComposeType.Forward & String = js.native
    
    /* "newMail" */ val NewMail: typings.officeJsPreview.Office.MailboxEnums.ComposeType.NewMail & String = js.native
    
    /* "reply" */ val Reply: typings.officeJsPreview.Office.MailboxEnums.ComposeType.Reply & String = js.native
  }
  
  /**
    * Specifies the day of week or type of day.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.Days")
  @js.native
  object Days extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.Days & String] = js.native
    
    /* "day" */ val Day: typings.officeJsPreview.Office.MailboxEnums.Days.Day & String = js.native
    
    /* "fri" */ val Fri: typings.officeJsPreview.Office.MailboxEnums.Days.Fri & String = js.native
    
    /* "mon" */ val Mon: typings.officeJsPreview.Office.MailboxEnums.Days.Mon & String = js.native
    
    /* "sat" */ val Sat: typings.officeJsPreview.Office.MailboxEnums.Days.Sat & String = js.native
    
    /* "sun" */ val Sun: typings.officeJsPreview.Office.MailboxEnums.Days.Sun & String = js.native
    
    /* "thu" */ val Thu: typings.officeJsPreview.Office.MailboxEnums.Days.Thu & String = js.native
    
    /* "tue" */ val Tue: typings.officeJsPreview.Office.MailboxEnums.Days.Tue & String = js.native
    
    /* "wed" */ val Wed: typings.officeJsPreview.Office.MailboxEnums.Days.Wed & String = js.native
    
    /* "weekday" */ val Weekday: typings.officeJsPreview.Office.MailboxEnums.Days.Weekday & String = js.native
    
    /* "weekendDay" */ val WeekendDay: typings.officeJsPreview.Office.MailboxEnums.Days.WeekendDay & String = js.native
  }
  
  /**
    * This bit mask represents a delegate's permissions on a shared folder.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.DelegatePermissions")
  @js.native
  object DelegatePermissions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions & Double] = js.native
    
    /* 8 */ val DeleteAll: typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions.DeleteAll & Double = js.native
    
    /* 4 */ val DeleteOwn: typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions.DeleteOwn & Double = js.native
    
    /* 32 */ val EditAll: typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions.EditAll & Double = js.native
    
    /* 16 */ val EditOwn: typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions.EditOwn & Double = js.native
    
    /* 1 */ val Read: typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions.Read & Double = js.native
    
    /* 2 */ val Write: typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions.Write & Double = js.native
  }
  
  /**
    * Specifies an entity's type.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.EntityType")
  @js.native
  object EntityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.EntityType & String] = js.native
    
    /* "address" */ val Address: typings.officeJsPreview.Office.MailboxEnums.EntityType.Address & String = js.native
    
    /* "contact" */ val Contact: typings.officeJsPreview.Office.MailboxEnums.EntityType.Contact & String = js.native
    
    /* "emailAddress" */ val EmailAddress: typings.officeJsPreview.Office.MailboxEnums.EntityType.EmailAddress & String = js.native
    
    /* "meetingSuggestion" */ val MeetingSuggestion: typings.officeJsPreview.Office.MailboxEnums.EntityType.MeetingSuggestion & String = js.native
    
    /* "phoneNumber" */ val PhoneNumber: typings.officeJsPreview.Office.MailboxEnums.EntityType.PhoneNumber & String = js.native
    
    /* "taskSuggestion" */ val TaskSuggestion: typings.officeJsPreview.Office.MailboxEnums.EntityType.TaskSuggestion & String = js.native
    
    /* "url" */ val Url: typings.officeJsPreview.Office.MailboxEnums.EntityType.Url & String = js.native
  }
  
  /**
    * Specifies the notification message type for an appointment or message.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ItemNotificationMessageType")
  @js.native
  object ItemNotificationMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType & String] = js.native
    
    /* "errorMessage" */ val ErrorMessage: typings.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ErrorMessage & String = js.native
    
    /* "informationalMessage" */ val InformationalMessage: typings.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InformationalMessage & String = js.native
    
    /* "insightMessage" */ val InsightMessage: typings.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InsightMessage & String = js.native
    
    /* "progressIndicator" */ val ProgressIndicator: typings.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ProgressIndicator & String = js.native
  }
  
  /**
    * Specifies an item's type.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ItemType & String] = js.native
    
    /* "appointment" */ val Appointment: typings.officeJsPreview.Office.MailboxEnums.ItemType.Appointment & String = js.native
    
    /* "message" */ val Message: typings.officeJsPreview.Office.MailboxEnums.ItemType.Message & String = js.native
  }
  
  /**
    * Specifies an appointment location's type.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.LocationType")
  @js.native
  object LocationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.LocationType & String] = js.native
    
    /* "custom" */ val Custom: typings.officeJsPreview.Office.MailboxEnums.LocationType.Custom & String = js.native
    
    /* "room" */ val Room: typings.officeJsPreview.Office.MailboxEnums.LocationType.Room & String = js.native
  }
  
  /**
    * Specifies the month.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.Month")
  @js.native
  object Month extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.Month & String] = js.native
    
    /* "apr" */ val Apr: typings.officeJsPreview.Office.MailboxEnums.Month.Apr & String = js.native
    
    /* "aug" */ val Aug: typings.officeJsPreview.Office.MailboxEnums.Month.Aug & String = js.native
    
    /* "dec" */ val Dec: typings.officeJsPreview.Office.MailboxEnums.Month.Dec & String = js.native
    
    /* "feb" */ val Feb: typings.officeJsPreview.Office.MailboxEnums.Month.Feb & String = js.native
    
    /* "jan" */ val Jan: typings.officeJsPreview.Office.MailboxEnums.Month.Jan & String = js.native
    
    /* "jul" */ val Jul: typings.officeJsPreview.Office.MailboxEnums.Month.Jul & String = js.native
    
    /* "jun" */ val Jun: typings.officeJsPreview.Office.MailboxEnums.Month.Jun & String = js.native
    
    /* "mar" */ val Mar: typings.officeJsPreview.Office.MailboxEnums.Month.Mar & String = js.native
    
    /* "may" */ val May: typings.officeJsPreview.Office.MailboxEnums.Month.May & String = js.native
    
    /* "nov" */ val Nov: typings.officeJsPreview.Office.MailboxEnums.Month.Nov & String = js.native
    
    /* "oct" */ val Oct: typings.officeJsPreview.Office.MailboxEnums.Month.Oct & String = js.native
    
    /* "sep" */ val Sep: typings.officeJsPreview.Office.MailboxEnums.Month.Sep & String = js.native
  }
  
  /**
    * Represents the current view of Outlook on the web.
    */
  @JSGlobal("Office.MailboxEnums.OWAView")
  @js.native
  object OWAView extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.OWAView & String] = js.native
    
    /* "OneColumn" */ val OneColumn: typings.officeJsPreview.Office.MailboxEnums.OWAView.OneColumn & String = js.native
    
    /* "ThreeColumns" */ val ThreeColumns: typings.officeJsPreview.Office.MailboxEnums.OWAView.ThreeColumns & String = js.native
    
    /* "TwoColumns" */ val TwoColumns: typings.officeJsPreview.Office.MailboxEnums.OWAView.TwoColumns & String = js.native
  }
  
  /**
    * Specifies the type of recipient for an appointment.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecipientType")
  @js.native
  object RecipientType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.RecipientType & String] = js.native
    
    /* "distributionList" */ val DistributionList: typings.officeJsPreview.Office.MailboxEnums.RecipientType.DistributionList & String = js.native
    
    /* "externalUser" */ val ExternalUser: typings.officeJsPreview.Office.MailboxEnums.RecipientType.ExternalUser & String = js.native
    
    /* "other" */ val Other: typings.officeJsPreview.Office.MailboxEnums.RecipientType.Other & String = js.native
    
    /* "user" */ val User: typings.officeJsPreview.Office.MailboxEnums.RecipientType.User & String = js.native
  }
  
  /**
    * Specifies the time zone applied to the recurrence.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecurrenceTimeZone")
  @js.native
  object RecurrenceTimeZone extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone & String] = js.native
    
    /* "AUS Central Standard Time" */ val AUSCentralStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AUSCentralStandardTime & String = js.native
    
    /* "AUS Eastern Standard Time" */ val AUSEasternStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AUSEasternStandardTime & String = js.native
    
    /* "Afghanistan Standard Time" */ val AfghanistanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AfghanistanStandardTime & String = js.native
    
    /* "Alaskan Standard Time" */ val AlaskanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AlaskanStandardTime & String = js.native
    
    /* "Aleutian Standard Time" */ val AleutianStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AleutianStandardTime & String = js.native
    
    /* "Altai Standard Time" */ val AltaiStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AltaiStandardTime & String = js.native
    
    /* "Arab Standard Time" */ val ArabStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabStandardTime & String = js.native
    
    /* "Arabian Standard Time" */ val ArabianStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabianStandardTime & String = js.native
    
    /* "Arabic Standard Time" */ val ArabicStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabicStandardTime & String = js.native
    
    /* "Argentina Standard Time" */ val ArgentinaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArgentinaStandardTime & String = js.native
    
    /* "Astrakhan Standard Time" */ val AstrakhanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AstrakhanStandardTime & String = js.native
    
    /* "Atlantic Standard Time" */ val AtlanticStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AtlanticStandardTime & String = js.native
    
    /* "Aus Central W. Standard Time" */ val AusCentralW_StandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AusCentralW_StandardTime & String = js.native
    
    /* "Azerbaijan Standard Time" */ val AzerbaijanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AzerbaijanStandardTime & String = js.native
    
    /* "Azores Standard Time" */ val AzoresStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AzoresStandardTime & String = js.native
    
    /* "Bahia Standard Time" */ val BahiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BahiaStandardTime & String = js.native
    
    /* "Bangladesh Standard Time" */ val BangladeshStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BangladeshStandardTime & String = js.native
    
    /* "Belarus Standard Time" */ val BelarusStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BelarusStandardTime & String = js.native
    
    /* "Bougainville Standard Time" */ val BougainvilleStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BougainvilleStandardTime & String = js.native
    
    /* "Canada Central Standard Time" */ val CanadaCentralStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CanadaCentralStandardTime & String = js.native
    
    /* "Cape Verde Standard Time" */ val CapeVerdeStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CapeVerdeStandardTime & String = js.native
    
    /* "Caucasus Standard Time" */ val CaucasusStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CaucasusStandardTime & String = js.native
    
    /* "Cen. Australia Standard Time" */ val CenAustraliaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CenAustraliaStandardTime & String = js.native
    
    /* "Central America Standard Time" */ val CentralAmericaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralAmericaStandardTime & String = js.native
    
    /* "Central Asia Standard Time" */ val CentralAsiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralAsiaStandardTime & String = js.native
    
    /* "Central Brazilian Standard Time" */ val CentralBrazilianStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralBrazilianStandardTime & String = js.native
    
    /* "Central Europe Standard Time" */ val CentralEuropeStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeStandardTime & String = js.native
    
    /* "Central European Standard Time" */ val CentralEuropeanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeanStandardTime & String = js.native
    
    /* "Central Pacific Standard Time" */ val CentralPacificStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralPacificStandardTime & String = js.native
    
    /* "Central Standard Time" */ val CentralStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime & String = js.native
    
    /* "Central Standard Time (Mexico)" */ val CentralStandardTime_Mexico: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime_Mexico & String = js.native
    
    /* "Chatham Islands Standard Time" */ val ChathamIslandsStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ChathamIslandsStandardTime & String = js.native
    
    /* "China Standard Time" */ val ChinaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ChinaStandardTime & String = js.native
    
    /* "Cuba Standard Time" */ val CubaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CubaStandardTime & String = js.native
    
    /* "Dateline Standard Time" */ val DatelineStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.DatelineStandardTime & String = js.native
    
    /* "E. Africa Standard Time" */ val E_AfricaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_AfricaStandardTime & String = js.native
    
    /* "E. Australia Standard Time" */ val E_AustraliaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_AustraliaStandardTime & String = js.native
    
    /* "E. Europe Standard Time" */ val E_EuropeStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_EuropeStandardTime & String = js.native
    
    /* "E. South America Standard Time" */ val E_SouthAmericaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_SouthAmericaStandardTime & String = js.native
    
    /* "Easter Island Standard Time" */ val EasterIslandStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasterIslandStandardTime & String = js.native
    
    /* "Eastern Standard Time" */ val EasternStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime & String = js.native
    
    /* "Eastern Standard Time (Mexico)" */ val EasternStandardTime_Mexico: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime_Mexico & String = js.native
    
    /* "Egypt Standard Time" */ val EgyptStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EgyptStandardTime & String = js.native
    
    /* "Ekaterinburg Standard Time" */ val EkaterinburgStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EkaterinburgStandardTime & String = js.native
    
    /* "FLE Standard Time" */ val FLEStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.FLEStandardTime & String = js.native
    
    /* "Fiji Standard Time" */ val FijiStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.FijiStandardTime & String = js.native
    
    /* "GMT Standard Time" */ val GMTStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GMTStandardTime & String = js.native
    
    /* "GTB Standard Time" */ val GTBStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GTBStandardTime & String = js.native
    
    /* "Georgian Standard Time" */ val GeorgianStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GeorgianStandardTime & String = js.native
    
    /* "Greenland Standard Time" */ val GreenlandStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GreenlandStandardTime & String = js.native
    
    /* "Greenwich Standard Time" */ val GreenwichStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GreenwichStandardTime & String = js.native
    
    /* "Haiti Standard Time" */ val HaitiStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.HaitiStandardTime & String = js.native
    
    /* "Hawaiian Standard Time" */ val HawaiianStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.HawaiianStandardTime & String = js.native
    
    /* "India Standard Time" */ val IndiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IndiaStandardTime & String = js.native
    
    /* "Iran Standard Time" */ val IranStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IranStandardTime & String = js.native
    
    /* "Israel Standard Time" */ val IsraelStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IsraelStandardTime & String = js.native
    
    /* "Jordan Standard Time" */ val JordanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.JordanStandardTime & String = js.native
    
    /* "Kaliningrad Standard Time" */ val KaliningradStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KaliningradStandardTime & String = js.native
    
    /* "Kamchatka Standard Time" */ val KamchatkaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KamchatkaStandardTime & String = js.native
    
    /* "Korea Standard Time" */ val KoreaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KoreaStandardTime & String = js.native
    
    /* "Libya Standard Time" */ val LibyaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LibyaStandardTime & String = js.native
    
    /* "Line Islands Standard Time" */ val LineIslandsStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LineIslandsStandardTime & String = js.native
    
    /* "Lord Howe Standard Time" */ val LordHoweStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LordHoweStandardTime & String = js.native
    
    /* "Magadan Standard Time" */ val MagadanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MagadanStandardTime & String = js.native
    
    /* "Magallanes Standard Time" */ val MagallanesStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MagallanesStandardTime & String = js.native
    
    /* "Marquesas Standard Time" */ val MarquesasStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MarquesasStandardTime & String = js.native
    
    /* "Mauritius Standard Time" */ val MauritiusStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MauritiusStandardTime & String = js.native
    
    /* "Mid-Atlantic Standard Time" */ val MidAtlanticStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MidAtlanticStandardTime & String = js.native
    
    /* "Middle East Standard Time" */ val MiddleEastStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MiddleEastStandardTime & String = js.native
    
    /* "Montevideo Standard Time" */ val MontevideoStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MontevideoStandardTime & String = js.native
    
    /* "Morocco Standard Time" */ val MoroccoStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MoroccoStandardTime & String = js.native
    
    /* "Mountain Standard Time" */ val MountainStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime & String = js.native
    
    /* "Mountain Standard Time (Mexico)" */ val MountainStandardTime_Mexico: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime_Mexico & String = js.native
    
    /* "Myanmar Standard Time" */ val MyanmarStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MyanmarStandardTime & String = js.native
    
    /* "N. Central Asia Standard Time" */ val N_CentralAsiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.N_CentralAsiaStandardTime & String = js.native
    
    /* "Namibia Standard Time" */ val NamibiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NamibiaStandardTime & String = js.native
    
    /* "Nepal Standard Time" */ val NepalStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NepalStandardTime & String = js.native
    
    /* "New Zealand Standard Time" */ val NewZealandStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NewZealandStandardTime & String = js.native
    
    /* "Newfoundland Standard Time" */ val NewfoundlandStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NewfoundlandStandardTime & String = js.native
    
    /* "Norfolk Standard Time" */ val NorfolkStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorfolkStandardTime & String = js.native
    
    /* "North Asia East Standard Time" */ val NorthAsiaEastStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaEastStandardTime & String = js.native
    
    /* "North Asia Standard Time" */ val NorthAsiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaStandardTime & String = js.native
    
    /* "North Korea Standard Time" */ val NorthKoreaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthKoreaStandardTime & String = js.native
    
    /* "Omsk Standard Time" */ val OmskStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.OmskStandardTime & String = js.native
    
    /* "Pacific SA Standard Time" */ val PacificSAStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificSAStandardTime & String = js.native
    
    /* "Pacific Standard Time" */ val PacificStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTime & String = js.native
    
    /* "Pacific Standard Time (Mexico)" */ val PacificStandardTimeMexico: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTimeMexico & String = js.native
    
    /* "Pakistan Standard Time" */ val PakistanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PakistanStandardTime & String = js.native
    
    /* "Paraguay Standard Time" */ val ParaguayStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ParaguayStandardTime & String = js.native
    
    /* "Romance Standard Time" */ val RomanceStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RomanceStandardTime & String = js.native
    
    /* "Russia Time Zone 10" */ val RussiaTimeZone10: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone10 & String = js.native
    
    /* "Russia Time Zone 11" */ val RussiaTimeZone11: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone11 & String = js.native
    
    /* "Russia Time Zone 3" */ val RussiaTimeZone3: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone3 & String = js.native
    
    /* "Russian Standard Time" */ val RussianStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussianStandardTime & String = js.native
    
    /* "SA Eastern Standard Time" */ val SAEasternStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAEasternStandardTime & String = js.native
    
    /* "SA Pacific Standard Time" */ val SAPacificStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAPacificStandardTime & String = js.native
    
    /* "SA Western Standard Time" */ val SAWesternStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAWesternStandardTime & String = js.native
    
    /* "SE Asia Standard Time" */ val SEAsiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SEAsiaStandardTime & String = js.native
    
    /* "Saint Pierre Standard Time" */ val SaintPierreStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SaintPierreStandardTime & String = js.native
    
    /* "Sakhalin Standard Time" */ val SakhalinStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SakhalinStandardTime & String = js.native
    
    /* "Samoa Standard Time" */ val SamoaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SamoaStandardTime & String = js.native
    
    /* "Saratov Standard Time" */ val SaratovStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SaratovStandardTime & String = js.native
    
    /* "Singapore Standard Time" */ val SingaporeStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SingaporeStandardTime & String = js.native
    
    /* "South Africa Standard Time" */ val SouthAfricaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SouthAfricaStandardTime & String = js.native
    
    /* "Sri Lanka Standard Time" */ val SriLankaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SriLankaStandardTime & String = js.native
    
    /* "Sudan Standard Time" */ val SudanStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SudanStandardTime & String = js.native
    
    /* "Syria Standard Time" */ val SyriaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SyriaStandardTime & String = js.native
    
    /* "Taipei Standard Time" */ val TaipeiStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TaipeiStandardTime & String = js.native
    
    /* "Tasmania Standard Time" */ val TasmaniaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TasmaniaStandardTime & String = js.native
    
    /* "Tocantins Standard Time" */ val TocantinsStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TocantinsStandardTime & String = js.native
    
    /* "Tokyo Standard Time" */ val TokyoStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TokyoStandardTime & String = js.native
    
    /* "Tomsk Standard Time" */ val TomskStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TomskStandardTime & String = js.native
    
    /* "Tonga Standard Time" */ val TongaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TongaStandardTime & String = js.native
    
    /* "Transbaikal Standard Time" */ val TransbaikalStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TransbaikalStandardTime & String = js.native
    
    /* "Turkey Standard Time" */ val TurkeyStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TurkeyStandardTime & String = js.native
    
    /* "Turks And Caicos Standard Time" */ val TurksAndCaicosStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TurksAndCaicosStandardTime & String = js.native
    
    /* "US Eastern Standard Time" */ val USEasternStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.USEasternStandardTime & String = js.native
    
    /* "US Mountain Standard Time" */ val USMountainStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.USMountainStandardTime & String = js.native
    
    /* "UTC" */ val UTC: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTC & String = js.native
    
    /* "UTC-02" */ val UTCMINUS02: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS02 & String = js.native
    
    /* "UTC-08" */ val UTCMINUS08: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS08 & String = js.native
    
    /* "UTC-09" */ val UTCMINUS09: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS09 & String = js.native
    
    /* "UTC-11" */ val UTCMINUS11: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS11 & String = js.native
    
    /* "UTC+12" */ val UTCPLUS12: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS12 & String = js.native
    
    /* "UTC+13" */ val UTCPLUS13: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS13 & String = js.native
    
    /* "Ulaanbaatar Standard Time" */ val UlaanbaatarStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UlaanbaatarStandardTime & String = js.native
    
    /* "Venezuela Standard Time" */ val VenezuelaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.VenezuelaStandardTime & String = js.native
    
    /* "Vladivostok Standard Time" */ val VladivostokStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.VladivostokStandardTime & String = js.native
    
    /* "W. Australia Standard Time" */ val W_AustraliaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_AustraliaStandardTime & String = js.native
    
    /* "W. Central Africa Standard Time" */ val W_CentralAfricaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_CentralAfricaStandardTime & String = js.native
    
    /* "W. Europe Standard Time" */ val W_EuropeStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_EuropeStandardTime & String = js.native
    
    /* "W. Mongolia Standard Time" */ val W_MongoliaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_MongoliaStandardTime & String = js.native
    
    /* "West Asia Standard Time" */ val WestAsiaStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestAsiaStandardTime & String = js.native
    
    /* "West Bank Standard Time" */ val WestBankStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestBankStandardTime & String = js.native
    
    /* "West Pacific Standard Time" */ val WestPacificStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestPacificStandardTime & String = js.native
    
    /* "Yakutsk Standard Time" */ val YakutskStandardTime: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.YakutskStandardTime & String = js.native
  }
  
  /**
    * Specifies the type of recurrence.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecurrenceType")
  @js.native
  object RecurrenceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.RecurrenceType & String] = js.native
    
    /* "daily" */ val Daily: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Daily & String = js.native
    
    /* "monthly" */ val Monthly: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Monthly & String = js.native
    
    /* "weekday" */ val Weekday: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekday & String = js.native
    
    /* "weekly" */ val Weekly: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekly & String = js.native
    
    /* "yearly" */ val Yearly: typings.officeJsPreview.Office.MailboxEnums.RecurrenceType.Yearly & String = js.native
  }
  
  /**
    * Specifies the type of response to a meeting invitation.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ResponseType & String] = js.native
    
    /* "accepted" */ val Accepted: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Accepted & String = js.native
    
    /* "declined" */ val Declined: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Declined & String = js.native
    
    /* "none" */ val None: typings.officeJsPreview.Office.MailboxEnums.ResponseType.None & String = js.native
    
    /* "organizer" */ val Organizer: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Organizer & String = js.native
    
    /* "tentative" */ val Tentative: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Tentative & String = js.native
  }
  
  /**
    * Specifies the version of the REST API that corresponds to a REST-formatted item ID.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RestVersion")
  @js.native
  object RestVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.RestVersion & String] = js.native
    
    /* "beta" */ val Beta: typings.officeJsPreview.Office.MailboxEnums.RestVersion.Beta & String = js.native
    
    /* "v1.0" */ val v1_0: typings.officeJsPreview.Office.MailboxEnums.RestVersion.v1_0 & String = js.native
    
    /* "v2.0" */ val v2_0: typings.officeJsPreview.Office.MailboxEnums.RestVersion.v2_0 & String = js.native
  }
  
  /**
    * Specifies the source of the selected data in an item (see `Office.mailbox.item.getSelectedDataAsync` for details).
    *
    * [Api set: Mailbox 1.2]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    */
  @JSGlobal("Office.MailboxEnums.SourceProperty")
  @js.native
  object SourceProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.SourceProperty & String] = js.native
    
    /* "body" */ val Body: typings.officeJsPreview.Office.MailboxEnums.SourceProperty.Body & String = js.native
    
    /* "subject" */ val Subject: typings.officeJsPreview.Office.MailboxEnums.SourceProperty.Subject & String = js.native
  }
  
  /**
    * Specifies the week of the month.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.WeekNumber")
  @js.native
  object WeekNumber extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.WeekNumber & String] = js.native
    
    /* "first" */ val First: typings.officeJsPreview.Office.MailboxEnums.WeekNumber.First & String = js.native
    
    /* "fourth" */ val Fourth: typings.officeJsPreview.Office.MailboxEnums.WeekNumber.Fourth & String = js.native
    
    /* "last" */ val Last: typings.officeJsPreview.Office.MailboxEnums.WeekNumber.Last & String = js.native
    
    /* "second" */ val Second: typings.officeJsPreview.Office.MailboxEnums.WeekNumber.Second & String = js.native
    
    /* "third" */ val Third: typings.officeJsPreview.Office.MailboxEnums.WeekNumber.Third & String = js.native
  }
}
