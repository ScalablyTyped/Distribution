package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reset")
@js.native
class Reset ()
  extends typings.nodegit.resetMod.Reset

/* static members */
@JSImport("nodegit", "Reset")
@js.native
object Reset extends js.Object {
  def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    pathspecs: String
  ): js.Promise[Double] = js.native
  def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = js.native
  /**
    * Look up a refs's commit.
    */
  def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    pathspecs: typings.nodegit.strDashArrayMod.Strarray
  ): js.Promise[Double] = js.native
  def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    pathspecs: String
  ): js.Promise[Double] = js.native
  def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = js.native
  def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    pathspecs: typings.nodegit.strDashArrayMod.Strarray
  ): js.Promise[Double] = js.native
  /**
    * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
    * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
    * See the documentation for reset.
    */
  def fromAnnotated(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    resetType: Double,
    checkoutOpts: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): Double = js.native
  /**
    * Look up a refs's commit.
    */
  def reset(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    resetType: Double,
    checkoutOpts: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Double] = js.native
  def reset(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    resetType: Double,
    checkoutOpts: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Double] = js.native
}

