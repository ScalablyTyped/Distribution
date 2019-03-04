package typings
package nodemailerLib.libMimeDashFuncsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHeaderParam extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object ParsedHeaderParam {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): ParsedHeaderParam = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[ParsedHeaderParam]
  }
}

