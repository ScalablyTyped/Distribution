package typings.postmark.distClientModelsMessagesInboundMessageMod

import typings.postmark.distClientModelsMessagesOutboundMessageMod.Recipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundRecipient extends Recipient {
  var MailboxHash: String
}

object InboundRecipient {
  @scala.inline
  def apply(Email: String, MailboxHash: String, Name: String): InboundRecipient = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InboundRecipient]
  }
}

