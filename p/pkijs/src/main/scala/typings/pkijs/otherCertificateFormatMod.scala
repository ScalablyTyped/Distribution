package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherCertificateFormatMod {
  
  @JSImport("pkijs/src/OtherCertificateFormat", JSImport.Default)
  @js.native
  class default () extends OtherCertificateFormat {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherCertificateFormat", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OtherCertificateFormat", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OtherCertificateFormat", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OtherCertificateFormat extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var otherCert: js.Any = js.native
    
    var otherCertFormat: String = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object OtherCertificateFormat {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      otherCert: js.Any,
      otherCertFormat: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherCertificateFormat = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherCert = otherCert.asInstanceOf[js.Any], otherCertFormat = otherCertFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherCertificateFormat]
    }
    
    @scala.inline
    implicit class OtherCertificateFormatMutableBuilder[Self <: OtherCertificateFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOtherCert(value: js.Any): Self = StObject.set(x, "otherCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherCertFormat(value: String): Self = StObject.set(x, "otherCertFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
