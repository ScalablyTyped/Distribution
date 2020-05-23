package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetOrgPublicKeyResponseData extends js.Object {
  var key: String
  var key_id: String
}

object ActionsGetOrgPublicKeyResponseData {
  @scala.inline
  def apply(key: String, key_id: String): ActionsGetOrgPublicKeyResponseData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgPublicKeyResponseData]
  }
}

