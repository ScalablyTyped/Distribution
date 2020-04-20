package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreatePublicKeyResponse extends js.Object {
  var key: String
  var key_id: String
}

object UsersCreatePublicKeyResponse {
  @scala.inline
  def apply(key: String, key_id: String): UsersCreatePublicKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCreatePublicKeyResponse]
  }
}

