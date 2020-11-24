package typings.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeSchemeOption extends js.Object {
  
  var format: String = js.native
  
  var scheme_type: String = js.native
}
object MakeSchemeOption {
  
  @scala.inline
  def apply(format: String, scheme_type: String): MakeSchemeOption = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], scheme_type = scheme_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeSchemeOption]
  }
  
  @scala.inline
  implicit class MakeSchemeOptionOps[Self <: MakeSchemeOption] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme_type(value: String): Self = this.set("scheme_type", value.asInstanceOf[js.Any])
  }
}
