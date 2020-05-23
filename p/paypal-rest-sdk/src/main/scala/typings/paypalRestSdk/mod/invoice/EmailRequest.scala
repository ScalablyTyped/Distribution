package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailRequest extends js.Object {
  var cc_emails: js.UndefOr[js.Array[String]] = js.undefined
  var note: js.UndefOr[String] = js.undefined
  var send_to_merchant: js.UndefOr[Boolean] = js.undefined
  var send_to_payer: js.UndefOr[Boolean] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object EmailRequest {
  @scala.inline
  def apply(
    cc_emails: js.Array[String] = null,
    note: String = null,
    send_to_merchant: js.UndefOr[Boolean] = js.undefined,
    send_to_payer: js.UndefOr[Boolean] = js.undefined,
    subject: String = null
  ): EmailRequest = {
    val __obj = js.Dynamic.literal()
    if (cc_emails != null) __obj.updateDynamic("cc_emails")(cc_emails.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (!js.isUndefined(send_to_merchant)) __obj.updateDynamic("send_to_merchant")(send_to_merchant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(send_to_payer)) __obj.updateDynamic("send_to_payer")(send_to_payer.get.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRequest]
  }
}

