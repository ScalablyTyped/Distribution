package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount
  extends /* others */ StringDictionary[js.Any] {
  var amount: Double
  var interval: String
  var name: String
}

object Amount {
  @scala.inline
  def apply(
    amount: Double,
    interval: String,
    name: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Amount]
  }
}

