package typings.nodegit.mod

import typings.nodegit.revertMod.RevertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revert")
@js.native
class Revert ()
  extends typings.nodegit.revertMod.Revert

/* static members */
@JSImport("nodegit", "Revert")
@js.native
object Revert extends js.Object {
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    revertCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Index] = js.native
  def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    revertCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
  def revert(repo: typings.nodegit.repositoryMod.Repository, commit: typings.nodegit.commitMod.Commit): js.Promise[Double] = js.native
  def revert(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.commitMod.Commit,
    givenOpts: RevertOptions
  ): js.Promise[Double] = js.native
}

