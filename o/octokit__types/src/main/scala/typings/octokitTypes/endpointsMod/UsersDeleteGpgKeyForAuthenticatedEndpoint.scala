package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersDeleteGpgKeyForAuthenticatedEndpoint extends js.Object {
  var gpg_key_id: Double
}

object UsersDeleteGpgKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(gpg_key_id: Double): UsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
}

