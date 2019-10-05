package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cred")
@js.native
class Cred ()
  extends typings.nodegit.credMod.Cred

/* static members */
@JSImport("nodegit", "Cred")
@js.native
object Cred extends js.Object {
  def defaultNew(): typings.nodegit.credMod.Cred = js.native
  def sshKeyFromAgent(username: String): typings.nodegit.credMod.Cred = js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typings.nodegit.credMod.Cred] = js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typings.nodegit.credMod.Cred = js.native
  def usernameNew(username: String): js.Promise[typings.nodegit.credMod.Cred] = js.native
  def userpassPlaintextNew(username: String, password: String): typings.nodegit.credMod.Cred = js.native
  type TYPE = typings.nodegit.credMod.Cred.TYPE
}

