package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranchContextsOwner extends js.Object {
  var branch: AnonRequired
  var contexts: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var strict: AnonType
}

object AnonBranchContextsOwner {
  @scala.inline
  def apply(
    branch: AnonRequired,
    contexts: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    strict: AnonType
  ): AnonBranchContextsOwner = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBranchContextsOwner]
  }
}

