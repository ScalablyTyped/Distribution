package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimitOwner extends js.Object {
  var limit: AnonEnumRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonLimitOwner {
  @scala.inline
  def apply(limit: AnonEnumRequired, owner: AnonRequired, repo: AnonRequired): AnonLimitOwner = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLimitOwner]
  }
}

