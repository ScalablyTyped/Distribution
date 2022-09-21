package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Days extends StObject
/**
  * Specifies the day of week or type of day.
  *
  * @remarks
  * [Api set: Mailbox 1.7]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.Days")
@js.native
object Days extends StObject {
  
  /**
    * Day of week.
    */
  @js.native
  sealed trait Day
    extends StObject
       with Days
  
  /**
    * Friday
    */
  @js.native
  sealed trait Fri
    extends StObject
       with Days
  
  /**
    * Monday
    */
  @js.native
  sealed trait Mon
    extends StObject
       with Days
  
  /**
    * Saturday
    */
  @js.native
  sealed trait Sat
    extends StObject
       with Days
  
  /**
    * Sunday
    */
  @js.native
  sealed trait Sun
    extends StObject
       with Days
  
  /**
    * Thursday
    */
  @js.native
  sealed trait Thu
    extends StObject
       with Days
  
  /**
    * Tuesday
    */
  @js.native
  sealed trait Tue
    extends StObject
       with Days
  
  /**
    * Wednesday
    */
  @js.native
  sealed trait Wed
    extends StObject
       with Days
  
  /**
    * Week day (excludes weekend days): 'Mon', 'Tue', 'Wed', 'Thu', and 'Fri'.
    */
  @js.native
  sealed trait Weekday
    extends StObject
       with Days
  
  /**
    * Weekend day: 'Sat' and 'Sun'.
    */
  @js.native
  sealed trait WeekendDay
    extends StObject
       with Days
}
