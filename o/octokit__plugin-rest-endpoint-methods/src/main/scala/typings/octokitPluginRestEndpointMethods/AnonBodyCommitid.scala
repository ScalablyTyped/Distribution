package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommitid extends js.Object {
  var body: AnonRequired
  var commit_id: AnonRequired
  var in_reply_to: AnonDeprecatedDescription
  var line: AnonType
  var number: AnonAlias
  var owner: AnonRequired
  var path: AnonRequired
  var position: AnonType
  var pull_number: AnonRequired
  var repo: AnonRequired
  var side: AnonEnum
  var start_line: AnonType
  var start_side: AnonEnum
}

object AnonBodyCommitid {
  @scala.inline
  def apply(
    body: AnonRequired,
    commit_id: AnonRequired,
    in_reply_to: AnonDeprecatedDescription,
    line: AnonType,
    number: AnonAlias,
    owner: AnonRequired,
    path: AnonRequired,
    position: AnonType,
    pull_number: AnonRequired,
    repo: AnonRequired,
    side: AnonEnum,
    start_line: AnonType,
    start_side: AnonEnum
  ): AnonBodyCommitid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], in_reply_to = in_reply_to.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], start_side = start_side.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyCommitid]
  }
}

