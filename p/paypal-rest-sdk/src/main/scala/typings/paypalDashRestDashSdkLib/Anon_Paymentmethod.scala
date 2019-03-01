package typings
package paypalDashRestDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Paymentmethod extends js.Object {
  var payment_method: java.lang.String
}

object Anon_Paymentmethod {
  @scala.inline
  def apply(payment_method: java.lang.String): Anon_Paymentmethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("payment_method")(payment_method)
    __obj.asInstanceOf[Anon_Paymentmethod]
  }
}

