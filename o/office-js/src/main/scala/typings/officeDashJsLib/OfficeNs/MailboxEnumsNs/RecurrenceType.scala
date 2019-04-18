package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

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
  sealed trait Daily
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
    * Monthly.
    */
  @js.native
  sealed trait Monthly
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
    * Weekday.
    */
  @js.native
  sealed trait Weekday
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
    * Weekly.
    */
  @js.native
  sealed trait Weekly
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
    * Yearly.
    */
  @js.native
  sealed trait Yearly
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /* "daily" */ val Daily: Daily with java.lang.String = js.native
  /* "monthly" */ val Monthly: Monthly with java.lang.String = js.native
  /* "weekday" */ val Weekday: Weekday with java.lang.String = js.native
  /* "weekly" */ val Weekly: Weekly with java.lang.String = js.native
  /* "yearly" */ val Yearly: Yearly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType with java.lang.String] = js.native
}

