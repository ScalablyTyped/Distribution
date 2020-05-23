package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* others */ StringDictionary[js.Any] {
  var amount: Double
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object Dictkey {
  @scala.inline
  def apply(
    amount: Double,
    name: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    description: String = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

