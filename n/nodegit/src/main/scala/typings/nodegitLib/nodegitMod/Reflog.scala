package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reflog")
@js.native
class Reflog ()
  extends nodegitLib.refDashLogMod.Reflog

@JSImport("nodegit", "Reflog")
@js.native
object Reflog extends js.Object {
  def delete(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): scala.Double = js.native
  def read(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): js.Promise[nodegitLib.refDashLogMod.Reflog] = js.native
  def rename(repo: nodegitLib.repositoryMod.Repository, oldName: java.lang.String, name: java.lang.String): scala.Double = js.native
}

