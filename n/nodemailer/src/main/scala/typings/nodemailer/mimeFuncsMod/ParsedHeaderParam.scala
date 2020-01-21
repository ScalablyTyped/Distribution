package typings.nodemailer.mimeFuncsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHeaderParam extends js.Object {
  var key: String
  var value: String
}

object ParsedHeaderParam {
  @scala.inline
  def apply(key: String, value: String): ParsedHeaderParam = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedHeaderParam]
  }
}

