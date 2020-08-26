package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Checks
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsGetUserInstallationResponseData extends js.Object {
  var access_tokens_url: String = js.native
  var account: Avatarurl = js.native
  var app_id: Double = js.native
  var created_at: String = js.native
  var events: js.Array[String] = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var permissions: Checks = js.native
  var repositories_url: String = js.native
  var repository_selection: all | selected = js.native
  var single_file_name: String = js.native
  var target_id: Double = js.native
  var target_type: String = js.native
  var updated_at: String = js.native
}

object AppsGetUserInstallationResponseData {
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: Avatarurl,
    app_id: Double,
    created_at: String,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: Checks,
    repositories_url: String,
    repository_selection: all | selected,
    single_file_name: String,
    target_id: Double,
    target_type: String,
    updated_at: String
  ): AppsGetUserInstallationResponseData = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], single_file_name = single_file_name.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetUserInstallationResponseData]
  }
  @scala.inline
  implicit class AppsGetUserInstallationResponseDataOps[Self <: AppsGetUserInstallationResponseData] (val x: Self) extends AnyVal {
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
    def setAccess_tokens_url(value: String): Self = this.set("access_tokens_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount(value: Avatarurl): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_id(value: Double): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: Checks): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositories_url(value: String): Self = this.set("repositories_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository_selection(value: all | selected): Self = this.set("repository_selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingle_file_name(value: String): Self = this.set("single_file_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget_id(value: Double): Self = this.set("target_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget_type(value: String): Self = this.set("target_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
  
}

