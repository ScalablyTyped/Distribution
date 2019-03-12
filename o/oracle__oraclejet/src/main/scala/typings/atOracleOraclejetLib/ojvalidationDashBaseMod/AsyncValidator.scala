package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator[V] extends js.Object {
  var hint: js.Promise[java.lang.String | scala.Null]
  def validate(value: V): js.Promise[scala.Boolean]
}

object AsyncValidator {
  @scala.inline
  def apply[V](hint: js.Promise[java.lang.String | scala.Null], validate: V => js.Promise[scala.Boolean]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint, validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[AsyncValidator[V]]
  }
}

