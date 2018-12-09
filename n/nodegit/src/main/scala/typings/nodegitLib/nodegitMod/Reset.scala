package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reset")
@js.native
class Reset ()
  extends nodegitLib.resetMod.Reset

@JSImport("nodegit", "Reset")
@js.native
object Reset extends js.Object {
  /**
       * Look up a refs's commit.
       */
  def default(
    repo: nodegitLib.repositoryMod.Repository,
    target: nodegitLib.objectMod.Object,
    pathspecs: java.lang.String
  ): js.Promise[scala.Double] = js.native
  /**
       * Look up a refs's commit.
       */
  def default(
    repo: nodegitLib.repositoryMod.Repository,
    target: nodegitLib.objectMod.Object,
    pathspecs: js.Array[java.lang.String]
  ): js.Promise[scala.Double] = js.native
  /**
       * Look up a refs's commit.
       */
  def default(
    repo: nodegitLib.repositoryMod.Repository,
    target: nodegitLib.objectMod.Object,
    pathspecs: nodegitLib.strDashArrayMod.Strarray
  ): js.Promise[scala.Double] = js.native
  /**
       * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
       * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
       * See the documentation for reset.
       */
  def fromAnnotated(
    repo: nodegitLib.repositoryMod.Repository,
    commit: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    resetType: scala.Double,
    checkoutOpts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): scala.Double = js.native
  /**
       * Look up a refs's commit.
       */
  def reset(
    repo: nodegitLib.repositoryMod.Repository,
    target: nodegitLib.objectMod.Object,
    resetType: scala.Double,
    checkoutOpts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Double] = js.native
}

