package typings.officeDashJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Office.MailboxEnums.AttachmentType.Cloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

/**
  * Specifies an attachment's type.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  /**
    * The attachment is stored in a cloud location, such as OneDrive. The id property of the attachment contains a URL to the file.
    */
  @js.native
  sealed trait Cloud extends AttachmentType
  
  /**
    * The attachment is a file
    */
  @js.native
  sealed trait File extends AttachmentType
  
  /**
    * The attachment is an Exchange item
    */
  @js.native
  sealed trait Item extends AttachmentType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentType with String] = js.native
  /* "cloud" */ @js.native
  object Cloud extends TopLevel[Cloud with String]
  
  /* "file" */ @js.native
  object File
    extends TopLevel[typings.officeDashJs.Office.MailboxEnums.AttachmentType.File with String]
  
  /* "item" */ @js.native
  object Item
    extends TopLevel[typings.officeDashJs.Office.MailboxEnums.AttachmentType.Item with String]
  
}

