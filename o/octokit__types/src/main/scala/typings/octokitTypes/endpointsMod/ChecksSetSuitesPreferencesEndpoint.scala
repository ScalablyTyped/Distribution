package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   auto_trigger_checks :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksSetSuitesPreferencesParamsAutoTriggerChecks> | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksSetSuitesPreferencesEndpoint extends js.Object {
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.native
  var mediaType: `4` = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ChecksSetSuitesPreferencesEndpoint {
  @scala.inline
  def apply(mediaType: `4`, owner: String, repo: String): ChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesEndpoint]
  }
  @scala.inline
  implicit class ChecksSetSuitesPreferencesEndpointOps[Self <: ChecksSetSuitesPreferencesEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `4`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto_trigger_checksVarargs(value: ChecksSetSuitesPreferencesParamsAutoTriggerChecks*): Self = this.set("auto_trigger_checks", js.Array(value :_*))
    @scala.inline
    def setAuto_trigger_checks(value: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]): Self = this.set("auto_trigger_checks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_trigger_checks: Self = this.set("auto_trigger_checks", js.undefined)
  }
  
}

