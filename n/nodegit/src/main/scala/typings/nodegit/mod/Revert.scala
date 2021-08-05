package typings.nodegit.mod

import typings.nodegit.revertMod.RevertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revert")
@js.native
class Revert ()
  extends typings.nodegit.revertMod.Revert
/* static members */
object Revert {
  
  @JSImport("nodegit", "Revert")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  inline def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    revertCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], revertCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
  inline def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    revertCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], revertCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any], mergeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
  
  inline def revert(repo: typings.nodegit.repositoryMod.Repository, commit: typings.nodegit.commitMod.Commit): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def revert(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.commitMod.Commit,
    givenOpts: RevertOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], givenOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
