package typings.nodegit

import typings.nodegit.diffPerfDataMod.DiffPerfdata
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/status-list", JSImport.Namespace)
@js.native
object statusListMod extends js.Object {
  
  @js.native
  class StatusList () extends js.Object {
    
    def entrycount(): Double = js.native
    
    def free(): Unit = js.native
    
    def getPerfdata(): js.Promise[DiffPerfdata] = js.native
  }
  /* static members */
  @js.native
  object StatusList extends js.Object {
    
    def create(repo: Repository): js.Promise[StatusList] = js.native
    def create(repo: Repository, opts: StatusOptions): js.Promise[StatusList] = js.native
  }
}
