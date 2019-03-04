package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueString extends js.Object {
  var key: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KeyValueString {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String = null): Anon_KeyValueString = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyValueString]
  }
}

