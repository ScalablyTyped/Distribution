package typings.officeDashJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Office.MailboxEnums.RecurrenceType.Daily
import typings.officeDashJs.Office.MailboxEnums.RecurrenceType.Monthly
import typings.officeDashJs.Office.MailboxEnums.RecurrenceType.Weekday
import typings.officeDashJs.Office.MailboxEnums.RecurrenceType.Weekly
import typings.officeDashJs.Office.MailboxEnums.RecurrenceType.Yearly
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RecurrenceType with String] = js.native
  /* "daily" */ @js.native
  object Daily extends TopLevel[Daily with String]
  
  /* "monthly" */ @js.native
  object Monthly extends TopLevel[Monthly with String]
  
  /* "weekday" */ @js.native
  object Weekday extends TopLevel[Weekday with String]
  
  /* "weekly" */ @js.native
  object Weekly extends TopLevel[Weekly with String]
  
  /* "yearly" */ @js.native
  object Yearly extends TopLevel[Yearly with String]
  
}

