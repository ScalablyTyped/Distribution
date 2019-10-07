package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentParams extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String
  var commit_sha: String
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
}

object ReposCreateCommitCommentParams {
  @scala.inline
  def apply(
    body: String,
    commit_sha: String,
    owner: String,
    repo: String,
    path: String = null,
    position: Int | Double = null
  ): ReposCreateCommitCommentParams = {
    val __obj = js.Dynamic.literal(body = body, commit_sha = commit_sha, owner = owner, repo = repo)
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentParams]
  }
}

