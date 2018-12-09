package typings
package nodegitLib.statusDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status-list", "StatusList")
@js.native
class StatusList () extends js.Object {
  def entrycount(): scala.Double = js.native
  def free(): scala.Unit = js.native
  def getPerfdata(): js.Promise[nodegitLib.diffDashPerfDashDataMod.DiffPerfdata] = js.native
}

@JSImport("nodegit/status-list", "StatusList")
@js.native
object StatusList extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.statusDashListMod.StatusList] = js.native
  def create(repo: nodegitLib.repositoryMod.Repository, opts: nodegitLib.statusDashOptionsMod.StatusOptions): js.Promise[nodegitLib.statusDashListMod.StatusList] = js.native
}

