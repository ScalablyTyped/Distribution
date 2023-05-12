package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRulesetid extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /** @description The ID of the ruleset. */
  var ruleset_id: Double
}
object OrgRulesetid {
  
  inline def apply(org_ : String, ruleset_id: Double): OrgRulesetid = {
    val __obj = js.Dynamic.literal(ruleset_id = ruleset_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgRulesetid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRuleset_id(value: Double): Self = StObject.set(x, "ruleset_id", value.asInstanceOf[js.Any])
  }
}
