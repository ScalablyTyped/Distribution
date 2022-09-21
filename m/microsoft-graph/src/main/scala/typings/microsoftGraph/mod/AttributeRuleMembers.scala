package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeRuleMembers
  extends StObject
     with SubjectSet {
  
  // A description of the membership rule.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see
    * Membership Rules syntax.
    */
  var membershipRule: js.UndefOr[NullableOption[String]] = js.undefined
}
object AttributeRuleMembers {
  
  inline def apply(): AttributeRuleMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeRuleMembers]
  }
  
  extension [Self <: AttributeRuleMembers](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMembershipRule(value: NullableOption[String]): Self = StObject.set(x, "membershipRule", value.asInstanceOf[js.Any])
    
    inline def setMembershipRuleNull: Self = StObject.set(x, "membershipRule", null)
    
    inline def setMembershipRuleUndefined: Self = StObject.set(x, "membershipRule", js.undefined)
  }
}
