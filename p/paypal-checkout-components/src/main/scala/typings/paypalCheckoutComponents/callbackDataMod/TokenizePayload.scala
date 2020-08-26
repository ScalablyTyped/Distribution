package typings.paypalCheckoutComponents.callbackDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizePayload extends js.Object {
  /**
    * Additional PayPal account details.
    */
  var details: TokenizePayloadDetails = js.native
  /**
    * The payment method nonce.
    */
  var nonce: String = js.native
  /**
    * The payment method type, always `PayPalAccount`.
    */
  var `type`: String = js.native
}

object TokenizePayload {
  @scala.inline
  def apply(details: TokenizePayloadDetails, nonce: String, `type`: String): TokenizePayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizePayload]
  }
  @scala.inline
  implicit class TokenizePayloadOps[Self <: TokenizePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: TokenizePayloadDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

