package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Branch")
@js.native
class Branch ()
  extends nodegitLib.branchMod.Branch

@JSImport("nodegit", "Branch")
@js.native
object Branch extends js.Object {
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    branchName: java.lang.String,
    target: nodegitLib.commitMod.Commit,
    force: scala.Double
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def createFromAnnotated(
    repository: nodegitLib.repositoryMod.Repository,
    branchName: java.lang.String,
    commit: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    force: scala.Double
  ): nodegitLib.referenceMod.Reference = js.native
  def delete(branch: nodegitLib.referenceMod.Reference): scala.Double = js.native
  def isHead(branch: nodegitLib.referenceMod.Reference): scala.Double = js.native
  def iteratorNew(repo: nodegitLib.repositoryMod.Repository, listFlags: scala.Double): stdLib.Promise[_] = js.native
  def lookup(
    repo: nodegitLib.repositoryMod.Repository,
    branchName: java.lang.String,
    branchType: nodegitLib.branchMod.BranchNs.BRANCH
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def move(branch: nodegitLib.referenceMod.Reference, newBranchName: java.lang.String, force: scala.Double): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def name(ref: nodegitLib.referenceMod.Reference): stdLib.Promise[java.lang.String] = js.native
  def setUpstream(branch: nodegitLib.referenceMod.Reference, upstreamName: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def upstream(branch: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
}

