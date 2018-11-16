package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

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
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
         */
@JSGlobal("Office.MailboxEnums.ItemNotificationMessageType")
@js.native
object ItemNotificationMessageType extends js.Object {
  /**
               * The notificationMessage is an error message.
               */
  @js.native
  sealed trait ErrorMessage
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType
  
  /**
               * The notificationMessage is an informational message.
               */
  @js.native
  sealed trait InformationalMessage
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType
  
  /**
               * The notificationMessage is a progress indicator.
               */
  @js.native
  sealed trait ProgressIndicator
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType
  
  /* "errorMessage" */ val ErrorMessage: ErrorMessage with java.lang.String = js.native
  /* "informationalMessage" */ val InformationalMessage: InformationalMessage with java.lang.String = js.native
  /* "progressIndicator" */ val ProgressIndicator: ProgressIndicator with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsLib.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType with java.lang.String
  ] = js.native
}

