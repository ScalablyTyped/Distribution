package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValue extends js.Object {
  var key: String
  var value: js.UndefOr[String] = js.undefined
}

object AnonKeyValue {
  @scala.inline
  def apply(key: String, value: String = null): AnonKeyValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyValue]
  }
}

