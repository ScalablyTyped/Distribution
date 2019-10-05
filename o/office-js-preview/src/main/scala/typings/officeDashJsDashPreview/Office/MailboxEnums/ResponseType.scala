package typings.officeDashJsDashPreview.Office.MailboxEnums

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
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ResponseType")
@js.native
object ResponseType extends js.Object {
  /**
    * The meeting request was accepted by the attendee.
    */
  @js.native
  sealed trait Accepted extends ResponseType
  
  /**
    * The meeting request was declined by the attendee.
    */
  @js.native
  sealed trait Declined extends ResponseType
  
  /**
    * There has been no response from the attendee.
    */
  @js.native
  sealed trait None extends ResponseType
  
  /**
    * The attendee is the meeting organizer.
    */
  @js.native
  sealed trait Organizer extends ResponseType
  
  /**
    * The meeting request was tentatively accepted by the attendee.
    */
  @js.native
  sealed trait Tentative extends ResponseType
  
  /* "accepted" */ val Accepted: typings.officeDashJsDashPreview.Office.MailboxEnums.ResponseType.Accepted with String = js.native
  /* "declined" */ val Declined: typings.officeDashJsDashPreview.Office.MailboxEnums.ResponseType.Declined with String = js.native
  /* "none" */ val None: typings.officeDashJsDashPreview.Office.MailboxEnums.ResponseType.None with String = js.native
  /* "organizer" */ val Organizer: typings.officeDashJsDashPreview.Office.MailboxEnums.ResponseType.Organizer with String = js.native
  /* "tentative" */ val Tentative: typings.officeDashJsDashPreview.Office.MailboxEnums.ResponseType.Tentative with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResponseType with String] = js.native
}

