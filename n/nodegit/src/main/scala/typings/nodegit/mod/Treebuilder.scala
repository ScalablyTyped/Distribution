package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Treebuilder")
@js.native
class Treebuilder ()
  extends typings.nodegit.treeBuilderMod.Treebuilder
/* static members */
@JSImport("nodegit", "Treebuilder")
@js.native
object Treebuilder extends js.Object {
  
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.treeBuilderMod.Treebuilder] = js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, source: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.treeBuilderMod.Treebuilder] = js.native
}
