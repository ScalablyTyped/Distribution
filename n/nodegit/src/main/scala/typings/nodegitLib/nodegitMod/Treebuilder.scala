package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Treebuilder")
@js.native
class Treebuilder ()
  extends nodegitLib.treeDashBuilderMod.Treebuilder

/* static members */
@JSImport("nodegit", "Treebuilder")
@js.native
object Treebuilder extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository, source: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.treeDashBuilderMod.Treebuilder] = js.native
}

