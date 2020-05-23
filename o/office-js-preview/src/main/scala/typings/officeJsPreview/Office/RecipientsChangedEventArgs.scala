package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkRecipientsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientsChangedEventArgs extends js.Object {
  /**
    * Gets an object that indicates change state of recipients fields.
    *
    * [Api set: Mailbox 1.7]
    */
  var changedRecipientFields: RecipientsChangedFields
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    *
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkRecipientsChanged
}

object RecipientsChangedEventArgs {
  @scala.inline
  def apply(changedRecipientFields: RecipientsChangedFields, `type`: olkRecipientsChanged): RecipientsChangedEventArgs = {
    val __obj = js.Dynamic.literal(changedRecipientFields = changedRecipientFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEventArgs]
  }
}

