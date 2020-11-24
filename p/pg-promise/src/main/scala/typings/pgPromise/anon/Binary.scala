package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binary extends js.Object {
  
  var _types: js.Any = js.native
  
  var binary: js.Any = js.native
  
  var text: js.Any = js.native
}
object Binary {
  
  @scala.inline
  def apply(_types: js.Any, binary: js.Any, text: js.Any): Binary = {
    val __obj = js.Dynamic.literal(_types = _types.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
    
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
    def set_types(value: js.Any): Self = this.set("_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinary(value: js.Any): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
