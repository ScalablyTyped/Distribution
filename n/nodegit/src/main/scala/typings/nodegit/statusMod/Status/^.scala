package typings.nodegit.statusMod.Status

import typings.nodegit.repositoryMod.Repository
import typings.nodegit.statusEntryMod.StatusEntry
import typings.nodegit.statusListMod.StatusList
import typings.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status", "Status")
@js.native
object ^ extends js.Object {
  def byIndex(statuslist: StatusList, idx: Double): StatusEntry = js.native
  def file(repo: Repository, path: String): Double = js.native
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  def foreachExt(repo: Repository): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: StatusOptions): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  def shouldIgnore(ignored: Double, repo: Repository, path: String): Double = js.native
}

