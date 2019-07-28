package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsResponseItem extends js.Object {
  var access_tokens_url: String
  var account: AppsListInstallationsResponseItemAccount
  var app_id: Double
  var events: js.Array[String]
  var html_url: String
  var id: Double
  var permissions: AppsListInstallationsResponseItemPermissions
  var repositories_url: String
  var repository_selection: String
  var single_file_name: String
  var target_id: Double
  var target_type: String
}

object AppsListInstallationsResponseItem {
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: AppsListInstallationsResponseItemAccount,
    app_id: Double,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: AppsListInstallationsResponseItemPermissions,
    repositories_url: String,
    repository_selection: String,
    single_file_name: String,
    target_id: Double,
    target_type: String
  ): AppsListInstallationsResponseItem = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url, account = account, app_id = app_id, events = events, html_url = html_url, id = id, permissions = permissions, repositories_url = repositories_url, repository_selection = repository_selection, single_file_name = single_file_name, target_id = target_id, target_type = target_type)
  
    __obj.asInstanceOf[AppsListInstallationsResponseItem]
  }
}

