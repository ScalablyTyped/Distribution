package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerRepoRulesetid extends StObject {
  
  var owner: String
  
  var repo: String
  
  /** @description The ID of the ruleset. */
  var ruleset_id: Double
}
object OwnerRepoRulesetid {
  
  inline def apply(owner: String, repo: String, ruleset_id: Double): OwnerRepoRulesetid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], ruleset_id = ruleset_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRepoRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerRepoRulesetid] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRuleset_id(value: Double): Self = StObject.set(x, "ruleset_id", value.asInstanceOf[js.Any])
  }
}
