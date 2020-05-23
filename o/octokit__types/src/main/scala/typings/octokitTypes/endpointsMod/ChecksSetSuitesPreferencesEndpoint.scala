package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   auto_trigger_checks ? :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksSetSuitesPreferencesParamsAutoTriggerChecks>} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksSetSuitesPreferencesEndpoint extends js.Object {
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.undefined
  var mediaType: `12`
  var owner: String
  var repo: String
}

object ChecksSetSuitesPreferencesEndpoint {
  @scala.inline
  def apply(
    mediaType: `12`,
    owner: String,
    repo: String,
    auto_trigger_checks: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks] = null
  ): ChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (auto_trigger_checks != null) __obj.updateDynamic("auto_trigger_checks")(auto_trigger_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesEndpoint]
  }
}

