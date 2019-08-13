package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

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
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.Days")
@js.native
object Days extends js.Object {
  /**
    * Day of week.
    */
  @js.native
  sealed trait Day extends Days
  
  /**
    * Friday
    */
  @js.native
  sealed trait Fri extends Days
  
  /**
    * Monday
    */
  @js.native
  sealed trait Mon extends Days
  
  /**
    * Saturday
    */
  @js.native
  sealed trait Sat extends Days
  
  /**
    * Sunday
    */
  @js.native
  sealed trait Sun extends Days
  
  /**
    * Thursday
    */
  @js.native
  sealed trait Thu extends Days
  
  /**
    * Tuesday
    */
  @js.native
  sealed trait Tue extends Days
  
  /**
    * Wednesday
    */
  @js.native
  sealed trait Wed extends Days
  
  /**
    * Week day (excludes weekend days): 'Mon', 'Tue', 'Wed', 'Thu', and 'Fri'.
    */
  @js.native
  sealed trait Weekday extends Days
  
  /**
    * Weekend day: 'Sat' and 'Sun'.
    */
  @js.native
  sealed trait WeekendDay extends Days
  
  /* "day" */ val Day: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Day with String = js.native
  /* "fri" */ val Fri: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Fri with String = js.native
  /* "mon" */ val Mon: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Mon with String = js.native
  /* "sat" */ val Sat: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Sat with String = js.native
  /* "sun" */ val Sun: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Sun with String = js.native
  /* "thu" */ val Thu: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Thu with String = js.native
  /* "tue" */ val Tue: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Tue with String = js.native
  /* "wed" */ val Wed: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Wed with String = js.native
  /* "weekday" */ val Weekday: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.Weekday with String = js.native
  /* "weekendDay" */ val WeekendDay: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.Days.WeekendDay with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Days with String] = js.native
}

