package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends nodegitLib.annotatedDashCommitMod.AnnotatedCommit

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
    repo: nodegitLib.repositoryMod.Repository,
    branchName: java.lang.String,
    remoteUrl: java.lang.String,
    id: nodegitLib.oidMod.Oid
  ): js.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def fromRef(repo: nodegitLib.repositoryMod.Repository, ref: nodegitLib.referenceMod.Reference): js.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def fromRevspec(repo: nodegitLib.repositoryMod.Repository, revspec: java.lang.String): js.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.annotatedDashCommitMod.AnnotatedCommit] = js.native
}

