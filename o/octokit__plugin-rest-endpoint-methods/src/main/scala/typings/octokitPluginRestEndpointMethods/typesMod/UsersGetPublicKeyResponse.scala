package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetPublicKeyResponse extends js.Object {
  var key: String
  var key_id: String
}

object UsersGetPublicKeyResponse {
  @scala.inline
  def apply(key: String, key_id: String): UsersGetPublicKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetPublicKeyResponse]
  }
}

