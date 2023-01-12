package typings.nodeJose.mod

import typings.node.bufferMod.global.Buffer
import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
import typings.nodeJose.nodeJoseStrings.DEF
import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import typings.nodeJose.nodeJoseStrings.general
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWE {
  
  @JSImport("node-jose", "JWE")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDecrypt(key: Key): Decryptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecrypt")(key.asInstanceOf[js.Any]).asInstanceOf[Decryptor]
  inline def createDecrypt(key: KeyStore): Decryptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecrypt")(key.asInstanceOf[js.Any]).asInstanceOf[Decryptor]
  inline def createDecrypt(key: KeyStore, opts: Any): Decryptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecrypt")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Decryptor]
  inline def createDecrypt(key: Key, opts: Any): Decryptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecrypt")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Decryptor]
  
  inline def createEncrypt(keys: js.Array[Key]): Encryptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncrypt")(keys.asInstanceOf[js.Any]).asInstanceOf[Encryptor]
  inline def createEncrypt(keys: Key): Encryptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncrypt")(keys.asInstanceOf[js.Any]).asInstanceOf[Encryptor]
  inline def createEncrypt(options: EncryptOptions, key: js.Array[Key]): Encryptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncrypt")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Encryptor]
  inline def createEncrypt(options: EncryptOptions, key: Key): Encryptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncrypt")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Encryptor]
  
  trait DecryptResult extends StObject {
    
    var header: js.Object
    
    /**
      * Key used to decrypt
      */
    var key: Key
    
    /**
      * Buffer of the decrypted content
      */
    var payload: Buffer
    
    /**
      * the decrypted content (alternate)
      */
    var plaintext: Buffer
    
    /**
      * an array of the member names from the "protected" member
      */
    var `protected`: js.Array[String]
  }
  object DecryptResult {
    
    inline def apply(header: js.Object, key: Key, payload: Buffer, plaintext: Buffer, `protected`: js.Array[String]): DecryptResult = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecryptResult] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPlaintext(value: Buffer): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: js.Array[String]): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedVarargs(value: String*): Self = StObject.set(x, "protected", js.Array(value*))
    }
  }
  
  trait Decryptor extends StObject {
    
    def decrypt(input: String): js.Promise[DecryptResult]
  }
  object Decryptor {
    
    inline def apply(decrypt: String => js.Promise[DecryptResult]): Decryptor = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt))
      __obj.asInstanceOf[Decryptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decryptor] (val x: Self) extends AnyVal {
      
      inline def setDecrypt(value: String => js.Promise[DecryptResult]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
    }
  }
  
  trait EncryptOptions extends StObject {
    
    var contentAlg: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var format: js.UndefOr[general | compact | flattened] = js.undefined
    
    var iv: js.UndefOr[String | Buffer] = js.undefined
    
    var protect: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var zip: js.UndefOr[Boolean | DEF] = js.undefined
  }
  object EncryptOptions {
    
    inline def apply(): EncryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
      
      inline def setContentAlg(value: String): Self = StObject.set(x, "contentAlg", value.asInstanceOf[js.Any])
      
      inline def setContentAlgUndefined: Self = StObject.set(x, "contentAlg", js.undefined)
      
      inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFormat(value: general | compact | flattened): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIv(value: String | Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setProtect(value: String | js.Array[String]): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
      
      inline def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
      
      inline def setProtectVarargs(value: String*): Self = StObject.set(x, "protect", js.Array(value*))
      
      inline def setZip(value: Boolean | DEF): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  trait Encryptor extends StObject {
    
    def `final`(): js.Promise[String]
    
    def update(input: Any): this.type
  }
  object Encryptor {
    
    inline def apply(`final`: () => js.Promise[String], update: Any => Encryptor): Encryptor = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[Encryptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encryptor] (val x: Self) extends AnyVal {
      
      inline def setFinal(value: () => js.Promise[String]): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: Any => Encryptor): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
