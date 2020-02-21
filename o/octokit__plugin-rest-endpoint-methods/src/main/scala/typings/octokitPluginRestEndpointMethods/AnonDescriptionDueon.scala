package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionDueon extends js.Object {
  var description: AnonType
  var due_on: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var state: AnonEnum
  var title: AnonRequired
}

object AnonDescriptionDueon {
  @scala.inline
  def apply(
    description: AnonType,
    due_on: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnum,
    title: AnonRequired
  ): AnonDescriptionDueon = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescriptionDueon]
  }
}

