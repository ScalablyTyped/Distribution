package typings.nodegit.mod

import typings.nodegit.branchMod.Branch.BRANCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Branch")
@js.native
class Branch ()
  extends typings.nodegit.branchMod.Branch
/* static members */
object Branch {
  
  @JSImport("nodegit", "Branch")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    target: typings.nodegit.commitMod.Commit,
    force: Double
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  @scala.inline
  def createFromAnnotated(
    repository: typings.nodegit.repositoryMod.Repository,
    branchName: String,
    commit: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    force: Double
  ): typings.nodegit.referenceMod.Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromAnnotated")(repository.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.referenceMod.Reference]
  
  @scala.inline
  def delete(branch: typings.nodegit.referenceMod.Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(branch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isHead(branch: typings.nodegit.referenceMod.Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isHead")(branch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def iteratorNew(repo: typings.nodegit.repositoryMod.Repository, listFlags: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], listFlags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, branchName: String, branchType: BRANCH): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], branchType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  @scala.inline
  def move(branch: typings.nodegit.referenceMod.Reference, newBranchName: String, force: Double): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(branch.asInstanceOf[js.Any], newBranchName.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  @scala.inline
  def name(ref: typings.nodegit.referenceMod.Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def setUpstream(branch: typings.nodegit.referenceMod.Reference, upstreamName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpstream")(branch.asInstanceOf[js.Any], upstreamName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def upstream(branch: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = ^.asInstanceOf[js.Dynamic].applyDynamic("upstream")(branch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
}
