package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActorBranch extends js.Object {
  var actor: AnonType
  var branch: AnonType
  var event: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var status: AnonEnum
  var workflow_id: AnonRequired
}

object AnonActorBranch {
  @scala.inline
  def apply(
    actor: AnonType,
    branch: AnonType,
    event: AnonType,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    status: AnonEnum,
    workflow_id: AnonRequired
  ): AnonActorBranch = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActorBranch]
  }
}

