package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsResponseItem extends js.Object {
  var access_tokens_url: java.lang.String
  var account: AppsListInstallationsResponseItemAccount
  var app_id: scala.Double
  var events: js.Array[java.lang.String]
  var html_url: java.lang.String
  var id: scala.Double
  var permissions: AppsListInstallationsResponseItemPermissions
  var repositories_url: java.lang.String
  var repository_selection: java.lang.String
  var single_file_name: java.lang.String
  var target_id: scala.Double
  var target_type: java.lang.String
}

object AppsListInstallationsResponseItem {
  @scala.inline
  def apply(
    access_tokens_url: java.lang.String,
    account: AppsListInstallationsResponseItemAccount,
    app_id: scala.Double,
    events: js.Array[java.lang.String],
    html_url: java.lang.String,
    id: scala.Double,
    permissions: AppsListInstallationsResponseItemPermissions,
    repositories_url: java.lang.String,
    repository_selection: java.lang.String,
    single_file_name: java.lang.String,
    target_id: scala.Double,
    target_type: java.lang.String
  ): AppsListInstallationsResponseItem = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url, account = account, app_id = app_id, events = events, html_url = html_url, id = id, permissions = permissions, repositories_url = repositories_url, repository_selection = repository_selection, single_file_name = single_file_name, target_id = target_id, target_type = target_type)
  
    __obj.asInstanceOf[AppsListInstallationsResponseItem]
  }
}

