package typings
package nodegitLib.cherryDashPickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cherry-pick", "Cherrypick")
@js.native
class Cherrypick () extends js.Object

@JSImport("nodegit/cherry-pick", "Cherrypick")
@js.native
object Cherrypick extends js.Object {
  /**
       * Cherrypick a commit and, changing the index and working directory
       */
  def cherrypick(repo: nodegitLib.repositoryMod.Repository, commit: nodegitLib.commitMod.Commit): js.Promise[scala.Double] = js.native
  /**
       * Cherrypick a commit and, changing the index and working directory
       */
  def cherrypick(
    repo: nodegitLib.repositoryMod.Repository,
    commit: nodegitLib.commitMod.Commit,
    options: nodegitLib.cherryDashPickDashOptionsMod.CherrypickOptions
  ): js.Promise[scala.Double] = js.native
  /**
       * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
       */
  def commit(
    repo: nodegitLib.repositoryMod.Repository,
    cherrypickCommit: nodegitLib.commitMod.Commit,
    ourCommit: nodegitLib.commitMod.Commit,
    mainline: scala.Double
  ): js.Promise[scala.Double] = js.native
  /**
       * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
       */
  def commit(
    repo: nodegitLib.repositoryMod.Repository,
    cherrypickCommit: nodegitLib.commitMod.Commit,
    ourCommit: nodegitLib.commitMod.Commit,
    mainline: scala.Double,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): js.Promise[scala.Double] = js.native
  def initOptions(opts: nodegitLib.cherryDashPickDashOptionsMod.CherrypickOptions, version: scala.Double): scala.Double = js.native
}

