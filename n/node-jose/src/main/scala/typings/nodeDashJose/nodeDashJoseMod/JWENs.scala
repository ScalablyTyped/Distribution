package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import typings.nodeDashJose.Anon_Compact
import typings.nodeDashJose.nodeDashJoseMod.JWENs.DecryptResult
import typings.nodeDashJose.nodeDashJoseMod.JWENs.Decryptor
import typings.nodeDashJose.nodeDashJoseMod.JWENs.Encryptor
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.Key
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWE")
@js.native
object JWENs extends js.Object {
  trait DecryptResult extends js.Object {
    /**
      * the decrypted content (alternate)
      */
    var plaintext: Buffer
    /**
      * an array of the member names from the "protected" member
      */
    var `protected`: js.Array[String]
  }
  
  trait Decryptor extends js.Object {
    def decrypt(input: String): js.Promise[DecryptResult]
  }
  
  trait Encryptor extends js.Object {
    def `final`(): js.Promise[String]
    def update(input: js.Any): this.type
  }
  
  def createDecrypt(key: Key): Decryptor = js.native
  def createDecrypt(key: KeyStore): Decryptor = js.native
  def createDecrypt(key: KeyStore, opts: js.Any): Decryptor = js.native
  def createDecrypt(key: Key, opts: js.Any): Decryptor = js.native
  def createEncrypt(keys: js.Array[Key]): Encryptor = js.native
  def createEncrypt(keys: Key): Encryptor = js.native
  def createEncrypt(options: Anon_Compact, key: Key): Encryptor = js.native
}

