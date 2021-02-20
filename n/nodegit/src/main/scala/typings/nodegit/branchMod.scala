package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.commitMod.Commit
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object branchMod {
  
  @JSImport("nodegit/branch", "Branch")
  @js.native
  class Branch () extends StObject
  /* static members */
  object Branch {
    
    @JSImport("nodegit/branch", "Branch.create")
    @js.native
    def create(repo: Repository, branchName: String, target: Commit, force: Double): js.Promise[Reference] = js.native
    
    @JSImport("nodegit/branch", "Branch.createFromAnnotated")
    @js.native
    def createFromAnnotated(repository: Repository, branchName: String, commit: AnnotatedCommit, force: Double): Reference = js.native
    
    @JSImport("nodegit/branch", "Branch.delete")
    @js.native
    def delete(branch: Reference): Double = js.native
    
    @JSImport("nodegit/branch", "Branch.isHead")
    @js.native
    def isHead(branch: Reference): Double = js.native
    
    @JSImport("nodegit/branch", "Branch.iteratorNew")
    @js.native
    def iteratorNew(repo: Repository, listFlags: Double): js.Promise[_] = js.native
    
    @JSImport("nodegit/branch", "Branch.lookup")
    @js.native
    def lookup(repo: Repository, branchName: String, branchType: BRANCH): js.Promise[Reference] = js.native
    
    @JSImport("nodegit/branch", "Branch.move")
    @js.native
    def move(branch: Reference, newBranchName: String, force: Double): js.Promise[Reference] = js.native
    
    @JSImport("nodegit/branch", "Branch.name")
    @js.native
    def name(ref: Reference): js.Promise[String] = js.native
    
    @JSImport("nodegit/branch", "Branch.setUpstream")
    @js.native
    def setUpstream(branch: Reference, upstreamName: String): js.Promise[Double] = js.native
    
    @JSImport("nodegit/branch", "Branch.upstream")
    @js.native
    def upstream(branch: Reference): js.Promise[Reference] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait BRANCH extends StObject
    object BRANCH {
      
      @scala.inline
      def ALL: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def LOCAL: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def REMOTE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
