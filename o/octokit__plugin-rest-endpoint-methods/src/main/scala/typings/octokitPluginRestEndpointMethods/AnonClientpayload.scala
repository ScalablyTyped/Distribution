package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientpayload extends js.Object {
  var client_payload: AnonType
  var event_type: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonClientpayload {
  @scala.inline
  def apply(client_payload: AnonType, event_type: AnonType, owner: AnonRequired, repo: AnonRequired): AnonClientpayload = {
    val __obj = js.Dynamic.literal(client_payload = client_payload.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientpayload]
  }
}

