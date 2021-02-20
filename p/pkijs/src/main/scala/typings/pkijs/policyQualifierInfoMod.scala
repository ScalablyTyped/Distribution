package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyQualifierInfoMod {
  
  @JSImport("pkijs/src/PolicyQualifierInfo", JSImport.Default)
  @js.native
  class default () extends PolicyQualifierInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyQualifierInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PolicyQualifierInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PolicyQualifierInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PolicyQualifierInfo extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var policyQualifierId: String = js.native
    
    var qualifier: js.Any = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PolicyQualifierInfo {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      policyQualifierId: String,
      qualifier: js.Any,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyQualifierInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyQualifierId = policyQualifierId.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyQualifierInfo]
    }
    
    @scala.inline
    implicit class PolicyQualifierInfoMutableBuilder[Self <: PolicyQualifierInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPolicyQualifierId(value: String): Self = StObject.set(x, "policyQualifierId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: js.Any): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
