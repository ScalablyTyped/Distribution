package typings.officeDashJsDashPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Days with String] = js.native
  /* "day" */ @js.native
  object Day extends TopLevel[Day with String]
  
  /* "fri" */ @js.native
  object Fri extends TopLevel[Fri with String]
  
  /* "mon" */ @js.native
  object Mon extends TopLevel[Mon with String]
  
  /* "sat" */ @js.native
  object Sat extends TopLevel[Sat with String]
  
  /* "sun" */ @js.native
  object Sun extends TopLevel[Sun with String]
  
  /* "thu" */ @js.native
  object Thu extends TopLevel[Thu with String]
  
  /* "tue" */ @js.native
  object Tue extends TopLevel[Tue with String]
  
  /* "wed" */ @js.native
  object Wed extends TopLevel[Wed with String]
  
  /* "weekday" */ @js.native
  object Weekday extends TopLevel[Weekday with String]
  
  /* "weekendDay" */ @js.native
  object WeekendDay extends TopLevel[WeekendDay with String]
  
}

