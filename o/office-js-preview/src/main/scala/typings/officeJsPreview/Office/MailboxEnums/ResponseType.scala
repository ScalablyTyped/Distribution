package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseType extends js.Object

/**  
  * Specifies the type of response to a meeting invitation.
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResponseType with String] = js.native
  /* "accepted" */ @js.native
  object Accepted extends TopLevel[Accepted with String]
  
  /* "declined" */ @js.native
  object Declined extends TopLevel[Declined with String]
  
  /* "none" */ @js.native
  object None extends TopLevel[None with String]
  
  /* "organizer" */ @js.native
  object Organizer extends TopLevel[Organizer with String]
  
  /* "tentative" */ @js.native
  object Tentative extends TopLevel[Tentative with String]
  
}

