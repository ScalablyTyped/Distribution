package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseBody extends js.Object {
  var base: AnonType
  var body: AnonType
  var maintainer_can_modify: AnonType
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
  var state: AnonEnum
  var title: AnonType
}

object AnonBaseBody {
  @scala.inline
  def apply(
    base: AnonType,
    body: AnonType,
    maintainer_can_modify: AnonType,
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    state: AnonEnum,
    title: AnonType
  ): AnonBaseBody = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseBody]
  }
}

