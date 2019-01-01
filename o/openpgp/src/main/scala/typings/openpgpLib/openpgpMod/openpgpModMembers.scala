package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", JSImport.Namespace)
@js.native
object openpgpModMembers extends js.Object {
  def decrypt(options: DecryptOptions): js.Promise[DecryptedMessage] = js.native
  def decryptKey(options: openpgpLib.Anon_Passphrase): js.Promise[KeyContainer] = js.native
  def destroyWorker(): scala.Unit = js.native
  def encrypt(options: EncryptOptions): js.Promise[EncryptedMessage] = js.native
  def encryptKey(options: openpgpLib.Anon_Passphrase): js.Promise[KeyContainer] = js.native
  def generateKey(options: KeyOptions): js.Promise[KeyPair] = js.native
  def getWorker(): AsyncProxy = js.native
  def initWorker(options: WorkerOptions): scala.Boolean = js.native
  def reformatKey(options: openpgpLib.Anon_KeyExpirationTime): js.Promise[KeyPair] = js.native
  def revokeKey(options: openpgpLib.Anon_Key): js.Promise[KeyPair] = js.native
  def sign(options: SignOptions): js.Promise[SignedMessage] = js.native
  def verify(options: VerifyOptions): js.Promise[VerifiedMessage] = js.native
}

