package typings
package nodegitLib.annotatedDashCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/annotated-commit", "AnnotatedCommit")
@js.native
class AnnotatedCommit () extends js.Object {
  def free(): scala.Unit = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
}

@JSImport("nodegit/annotated-commit", "AnnotatedCommit")
@js.native
object AnnotatedCommit extends js.Object {
  /**
       * @param repo - repository that contains the given commit
       * @param branchName - name of the (remote) branch
       * @param remoteUrl - 	url of the remote
       * @param id - the commit object id of the remote branch
       */
  def fromFetchhead(
    repo: nodegitLib.repositoryMod.Repository,
    branchName: java.lang.String,
    remoteUrl: java.lang.String,
    id: nodegitLib.oidMod.Oid
  ): stdLib.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def fromRef(repo: nodegitLib.repositoryMod.Repository, ref: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def fromRevspec(repo: nodegitLib.repositoryMod.Repository, revspec: java.lang.String): stdLib.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
}

