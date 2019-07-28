package typings.nodemailer.libMimeDashFuncsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHeaderValue extends HeaderValue {
  @JSName("params")
  var params_ParsedHeaderValue: StringDictionary[String]
}

object ParsedHeaderValue {
  @scala.inline
  def apply(params: StringDictionary[String], value: String): ParsedHeaderValue = {
    val __obj = js.Dynamic.literal(params = params, value = value)
  
    __obj.asInstanceOf[ParsedHeaderValue]
  }
}

