package typings.paypalRestSdk.mod.notification.webhookEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookVerifyResponse extends js.Object {
  var verification_status: String
}

object WebhookVerifyResponse {
  @scala.inline
  def apply(verification_status: String): WebhookVerifyResponse = {
    val __obj = js.Dynamic.literal(verification_status = verification_status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookVerifyResponse]
  }
}

