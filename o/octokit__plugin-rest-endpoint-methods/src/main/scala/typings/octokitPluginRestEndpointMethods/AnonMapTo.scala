package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMapTo extends js.Object {
  var mapTo: String
  var required: Boolean
  var `type`: String
}

object AnonMapTo {
  @scala.inline
  def apply(mapTo: String, required: Boolean, `type`: String): AnonMapTo = {
    val __obj = js.Dynamic.literal(mapTo = mapTo.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMapTo]
  }
}

