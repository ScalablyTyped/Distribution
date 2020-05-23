package typings.officeJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

/**
  * Specifies an attachment's type.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  /**
    * The attachment is stored in a cloud location, such as OneDrive.
    *
    * **Important**: In Read mode, the `id` property of the attachment's {@link Office.AttachmentDetails | details} object
    * contains a URL to the file.
    * From requirement set 1.8, the `url` property included in the attachment's
    * {@link https://docs.microsoft.com/javascript/api/outlook/office.attachmentdetailscompose?view=outlook-js-1.8 | details} object
    * contains a URL to the file in Compose mode.
    */
  @js.native
  sealed trait Cloud extends AttachmentType
  
  /**
    * The attachment is a file.
    */
  @js.native
  sealed trait File extends AttachmentType
  
  /**
    * The attachment is an Exchange item.
    */
  @js.native
  sealed trait Item extends AttachmentType
  
}

