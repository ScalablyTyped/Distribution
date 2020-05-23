package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersDeletePublicKeyEndpoint extends js.Object {
  var key_id: Double
}

object UsersDeletePublicKeyEndpoint {
  @scala.inline
  def apply(key_id: Double): UsersDeletePublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeletePublicKeyEndpoint]
  }
}

