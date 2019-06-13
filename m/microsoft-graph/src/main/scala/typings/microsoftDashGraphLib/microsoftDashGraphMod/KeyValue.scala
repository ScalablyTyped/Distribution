package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  /** Key for the key-value pair. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Value for the key-value pair. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object KeyValue {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): KeyValue = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[KeyValue]
  }
}

