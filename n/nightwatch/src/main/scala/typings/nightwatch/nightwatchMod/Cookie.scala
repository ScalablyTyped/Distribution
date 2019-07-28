package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: String
  var name: String
  var path: String
  var secure: Boolean
  var value: String
}

object Cookie {
  @scala.inline
  def apply(domain: String, name: String, path: String, secure: Boolean, value: String): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, name = name, path = path, secure = secure, value = value)
  
    __obj.asInstanceOf[Cookie]
  }
}

