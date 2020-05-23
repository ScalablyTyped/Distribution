package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSetSelectedReposForOrgSecretEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var secret_name: String
  /**
    * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can add and remove individual repositories using the [Set selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#set-selected-repositories-for-an-organization-secret) and [Remove selected repository from an organization secret](https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret) endpoints.
    */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object ActionsSetSelectedReposForOrgSecretEndpoint {
  @scala.inline
  def apply(org_ : String, secret_name: String, selected_repository_ids: js.Array[Double] = null): ActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (selected_repository_ids != null) __obj.updateDynamic("selected_repository_ids")(selected_repository_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSetSelectedReposForOrgSecretEndpoint]
  }
}

