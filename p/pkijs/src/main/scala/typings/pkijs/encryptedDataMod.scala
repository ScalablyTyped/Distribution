package typings.pkijs

import typings.pkijs.anon.ContentEncryptionAlgorithm
import typings.pkijs.anon.Password
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptedDataMod {
  
  @JSImport("pkijs/src/EncryptedData", JSImport.Default)
  @js.native
  class default () extends EncryptedData {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/EncryptedData", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/EncryptedData", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/EncryptedData", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/EncryptedData", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait EncryptedData extends StObject {
    
    /**
      * Create a new CMS Encrypted Data content
      * @param {*} parameters Parameters neccessary for encryption
      */
    def decrypt(parameters: Password): js.Thenable[ArrayBuffer] = js.native
    
    /**
      * Create a new CMS Encrypted Data content
      * @param {*} parameters Parameters neccessary for encryption
      * @returns {Promise}
      */
    def encrypt(parameters: ContentEncryptionAlgorithm): js.Thenable[ArrayBuffer] = js.native
    
    var encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var unprotectedAttrs: js.Array[typings.pkijs.attributeMod.default] = js.native
    
    var version: Double = js.native
  }
  object EncryptedData {
    
    @scala.inline
    def apply(
      decrypt: Password => js.Thenable[ArrayBuffer],
      encrypt: ContentEncryptionAlgorithm => js.Thenable[ArrayBuffer],
      encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      unprotectedAttrs: js.Array[typings.pkijs.attributeMod.default],
      version: Double
    ): EncryptedData = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), unprotectedAttrs = unprotectedAttrs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptedData]
    }
    
    @scala.inline
    implicit class EncryptedDataMutableBuilder[Self <: EncryptedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrypt(value: Password => js.Thenable[ArrayBuffer]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncrypt(value: ContentEncryptionAlgorithm => js.Thenable[ArrayBuffer]): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncryptedContentInfo(value: typings.pkijs.encryptedContentInfoMod.default): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnprotectedAttrs(value: js.Array[typings.pkijs.attributeMod.default]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprotectedAttrsVarargs(value: typings.pkijs.attributeMod.default*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
