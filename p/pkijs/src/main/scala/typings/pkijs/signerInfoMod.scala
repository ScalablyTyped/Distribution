package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signerInfoMod {
  
  @JSImport("pkijs/src/SignerInfo", JSImport.Default)
  @js.native
  class default () extends SignerInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/SignerInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/SignerInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/SignerInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/SignerInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait SignerInfo extends StObject {
    
    var digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var sid: js.Any = js.native
    
    var signature: OctetString = js.native
    
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var signedAttrs: js.UndefOr[typings.pkijs.signedAndUnsignedAttributesMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var unsignedAttrs: js.UndefOr[typings.pkijs.signedAndUnsignedAttributesMod.default] = js.native
    
    var version: Double = js.native
  }
  object SignerInfo {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SignerInfoMutableBuilder[Self <: SignerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigestAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSid(value: js.Any): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: OctetString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedAttrs(value: typings.pkijs.signedAndUnsignedAttributesMod.default): Self = StObject.set(x, "signedAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedAttrsUndefined: Self = StObject.set(x, "signedAttrs", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnsignedAttrs(value: typings.pkijs.signedAndUnsignedAttributesMod.default): Self = StObject.set(x, "unsignedAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsignedAttrsUndefined: Self = StObject.set(x, "unsignedAttrs", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
