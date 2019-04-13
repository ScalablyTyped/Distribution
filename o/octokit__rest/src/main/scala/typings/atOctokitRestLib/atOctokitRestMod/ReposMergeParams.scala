package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeParams extends js.Object {
  /**
    * The name of the base branch that the head will be merged into.
    */
  var base: java.lang.String
  /**
    * Commit message to use for the merge commit. If omitted, a default message will be used.
    */
  var commit_message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The head to merge. This can be a branch name or a commit SHA1.
    */
  var head: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposMergeParams {
  @scala.inline
  def apply(
    base: java.lang.String,
    head: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    commit_message: java.lang.String = null
  ): ReposMergeParams = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    __obj.asInstanceOf[ReposMergeParams]
  }
}

