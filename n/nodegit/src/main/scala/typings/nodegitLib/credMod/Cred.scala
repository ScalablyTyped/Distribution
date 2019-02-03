package typings
package nodegitLib.credMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cred", "Cred")
@js.native
class Cred () extends js.Object {
  def free(): scala.Unit = js.native
  def hasUsername(): scala.Double = js.native
}

/* static members */
@JSImport("nodegit/cred", "Cred")
@js.native
object Cred extends js.Object {
  def defaultNew(): nodegitLib.credMod.Cred = js.native
  def sshKeyFromAgent(username: java.lang.String): nodegitLib.credMod.Cred = js.native
  def sshKeyMemoryNew(
    username: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    passphrase: java.lang.String
  ): js.Promise[nodegitLib.credMod.Cred] = js.native
  def sshKeyNew(
    username: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    passphrase: java.lang.String
  ): nodegitLib.credMod.Cred = js.native
  def usernameNew(username: java.lang.String): js.Promise[nodegitLib.credMod.Cred] = js.native
  def userpassPlaintextNew(username: java.lang.String, password: java.lang.String): nodegitLib.credMod.Cred = js.native
}

