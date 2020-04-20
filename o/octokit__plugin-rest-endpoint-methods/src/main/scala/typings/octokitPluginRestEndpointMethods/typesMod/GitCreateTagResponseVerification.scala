package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagResponseVerification extends js.Object {
  var payload: Null
  var reason: String
  var signature: Null
  var verified: Boolean
}

object GitCreateTagResponseVerification {
  @scala.inline
  def apply(payload: Null, reason: String, signature: Null, verified: Boolean): GitCreateTagResponseVerification = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagResponseVerification]
  }
}

