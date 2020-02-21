package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckrunid extends js.Object {
  var check_run_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonCheckrunid {
  @scala.inline
  def apply(check_run_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonCheckrunid = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckrunid]
  }
}

