package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents `RecipientsChangedEventArgs.changedRecipientFields` object.
  *
  * [Api set: Mailbox 1.7]
  */
trait RecipientsChangedFields extends js.Object {
  /**
    * Gets if recipients in the **bcc** field were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var bcc: Boolean
  /**
    * Gets if recipients in the **cc** field were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var cc: Boolean
  /**
    * Gets if optional attendees were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var optionalAttendees: Boolean
  /**
    * Gets if required attendees were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var requiredAttendees: Boolean
  /**
    * Gets if resources were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var resources: Boolean
  /**
    * Gets if recipients in the **to** field were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var to: Boolean
}

object RecipientsChangedFields {
  @scala.inline
  def apply(
    bcc: Boolean,
    cc: Boolean,
    optionalAttendees: Boolean,
    requiredAttendees: Boolean,
    resources: Boolean,
    to: Boolean
  ): RecipientsChangedFields = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], optionalAttendees = optionalAttendees.asInstanceOf[js.Any], requiredAttendees = requiredAttendees.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecipientsChangedFields]
  }
}

