package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJobidOwner extends js.Object {
  var job_id: AnonRequired
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonJobidOwner {
  @scala.inline
  def apply(job_id: AnonRequired, owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired): AnonJobidOwner = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJobidOwner]
  }
}

