package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends StObject
/**
  * Specifies an attachment's type.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends StObject {
  
  /**
    * The attachment is stored in a cloud location, such as OneDrive.
    *
    * **Important**: In Read mode, the `id` property of the attachment's {@link Office.AttachmentDetails | details} object
    * contains a URL to the file.
    * From requirement set 1.8, the `url` property included in the attachment's
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.attachmentdetailscompose?view=outlook-js-1.8 | details} object
    * contains a URL to the file in Compose mode.
    */
  @js.native
  sealed trait Cloud
    extends StObject
       with AttachmentType
  
  /**
    * The attachment is a file.
    */
  @js.native
  sealed trait File
    extends StObject
       with AttachmentType
  
  /**
    * The attachment is an Exchange item.
    */
  @js.native
  sealed trait Item
    extends StObject
       with AttachmentType
}
