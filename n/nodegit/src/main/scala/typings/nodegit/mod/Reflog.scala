package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reflog")
@js.native
class Reflog ()
  extends typings.nodegit.refLogMod.Reflog
/* static members */
@JSImport("nodegit", "Reflog")
@js.native
object Reflog extends js.Object {
  
  def delete(repo: typings.nodegit.repositoryMod.Repository, name: String): Double = js.native
  
  def read(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.refLogMod.Reflog] = js.native
  
  def rename(repo: typings.nodegit.repositoryMod.Repository, oldName: String, name: String): Double = js.native
}
