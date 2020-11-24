package typings.officeJsPreview.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Days extends js.Object
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
}
