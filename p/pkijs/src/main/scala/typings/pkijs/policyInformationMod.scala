package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyInformationMod {
  
  @JSImport("pkijs/src/PolicyInformation", JSImport.Default)
  @js.native
  class default () extends PolicyInformation {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyInformation", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PolicyInformation", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PolicyInformation", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PolicyInformation extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var policyIdentifier: String = js.native
    
    /**
      * Value of the TIME class
      */
    var policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PolicyInformation {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      policyIdentifier: String,
      policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyInformation = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyIdentifier = policyIdentifier.asInstanceOf[js.Any], policyQualifiers = policyQualifiers.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyInformation]
    }
    
    @scala.inline
    implicit class PolicyInformationMutableBuilder[Self <: PolicyInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPolicyIdentifier(value: String): Self = StObject.set(x, "policyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyQualifiers(value: js.Array[typings.pkijs.policyQualifierInfoMod.default]): Self = StObject.set(x, "policyQualifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyQualifiersVarargs(value: typings.pkijs.policyQualifierInfoMod.default*): Self = StObject.set(x, "policyQualifiers", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
