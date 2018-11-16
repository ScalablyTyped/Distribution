package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

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
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
         */
@JSGlobal("Office.MailboxEnums.WeekNumber")
@js.native
object WeekNumber extends js.Object {
  /**
               * First week of the month.
               */
  @js.native
  sealed trait First
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber
  
  /**
               * Fourth week of the month.
               */
  @js.native
  sealed trait Fourth
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber
  
  /**
               * Last week of the month.
               */
  @js.native
  sealed trait Last
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber
  
  /**
               * Second week of the month.
               */
  @js.native
  sealed trait Second
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber
  
  /**
               * Third week of the month.
               */
  @js.native
  sealed trait Third
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber
  
  /* "first" */ val First: First with java.lang.String = js.native
  /* "fourth" */ val Fourth: Fourth with java.lang.String = js.native
  /* "last" */ val Last: Last with java.lang.String = js.native
  /* "second" */ val Second: Second with java.lang.String = js.native
  /* "third" */ val Third: Third with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber with java.lang.String] = js.native
}

