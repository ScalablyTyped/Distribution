package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var currency: java.lang.String
  var value: java.lang.String
}

object Currency {
  @scala.inline
  def apply(currency: java.lang.String, value: java.lang.String): Currency = {
    val __obj = js.Dynamic.literal(currency = currency, value = value)
  
    __obj.asInstanceOf[Currency]
  }
}

