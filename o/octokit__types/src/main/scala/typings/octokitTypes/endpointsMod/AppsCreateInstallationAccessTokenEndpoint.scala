package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsCreateInstallationAccessTokenEndpoint extends js.Object {
  
  var installation_id: Double = js.native
  
  /**
    * The permissions granted to the access token. The permissions object includes the permission names and their access type. For a complete list of permissions and allowable values, see "[GitHub App permissions](https://developer.github.com/apps/building-github-apps/creating-github-apps-using-url-parameters/#github-app-permissions)."
    */
  var permissions: js.UndefOr[AppsCreateInstallationAccessTokenParamsPermissions] = js.native
  
  /**
    * The `id`s of the repositories that the installation token can access. Providing repository `id`s restricts the access of an installation token to specific repositories. You can use the "[List repositories accessible to the app installation](https://developer.github.com/v3/apps/installations/#list-repositories-accessible-to-the-app-installation)" endpoint to get the `id` of all repositories that an installation can access. For example, you can select specific repositories when creating an installation token to restrict the number of repositories that can be cloned using the token.
    */
  var repository_ids: js.UndefOr[js.Array[Double]] = js.native
}
object AppsCreateInstallationAccessTokenEndpoint {
  
  @scala.inline
  def apply(installation_id: Double): AppsCreateInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationAccessTokenEndpoint]
  }
  
  @scala.inline
  implicit class AppsCreateInstallationAccessTokenEndpointOps[Self <: AppsCreateInstallationAccessTokenEndpoint] (val x: Self) extends AnyVal {
    
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
    def setInstallation_id(value: Double): Self = this.set("installation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: AppsCreateInstallationAccessTokenParamsPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setRepository_idsVarargs(value: Double*): Self = this.set("repository_ids", js.Array(value :_*))
    
    @scala.inline
    def setRepository_ids(value: js.Array[Double]): Self = this.set("repository_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository_ids: Self = this.set("repository_ids", js.undefined)
  }
}
