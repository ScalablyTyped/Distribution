package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name
  extends /* others */ StringDictionary[js.Any] {
  var amount: Double
  var email: String
  var name: String
  var reference: String
}

object Name {
  @scala.inline
  def apply(
    amount: Double,
    email: String,
    name: String,
    reference: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Name = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Name]
  }
}

