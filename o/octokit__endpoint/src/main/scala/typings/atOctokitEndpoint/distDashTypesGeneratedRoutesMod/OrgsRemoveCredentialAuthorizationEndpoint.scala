package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveCredentialAuthorizationEndpoint extends js.Object {
  var credential_id: Double
  var org: String
}

object OrgsRemoveCredentialAuthorizationEndpoint {
  @scala.inline
  def apply(credential_id: Double, org: String): OrgsRemoveCredentialAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(credential_id = credential_id, org = org)
  
    __obj.asInstanceOf[OrgsRemoveCredentialAuthorizationEndpoint]
  }
}

