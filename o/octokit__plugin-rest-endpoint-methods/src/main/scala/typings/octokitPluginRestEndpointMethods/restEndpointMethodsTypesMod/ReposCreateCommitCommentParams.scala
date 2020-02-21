package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentParams]
  }
}

