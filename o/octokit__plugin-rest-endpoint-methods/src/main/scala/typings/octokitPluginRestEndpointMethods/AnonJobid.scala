package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJobid extends js.Object {
  var job_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonJobid {
  @scala.inline
  def apply(job_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonJobid = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJobid]
  }
}

