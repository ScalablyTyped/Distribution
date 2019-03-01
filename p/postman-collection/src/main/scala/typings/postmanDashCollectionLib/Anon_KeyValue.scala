package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue extends js.Object {
  var key: java.lang.String
  var value: java.lang.String | scala.Boolean
}

object Anon_KeyValue {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String | scala.Boolean): Anon_KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyValue]
  }
}

