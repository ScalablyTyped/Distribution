package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileParams extends js.Object {
  /**
    * The author of the file.
    */
  var author: js.UndefOr[ReposUpdateFileParamsAuthor] = js.undefined
  /**
    * The branch name.
    */
  var branch: js.UndefOr[String] = js.undefined
  /**
    * The person that committed the file.
    */
  var committer: js.UndefOr[ReposUpdateFileParamsCommitter] = js.undefined
  /**
    * The new file content, using Base64 encoding.
    */
  var content: String
  /**
    * The commit message.
    */
  var message: String
  var owner: String
  var path: String
  var repo: String
  /**
    * **Required if you are updating a file**. The blob SHA of the file being replaced.
    */
  var sha: js.UndefOr[String] = js.undefined
}

object ReposUpdateFileParams {
  @scala.inline
  def apply(
    content: String,
    message: String,
    owner: String,
    path: String,
    repo: String,
    author: ReposUpdateFileParamsAuthor = null,
    branch: String = null,
    committer: ReposUpdateFileParamsCommitter = null,
    sha: String = null
  ): ReposUpdateFileParams = {
    val __obj = js.Dynamic.literal(content = content, message = message, owner = owner, path = path, repo = repo)
    if (author != null) __obj.updateDynamic("author")(author)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposUpdateFileParams]
  }
}

