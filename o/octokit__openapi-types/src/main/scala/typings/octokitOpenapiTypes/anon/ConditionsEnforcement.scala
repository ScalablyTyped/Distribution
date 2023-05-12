package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.evaluate
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionsEnforcement extends StObject {
  
  /** @description The actors that can bypass the rules in this ruleset */
  var bypass_actors: js.UndefOr[js.Array[Actorid]] = js.undefined
  
  var conditions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-conditions'] */ js.Any
  ] = js.undefined
  
  var enforcement: js.UndefOr[disabled | active | evaluate] = js.undefined
  
  /** @description The name of the ruleset. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description An array of rules within the ruleset. */
  var rules: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-creation'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * @description The target of the ruleset.
    * @enum {string}
    */
  var target: js.UndefOr[branch | tag] = js.undefined
}
object ConditionsEnforcement {
  
  inline def apply(): ConditionsEnforcement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionsEnforcement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionsEnforcement] (val x: Self) extends AnyVal {
    
    inline def setBypass_actors(value: js.Array[Actorid]): Self = StObject.set(x, "bypass_actors", value.asInstanceOf[js.Any])
    
    inline def setBypass_actorsUndefined: Self = StObject.set(x, "bypass_actors", js.undefined)
    
    inline def setBypass_actorsVarargs(value: Actorid*): Self = StObject.set(x, "bypass_actors", js.Array(value*))
    
    inline def setConditions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-ruleset-conditions'] */ js.Any
    ): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setEnforcement(value: disabled | active | evaluate): Self = StObject.set(x, "enforcement", value.asInstanceOf[js.Any])
    
    inline def setEnforcementUndefined: Self = StObject.set(x, "enforcement", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-creation'] */ js.Any
        ]
    ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-creation'] */ js.Any)*
    ): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTarget(value: branch | tag): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
