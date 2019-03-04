package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, domain: java.lang.String = null): Cookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[Cookie]
  }
}

