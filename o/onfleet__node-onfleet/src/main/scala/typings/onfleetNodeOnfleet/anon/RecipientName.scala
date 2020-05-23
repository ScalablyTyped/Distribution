package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientName extends js.Object {
  var recipientName: String | Null
  var recipientNotes: String | Null
  var recipientSkipSMSNotifications: String | Null
  var useMerchantForProxy: String | Null
}

object RecipientName {
  @scala.inline
  def apply(
    recipientName: String = null,
    recipientNotes: String = null,
    recipientSkipSMSNotifications: String = null,
    useMerchantForProxy: String = null
  ): RecipientName = {
    val __obj = js.Dynamic.literal(recipientName = recipientName.asInstanceOf[js.Any], recipientNotes = recipientNotes.asInstanceOf[js.Any], recipientSkipSMSNotifications = recipientSkipSMSNotifications.asInstanceOf[js.Any], useMerchantForProxy = useMerchantForProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientName]
  }
}

