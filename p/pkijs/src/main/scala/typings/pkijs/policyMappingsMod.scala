package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyMappingsMod {
  
  @JSImport("pkijs/src/PolicyMappings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PolicyMappings {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var mappings: js.Array[typings.pkijs.policyMappingMod.default] = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyMappings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PolicyMappings extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var mappings: js.Array[typings.pkijs.policyMappingMod.default]
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PolicyMappings {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      mappings: js.Array[typings.pkijs.policyMappingMod.default],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyMappings = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mappings = mappings.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyMappings]
    }
    
    extension [Self <: PolicyMappings](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setMappings(value: js.Array[typings.pkijs.policyMappingMod.default]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: typings.pkijs.policyMappingMod.default*): Self = StObject.set(x, "mappings", js.Array(value :_*))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
