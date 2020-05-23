package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsAddSelectedRepoToOrgSecretEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var repository_id: Double
  var secret_name: String
}

object ActionsAddSelectedRepoToOrgSecretEndpoint {
  @scala.inline
  def apply(org_ : String, repository_id: Double, secret_name: String): ActionsAddSelectedRepoToOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsAddSelectedRepoToOrgSecretEndpoint]
  }
}

