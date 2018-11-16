package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", JSImport.Namespace)
@js.native
object openpgpModMembers extends js.Object {
  def decrypt(options: DecryptOptions): stdLib.Promise[VerifiedMessage] = js.native
  def decryptKey(options: openpgpLib.Anon_Passphrase): stdLib.Promise[KeyContainer] = js.native
  def destroyWorker(): scala.Unit = js.native
  def encrypt(options: EncryptOptions): stdLib.Promise[EncryptedMessage] = js.native
  def encryptKey(options: openpgpLib.Anon_PassphrasePrivateKey): stdLib.Promise[KeyContainer] = js.native
  def generateKey(options: KeyOptions): stdLib.Promise[KeyPair] = js.native
  def getWorker(): AsyncProxy = js.native
  def initWorker(options: WorkerOptions): scala.Boolean = js.native
  def reformatKey(options: openpgpLib.Anon_KeyExpirationTime): stdLib.Promise[KeyPair] = js.native
}

