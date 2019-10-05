package typings.nodegit.resetMod.Reset

import typings.nodegit.annotatedDashCommitMod.AnnotatedCommit
import typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strDashArrayMod.Strarray
import typings.nodegit.tagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/reset", "Reset")
@js.native
object ^ extends js.Object {
  def default(repo: Repository, target: Commit, pathspecs: String): js.Promise[Double] = js.native
  def default(repo: Repository, target: Commit, pathspecs: js.Array[String]): js.Promise[Double] = js.native
  /**
    * Look up a refs's commit.
    */
  def default(repo: Repository, target: Commit, pathspecs: Strarray): js.Promise[Double] = js.native
  def default(repo: Repository, target: Tag, pathspecs: String): js.Promise[Double] = js.native
  def default(repo: Repository, target: Tag, pathspecs: js.Array[String]): js.Promise[Double] = js.native
  def default(repo: Repository, target: Tag, pathspecs: Strarray): js.Promise[Double] = js.native
  /**
    * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
    * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
    * See the documentation for reset.
    */
  def fromAnnotated(repo: Repository, commit: AnnotatedCommit, resetType: Double, checkoutOpts: CheckoutOptions): Double = js.native
  /**
    * Look up a refs's commit.
    */
  def reset(repo: Repository, target: Commit, resetType: Double, checkoutOpts: CheckoutOptions): js.Promise[Double] = js.native
  def reset(repo: Repository, target: Tag, resetType: Double, checkoutOpts: CheckoutOptions): js.Promise[Double] = js.native
}

