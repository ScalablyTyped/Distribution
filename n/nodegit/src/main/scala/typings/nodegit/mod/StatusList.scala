package typings.nodegit.mod

import typings.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typings.nodegit.statusListMod.StatusList
/* static members */
object StatusList {
  
  @JSImport("nodegit", "StatusList.create")
  @js.native
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.statusListMod.StatusList] = js.native
  @JSImport("nodegit", "StatusList.create")
  @js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typings.nodegit.statusListMod.StatusList] = js.native
}
