package typings.nodeRedRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMessage extends js.Object {
  
  var _msgid: js.UndefOr[String] = js.native
  
  var payload: js.UndefOr[js.Any] = js.native
}
object NodeMessage {
  
  @scala.inline
  def apply(): NodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeMessage]
  }
  
  @scala.inline
  implicit class NodeMessageOps[Self <: NodeMessage] (val x: Self) extends AnyVal {
    
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
    def set_msgid(value: String): Self = this.set("_msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_msgid: Self = this.set("_msgid", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
