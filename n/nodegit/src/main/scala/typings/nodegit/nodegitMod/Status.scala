package typings.nodegit.nodegitMod

import typings.nodegit.statusDashOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Status")
@js.native
class Status ()
  extends typings.nodegit.statusMod.Status

/* static members */
@JSImport("nodegit", "Status")
@js.native
object Status extends js.Object {
  def byIndex(statuslist: typings.nodegit.statusDashListMod.StatusList, idx: Double): typings.nodegit.statusDashEntryMod.StatusEntry = js.native
  def file(repo: typings.nodegit.repositoryMod.Repository, path: String): Double = js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def foreachExt(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreachExt(repo: typings.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[Double] = js.native
  def foreachExt(repo: typings.nodegit.repositoryMod.Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  def shouldIgnore(ignored: Double, repo: typings.nodegit.repositoryMod.Repository, path: String): Double = js.native
  type OPT = typings.nodegit.statusMod.Status.OPT
  type SHOW = typings.nodegit.statusMod.Status.SHOW
  type STATUS = typings.nodegit.statusMod.Status.STATUS
}

