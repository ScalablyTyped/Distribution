package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revwalk")
@js.native
class Revwalk ()
  extends nodegitLib.revDashWalkMod.Revwalk

/* static members */
@JSImport("nodegit", "Revwalk")
@js.native
object Revwalk extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository): nodegitLib.revDashWalkMod.Revwalk = js.native
}

