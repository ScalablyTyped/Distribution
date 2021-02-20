package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyConstraintsMod {
  
  @JSImport("pkijs/src/PolicyConstraints", JSImport.Default)
  @js.native
  class default () extends PolicyConstraints {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyConstraints", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PolicyConstraints", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PolicyConstraints", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PolicyConstraints extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var inhibitPolicyMapping: js.UndefOr[Double] = js.native
    
    var requireExplicitPolicy: js.UndefOr[Double] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PolicyConstraints {
    
    @scala.inline
    def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): PolicyConstraints = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyConstraints]
    }
    
    @scala.inline
    implicit class PolicyConstraintsMutableBuilder[Self <: PolicyConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInhibitPolicyMapping(value: Double): Self = StObject.set(x, "inhibitPolicyMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInhibitPolicyMappingUndefined: Self = StObject.set(x, "inhibitPolicyMapping", js.undefined)
      
      @scala.inline
      def setRequireExplicitPolicy(value: Double): Self = StObject.set(x, "requireExplicitPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireExplicitPolicyUndefined: Self = StObject.set(x, "requireExplicitPolicy", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
