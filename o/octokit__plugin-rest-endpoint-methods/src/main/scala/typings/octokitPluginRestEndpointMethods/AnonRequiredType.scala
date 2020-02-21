package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequiredType extends js.Object {
  var required: Boolean
  var `type`: String
  var validation: String
}

object AnonRequiredType {
  @scala.inline
  def apply(required: Boolean, `type`: String, validation: String): AnonRequiredType = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequiredType]
  }
}

