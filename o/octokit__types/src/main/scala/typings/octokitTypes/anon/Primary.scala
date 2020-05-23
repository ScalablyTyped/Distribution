package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Primary extends js.Object {
  var primary: Boolean
  var `type`: String
  var value: String
}

object Primary {
  @scala.inline
  def apply(primary: Boolean, `type`: String, value: String): Primary = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
}

