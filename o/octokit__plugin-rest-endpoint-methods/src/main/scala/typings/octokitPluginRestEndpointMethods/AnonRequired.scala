package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var required: Boolean
  var `type`: String
}

object AnonRequired {
  @scala.inline
  def apply(required: Boolean, `type`: String): AnonRequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
}

