package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentParamsDeprecatedSha extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String
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
    path: String = null,
    position: Int | Double = null
  ): ReposCreateCommitCommentParamsDeprecatedSha = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentParamsDeprecatedSha]
  }
}

