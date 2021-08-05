package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signerInfoMod {
  
  @JSImport("pkijs/src/SignerInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with SignerInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var sid: js.Any = js.native
    
    /* CompleteClass */
    var signature: OctetString = js.native
    
    /* CompleteClass */
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/SignerInfo", JSImport.Default)
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
  
  trait SignerInfo extends StObject {
    
    var digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    def fromSchema(schema: js.Any): Unit
    
    var sid: js.Any
    
    var signature: OctetString
    
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    var signedAttrs: js.UndefOr[typings.pkijs.signedAndUnsignedAttributesMod.default] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var unsignedAttrs: js.UndefOr[typings.pkijs.signedAndUnsignedAttributesMod.default] = js.undefined
    
    var version: Double
  }
  object SignerInfo {
    
    inline def apply(
      digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      fromSchema: js.Any => Unit,
      sid: js.Any,
      signature: OctetString,
      signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): SignerInfo = {
      val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), sid = sid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignerInfo]
    }
    
    extension [Self <: SignerInfo](x: Self) {
      
      inline def setDigestAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setSid(value: js.Any): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: OctetString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignedAttrs(value: typings.pkijs.signedAndUnsignedAttributesMod.default): Self = StObject.set(x, "signedAttrs", value.asInstanceOf[js.Any])
      
      inline def setSignedAttrsUndefined: Self = StObject.set(x, "signedAttrs", js.undefined)
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      inline def setUnsignedAttrs(value: typings.pkijs.signedAndUnsignedAttributesMod.default): Self = StObject.set(x, "unsignedAttrs", value.asInstanceOf[js.Any])
      
      inline def setUnsignedAttrsUndefined: Self = StObject.set(x, "unsignedAttrs", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
