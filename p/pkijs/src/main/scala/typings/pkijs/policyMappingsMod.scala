package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyMappingsMod {
  
  @JSImport("pkijs/src/PolicyMappings", JSImport.Default)
  @js.native
  class default () extends PolicyMappings {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyMappings", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PolicyMappings", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PolicyMappings", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PolicyMappings extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var mappings: js.Array[typings.pkijs.policyMappingMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PolicyMappings {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      mappings: js.Array[typings.pkijs.policyMappingMod.default],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyMappings = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mappings = mappings.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyMappings]
    }
    
    @scala.inline
    implicit class PolicyMappingsMutableBuilder[Self <: PolicyMappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMappings(value: js.Array[typings.pkijs.policyMappingMod.default]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingsVarargs(value: typings.pkijs.policyMappingMod.default*): Self = StObject.set(x, "mappings", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
