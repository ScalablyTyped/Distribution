package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetMessageHeader extends js.Object {
  // Represents the key in a key-value pair.
  var name: js.UndefOr[java.lang.String] = js.undefined
  // The value in a key-value pair.
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object InternetMessageHeader {
  @scala.inline
  def apply(name: java.lang.String = null, value: java.lang.String = null): InternetMessageHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InternetMessageHeader]
  }
}

