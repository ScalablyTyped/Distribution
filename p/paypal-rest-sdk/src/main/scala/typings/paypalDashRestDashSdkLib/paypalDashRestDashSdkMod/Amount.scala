package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var currency: java.lang.String
  var details: js.UndefOr[paypalDashRestDashSdkLib.Anon_Giftwrap] = js.undefined
  var total: java.lang.String
}

object Amount {
  @scala.inline
  def apply(
    currency: java.lang.String,
    total: java.lang.String,
    details: paypalDashRestDashSdkLib.Anon_Giftwrap = null
  ): Amount = {
    val __obj = js.Dynamic.literal(currency = currency, total = total)
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[Amount]
  }
}

