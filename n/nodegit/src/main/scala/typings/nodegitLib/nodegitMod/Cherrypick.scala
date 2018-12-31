package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cherrypick")
@js.native
class Cherrypick ()
  extends nodegitLib.cherryDashPickMod.Cherrypick

@JSImport("nodegit", "Cherrypick")
@js.native
object Cherrypick extends js.Object {
  /**
    * Cherrypick a commit and, changing the index and working directory
    */
  def cherrypick(repo: nodegitLib.repositoryMod.Repository, commit: nodegitLib.commitMod.Commit): js.Promise[scala.Double] = js.native
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
  def commit(
    repo: nodegitLib.repositoryMod.Repository,
    cherrypickCommit: nodegitLib.commitMod.Commit,
    ourCommit: nodegitLib.commitMod.Commit,
    mainline: scala.Double,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): js.Promise[scala.Double] = js.native
  def initOptions(opts: nodegitLib.cherryDashPickDashOptionsMod.CherrypickOptions, version: scala.Double): scala.Double = js.native
}

