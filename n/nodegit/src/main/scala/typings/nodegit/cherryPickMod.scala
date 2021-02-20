package typings.nodegit

import typings.nodegit.cherryPickOptionsMod.CherrypickOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.mergeOptionsMod.MergeOptions
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cherryPickMod {
  
  @JSImport("nodegit/cherry-pick", "Cherrypick")
  @js.native
  class Cherrypick () extends StObject
  /* static members */
  object Cherrypick {
    
    /**
      * Cherrypick a commit and, changing the index and working directory
      */
    @JSImport("nodegit/cherry-pick", "Cherrypick.cherrypick")
    @js.native
    def cherrypick(repo: Repository, commit: Commit): js.Promise[Double] = js.native
    @JSImport("nodegit/cherry-pick", "Cherrypick.cherrypick")
    @js.native
    def cherrypick(repo: Repository, commit: Commit, options: CherrypickOptions): js.Promise[Double] = js.native
    
    /**
      * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
      */
    @JSImport("nodegit/cherry-pick", "Cherrypick.commit")
    @js.native
    def commit(repo: Repository, cherrypickCommit: Commit, ourCommit: Commit, mainline: Double): js.Promise[Double] = js.native
    @JSImport("nodegit/cherry-pick", "Cherrypick.commit")
    @js.native
    def commit(
      repo: Repository,
      cherrypickCommit: Commit,
      ourCommit: Commit,
      mainline: Double,
      mergeOptions: MergeOptions
    ): js.Promise[Double] = js.native
    
    @JSImport("nodegit/cherry-pick", "Cherrypick.initOptions")
    @js.native
    def initOptions(opts: CherrypickOptions, version: Double): Double = js.native
  }
}
