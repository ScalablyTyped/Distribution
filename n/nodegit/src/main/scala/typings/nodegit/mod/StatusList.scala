package typings.nodegit.mod

import typings.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typings.nodegit.statusListMod.StatusList
/* static members */
@JSImport("nodegit", "StatusList")
@js.native
object StatusList extends js.Object {
  
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.statusListMod.StatusList] = js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typings.nodegit.statusListMod.StatusList] = js.native
}
