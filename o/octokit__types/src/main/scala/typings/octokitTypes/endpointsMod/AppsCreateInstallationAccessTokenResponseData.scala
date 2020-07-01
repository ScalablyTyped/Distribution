package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Issues
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationAccessTokenResponseData extends js.Object {
  var expires_at: String
  var permissions: Issues
  var repositories: js.Array[Allowmergecommit]
  var repository_selection: all | selected
  var token: String
}

object AppsCreateInstallationAccessTokenResponseData {
  @scala.inline
  def apply(
    expires_at: String,
    permissions: Issues,
    repositories: js.Array[Allowmergecommit],
    repository_selection: all | selected,
    token: String
  ): AppsCreateInstallationAccessTokenResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationAccessTokenResponseData]
  }
}

