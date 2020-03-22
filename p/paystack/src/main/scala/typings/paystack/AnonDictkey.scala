package typings.paystack

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var amount: Double
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object AnonDictkey {
  @scala.inline
  def apply(
    amount: Double,
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    description: String = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

