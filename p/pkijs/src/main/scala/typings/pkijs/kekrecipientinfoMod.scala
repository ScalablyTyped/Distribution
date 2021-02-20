package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kekrecipientinfoMod {
  
  @JSImport("pkijs/src/KEKRecipientInfo", JSImport.Default)
  @js.native
  class default () extends KEKRecipientInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/KEKRecipientInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/KEKRecipientInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/KEKRecipientInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/KEKRecipientInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait KEKRecipientInfo extends StObject {
    
    var encryptedKey: OctetString = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var kekid: typings.pkijs.kekidentifierMod.default = js.native
    
    var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var preDefinedKEK: ArrayBuffer = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var version: Double = js.native
  }
  object KEKRecipientInfo {
    
    @scala.inline
    def apply(
      encryptedKey: OctetString,
      fromSchema: js.Any => Unit,
      kekid: typings.pkijs.kekidentifierMod.default,
      keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      preDefinedKEK: ArrayBuffer,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): KEKRecipientInfo = {
      val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], preDefinedKEK = preDefinedKEK.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[KEKRecipientInfo]
    }
    
    @scala.inline
    implicit class KEKRecipientInfoMutableBuilder[Self <: KEKRecipientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKekid(value: typings.pkijs.kekidentifierMod.default): Self = StObject.set(x, "kekid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreDefinedKEK(value: ArrayBuffer): Self = StObject.set(x, "preDefinedKEK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
