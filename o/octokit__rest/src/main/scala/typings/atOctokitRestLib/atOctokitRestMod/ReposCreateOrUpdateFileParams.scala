package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileParams extends js.Object {
  /**
    * The author of the file.
    */
  var author: js.UndefOr[ReposCreateOrUpdateFileParamsAuthor] = js.undefined
  /**
    * The branch name.
    */
  var branch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The person that committed the file.
    */
  var committer: js.UndefOr[ReposCreateOrUpdateFileParamsCommitter] = js.undefined
  /**
    * The new file content, using Base64 encoding.
    */
  var content: java.lang.String
  /**
    * The commit message.
    */
  var message: java.lang.String
  var owner: java.lang.String
  var path: java.lang.String
  var repo: java.lang.String
  /**
    * **Required if you are updating a file**. The blob SHA of the file being replaced.
    */
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateOrUpdateFileParams {
  @scala.inline
  def apply(
    content: java.lang.String,
    message: java.lang.String,
    owner: java.lang.String,
    path: java.lang.String,
    repo: java.lang.String,
    author: ReposCreateOrUpdateFileParamsAuthor = null,
    branch: java.lang.String = null,
    committer: ReposCreateOrUpdateFileParamsCommitter = null,
    sha: java.lang.String = null
  ): ReposCreateOrUpdateFileParams = {
    val __obj = js.Dynamic.literal(content = content, message = message, owner = owner, path = path, repo = repo)
    if (author != null) __obj.updateDynamic("author")(author)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposCreateOrUpdateFileParams]
  }
}

