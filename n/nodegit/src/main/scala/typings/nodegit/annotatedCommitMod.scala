package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annotatedCommitMod {
  
  @JSImport("nodegit/annotated-commit", "AnnotatedCommit")
  @js.native
  class AnnotatedCommit () extends StObject {
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
  }
  /* static members */
  object AnnotatedCommit {
    
    /**
      * @param repo - repository that contains the given commit
      * @param branchName - name of the (remote) branch
      * @param remoteUrl -     url of the remote
      * @param id - the commit object id of the remote branch
      */
    @JSImport("nodegit/annotated-commit", "AnnotatedCommit.fromFetchhead")
    @js.native
    def fromFetchhead(repo: Repository, branchName: String, remoteUrl: String, id: Oid): js.Promise[AnnotatedCommit] = js.native
    
    @JSImport("nodegit/annotated-commit", "AnnotatedCommit.fromRef")
    @js.native
    def fromRef(repo: Repository, ref: Reference): js.Promise[AnnotatedCommit] = js.native
    
    @JSImport("nodegit/annotated-commit", "AnnotatedCommit.fromRevspec")
    @js.native
    def fromRevspec(repo: Repository, revspec: String): js.Promise[AnnotatedCommit] = js.native
    
    @JSImport("nodegit/annotated-commit", "AnnotatedCommit.lookup")
    @js.native
    def lookup(repo: Repository, id: Oid): js.Promise[AnnotatedCommit] = js.native
  }
}
