package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherCertificateFormatMod {
  
  @JSImport("pkijs/src/OtherCertificateFormat", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OtherCertificateFormat {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var otherCert: js.Any = js.native
    
    /* CompleteClass */
    var otherCertFormat: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherCertificateFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait OtherCertificateFormat extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var otherCert: js.Any
    
    var otherCertFormat: String
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object OtherCertificateFormat {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      otherCert: js.Any,
      otherCertFormat: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherCertificateFormat = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherCert = otherCert.asInstanceOf[js.Any], otherCertFormat = otherCertFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherCertificateFormat]
    }
    
    extension [Self <: OtherCertificateFormat](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setOtherCert(value: js.Any): Self = StObject.set(x, "otherCert", value.asInstanceOf[js.Any])
      
      inline def setOtherCertFormat(value: String): Self = StObject.set(x, "otherCertFormat", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
