package typings.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecipientName extends js.Object {
  var recipientName: String | Null
  var recipientNotes: String | Null
  var recipientSkipSMSNotifications: String | Null
  var useMerchantForProxy: String | Null
}

object Anon_RecipientName {
  @scala.inline
  def apply(
    recipientName: String = null,
    recipientNotes: String = null,
    recipientSkipSMSNotifications: String = null,
    useMerchantForProxy: String = null
  ): Anon_RecipientName = {
    val __obj = js.Dynamic.literal()
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (recipientNotes != null) __obj.updateDynamic("recipientNotes")(recipientNotes.asInstanceOf[js.Any])
    if (recipientSkipSMSNotifications != null) __obj.updateDynamic("recipientSkipSMSNotifications")(recipientSkipSMSNotifications.asInstanceOf[js.Any])
    if (useMerchantForProxy != null) __obj.updateDynamic("useMerchantForProxy")(useMerchantForProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RecipientName]
  }
}

