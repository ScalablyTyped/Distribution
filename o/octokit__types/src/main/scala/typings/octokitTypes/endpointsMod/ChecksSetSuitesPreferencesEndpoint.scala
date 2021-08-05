package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.antiope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksSetSuitesPreferencesEndpoint
  extends StObject
     with RequiredPreview[antiope] {
  
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.undefined
  
  var owner: String
  
  var repo: String
}
object ChecksSetSuitesPreferencesEndpoint {
  
  inline def apply(mediaType: `0`[antiope], owner: String, repo: String): ChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesEndpoint]
  }
  
  extension [Self <: ChecksSetSuitesPreferencesEndpoint](x: Self) {
    
    inline def setAuto_trigger_checks(value: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]): Self = StObject.set(x, "auto_trigger_checks", value.asInstanceOf[js.Any])
    
    inline def setAuto_trigger_checksUndefined: Self = StObject.set(x, "auto_trigger_checks", js.undefined)
    
    inline def setAuto_trigger_checksVarargs(value: ChecksSetSuitesPreferencesParamsAutoTriggerChecks*): Self = StObject.set(x, "auto_trigger_checks", js.Array(value :_*))
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
