package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Treebuilder")
@js.native
class Treebuilder ()
  extends typings.nodegit.treeBuilderMod.Treebuilder
/* static members */
object Treebuilder {
  
  @JSImport("nodegit", "Treebuilder.create")
  @js.native
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.treeBuilderMod.Treebuilder] = js.native
  @JSImport("nodegit", "Treebuilder.create")
  @js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, source: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.treeBuilderMod.Treebuilder] = js.native
}
