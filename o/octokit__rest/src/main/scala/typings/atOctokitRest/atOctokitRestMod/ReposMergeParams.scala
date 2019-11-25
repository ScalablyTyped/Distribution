package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeParams extends js.Object {
  /**
    * The name of the base branch that the head will be merged into.
    */
  var base: String
  /**
    * Commit message to use for the merge commit. If omitted, a default message will be used.
    */
  var commit_message: js.UndefOr[String] = js.undefined
  /**
    * The head to merge. This can be a branch name or a commit SHA1.
    */
  var head: String
  var owner: String
  var repo: String
}

object ReposMergeParams {
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String, commit_message: String = null): ReposMergeParams = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeParams]
  }
}

