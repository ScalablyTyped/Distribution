package typings.nodeJose.mod

import typings.node.Buffer
import typings.nodeJose.anon.ContentAlg
import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWE {
  
  @JSImport("node-jose", "JWE.createDecrypt")
  @js.native
  def createDecrypt(key: Key): Decryptor = js.native
  @JSImport("node-jose", "JWE.createDecrypt")
  @js.native
  def createDecrypt(key: KeyStore): Decryptor = js.native
  @JSImport("node-jose", "JWE.createDecrypt")
  @js.native
  def createDecrypt(key: KeyStore, opts: js.Any): Decryptor = js.native
  @JSImport("node-jose", "JWE.createDecrypt")
  @js.native
  def createDecrypt(key: Key, opts: js.Any): Decryptor = js.native
  
  @JSImport("node-jose", "JWE.createEncrypt")
  @js.native
  def createEncrypt(keys: js.Array[Key]): Encryptor = js.native
  @JSImport("node-jose", "JWE.createEncrypt")
  @js.native
  def createEncrypt(keys: Key): Encryptor = js.native
  @JSImport("node-jose", "JWE.createEncrypt")
  @js.native
  def createEncrypt(options: ContentAlg, key: Key): Encryptor = js.native
  
  @js.native
  trait DecryptResult extends StObject {
    
    var header: js.Object = js.native
    
    /**
      * Key used to decrypt
      */
    var key: Key = js.native
    
    /**
      * Buffer of the decrypted content
      */
    var payload: Buffer = js.native
    
    /**
      * the decrypted content (alternate)
      */
    var plaintext: Buffer = js.native
    
    /**
      * an array of the member names from the "protected" member
      */
    var `protected`: js.Array[String] = js.native
  }
  object DecryptResult {
    
    @scala.inline
    def apply(header: js.Object, key: Key, payload: Buffer, plaintext: Buffer, `protected`: js.Array[String]): DecryptResult = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptResult]
    }
    
    @scala.inline
    implicit class DecryptResultMutableBuilder[Self <: DecryptResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: Buffer): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtected(value: js.Array[String]): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedVarargs(value: String*): Self = StObject.set(x, "protected", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Decryptor extends StObject {
    
    def decrypt(input: String): js.Promise[DecryptResult] = js.native
  }
  object Decryptor {
    
    @scala.inline
    def apply(decrypt: String => js.Promise[DecryptResult]): Decryptor = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt))
      __obj.asInstanceOf[Decryptor]
    }
    
    @scala.inline
    implicit class DecryptorMutableBuilder[Self <: Decryptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrypt(value: String => js.Promise[DecryptResult]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Encryptor extends StObject {
    
    def `final`(): js.Promise[String] = js.native
    
    def update(input: js.Any): this.type = js.native
  }
  object Encryptor {
    
    @scala.inline
    def apply(`final`: () => js.Promise[String], update: js.Any => Encryptor): Encryptor = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[Encryptor]
    }
    
    @scala.inline
    implicit class EncryptorMutableBuilder[Self <: Encryptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: () => js.Promise[String]): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: js.Any => Encryptor): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
