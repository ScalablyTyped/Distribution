package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextDescription extends js.Object {
  var context: AnonType
  var description: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var sha: AnonRequired
  var state: AnonEnumRequired
  var target_url: AnonType
}

object AnonContextDescription {
  @scala.inline
  def apply(
    context: AnonType,
    description: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    sha: AnonRequired,
    state: AnonEnumRequired,
    target_url: AnonType
  ): AnonContextDescription = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextDescription]
  }
}

