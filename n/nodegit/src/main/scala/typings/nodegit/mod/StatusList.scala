package typings.nodegit.mod

import typings.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typings.nodegit.statusListMod.StatusList
/* static members */
object StatusList {
  
  @JSImport("nodegit", "StatusList")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.statusListMod.StatusList] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.statusListMod.StatusList]]
  @scala.inline
  def create(repo: typings.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typings.nodegit.statusListMod.StatusList] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.statusListMod.StatusList]]
}
