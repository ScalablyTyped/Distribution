package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnumRequired extends js.Object {
  var enum: js.Array[String]
  var required: Boolean
  var `type`: String
}

object AnonEnumRequired {
  @scala.inline
  def apply(enum: js.Array[String], required: Boolean, `type`: String): AnonEnumRequired = {
    val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumRequired]
  }
}

