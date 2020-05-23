package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Issues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenResponseData extends js.Object {
  var expires_at: String
  var permissions: Issues
  var repositories: js.Array[Allowmergecommit]
  var token: String
}

object AppsCreateInstallationTokenResponseData {
  @scala.inline
  def apply(expires_at: String, permissions: Issues, repositories: js.Array[Allowmergecommit], token: String): AppsCreateInstallationTokenResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationTokenResponseData]
  }
}

