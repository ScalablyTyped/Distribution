package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends typings.nodegit.annotatedCommitMod.AnnotatedCommit
/* static members */
object AnnotatedCommit {
  
  /**
    * @param repo - repository that contains the given commit
    * @param branchName - name of the (remote) branch
    * @param remoteUrl -     url of the remote
    * @param id - the commit object id of the remote branch
    */
  @JSImport("nodegit", "AnnotatedCommit.fromFetchhead")
  @js.native
  def fromFetchhead(
    repo: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    remoteUrl: String,
    id: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  
  @JSImport("nodegit", "AnnotatedCommit.fromRef")
  @js.native
  def fromRef(repo: typings.nodegit.repositoryMod.Repository, ref: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  
  @JSImport("nodegit", "AnnotatedCommit.fromRevspec")
  @js.native
  def fromRevspec(repo: typings.nodegit.repositoryMod.Repository, revspec: String): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  
  @JSImport("nodegit", "AnnotatedCommit.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
}
