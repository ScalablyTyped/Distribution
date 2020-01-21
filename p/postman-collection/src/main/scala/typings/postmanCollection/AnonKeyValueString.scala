package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValueString extends js.Object {
  var key: String
  var value: js.UndefOr[String] = js.undefined
}

object AnonKeyValueString {
  @scala.inline
  def apply(key: String, value: String = null): AnonKeyValueString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyValueString]
  }
}

