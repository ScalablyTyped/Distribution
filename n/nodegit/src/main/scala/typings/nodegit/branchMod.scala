package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.commitMod.Commit
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object branchMod {
  
  @JSImport("nodegit/branch", "Branch")
  @js.native
  open class Branch () extends StObject
  /* static members */
  object Branch {
    
    @JSImport("nodegit/branch", "Branch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(repo: Repository, branchName: String, target: Commit, force: Double): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def createFromAnnotated(repository: Repository, branchName: String, commit: AnnotatedCommit, force: Double): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromAnnotated")(repository.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def delete(branch: Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(branch.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isHead(branch: Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isHead")(branch.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def iteratorNew(repo: Repository, listFlags: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], listFlags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def lookup(repo: Repository, branchName: String, branchType: BRANCH): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], branchType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def move(branch: Reference, newBranchName: String, force: Double): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(branch.asInstanceOf[js.Any], newBranchName.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def name(ref: Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def setUpstream(branch: Reference): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpstream")(branch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def setUpstream(branch: Reference, upstreamName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpstream")(branch.asInstanceOf[js.Any], upstreamName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def upstream(branch: Reference): js.Promise[Reference] = ^.asInstanceOf[js.Dynamic].applyDynamic("upstream")(branch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Reference]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
    */
    trait BRANCH extends StObject
    object BRANCH {
      
      inline def ALL: `3` = 3.asInstanceOf[`3`]
      
      inline def LOCAL: `1` = 1.asInstanceOf[`1`]
      
      inline def REMOTE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
