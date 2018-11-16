package typings
package nodegitLib.refDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-log", "Reflog")
@js.native
class Reflog () extends js.Object {
  def append(id: nodegitLib.oidMod.Oid, committer: nodegitLib.signatureMod.Signature, msg: java.lang.String): scala.Double = js.native
  def drop(idx: scala.Double, rewritePreviousEntry: scala.Double): scala.Double = js.native
  def entryByIndex(idx: scala.Double): ReflogEntry = js.native
  def entrycount(): scala.Double = js.native
  def free(): scala.Unit = js.native
  def write(): scala.Double = js.native
}

@JSImport("nodegit/ref-log", "Reflog")
@js.native
object Reflog extends js.Object {
  def delete(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): scala.Double = js.native
  def read(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): stdLib.Promise[nodegitLib.refDashLogMod.Reflog] = js.native
  def rename(repo: nodegitLib.repositoryMod.Repository, oldName: java.lang.String, name: java.lang.String): scala.Double = js.native
}

