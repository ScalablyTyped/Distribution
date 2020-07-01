package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimUpdateAttributeForUserEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var scim_user_id: Double
}

object ScimUpdateAttributeForUserEndpoint {
  @scala.inline
  def apply(org_ : String, scim_user_id: Double): ScimUpdateAttributeForUserEndpoint = {
    val __obj = js.Dynamic.literal(scim_user_id = scim_user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimUpdateAttributeForUserEndpoint]
  }
}

