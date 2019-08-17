package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phone extends js.Object {
  var country_code: String
  var national_number: String
}

object Phone {
  @scala.inline
  def apply(country_code: String, national_number: String): Phone = {
    val __obj = js.Dynamic.literal(country_code = country_code, national_number = national_number)
  
    __obj.asInstanceOf[Phone]
  }
}

