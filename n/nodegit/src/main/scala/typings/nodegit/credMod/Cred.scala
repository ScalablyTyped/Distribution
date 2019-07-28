package typings.nodegit.credMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cred", "Cred")
@js.native
class Cred () extends js.Object {
  def free(): Unit = js.native
  def hasUsername(): Double = js.native
}

/* static members */
@JSImport("nodegit/cred", "Cred")
@js.native
object Cred extends js.Object {
  def defaultNew(): Cred = js.native
  def sshKeyFromAgent(username: String): Cred = js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[Cred] = js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): Cred = js.native
  def usernameNew(username: String): js.Promise[Cred] = js.native
  def userpassPlaintextNew(username: String, password: String): Cred = js.native
}

