package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberResponse extends js.Object {
  var number: String = js.native
}

object NumberResponse {
  @scala.inline
  def apply(number: String): NumberResponse = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberResponse]
  }
  @scala.inline
  implicit class NumberResponseOps[Self <: NumberResponse] (val x: Self) extends AnyVal {
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
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}

