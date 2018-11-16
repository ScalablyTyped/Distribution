package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseType extends js.Object

/**  
         * Specifies the type of response to a meeting invitation.
         *
         * [Api set: Mailbox 1.0]
         *
         * @remarks
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
         */
@JSGlobal("Office.MailboxEnums.ResponseType")
@js.native
object ResponseType extends js.Object {
  /**
               * The meeting request was accepted by the attendee.
               */
  @js.native
  sealed trait Accepted
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType
  
  /**
               * The meeting request was declined by the attendee.
               */
  @js.native
  sealed trait Declined
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType
  
  /**
               * There has been no response from the attendee.
               */
  @js.native
  sealed trait None
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType
  
  /**
               * The attendee is the meeting organizer.
               */
  @js.native
  sealed trait Organizer
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType
  
  /**
               * The meeting request was tentatively accepted by the attendee.
               */
  @js.native
  sealed trait Tentative
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType
  
  /* "accepted" */ val Accepted: Accepted with java.lang.String = js.native
  /* "declined" */ val Declined: Declined with java.lang.String = js.native
  /* "none" */ val None: None with java.lang.String = js.native
  /* "organizer" */ val Organizer: Organizer with java.lang.String = js.native
  /* "tentative" */ val Tentative: Tentative with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType with java.lang.String] = js.native
}

