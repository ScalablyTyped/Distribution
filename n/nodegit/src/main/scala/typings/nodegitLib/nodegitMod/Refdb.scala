package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends nodegitLib.refDashDbMod.Refdb

/* static members */
@JSImport("nodegit", "Refdb")
@js.native
object Refdb extends js.Object {
  def open(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.refDashDbMod.Refdb] = js.native
}

