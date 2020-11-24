package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert extends js.Object {
  
  var convert: js.Function = js.native
}
object Convert {
  
  @scala.inline
  def apply(convert: js.Function): Convert = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert]
  }
  
  @scala.inline
  implicit class ConvertOps[Self <: Convert] (val x: Self) extends AnyVal {
    
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
    def setConvert(value: js.Function): Self = this.set("convert", value.asInstanceOf[js.Any])
  }
}
