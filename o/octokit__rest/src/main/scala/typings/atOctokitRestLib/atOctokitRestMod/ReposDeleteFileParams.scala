package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileParams extends js.Object {
  /**
    * object containing information about the author.
    */
  var author: js.UndefOr[ReposDeleteFileParamsAuthor] = js.undefined
  /**
    * The branch name.
    */
  var branch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * object containing information about the committer.
    */
  var committer: js.UndefOr[ReposDeleteFileParamsCommitter] = js.undefined
  /**
    * The commit message.
    */
  var message: java.lang.String
  var owner: java.lang.String
  var path: java.lang.String
  var repo: java.lang.String
  /**
    * The blob SHA of the file being replaced.
    */
  var sha: java.lang.String
}

object ReposDeleteFileParams {
  @scala.inline
  def apply(
    message: java.lang.String,
    owner: java.lang.String,
    path: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    author: ReposDeleteFileParamsAuthor = null,
    branch: java.lang.String = null,
    committer: ReposDeleteFileParamsCommitter = null
  ): ReposDeleteFileParams = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, path = path, repo = repo, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[ReposDeleteFileParams]
  }
}

