package typings.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.native
  def validate(value: V): Unit = js.native
}

object Validator {
  @scala.inline
  def apply[V](validate: V => Unit): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validator[V]]
  }
  @scala.inline
  implicit class ValidatorOps[Self <: Validator[_], V] (val x: Self with Validator[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidate(value: V => Unit): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHint(value: () => String | Null): Self = this.set("getHint", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHint: Self = this.set("getHint", js.undefined)
  }
  
}

