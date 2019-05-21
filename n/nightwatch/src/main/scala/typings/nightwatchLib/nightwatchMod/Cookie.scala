package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: java.lang.String
  var name: java.lang.String
  var path: java.lang.String
  var secure: scala.Boolean
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    secure: scala.Boolean,
    value: java.lang.String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, name = name, path = path, secure = secure, value = value)
  
    __obj.asInstanceOf[Cookie]
  }
}

