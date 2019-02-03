package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Status")
@js.native
class Status ()
  extends nodegitLib.statusMod.Status

/* static members */
@JSImport("nodegit", "Status")
@js.native
object Status extends js.Object {
  def byIndex(statuslist: nodegitLib.statusDashListMod.StatusList, idx: scala.Double): nodegitLib.statusDashEntryMod.StatusEntry = js.native
  def file(repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): scala.Double = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository, callback: js.Function): js.Promise[scala.Double] = js.native
  def foreachExt(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Double] = js.native
  def foreachExt(repo: nodegitLib.repositoryMod.Repository, opts: nodegitLib.statusDashOptionsMod.StatusOptions): js.Promise[scala.Double] = js.native
  def foreachExt(
    repo: nodegitLib.repositoryMod.Repository,
    opts: nodegitLib.statusDashOptionsMod.StatusOptions,
    callback: js.Function
  ): js.Promise[scala.Double] = js.native
  def shouldIgnore(ignored: scala.Double, repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): scala.Double = js.native
}

