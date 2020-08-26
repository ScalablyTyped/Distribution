package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Contents
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCreateInstallationAccessTokenResponseData extends js.Object {
  var expires_at: String = js.native
  var permissions: Contents = js.native
  var repositories: js.Array[Allowmergecommit] = js.native
  var repository_selection: all | selected = js.native
  var token: String = js.native
}

object AppsCreateInstallationAccessTokenResponseData {
  @scala.inline
  def apply(
    expires_at: String,
    permissions: Contents,
    repositories: js.Array[Allowmergecommit],
    repository_selection: all | selected,
    token: String
  ): AppsCreateInstallationAccessTokenResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationAccessTokenResponseData]
  }
  @scala.inline
  implicit class AppsCreateInstallationAccessTokenResponseDataOps[Self <: AppsCreateInstallationAccessTokenResponseData] (val x: Self) extends AnyVal {
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
    def setExpires_at(value: String): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: Contents): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoriesVarargs(value: Allowmergecommit*): Self = this.set("repositories", js.Array(value :_*))
    @scala.inline
    def setRepositories(value: js.Array[Allowmergecommit]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository_selection(value: all | selected): Self = this.set("repository_selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

