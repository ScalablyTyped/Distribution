package typings.nodegit.refDashLogMod

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-log", "Reflog")
@js.native
class Reflog () extends js.Object {
  def append(id: Oid, committer: Signature, msg: String): Double = js.native
  def drop(idx: Double, rewritePreviousEntry: Double): Double = js.native
  def entryByIndex(idx: Double): ReflogEntry = js.native
  def entrycount(): Double = js.native
  def free(): Unit = js.native
  def write(): Double = js.native
}

/* static members */
@JSImport("nodegit/ref-log", "Reflog")
@js.native
object Reflog extends js.Object {
  def delete(repo: Repository, name: String): Double = js.native
  def read(repo: Repository, name: String): js.Promise[Reflog] = js.native
  def rename(repo: Repository, oldName: String, name: String): Double = js.native
}

