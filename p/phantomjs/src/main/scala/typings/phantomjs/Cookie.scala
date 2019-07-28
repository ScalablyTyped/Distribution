package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var name: String
  var value: String
}

object Cookie {
  @scala.inline
  def apply(name: String, value: String, domain: String = null): Cookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[Cookie]
  }
}

