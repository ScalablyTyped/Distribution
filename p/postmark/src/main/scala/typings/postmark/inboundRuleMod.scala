package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboundRuleMod {
  
  @JSImport("postmark/dist/client/models/triggers/InboundRule", "CreateInboundRuleRequest")
  @js.native
  open class CreateInboundRuleRequest protected () extends StObject {
    def this(Rule: String) = this()
    
    var Rule: String = js.native
  }
  
  trait InboundRule extends StObject {
    
    var ID: Double
    
    var Rule: String
  }
  object InboundRule {
    
    inline def apply(ID: Double, Rule: String): InboundRule = {
      val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundRule]
    }
    
    extension [Self <: InboundRule](x: Self) {
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setRule(value: String): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    }
  }
  
  trait InboundRules extends StObject {
    
    var InboundRules: js.Array[InboundRule]
    
    var TotalCount: Double
  }
  object InboundRules {
    
    inline def apply(InboundRules: js.Array[InboundRule], TotalCount: Double): InboundRules = {
      val __obj = js.Dynamic.literal(InboundRules = InboundRules.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundRules]
    }
    
    extension [Self <: InboundRules](x: Self) {
      
      inline def setInboundRules(value: js.Array[InboundRule]): Self = StObject.set(x, "InboundRules", value.asInstanceOf[js.Any])
      
      inline def setInboundRulesVarargs(value: InboundRule*): Self = StObject.set(x, "InboundRules", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
