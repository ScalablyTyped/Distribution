package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowNull extends js.Object {
  var allowNull: Boolean
  var `type`: String
}

object AnonAllowNull {
  @scala.inline
  def apply(allowNull: Boolean, `type`: String): AnonAllowNull = {
    val __obj = js.Dynamic.literal(allowNull = allowNull.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowNull]
  }
}

