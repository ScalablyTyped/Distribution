package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetOrgInstallationResponse extends js.Object {
  var access_tokens_url: java.lang.String
  var account: AppsGetOrgInstallationResponseAccount
  var app_id: scala.Double
  var created_at: java.lang.String
  var events: js.Array[java.lang.String]
  var html_url: java.lang.String
  var id: scala.Double
  var permissions: AppsGetOrgInstallationResponsePermissions
  var repositories_url: java.lang.String
  var repository_selection: java.lang.String
  var single_file_name: scala.Null
  var target_id: scala.Double
  var target_type: java.lang.String
  var updated_at: java.lang.String
}

object AppsGetOrgInstallationResponse {
  @scala.inline
  def apply(
    access_tokens_url: java.lang.String,
    account: AppsGetOrgInstallationResponseAccount,
    app_id: scala.Double,
    created_at: java.lang.String,
    events: js.Array[java.lang.String],
    html_url: java.lang.String,
    id: scala.Double,
    permissions: AppsGetOrgInstallationResponsePermissions,
    repositories_url: java.lang.String,
    repository_selection: java.lang.String,
    single_file_name: scala.Null,
    target_id: scala.Double,
    target_type: java.lang.String,
    updated_at: java.lang.String
  ): AppsGetOrgInstallationResponse = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url, account = account, app_id = app_id, created_at = created_at, events = events, html_url = html_url, id = id, permissions = permissions, repositories_url = repositories_url, repository_selection = repository_selection, single_file_name = single_file_name, target_id = target_id, target_type = target_type, updated_at = updated_at)
  
    __obj.asInstanceOf[AppsGetOrgInstallationResponse]
  }
}

