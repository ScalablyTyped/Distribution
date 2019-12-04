package typings.atOracleOraclejet.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator[V] extends js.Object {
  var hint: js.Promise[String | Null]
  def validate(value: V): js.Promise[Boolean]
}

object AsyncValidator {
  @scala.inline
  def apply[V](hint: js.Promise[String | Null], validate: V => js.Promise[Boolean]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[AsyncValidator[V]]
  }
}

