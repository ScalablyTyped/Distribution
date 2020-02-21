package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileParams extends js.Object {
  /**
    * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
    */
  var author: js.UndefOr[ReposCreateOrUpdateFileParamsAuthor] = js.undefined
  /**
    * The branch name. Default: the repository’s default branch (usually `master`)
    */
  var branch: js.UndefOr[String] = js.undefined
  /**
    * The person that committed the file. Default: the authenticated user.
    */
  var committer: js.UndefOr[ReposCreateOrUpdateFileParamsCommitter] = js.undefined
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

object ReposCreateOrUpdateFileParams {
  @scala.inline
  def apply(
    content: String,
    message: String,
    owner: String,
    path: String,
    repo: String,
    author: ReposCreateOrUpdateFileParamsAuthor = null,
    branch: String = null,
    committer: ReposCreateOrUpdateFileParamsCommitter = null,
    sha: String = null
  ): ReposCreateOrUpdateFileParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (committer != null) __obj.updateDynamic("committer")(committer.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileParams]
  }
}

