package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecurrenceType extends js.Object

/**
  * Specifies the type of recurrence.
  * 
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RecurrenceType")
@js.native
object RecurrenceType extends js.Object {
  /**
    * Daily.
    */
  @js.native
  sealed trait Daily extends RecurrenceType
  
  /**
    * Monthly.
    */
  @js.native
  sealed trait Monthly extends RecurrenceType
  
  /**
    * Weekday.
    */
  @js.native
  sealed trait Weekday extends RecurrenceType
  
  /**
    * Weekly.
    */
  @js.native
  sealed trait Weekly extends RecurrenceType
  
  /**
    * Yearly.
    */
  @js.native
  sealed trait Yearly extends RecurrenceType
  
  /* "daily" */ val Daily: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.RecurrenceType.Daily with String = js.native
  /* "monthly" */ val Monthly: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.RecurrenceType.Monthly with String = js.native
  /* "weekday" */ val Weekday: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.RecurrenceType.Weekday with String = js.native
  /* "weekly" */ val Weekly: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.RecurrenceType.Weekly with String = js.native
  /* "yearly" */ val Yearly: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.RecurrenceType.Yearly with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RecurrenceType with String] = js.native
}

