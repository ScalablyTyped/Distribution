package typings.nodegit.mod

import typings.nodegit.cherryPickOptionsMod.CherrypickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Cherrypick")
@js.native
class Cherrypick ()
  extends typings.nodegit.cherryPickMod.Cherrypick
/* static members */
object Cherrypick {
  
  /**
    * Cherrypick a commit and, changing the index and working directory
    */
  @JSImport("nodegit", "Cherrypick.cherrypick")
  @js.native
  def cherrypick(repo: typings.nodegit.repositoryMod.Repository, commit: typings.nodegit.commitMod.Commit): js.Promise[Double] = js.native
  @JSImport("nodegit", "Cherrypick.cherrypick")
  @js.native
  def cherrypick(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.commitMod.Commit,
    options: CherrypickOptions
  ): js.Promise[Double] = js.native
  
  /**
    * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
    */
  @JSImport("nodegit", "Cherrypick.commit")
  @js.native
  def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    cherrypickCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Cherrypick.commit")
  @js.native
  def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    cherrypickCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Cherrypick.initOptions")
  @js.native
  def initOptions(opts: CherrypickOptions, version: Double): Double = js.native
}
