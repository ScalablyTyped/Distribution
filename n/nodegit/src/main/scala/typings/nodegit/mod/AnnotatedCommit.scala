package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends typings.nodegit.annotatedCommitMod.AnnotatedCommit
/* static members */
object AnnotatedCommit {
  
  @JSImport("nodegit", "AnnotatedCommit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param repo - repository that contains the given commit
    * @param branchName - name of the (remote) branch
    * @param remoteUrl -     url of the remote
    * @param id - the commit object id of the remote branch
    */
  inline def fromFetchhead(
    repo: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    remoteUrl: String,
    id: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetchhead")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], remoteUrl.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit]]
  
  inline def fromRef(repo: typings.nodegit.repositoryMod.Repository, ref: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRef")(repo.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit]]
  
  inline def fromRevspec(repo: typings.nodegit.repositoryMod.Repository, revspec: String): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRevspec")(repo.asInstanceOf[js.Any], revspec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit]]
  
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit]]
}
