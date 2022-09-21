package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseType extends StObject
/**
  * Specifies the type of response to a meeting invitation.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ResponseType")
@js.native
object ResponseType extends StObject {
  
  /**
    * The meeting request was accepted by the attendee.
    */
  @js.native
  sealed trait Accepted
    extends StObject
       with ResponseType
  
  /**
    * The meeting request was declined by the attendee.
    */
  @js.native
  sealed trait Declined
    extends StObject
       with ResponseType
  
  /**
    * There has been no response from the attendee.
    */
  @js.native
  sealed trait None
    extends StObject
       with ResponseType
  
  /**
    * The attendee is the meeting organizer.
    */
  @js.native
  sealed trait Organizer
    extends StObject
       with ResponseType
  
  /**
    * The meeting request was tentatively accepted by the attendee.
    */
  @js.native
  sealed trait Tentative
    extends StObject
       with ResponseType
}
