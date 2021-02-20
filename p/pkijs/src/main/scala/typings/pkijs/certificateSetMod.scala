package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateSetMod {
  
  @JSImport("pkijs/src/CertificateSet", JSImport.Default)
  @js.native
  class default () extends CertificateSet {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CertificateSet", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/CertificateSet", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/CertificateSet", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait CertificateSet extends StObject {
    
    var certificates: js.Array[typings.pkijs.certificateMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object CertificateSet {
    
    @scala.inline
    def apply(
      certificates: js.Array[typings.pkijs.certificateMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): CertificateSet = {
      val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[CertificateSet]
    }
    
    @scala.inline
    implicit class CertificateSetMutableBuilder[Self <: CertificateSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificates(value: js.Array[typings.pkijs.certificateMod.default]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatesVarargs(value: typings.pkijs.certificateMod.default*): Self = StObject.set(x, "certificates", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
