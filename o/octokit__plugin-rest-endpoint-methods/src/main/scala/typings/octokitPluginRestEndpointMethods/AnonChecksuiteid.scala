package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecksuiteid extends js.Object {
  var check_suite_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonChecksuiteid {
  @scala.inline
  def apply(check_suite_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonChecksuiteid = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecksuiteid]
  }
}

