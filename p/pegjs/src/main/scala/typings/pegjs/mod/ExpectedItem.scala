package typings.pegjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectedItem extends js.Object {
  var description: String
  var `type`: String
  var value: js.UndefOr[String] = js.undefined
}

object ExpectedItem {
  @scala.inline
  def apply(description: String, `type`: String, value: String = null): ExpectedItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedItem]
  }
}

