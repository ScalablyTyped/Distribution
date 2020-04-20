package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetSecretResponse extends js.Object {
  var created_at: String
  var name: String
  var updated_at: String
}

object ActionsGetSecretResponse {
  @scala.inline
  def apply(created_at: String, name: String, updated_at: String): ActionsGetSecretResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetSecretResponse]
  }
}

