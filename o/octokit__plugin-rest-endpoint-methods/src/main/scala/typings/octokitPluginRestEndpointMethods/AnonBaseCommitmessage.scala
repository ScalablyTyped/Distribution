package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseCommitmessage extends js.Object {
  var base: AnonRequired
  var commit_message: AnonType
  var head: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBaseCommitmessage {
  @scala.inline
  def apply(
    base: AnonRequired,
    commit_message: AnonType,
    head: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonBaseCommitmessage = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], commit_message = commit_message.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseCommitmessage]
  }
}

