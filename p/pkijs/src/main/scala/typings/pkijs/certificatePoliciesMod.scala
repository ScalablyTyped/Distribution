package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificatePoliciesMod {
  
  @JSImport("pkijs/src/CertificatePolicies", JSImport.Default)
  @js.native
  class default () extends CertificatePolicies {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CertificatePolicies", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/CertificatePolicies", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/CertificatePolicies", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait CertificatePolicies extends StObject {
    
    var certificatePolicies: js.Array[typings.pkijs.policyInformationMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object CertificatePolicies {
    
    @scala.inline
    def apply(
      certificatePolicies: js.Array[typings.pkijs.policyInformationMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): CertificatePolicies = {
      val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[CertificatePolicies]
    }
    
    @scala.inline
    implicit class CertificatePoliciesMutableBuilder[Self <: CertificatePolicies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificatePolicies(value: js.Array[typings.pkijs.policyInformationMod.default]): Self = StObject.set(x, "certificatePolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePoliciesVarargs(value: typings.pkijs.policyInformationMod.default*): Self = StObject.set(x, "certificatePolicies", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
