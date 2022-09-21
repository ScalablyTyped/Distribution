package typings.nodegit.mod

import typings.nodegit.applyMod.Apply.LOCATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Apply")
@js.native
open class Apply ()
  extends typings.nodegit.applyMod.Apply
/* static members */
object Apply {
  
  @JSImport("nodegit", "Apply")
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(
    repo: typings.nodegit.repositoryMod.Repository,
    diff: typings.nodegit.diffMod.Diff,
    location: LOCATION,
    options: typings.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def toTree(
    repo: typings.nodegit.repositoryMod.Repository,
    preimage: typings.nodegit.treeMod.Tree,
    diff: typings.nodegit.diffMod.Diff,
    options: typings.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[typings.nodegit.indexMod.Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTree")(repo.asInstanceOf[js.Any], preimage.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.indexMod.Index]]
}
