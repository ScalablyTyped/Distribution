package typings.nodemailer.mimeFuncsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedHeaderValue extends HeaderValue {
  
  @JSName("params")
  var params_ParsedHeaderValue: StringDictionary[String] = js.native
}
object ParsedHeaderValue {
  
  @scala.inline
  def apply(params: StringDictionary[String], value: String): ParsedHeaderValue = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHeaderValue]
  }
  
  @scala.inline
  implicit class ParsedHeaderValueOps[Self <: ParsedHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
