package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsSetSelectedReposForOrgSecretEndpoint extends js.Object {
  
  @JSName("org")
  var org_ : String = js.native
  
  var secret_name: String = js.native
  
  /**
    * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can add and remove individual repositories using the [Set selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#set-selected-repositories-for-an-organization-secret) and [Remove selected repository from an organization secret](https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret) endpoints.
    */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.native
}
object ActionsSetSelectedReposForOrgSecretEndpoint {
  
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSetSelectedReposForOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsSetSelectedReposForOrgSecretEndpointOps[Self <: ActionsSetSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = this.set("secret_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repository_idsVarargs(value: Double*): Self = this.set("selected_repository_ids", js.Array(value :_*))
    
    @scala.inline
    def setSelected_repository_ids(value: js.Array[Double]): Self = this.set("selected_repository_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected_repository_ids: Self = this.set("selected_repository_ids", js.undefined)
  }
}
