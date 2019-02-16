package typings
package nodeDashJoseLib.nodeDashJoseMod

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
    var plaintext: nodeLib.Buffer
    /**
      * an array of the member names from the "protected" member
      */
    var `protected`: js.Array[java.lang.String]
  }
  
  trait Decryptor extends js.Object {
    def decrypt(input: java.lang.String): js.Promise[DecryptResult]
  }
  
  trait Encryptor extends js.Object {
    def `final`(): js.Promise[java.lang.String]
    def update(input: js.Any): this.type
  }
  
  def createDecrypt(key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key): Decryptor = js.native
  def createDecrypt(key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.KeyStore): Decryptor = js.native
  def createDecrypt(key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.KeyStore, opts: js.Any): Decryptor = js.native
  def createDecrypt(key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key, opts: js.Any): Decryptor = js.native
  def createEncrypt(keys: js.Array[nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key]): Encryptor = js.native
  def createEncrypt(keys: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key): Encryptor = js.native
  def createEncrypt(options: nodeDashJoseLib.Anon_Compact, key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key): Encryptor = js.native
}

