package typings.officeJs.Office.MailboxEnums

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
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
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
  
}

