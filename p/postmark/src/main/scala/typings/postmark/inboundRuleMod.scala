package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboundRuleMod {
  
  @JSImport("postmark/dist/client/models/triggers/InboundRule", "CreateInboundRuleRequest")
  @js.native
  class CreateInboundRuleRequest protected () extends StObject {
    def this(Rule: String) = this()
    
    var Rule: String = js.native
  }
  
  @js.native
  trait InboundRule extends StObject {
    
    var ID: Double = js.native
    
    var Rule: String = js.native
  }
  object InboundRule {
    
    @scala.inline
    def apply(ID: Double, Rule: String): InboundRule = {
      val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundRule]
    }
    
    @scala.inline
    implicit class InboundRuleMutableBuilder[Self <: InboundRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: String): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InboundRules extends StObject {
    
    var InboundRules: js.Array[InboundRule] = js.native
    
    var TotalCount: Double = js.native
  }
  object InboundRules {
    
    @scala.inline
    def apply(InboundRules: js.Array[InboundRule], TotalCount: Double): InboundRules = {
      val __obj = js.Dynamic.literal(InboundRules = InboundRules.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundRules]
    }
    
    @scala.inline
    implicit class InboundRulesMutableBuilder[Self <: InboundRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInboundRules(value: js.Array[InboundRule]): Self = StObject.set(x, "InboundRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundRulesVarargs(value: InboundRule*): Self = StObject.set(x, "InboundRules", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
