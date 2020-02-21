package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlias extends js.Object {
  var alias: String
  var deprecated: Boolean
  var `type`: String
}

object AnonAlias {
  @scala.inline
  def apply(alias: String, deprecated: Boolean, `type`: String): AnonAlias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlias]
  }
}

