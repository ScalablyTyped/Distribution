package typings.nodegit.transportMod.Transport

import typings.nodegit.remoteMod.Remote
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/transport", "Transport")
@js.native
object ^ extends js.Object {
  def sshWithPaths(owner: Remote, payload: String): js.Promise[typings.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: Remote, payload: js.Array[String]): js.Promise[typings.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: Remote, payload: Strarray): js.Promise[typings.nodegit.transportMod.Transport] = js.native
  def unregister(prefix: String): Double = js.native
}

