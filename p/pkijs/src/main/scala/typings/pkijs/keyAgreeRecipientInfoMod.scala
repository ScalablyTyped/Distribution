package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyAgreeRecipientInfoMod {
  
  @JSImport("pkijs/src/KeyAgreeRecipientInfo", JSImport.Default)
  @js.native
  class default () extends KeyAgreeRecipientInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/KeyAgreeRecipientInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/KeyAgreeRecipientInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/KeyAgreeRecipientInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/KeyAgreeRecipientInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait KeyAgreeRecipientInfo extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var originator: typings.pkijs.originatorIdentifierOrKeyMod.default = js.native
    
    var recipientCertificate: typings.pkijs.certificateMod.default = js.native
    
    var recipientEncryptedKeys: typings.pkijs.recipientEncryptedKeysMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var ukm: js.UndefOr[OctetString] = js.native
    
    var version: Double = js.native
  }
  object KeyAgreeRecipientInfo {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      originator: typings.pkijs.originatorIdentifierOrKeyMod.default,
      recipientCertificate: typings.pkijs.certificateMod.default,
      recipientEncryptedKeys: typings.pkijs.recipientEncryptedKeysMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): KeyAgreeRecipientInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyAgreeRecipientInfo]
    }
    
    @scala.inline
    implicit class KeyAgreeRecipientInfoMutableBuilder[Self <: KeyAgreeRecipientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginator(value: typings.pkijs.originatorIdentifierOrKeyMod.default): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientCertificate(value: typings.pkijs.certificateMod.default): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientEncryptedKeys(value: typings.pkijs.recipientEncryptedKeysMod.default): Self = StObject.set(x, "recipientEncryptedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUkm(value: OctetString): Self = StObject.set(x, "ukm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUkmUndefined: Self = StObject.set(x, "ukm", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
