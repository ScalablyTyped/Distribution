package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPage extends js.Object {
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var run_id: AnonRequired
}

object AnonOwnerPage {
  @scala.inline
  def apply(owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired, run_id: AnonRequired): AnonOwnerPage = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPage]
  }
}

