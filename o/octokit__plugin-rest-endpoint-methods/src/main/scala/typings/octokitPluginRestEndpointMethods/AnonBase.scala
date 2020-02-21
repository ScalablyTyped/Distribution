package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: AnonRequired
  var body: AnonType
  var draft: AnonType
  var head: AnonRequired
  var maintainer_can_modify: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var title: AnonRequired
}

object AnonBase {
  @scala.inline
  def apply(
    base: AnonRequired,
    body: AnonType,
    draft: AnonType,
    head: AnonRequired,
    maintainer_can_modify: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    title: AnonRequired
  ): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase]
  }
}

