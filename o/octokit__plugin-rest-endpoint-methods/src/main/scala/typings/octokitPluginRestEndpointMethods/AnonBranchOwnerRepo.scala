package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranchOwnerRepo extends js.Object {
  var branch: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var users: AnonMapTo
}

object AnonBranchOwnerRepo {
  @scala.inline
  def apply(branch: AnonRequired, owner: AnonRequired, repo: AnonRequired, users: AnonMapTo): AnonBranchOwnerRepo = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBranchOwnerRepo]
  }
}

