package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowNullRequired extends js.Object {
  var allowNull: Boolean
  var required: Boolean
  var `type`: String
}

object AnonAllowNullRequired {
  @scala.inline
  def apply(allowNull: Boolean, required: Boolean, `type`: String): AnonAllowNullRequired = {
    val __obj = js.Dynamic.literal(allowNull = allowNull.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowNullRequired]
  }
}

