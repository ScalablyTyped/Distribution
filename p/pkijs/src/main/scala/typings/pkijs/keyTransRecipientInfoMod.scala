package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyTransRecipientInfoMod {
  
  @JSImport("pkijs/src/KeyTransRecipientInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with KeyTransRecipientInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var encryptedKey: OctetString = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * For some reasons we need to store recipient's certificate here
      *
      * @type {Certificate}
      * @memberOf KeyTransRecipientInfo
      */
    /* CompleteClass */
    var recipientCertificate: typings.pkijs.certificateMod.default = js.native
    
    /* CompleteClass */
    var rid: typings.pkijs.recipientIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/KeyTransRecipientInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait KeyTransRecipientInfo extends StObject {
    
    var encryptedKey: OctetString
    
    def fromSchema(schema: js.Any): Unit
    
    var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    /**
      * For some reasons we need to store recipient's certificate here
      *
      * @type {Certificate}
      * @memberOf KeyTransRecipientInfo
      */
    var recipientCertificate: typings.pkijs.certificateMod.default
    
    var rid: typings.pkijs.recipientIdentifierMod.default
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var version: Double
  }
  object KeyTransRecipientInfo {
    
    @scala.inline
    def apply(
      encryptedKey: OctetString,
      fromSchema: js.Any => Unit,
      keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      recipientCertificate: typings.pkijs.certificateMod.default,
      rid: typings.pkijs.recipientIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): KeyTransRecipientInfo = {
      val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyTransRecipientInfo]
    }
    
    @scala.inline
    implicit class KeyTransRecipientInfoMutableBuilder[Self <: KeyTransRecipientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientCertificate(value: typings.pkijs.certificateMod.default): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRid(value: typings.pkijs.recipientIdentifierMod.default): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
