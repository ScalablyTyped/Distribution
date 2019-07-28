package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentParamsDeprecatedSha extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String
  /**
    * **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
    */
  var line: js.UndefOr[Double] = js.undefined
  var owner: String
  /**
    * Relative path of the file to comment on.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Line index in the diff to comment on.
    */
  var position: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * @deprecated "sha" parameter renamed to "commit_sha"
    */
  var sha: String
}

object ReposCreateCommitCommentParamsDeprecatedSha {
  @scala.inline
  def apply(
    body: String,
    owner: String,
    repo: String,
    sha: String,
    line: Int | Double = null,
    path: String = null,
    position: Int | Double = null
  ): ReposCreateCommitCommentParamsDeprecatedSha = {
    val __obj = js.Dynamic.literal(body = body, owner = owner, repo = repo, sha = sha)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentParamsDeprecatedSha]
  }
}

