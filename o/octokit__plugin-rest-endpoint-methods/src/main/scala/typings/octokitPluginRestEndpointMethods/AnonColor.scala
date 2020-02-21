package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: AnonRequired
  var description: AnonType
  var name: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonColor {
  @scala.inline
  def apply(
    color: AnonRequired,
    description: AnonType,
    name: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

