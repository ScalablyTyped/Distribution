package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetPublicSshKeyForAuthenticatedEndpoint extends js.Object {
  var key_id: Double
}

object UsersGetPublicSshKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(key_id: Double): UsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
}

