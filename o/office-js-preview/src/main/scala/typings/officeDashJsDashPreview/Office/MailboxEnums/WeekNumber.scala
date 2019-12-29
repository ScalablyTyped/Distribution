package typings.officeDashJsDashPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekNumber extends js.Object

/**
  * Specifies the week of the month.
  * 
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.WeekNumber")
@js.native
object WeekNumber extends js.Object {
  /**
    * First week of the month.
    */
  @js.native
  sealed trait First extends WeekNumber
  
  /**
    * Fourth week of the month.
    */
  @js.native
  sealed trait Fourth extends WeekNumber
  
  /**
    * Last week of the month.
    */
  @js.native
  sealed trait Last extends WeekNumber
  
  /**
    * Second week of the month.
    */
  @js.native
  sealed trait Second extends WeekNumber
  
  /**
    * Third week of the month.
    */
  @js.native
  sealed trait Third extends WeekNumber
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WeekNumber with String] = js.native
  /* "first" */ @js.native
  object First extends TopLevel[First with String]
  
  /* "fourth" */ @js.native
  object Fourth extends TopLevel[Fourth with String]
  
  /* "last" */ @js.native
  object Last extends TopLevel[Last with String]
  
  /* "second" */ @js.native
  object Second extends TopLevel[Second with String]
  
  /* "third" */ @js.native
  object Third extends TopLevel[Third with String]
  
}

