package typings
package officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs

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
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
         */
@JSGlobal("Office.MailboxEnums.RecurrenceType")
@js.native
object RecurrenceType extends js.Object {
  /**
               * Daily.
               */
  @js.native
  sealed trait Daily
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
               * Monthly.
               */
  @js.native
  sealed trait Monthly
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
               * Weekday.
               */
  @js.native
  sealed trait Weekday
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
               * Weekly.
               */
  @js.native
  sealed trait Weekly
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /**
               * Yearly.
               */
  @js.native
  sealed trait Yearly
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecurrenceType
  
  /* "daily" */ val Daily: Daily with java.lang.String = js.native
  /* "monthly" */ val Monthly: Monthly with java.lang.String = js.native
  /* "weekday" */ val Weekday: Weekday with java.lang.String = js.native
  /* "weekly" */ val Weekly: Weekly with java.lang.String = js.native
  /* "yearly" */ val Yearly: Yearly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecurrenceType with java.lang.String
  ] = js.native
}

