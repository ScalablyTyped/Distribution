package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair extends js.Object {
  // Name for this key-value pair
  var name: js.UndefOr[String] = js.undefined
  // Value for this key-value pair
  var value: js.UndefOr[String] = js.undefined
}

object KeyValuePair {
  @scala.inline
  def apply(name: String = null, value: String = null): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[KeyValuePair]
  }
}

