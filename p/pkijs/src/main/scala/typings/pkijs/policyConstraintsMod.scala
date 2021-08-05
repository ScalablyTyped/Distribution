package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyConstraintsMod {
  
  @JSImport("pkijs/src/PolicyConstraints", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PolicyConstraints {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyConstraints", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PolicyConstraints extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var inhibitPolicyMapping: js.UndefOr[Double] = js.undefined
    
    var requireExplicitPolicy: js.UndefOr[Double] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PolicyConstraints {
    
    inline def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): PolicyConstraints = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyConstraints]
    }
    
    extension [Self <: PolicyConstraints](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setInhibitPolicyMapping(value: Double): Self = StObject.set(x, "inhibitPolicyMapping", value.asInstanceOf[js.Any])
      
      inline def setInhibitPolicyMappingUndefined: Self = StObject.set(x, "inhibitPolicyMapping", js.undefined)
      
      inline def setRequireExplicitPolicy(value: Double): Self = StObject.set(x, "requireExplicitPolicy", value.asInstanceOf[js.Any])
      
      inline def setRequireExplicitPolicyUndefined: Self = StObject.set(x, "requireExplicitPolicy", js.undefined)
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
