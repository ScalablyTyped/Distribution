package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phone extends js.Object {
  var country_code: java.lang.String
  var national_number: java.lang.String
}

object Phone {
  @scala.inline
  def apply(country_code: java.lang.String, national_number: java.lang.String): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("country_code")(country_code)
    __obj.updateDynamic("national_number")(national_number)
    __obj.asInstanceOf[Phone]
  }
}

