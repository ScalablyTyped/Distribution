package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object Anon_KeyValue {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): Anon_KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyValue]
  }
}

