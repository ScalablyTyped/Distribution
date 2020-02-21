package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponseInstallationsItem extends js.Object {
  var access_tokens_url: String
  var account: AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount
  var app_id: Double
  var events: js.Array[String]
  var html_url: String
  var id: Double
  var permissions: AppsListInstallationsForAuthenticatedUserResponseInstallationsItemPermissions
  var repositories_url: String
  var single_file_name: String
  var target_id: Double
  var target_type: String
}

object AppsListInstallationsForAuthenticatedUserResponseInstallationsItem {
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount,
    app_id: Double,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: AppsListInstallationsForAuthenticatedUserResponseInstallationsItemPermissions,
    repositories_url: String,
    single_file_name: String,
    target_id: Double,
    target_type: String
  ): AppsListInstallationsForAuthenticatedUserResponseInstallationsItem = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], single_file_name = single_file_name.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem]
  }
}

