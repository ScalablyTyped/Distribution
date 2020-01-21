package typings.postmark.webhookMod

import typings.postmark.AnonBounce
import typings.postmark.messageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  var HttpAuth: js.UndefOr[typings.postmark.webhookMod.HttpAuth] = js.undefined
  var HttpHeaders: js.UndefOr[js.Array[Header]] = js.undefined
  var ID: Double
  var MessageStream: String
  var Triggers: AnonBounce
  var Url: String
}

object Webhook {
  @scala.inline
  def apply(
    ID: Double,
    MessageStream: String,
    Triggers: AnonBounce,
    Url: String,
    HttpAuth: HttpAuth = null,
    HttpHeaders: js.Array[Header] = null
  ): Webhook = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    if (HttpAuth != null) __obj.updateDynamic("HttpAuth")(HttpAuth.asInstanceOf[js.Any])
    if (HttpHeaders != null) __obj.updateDynamic("HttpHeaders")(HttpHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

