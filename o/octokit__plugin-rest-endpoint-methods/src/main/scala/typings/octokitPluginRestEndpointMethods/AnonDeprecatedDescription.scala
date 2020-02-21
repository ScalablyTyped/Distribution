package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecatedDescription extends js.Object {
  var deprecated: Boolean
  var description: String
  var `type`: String
}

object AnonDeprecatedDescription {
  @scala.inline
  def apply(deprecated: Boolean, description: String, `type`: String): AnonDeprecatedDescription = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeprecatedDescription]
  }
}

