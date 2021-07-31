package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("nodegit/annotated-commit", "AnnotatedCommit")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param repo - repository that contains the given commit
      * @param branchName - name of the (remote) branch
      * @param remoteUrl -     url of the remote
      * @param id - the commit object id of the remote branch
      */
    @scala.inline
    def fromFetchhead(repo: Repository, branchName: String, remoteUrl: String, id: Oid): js.Promise[AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetchhead")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], remoteUrl.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotatedCommit]]
    
    @scala.inline
    def fromRef(repo: Repository, ref: Reference): js.Promise[AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRef")(repo.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotatedCommit]]
    
    @scala.inline
    def fromRevspec(repo: Repository, revspec: String): js.Promise[AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRevspec")(repo.asInstanceOf[js.Any], revspec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotatedCommit]]
    
    @scala.inline
    def lookup(repo: Repository, id: Oid): js.Promise[AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotatedCommit]]
  }
}
