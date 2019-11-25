package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  // Key for the key-value pair.
  var key: js.UndefOr[String] = js.undefined
  // Value for the key-value pair.
  var value: js.UndefOr[String] = js.undefined
}

object KeyValue {
  @scala.inline
  def apply(key: String = null, value: String = null): KeyValue = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue]
  }
}

