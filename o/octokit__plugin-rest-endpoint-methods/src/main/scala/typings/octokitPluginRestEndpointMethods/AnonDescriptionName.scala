package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionName extends js.Object {
  var description: AnonType
  var name: AnonRequired
  var owner: AnonType
  var `private`: AnonType
  var template_owner: AnonRequired
  var template_repo: AnonRequired
}

object AnonDescriptionName {
  @scala.inline
  def apply(
    description: AnonType,
    name: AnonRequired,
    owner: AnonType,
    `private`: AnonType,
    template_owner: AnonRequired,
    template_repo: AnonRequired
  ): AnonDescriptionName = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionName]
  }
}

