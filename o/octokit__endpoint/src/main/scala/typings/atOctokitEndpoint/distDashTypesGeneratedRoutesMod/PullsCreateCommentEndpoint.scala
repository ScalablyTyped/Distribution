package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentEndpoint extends js.Object {
  var body: String
  var commit_id: String
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var path: String
  var position: Double
  var pull_number: Double
  var repo: String
}

object PullsCreateCommentEndpoint {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    owner: String,
    path: String,
    position: Double,
    pull_number: Double,
    repo: String,
    number: Int | Double = null
  ): PullsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, owner = owner, path = path, position = position, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentEndpoint]
  }
}

