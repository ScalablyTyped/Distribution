package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rulesetid extends StObject {
  
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  
  /** @description The ID of the ruleset. */
  var ruleset_id: Double
}
object Rulesetid {
  
  inline def apply(
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any,
    ruleset_id: Double
  ): Rulesetid = {
    val __obj = js.Dynamic.literal(ruleset_id = ruleset_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rulesetid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRuleset_id(value: Double): Self = StObject.set(x, "ruleset_id", value.asInstanceOf[js.Any])
  }
}
