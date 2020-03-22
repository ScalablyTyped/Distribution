package typings.paystack

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmount
  extends /* key */ StringDictionary[js.Any] {
  var amount: Double
  var interval: String
  var name: String
}

object AnonAmount {
  @scala.inline
  def apply(
    amount: Double,
    interval: String,
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AnonAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonAmount]
  }
}

