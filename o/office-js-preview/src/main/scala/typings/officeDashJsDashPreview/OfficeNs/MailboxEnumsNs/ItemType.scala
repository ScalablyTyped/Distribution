package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

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
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemType")
@js.native
object ItemType extends js.Object {
  /**
    * An appointment item.
    */
  @js.native
  sealed trait Appointment extends ItemType
  
  /**
    * An email, meeting request, meeting response, or meeting cancellation.
    */
  @js.native
  sealed trait Message extends ItemType
  
  /* "appointment" */ val Appointment: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.ItemType.Appointment with String = js.native
  /* "message" */ val Message: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.ItemType.Message with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ItemType with String] = js.native
}

