package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends nodegitLib.revDashParseMod.Revparse

@JSImport("nodegit", "Revparse")
@js.native
object Revparse extends js.Object {
  def ext(
    objectOut: nodegitLib.objectMod.Object,
    referenceOut: nodegitLib.referenceMod.Reference,
    repo: nodegitLib.repositoryMod.Repository,
    spec: java.lang.String
  ): scala.Double = js.native
  def single(repo: nodegitLib.repositoryMod.Repository, spec: java.lang.String): js.Promise[nodegitLib.objectMod.Object] = js.native
}

