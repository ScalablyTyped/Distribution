package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentEndpoint extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String
  var commit_sha: String
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
}

object ReposCreateCommitCommentEndpoint {
  @scala.inline
  def apply(
    body: String,
    commit_sha: String,
    owner: String,
    repo: String,
    line: js.UndefOr[Double] = js.undefined,
    path: String = null,
    position: js.UndefOr[Double] = js.undefined
  ): ReposCreateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentEndpoint]
  }
}

