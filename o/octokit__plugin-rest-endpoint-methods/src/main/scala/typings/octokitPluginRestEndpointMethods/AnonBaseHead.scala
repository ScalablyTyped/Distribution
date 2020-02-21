package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseHead extends js.Object {
  var base: AnonRequired
  var head: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBaseHead {
  @scala.inline
  def apply(base: AnonRequired, head: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonBaseHead = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseHead]
  }
}

