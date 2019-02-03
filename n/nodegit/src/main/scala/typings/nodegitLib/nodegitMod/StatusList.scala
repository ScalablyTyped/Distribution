package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends nodegitLib.statusDashListMod.StatusList

/* static members */
@JSImport("nodegit", "StatusList")
@js.native
object StatusList extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.statusDashListMod.StatusList] = js.native
  def create(repo: nodegitLib.repositoryMod.Repository, opts: nodegitLib.statusDashOptionsMod.StatusOptions): js.Promise[nodegitLib.statusDashListMod.StatusList] = js.native
}

