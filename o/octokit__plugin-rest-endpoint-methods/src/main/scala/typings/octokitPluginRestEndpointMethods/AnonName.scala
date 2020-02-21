package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonName {
  @scala.inline
  def apply(name: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

