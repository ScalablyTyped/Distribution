package typings.nodegit.mod

import typings.nodegit.cherryPickOptionsMod.CherrypickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Cherrypick")
@js.native
open class Cherrypick ()
  extends typings.nodegit.cherryPickMod.Cherrypick
/* static members */
object Cherrypick {
  
  @JSImport("nodegit", "Cherrypick")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cherrypick a commit and, changing the index and working directory
    */
  inline def cherrypick(repo: typings.nodegit.repositoryMod.Repository, commit: typings.nodegit.commitMod.Commit): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cherrypick")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def cherrypick(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.commitMod.Commit,
    options: CherrypickOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cherrypick")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  /**
    * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
    */
  inline def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    cherrypickCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], cherrypickCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    cherrypickCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], cherrypickCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any], mergeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def initOptions(opts: CherrypickOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
