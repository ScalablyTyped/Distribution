package typings
package nodegitLib.refDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-db", "Refdb")
@js.native
class Refdb () extends js.Object {
  def compress(): scala.Double = js.native
  def free(): scala.Unit = js.native
}

/* static members */
@JSImport("nodegit/ref-db", "Refdb")
@js.native
object Refdb extends js.Object {
  def open(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.refDashDbMod.Refdb] = js.native
}

