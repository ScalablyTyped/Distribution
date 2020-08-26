package typings.openapiRequestCoercer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoercionStrategy extends js.Object {
  var boolean: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
  var integer: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
  var number: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
}

object CoercionStrategy {
  @scala.inline
  def apply(): CoercionStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoercionStrategy]
  }
  @scala.inline
  implicit class CoercionStrategyOps[Self <: CoercionStrategy] (val x: Self) extends AnyVal {
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
    def setBoolean(value: /* input */ js.Any => _): Self = this.set("boolean", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setInteger(value: /* input */ js.Any => _): Self = this.set("integer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    @scala.inline
    def setNumber(value: /* input */ js.Any => _): Self = this.set("number", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
  
}

