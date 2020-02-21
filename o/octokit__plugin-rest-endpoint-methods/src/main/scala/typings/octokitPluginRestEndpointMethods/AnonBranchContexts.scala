package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranchContexts extends js.Object {
  var branch: AnonRequired
  var contexts: AnonMapTo
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBranchContexts {
  @scala.inline
  def apply(branch: AnonRequired, contexts: AnonMapTo, owner: AnonRequired, repo: AnonRequired): AnonBranchContexts = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBranchContexts]
  }
}

