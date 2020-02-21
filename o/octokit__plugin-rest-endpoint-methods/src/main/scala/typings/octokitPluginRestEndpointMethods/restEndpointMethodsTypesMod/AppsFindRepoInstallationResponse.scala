package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsFindRepoInstallationResponse extends js.Object {
  var access_tokens_url: String
  var account: AppsFindRepoInstallationResponseAccount
  var app_id: Double
  var created_at: String
  var events: js.Array[String]
  var html_url: String
  var id: Double
  var permissions: AppsFindRepoInstallationResponsePermissions
  var repositories_url: String
  var repository_selection: String
  var single_file_name: Null
  var target_id: Double
  var target_type: String
  var updated_at: String
}

object AppsFindRepoInstallationResponse {
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: AppsFindRepoInstallationResponseAccount,
    app_id: Double,
    created_at: String,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: AppsFindRepoInstallationResponsePermissions,
    repositories_url: String,
    repository_selection: String,
    single_file_name: Null,
    target_id: Double,
    target_type: String,
    updated_at: String
  ): AppsFindRepoInstallationResponse = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], single_file_name = single_file_name.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsFindRepoInstallationResponse]
  }
}

