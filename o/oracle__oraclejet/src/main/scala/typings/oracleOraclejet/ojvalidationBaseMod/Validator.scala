package typings.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  def validate(value: V): Unit
}

object Validator {
  @scala.inline
  def apply[V](validate: V => Unit, getHint: () => String | Null = null): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    if (getHint != null) __obj.updateDynamic("getHint")(js.Any.fromFunction0(getHint))
    __obj.asInstanceOf[Validator[V]]
  }
}

