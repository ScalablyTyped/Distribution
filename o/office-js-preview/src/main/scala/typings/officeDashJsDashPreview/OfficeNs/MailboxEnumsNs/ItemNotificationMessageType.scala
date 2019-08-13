package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemNotificationMessageType extends js.Object

/**
  * Specifies the notification message type for an appointment or message.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemNotificationMessageType")
@js.native
object ItemNotificationMessageType extends js.Object {
  /**
    * The notificationMessage is an error message.
    */
  @js.native
  sealed trait ErrorMessage extends ItemNotificationMessageType
  
  /**
    * The notificationMessage is an informational message.
    */
  @js.native
  sealed trait InformationalMessage extends ItemNotificationMessageType
  
  /**
    * The notificationMessage is a progress indicator.
    */
  @js.native
  sealed trait ProgressIndicator extends ItemNotificationMessageType
  
  /* "errorMessage" */ val ErrorMessage: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType.ErrorMessage with String = js.native
  /* "informationalMessage" */ val InformationalMessage: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType.InformationalMessage with String = js.native
  /* "progressIndicator" */ val ProgressIndicator: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType.ProgressIndicator with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ItemNotificationMessageType with String] = js.native
}

