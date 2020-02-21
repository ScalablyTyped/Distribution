package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnored extends js.Object {
  var ignored: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var subscribed: AnonType
}

object AnonIgnored {
  @scala.inline
  def apply(ignored: AnonType, owner: AnonRequired, repo: AnonRequired, subscribed: AnonType): AnonIgnored = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIgnored]
  }
}

