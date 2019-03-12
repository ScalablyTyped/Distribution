package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[java.lang.String | scala.Null]] = js.undefined
  def validate(value: V): scala.Unit
}

object Validator {
  @scala.inline
  def apply[V](validate: V => scala.Unit, getHint: () => java.lang.String | scala.Null = null): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    if (getHint != null) __obj.updateDynamic("getHint")(js.Any.fromFunction0(getHint))
    __obj.asInstanceOf[Validator[V]]
  }
}

