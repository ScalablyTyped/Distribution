package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.organization_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repository_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bypassmode extends StObject {
  
  /** @description The actors that can bypass the rules in this ruleset */
  var bypass_actors: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-bypass-actor'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * @description The permission level required to bypass this ruleset. "repository" allows those with bypass permission at the repository level to bypass. "organization" allows those with bypass permission at the organization level to bypass. "none" prevents anyone from bypassing.
    * @enum {string}
    */
  var bypass_mode: js.UndefOr[none_ | repository_ | organization_] = js.undefined
  
  var conditions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-conditions'] */ js.Any
  ] = js.undefined
  
  var enforcement: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-enforcement'] */ js.Any
  
  /** @description The name of the ruleset. */
  var name: String
  
  /** @description An array of rules within the ruleset. */
  var rules: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * @description The target of the ruleset.
    * @enum {string}
    */
  var target: js.UndefOr[branch | tag] = js.undefined
}
object Bypassmode {
  
  inline def apply(
    enforcement: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-enforcement'] */ js.Any,
    name: String
  ): Bypassmode = {
    val __obj = js.Dynamic.literal(enforcement = enforcement.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bypassmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bypassmode] (val x: Self) extends AnyVal {
    
    inline def setBypass_actors(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-bypass-actor'] */ js.Any
        ]
    ): Self = StObject.set(x, "bypass_actors", value.asInstanceOf[js.Any])
    
    inline def setBypass_actorsUndefined: Self = StObject.set(x, "bypass_actors", js.undefined)
    
    inline def setBypass_actorsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-bypass-actor'] */ js.Any)*
    ): Self = StObject.set(x, "bypass_actors", js.Array(value*))
    
    inline def setBypass_mode(value: none_ | repository_ | organization_): Self = StObject.set(x, "bypass_mode", value.asInstanceOf[js.Any])
    
    inline def setBypass_modeUndefined: Self = StObject.set(x, "bypass_mode", js.undefined)
    
    inline def setConditions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-conditions'] */ js.Any
    ): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setEnforcement(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-enforcement'] */ js.Any
    ): Self = StObject.set(x, "enforcement", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRules(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule'] */ js.Any
        ]
    ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule'] */ js.Any)*
    ): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTarget(value: branch | tag): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
