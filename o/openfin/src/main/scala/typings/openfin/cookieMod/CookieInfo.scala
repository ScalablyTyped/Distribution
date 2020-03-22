package typings.openfin.cookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieInfo extends js.Object {
  var domain: String
  var name: String
  var path: String
}

object CookieInfo {
  @scala.inline
  def apply(domain: String, name: String, path: String): CookieInfo = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookieInfo]
  }
}

