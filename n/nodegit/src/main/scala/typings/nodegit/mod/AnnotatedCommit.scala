package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends typings.nodegit.annotatedCommitMod.AnnotatedCommit

/* static members */
@JSImport("nodegit", "AnnotatedCommit")
@js.native
object AnnotatedCommit extends js.Object {
  /**
    * @param repo - repository that contains the given commit
    * @param branchName - name of the (remote) branch
    * @param remoteUrl - 	url of the remote
    * @param id - the commit object id of the remote branch
    */
  def fromFetchhead(
    repo: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    remoteUrl: String,
    id: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  def fromRef(repo: typings.nodegit.repositoryMod.Repository, ref: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  def fromRevspec(repo: typings.nodegit.repositoryMod.Repository, revspec: String): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
}

