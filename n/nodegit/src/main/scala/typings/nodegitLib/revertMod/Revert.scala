package typings
package nodegitLib.revertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/revert", "Revert")
@js.native
class Revert () extends js.Object

/* static members */
@JSImport("nodegit/revert", "Revert")
@js.native
object Revert extends js.Object {
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  def commit(
    repo: nodegitLib.repositoryMod.Repository,
    revertCommit: nodegitLib.commitMod.Commit,
    ourCommit: nodegitLib.commitMod.Commit,
    mainline: scala.Double
  ): js.Promise[nodegitLib.nodegitMod.Index] = js.native
  def commit(
    repo: nodegitLib.repositoryMod.Repository,
    revertCommit: nodegitLib.commitMod.Commit,
    ourCommit: nodegitLib.commitMod.Commit,
    mainline: scala.Double,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): js.Promise[nodegitLib.nodegitMod.Index] = js.native
  def revert(repo: nodegitLib.repositoryMod.Repository, commit: nodegitLib.commitMod.Commit): js.Promise[scala.Double] = js.native
  def revert(
    repo: nodegitLib.repositoryMod.Repository,
    commit: nodegitLib.commitMod.Commit,
    givenOpts: nodegitLib.revertMod.RevertOptions
  ): js.Promise[scala.Double] = js.native
}

