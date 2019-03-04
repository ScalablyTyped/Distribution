package typings
package nodemailerLib.libMimeDashFuncsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHeaderValue extends HeaderValue {
  @JSName("params")
  var params_ParsedHeaderValue: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object ParsedHeaderValue {
  @scala.inline
  def apply(params: org.scalablytyped.runtime.StringDictionary[java.lang.String], value: java.lang.String): ParsedHeaderValue = {
    val __obj = js.Dynamic.literal(params = params, value = value)
  
    __obj.asInstanceOf[ParsedHeaderValue]
  }
}

