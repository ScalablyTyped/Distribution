package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileParams extends js.Object {
  /**
    * object containing information about the author.
    */
  var author: js.UndefOr[ReposDeleteFileParamsAuthor] = js.undefined
  /**
    * The branch name. Default: the repository’s default branch (usually `master`)
    */
  var branch: js.UndefOr[String] = js.undefined
  /**
    * object containing information about the committer.
    */
  var committer: js.UndefOr[ReposDeleteFileParamsCommitter] = js.undefined
  /**
    * The commit message.
    */
  var message: String
  var owner: String
  var path: String
  var repo: String
  /**
    * The blob SHA of the file being replaced.
    */
  var sha: String
}

object ReposDeleteFileParams {
  @scala.inline
  def apply(
    message: String,
    owner: String,
    path: String,
    repo: String,
    sha: String,
    author: ReposDeleteFileParamsAuthor = null,
    branch: String = null,
    committer: ReposDeleteFileParamsCommitter = null
  ): ReposDeleteFileParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (committer != null) __obj.updateDynamic("committer")(committer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileParams]
  }
}

