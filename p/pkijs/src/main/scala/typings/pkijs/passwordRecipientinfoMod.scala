package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordRecipientinfoMod {
  
  @JSImport("pkijs/src/PasswordRecipientinfo", JSImport.Default)
  @js.native
  class default () extends PasswordRecipientinfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/PasswordRecipientinfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/PasswordRecipientinfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PasswordRecipientinfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PasswordRecipientinfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PasswordRecipientinfo extends StObject {
    
    var encryptedKey: OctetString = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyDerivationAlgorithm: js.UndefOr[typings.pkijs.algorithmIdentifierMod.default] = js.native
    
    var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var password: ArrayBuffer = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var version: Double = js.native
  }
  object PasswordRecipientinfo {
    
    @scala.inline
    def apply(
      encryptedKey: OctetString,
      fromSchema: js.Any => Unit,
      keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      password: ArrayBuffer,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): PasswordRecipientinfo = {
      val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PasswordRecipientinfo]
    }
    
    @scala.inline
    implicit class PasswordRecipientinfoMutableBuilder[Self <: PasswordRecipientinfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyDerivationAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "keyDerivationAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyDerivationAlgorithmUndefined: Self = StObject.set(x, "keyDerivationAlgorithm", js.undefined)
      
      @scala.inline
      def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
