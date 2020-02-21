package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssigneeCreator extends js.Object {
  var assignee: AnonType
  var creator: AnonType
  var direction: AnonEnum
  var labels: AnonType
  var mentioned: AnonType
  var milestone: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var since: AnonType
  var sort: AnonEnum
  var state: AnonEnum
}

object AnonAssigneeCreator {
  @scala.inline
  def apply(
    assignee: AnonType,
    creator: AnonType,
    direction: AnonEnum,
    labels: AnonType,
    mentioned: AnonType,
    milestone: AnonType,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    since: AnonType,
    sort: AnonEnum,
    state: AnonEnum
  ): AnonAssigneeCreator = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], mentioned = mentioned.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssigneeCreator]
  }
}

