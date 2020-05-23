package typings.officeJsPreview.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

/**
  * Specifies an item's type.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemType")
@js.native
object ItemType extends js.Object {
  /**
    * An appointment item.
    */
  @js.native
  sealed trait Appointment extends ItemType
  
  /**
    * An email, meeting request, meeting response, or meeting cancellation.
    */
  @js.native
  sealed trait Message extends ItemType
  
}

