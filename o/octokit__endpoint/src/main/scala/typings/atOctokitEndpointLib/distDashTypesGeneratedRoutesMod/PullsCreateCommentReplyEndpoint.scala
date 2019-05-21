package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyEndpoint extends js.Object {
  var body: java.lang.String
  var in_reply_to: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsCreateCommentReplyEndpoint {
  @scala.inline
  def apply(
    body: java.lang.String,
    in_reply_to: scala.Double,
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): PullsCreateCommentReplyEndpoint = {
    val __obj = js.Dynamic.literal(body = body, in_reply_to = in_reply_to, owner = owner, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentReplyEndpoint]
  }
}

