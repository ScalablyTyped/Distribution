package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var payload: String
  var reason: String
  var signature: String
  var verified: Boolean
}

object Payload {
  @scala.inline
  def apply(payload: String, reason: String, signature: String, verified: Boolean): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

