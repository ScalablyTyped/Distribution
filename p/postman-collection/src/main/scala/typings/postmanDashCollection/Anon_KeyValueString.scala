package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueString extends js.Object {
  var key: String
  var value: js.UndefOr[String] = js.undefined
}

object Anon_KeyValueString {
  @scala.inline
  def apply(key: String, value: String = null): Anon_KeyValueString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyValueString]
  }
}

