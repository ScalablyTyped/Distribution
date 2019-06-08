package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentParams extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: java.lang.String
  var commit_sha: java.lang.String
  /**
    * **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
    */
  var line: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  /**
    * Relative path of the file to comment on.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Line index in the diff to comment on.
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ReposCreateCommitCommentParams {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_sha: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    line: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    position: scala.Int | scala.Double = null
  ): ReposCreateCommitCommentParams = {
    val __obj = js.Dynamic.literal(body = body, commit_sha = commit_sha, owner = owner, repo = repo)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentParams]
  }
}

