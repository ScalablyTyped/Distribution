package typings.nodegit.mod

import typings.nodegit.resetMod.Reset.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reset")
@js.native
open class Reset ()
  extends typings.nodegit.resetMod.Reset
/* static members */
object Reset {
  
  @JSImport("nodegit", "Reset")
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    pathspecs: String
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  /**
    * Look up a refs's commit.
    */
  inline def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    pathspecs: typings.nodegit.strArrayMod.Strarray
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    pathspecs: String
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def default(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    pathspecs: typings.nodegit.strArrayMod.Strarray
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  /**
    * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
    * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
    * See the documentation for reset.
    */
  inline def fromAnnotated(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    resetType: Double,
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAnnotated")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Look up a refs's commit.
    */
  inline def reset(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    resetType: TYPE
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reset(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.commitMod.Commit,
    resetType: TYPE,
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reset(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    resetType: TYPE
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reset(
    repo: typings.nodegit.repositoryMod.Repository,
    target: typings.nodegit.tagMod.Tag,
    resetType: TYPE,
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
