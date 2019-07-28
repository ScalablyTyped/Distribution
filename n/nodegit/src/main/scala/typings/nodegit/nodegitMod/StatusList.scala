package typings.nodegit.nodegitMod

import typings.nodegit.statusDashOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typings.nodegit.statusDashListMod.StatusList

/* static members */
@JSImport("nodegit", "StatusList")
@js.native
object StatusList extends js.Object {
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.statusDashListMod.StatusList] = js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typings.nodegit.statusDashListMod.StatusList] = js.native
}

