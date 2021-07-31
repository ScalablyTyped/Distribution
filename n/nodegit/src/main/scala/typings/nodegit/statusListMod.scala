package typings.nodegit

import typings.nodegit.diffPerfDataMod.DiffPerfdata
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusListMod {
  
  @JSImport("nodegit/status-list", "StatusList")
  @js.native
  class StatusList () extends StObject {
    
    def entrycount(): Double = js.native
    
    def free(): Unit = js.native
    
    def getPerfdata(): js.Promise[DiffPerfdata] = js.native
  }
  /* static members */
  object StatusList {
    
    @JSImport("nodegit/status-list", "StatusList")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(repo: Repository): js.Promise[StatusList] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StatusList]]
    @scala.inline
    def create(repo: Repository, opts: StatusOptions): js.Promise[StatusList] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StatusList]]
  }
}
