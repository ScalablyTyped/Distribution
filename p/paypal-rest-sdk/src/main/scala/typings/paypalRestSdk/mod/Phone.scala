package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phone extends js.Object {
  var country_code: String = js.native
  var national_number: String = js.native
}

object Phone {
  @scala.inline
  def apply(country_code: String, national_number: String): Phone = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  @scala.inline
  implicit class PhoneOps[Self <: Phone] (val x: Self) extends AnyVal {
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
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setNational_number(value: String): Self = this.set("national_number", value.asInstanceOf[js.Any])
  }
  
}

