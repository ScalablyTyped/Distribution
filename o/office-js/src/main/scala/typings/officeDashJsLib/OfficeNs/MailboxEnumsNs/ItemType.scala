package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

/**
  * Specifies an item's type.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table><tr><td>
  * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
  * </td><td>Compose or read</td></tr></table>
  */
@JSGlobal("Office.MailboxEnums.ItemType")
@js.native
object ItemType extends js.Object {
  /**
    * An appointment item.
    */
  @js.native
  sealed trait Appointment
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemType
  
  /**
    * An email, meeting request, meeting response, or meeting cancellation.
    */
  @js.native
  sealed trait Message
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemType
  
  /* "appointment" */ val Appointment: Appointment with java.lang.String = js.native
  /* "message" */ val Message: Message with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemType with java.lang.String] = js.native
}

