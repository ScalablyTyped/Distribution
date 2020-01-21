package typings.nodegit.mod

import typings.nodegit.branchMod.Branch.BRANCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Branch")
@js.native
class Branch ()
  extends typings.nodegit.branchMod.Branch

/* static members */
@JSImport("nodegit", "Branch")
@js.native
object Branch extends js.Object {
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    target: typings.nodegit.commitMod.Commit,
    force: Double
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def createFromAnnotated(
    repository: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    commit: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    force: Double
  ): typings.nodegit.referenceMod.Reference = js.native
  def delete(branch: typings.nodegit.referenceMod.Reference): Double = js.native
  def isHead(branch: typings.nodegit.referenceMod.Reference): Double = js.native
  def iteratorNew(repo: typings.nodegit.repositoryMod.Repository, listFlags: Double): js.Promise[_] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, branchName: String, branchType: BRANCH): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def move(branch: typings.nodegit.referenceMod.Reference, newBranchName: String, force: Double): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def name(ref: typings.nodegit.referenceMod.Reference): js.Promise[String] = js.native
  def setUpstream(branch: typings.nodegit.referenceMod.Reference, upstreamName: String): js.Promise[Double] = js.native
  def upstream(branch: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
}

