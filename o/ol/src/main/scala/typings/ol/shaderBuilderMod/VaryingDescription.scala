package typings.ol.shaderBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaryingDescription extends js.Object {
  var expression: String
  var name: String
  var `type`: String
}

object VaryingDescription {
  @scala.inline
  def apply(expression: String, name: String, `type`: String): VaryingDescription = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaryingDescription]
  }
}

