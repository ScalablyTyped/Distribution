package typings.nodegit.applyMod.Apply

import typings.nodegit.applyOptionsMod.ApplyOptions
import typings.nodegit.diffMod.Diff
import typings.nodegit.indexMod.Index
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/apply", "Apply")
@js.native
object ^ extends js.Object {
  
  @JSName("apply")
  def apply(repo: Repository, diff: Diff, location: LOCATION, options: ApplyOptions): js.Promise[Double] = js.native
  
  def toTree(repo: Repository, preimage: Tree, diff: Diff, options: ApplyOptions): js.Promise[Index] = js.native
}
