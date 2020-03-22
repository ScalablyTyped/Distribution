package typings.paystack

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName
  extends /* key */ StringDictionary[js.Any] {
  var amount: Double
  var email: String
  var name: String
  var reference: String
}

object AnonName {
  @scala.inline
  def apply(
    amount: Double,
    email: String,
    name: String,
    reference: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonName]
  }
}

