package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(options: openpgpLib.openpgpMod.DecryptOptions): js.Promise[openpgpLib.openpgpMod.DecryptedMessage] = js.native
  def decryptKey(options: openpgpLib.Anon_Passphrase): js.Promise[openpgpLib.openpgpMod.KeyContainer] = js.native
  def destroyWorker(): scala.Unit = js.native
  def encrypt(options: openpgpLib.openpgpMod.EncryptOptions): js.Promise[openpgpLib.openpgpMod.EncryptedMessage] = js.native
  def encryptKey(options: openpgpLib.Anon_Passphrase): js.Promise[openpgpLib.openpgpMod.KeyContainer] = js.native
  def generateKey(options: openpgpLib.openpgpMod.KeyOptions): js.Promise[openpgpLib.openpgpMod.KeyPair] = js.native
  def getWorker(): openpgpLib.openpgpMod.AsyncProxy = js.native
  def initWorker(options: openpgpLib.openpgpMod.WorkerOptions): scala.Boolean = js.native
  def reformatKey(options: openpgpLib.Anon_KeyExpirationTime): js.Promise[openpgpLib.openpgpMod.KeyPair] = js.native
  def revokeKey(options: openpgpLib.Anon_Key): js.Promise[openpgpLib.openpgpMod.KeyPair] = js.native
  def sign(options: openpgpLib.openpgpMod.SignOptions): js.Promise[openpgpLib.openpgpMod.SignedMessage] = js.native
  def verify(options: openpgpLib.openpgpMod.VerifyOptions): js.Promise[openpgpLib.openpgpMod.VerifiedMessage] = js.native
}

