package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentContentFormat extends StObject
/**
  * Specifies the formatting that applies to an attachment's content.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentContentFormat")
@js.native
object AttachmentContentFormat extends StObject {
  
  /**
    * The content of the attachment is returned as a base64-encoded string.
    */
  @js.native
  sealed trait Base64
    extends StObject
       with AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing an .eml formatted file.
    */
  @js.native
  sealed trait Eml
    extends StObject
       with AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing an .icalendar formatted file.
    */
  @js.native
  sealed trait ICalendar
    extends StObject
       with AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing a URL.
    */
  @js.native
  sealed trait Url
    extends StObject
       with AttachmentContentFormat
}
