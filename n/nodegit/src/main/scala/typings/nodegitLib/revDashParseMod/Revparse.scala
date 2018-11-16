package typings
package nodegitLib.revDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rev-parse", "Revparse")
@js.native
class Revparse () extends js.Object

@JSImport("nodegit/rev-parse", "Revparse")
@js.native
object Revparse extends js.Object {
  def ext(
    objectOut: js.Object,
    referenceOut: nodegitLib.referenceMod.Reference,
    repo: nodegitLib.repositoryMod.Repository,
    spec: java.lang.String
  ): scala.Double = js.native
  def single(repo: nodegitLib.repositoryMod.Repository, spec: java.lang.String): stdLib.Promise[js.Object] = js.native
}

