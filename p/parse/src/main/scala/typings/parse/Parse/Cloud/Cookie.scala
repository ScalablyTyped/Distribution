package typings.parse.Parse.Cloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[CookieOptions] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Cookie {
  @scala.inline
  def apply(name: String = null, options: CookieOptions = null, value: String = null): Cookie = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Cookie]
  }
}

