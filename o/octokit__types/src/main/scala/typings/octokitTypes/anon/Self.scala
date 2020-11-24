package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Self extends js.Object {
  
  var html: String = js.native
  
  var self: String = js.native
}
object Self {
  
  @scala.inline
  def apply(html: String, self: String): Self = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Self]
  }
  
  @scala.inline
  implicit class SelfOps[Self_ <: Self] (val x: Self_) extends AnyVal {
    
    @scala.inline
    def duplicate: Self_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self_]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self_ with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self_ with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self_ = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHtml(value: String): Self_ = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: String): Self_ = this.set("self", value.asInstanceOf[js.Any])
  }
}
