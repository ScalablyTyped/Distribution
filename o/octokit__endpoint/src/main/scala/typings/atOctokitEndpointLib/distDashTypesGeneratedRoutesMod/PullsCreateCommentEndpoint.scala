package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentEndpoint extends js.Object {
  var body: java.lang.String
  var commit_id: java.lang.String
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var path: java.lang.String
  var position: scala.Double
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsCreateCommentEndpoint {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_id: java.lang.String,
    owner: java.lang.String,
    path: java.lang.String,
    position: scala.Double,
    pull_number: scala.Double,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): PullsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, owner = owner, path = path, position = position, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentEndpoint]
  }
}

