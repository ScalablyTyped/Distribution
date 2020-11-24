package typings.nodegit.mod

import typings.nodegit.applyMod.Apply.LOCATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Apply")
@js.native
class Apply ()
  extends typings.nodegit.applyMod.Apply
/* static members */
@JSImport("nodegit", "Apply")
@js.native
object Apply extends js.Object {
  
  @JSName("apply")
  def apply(
    repo: typings.nodegit.repositoryMod.Repository,
    diff: typings.nodegit.diffMod.Diff,
    location: LOCATION,
    options: typings.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[Double] = js.native
  
  def toTree(
    repo: typings.nodegit.repositoryMod.Repository,
    preimage: typings.nodegit.treeMod.Tree,
    diff: typings.nodegit.diffMod.Diff,
    options: typings.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[typings.nodegit.indexMod.Index] = js.native
}
