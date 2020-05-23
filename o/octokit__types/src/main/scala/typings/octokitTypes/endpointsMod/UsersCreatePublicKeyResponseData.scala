package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreatePublicKeyResponseData extends js.Object {
  var key: String
  var key_id: String
}

object UsersCreatePublicKeyResponseData {
  @scala.inline
  def apply(key: String, key_id: String): UsersCreatePublicKeyResponseData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCreatePublicKeyResponseData]
  }
}

