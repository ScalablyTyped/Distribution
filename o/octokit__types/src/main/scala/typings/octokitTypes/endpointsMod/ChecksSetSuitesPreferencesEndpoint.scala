package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   auto_trigger_checks :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksSetSuitesPreferencesParamsAutoTriggerChecks> | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksSetSuitesPreferencesEndpoint extends StObject {
  
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.native
  
  var mediaType: `2` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ChecksSetSuitesPreferencesEndpoint {
  
  @scala.inline
  def apply(mediaType: `2`, owner: String, repo: String): ChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesEndpoint]
  }
  
  @scala.inline
  implicit class ChecksSetSuitesPreferencesEndpointMutableBuilder[Self <: ChecksSetSuitesPreferencesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_trigger_checks(value: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]): Self = StObject.set(x, "auto_trigger_checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_trigger_checksUndefined: Self = StObject.set(x, "auto_trigger_checks", js.undefined)
    
    @scala.inline
    def setAuto_trigger_checksVarargs(value: ChecksSetSuitesPreferencesParamsAutoTriggerChecks*): Self = StObject.set(x, "auto_trigger_checks", js.Array(value :_*))
    
    @scala.inline
    def setMediaType(value: `2`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
