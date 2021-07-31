package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateSetMod {
  
  @JSImport("pkijs/src/CertificateSet", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CertificateSet {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var certificates: js.Array[typings.pkijs.certificateMod.default] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CertificateSet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait CertificateSet extends StObject {
    
    var certificates: js.Array[typings.pkijs.certificateMod.default]
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
