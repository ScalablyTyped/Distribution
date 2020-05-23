package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersDeleteGpgKeyEndpoint extends js.Object {
  var gpg_key_id: Double
}

object UsersDeleteGpgKeyEndpoint {
  @scala.inline
  def apply(gpg_key_id: Double): UsersDeleteGpgKeyEndpoint = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeleteGpgKeyEndpoint]
  }
}

