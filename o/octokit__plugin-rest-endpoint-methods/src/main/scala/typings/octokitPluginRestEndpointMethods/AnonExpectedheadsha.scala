package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpectedheadsha extends js.Object {
  var expected_head_sha: AnonType
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
}

object AnonExpectedheadsha {
  @scala.inline
  def apply(expected_head_sha: AnonType, owner: AnonRequired, pull_number: AnonRequired, repo: AnonRequired): AnonExpectedheadsha = {
    val __obj = js.Dynamic.literal(expected_head_sha = expected_head_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpectedheadsha]
  }
}

