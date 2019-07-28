package typings.pegjs.pegjsMod

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
    val __obj = js.Dynamic.literal(description = description)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExpectedItem]
  }
}

