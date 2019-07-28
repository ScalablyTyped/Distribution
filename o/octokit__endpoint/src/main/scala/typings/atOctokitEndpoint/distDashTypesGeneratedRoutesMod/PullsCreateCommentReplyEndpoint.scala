package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyEndpoint extends js.Object {
  var body: String
  var in_reply_to: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCreateCommentReplyEndpoint {
  @scala.inline
  def apply(
    body: String,
    in_reply_to: Double,
    owner: String,
    pull_number: Double,
    repo: String,
    number: Int | Double = null
  ): PullsCreateCommentReplyEndpoint = {
    val __obj = js.Dynamic.literal(body = body, in_reply_to = in_reply_to, owner = owner, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentReplyEndpoint]
  }
}

