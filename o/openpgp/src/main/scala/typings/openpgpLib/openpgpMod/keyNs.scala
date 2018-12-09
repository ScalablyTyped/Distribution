package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key")
@js.native
object keyNs extends js.Object {
  /** Class that represents an OpenPGP key. Must contain a primary key. Can contain additional subkeys, signatures, user ids, user attributes.
       */
  
  trait Key extends js.Object {
    var primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey
    def armor(): java.lang.String
    def decrypt(passphrase: java.lang.String): scala.Boolean
    def getExpirationTime(): stdLib.Date
    def getKeyIds(): js.Array[openpgpLib.openpgpMod.Keyid]
    def getPreferredHashAlgorithm(): java.lang.String
    def getPrimaryUser(): js.Any
    def getUserIds(): js.Array[java.lang.String]
    def isPrivate(): scala.Boolean
    def isPublic(): scala.Boolean
    def toPublic(): Key
    def update(key: Key): scala.Unit
    def verifyPrimaryKey(): openpgpLib.openpgpMod.enumsNs.keyStatus
  }
  
  
  trait KeyResult extends js.Object {
    var err: js.Array[stdLib.Error]
    var keys: js.Array[Key]
  }
  
  /** Generates a new OpenPGP key. Currently only supports RSA keys. Primary and subkey will be of same type.
  
          @param options
       */
  def generate(options: openpgpLib.openpgpMod.KeyOptions): Key = js.native
  /** Reads an OpenPGP armored text and returns one or multiple key objects
  
          @param armoredText text to be parsed
       */
  def readArmored(armoredText: java.lang.String): js.Promise[KeyResult] = js.native
}

