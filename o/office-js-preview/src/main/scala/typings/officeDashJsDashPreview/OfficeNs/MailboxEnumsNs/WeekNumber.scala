package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

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
  
  /* "first" */ val First: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.WeekNumber.First with String = js.native
  /* "fourth" */ val Fourth: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.WeekNumber.Fourth with String = js.native
  /* "last" */ val Last: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.WeekNumber.Last with String = js.native
  /* "second" */ val Second: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.WeekNumber.Second with String = js.native
  /* "third" */ val Third: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.WeekNumber.Third with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WeekNumber with String] = js.native
}

