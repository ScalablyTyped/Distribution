package typings.octokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientId extends js.Object {
  var clientId: String
  var clientSecret: String
}

object AnonClientId {
  @scala.inline
  def apply(clientId: String, clientSecret: String): AnonClientId = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientId]
  }
}

