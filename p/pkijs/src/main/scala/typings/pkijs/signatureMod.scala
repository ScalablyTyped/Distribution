package typings.pkijs

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("pkijs/src/Signature", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Signature {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var signature: BitString = js.native
    
    /* CompleteClass */
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/Signature", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    inline def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait Signature extends StObject {
    
    var certs: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var signature: BitString
    
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object Signature {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      signature: BitString,
      signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): Signature = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setCerts(value: js.Array[typings.pkijs.certificateMod.default]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
      
      inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
      
      inline def setCertsVarargs(value: typings.pkijs.certificateMod.default*): Self = StObject.set(x, "certs", js.Array(value :_*))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setSignature(value: BitString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
