package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Days extends js.Object

/**
  * Specifies the day of week or type of day.
  *
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  * <table><tr><td>
  * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
  * </td><td>Compose or read</td></tr></table>
  */
@JSGlobal("Office.MailboxEnums.Days")
@js.native
object Days extends js.Object {
  /**
    * Day of week.
    */
  @js.native
  sealed trait Day
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Friday
    */
  @js.native
  sealed trait Fri
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Monday
    */
  @js.native
  sealed trait Mon
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Saturday
    */
  @js.native
  sealed trait Sat
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Sunday
    */
  @js.native
  sealed trait Sun
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Thursday
    */
  @js.native
  sealed trait Thu
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Tuesday
    */
  @js.native
  sealed trait Tue
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Wednesday
    */
  @js.native
  sealed trait Wed
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Week day (excludes weekend days): 'Mon', 'Tue', 'Wed', 'Thu', and 'Fri'.
    */
  @js.native
  sealed trait Weekday
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /**
    * Weekend day: 'Sat' and 'Sun'.
    */
  @js.native
  sealed trait WeekendDay
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  
  /* "day" */ val Day: Day with java.lang.String = js.native
  /* "fri" */ val Fri: Fri with java.lang.String = js.native
  /* "mon" */ val Mon: Mon with java.lang.String = js.native
  /* "sat" */ val Sat: Sat with java.lang.String = js.native
  /* "sun" */ val Sun: Sun with java.lang.String = js.native
  /* "thu" */ val Thu: Thu with java.lang.String = js.native
  /* "tue" */ val Tue: Tue with java.lang.String = js.native
  /* "wed" */ val Wed: Wed with java.lang.String = js.native
  /* "weekday" */ val Weekday: Weekday with java.lang.String = js.native
  /* "weekendDay" */ val WeekendDay: WeekendDay with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.Days with java.lang.String] = js.native
}

