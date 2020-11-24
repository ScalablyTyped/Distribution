package typings.nodeRedRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMessageInFlow extends NodeMessage {
  
  @JSName("_msgid")
  var _msgid_NodeMessageInFlow: String = js.native
  
  /**
    * If there is a message sequence, then each message in a sequence has the ```parts``` property.
    * More info: https://nodered.org/docs/user-guide/messages#understanding-msgparts
    */
  var parts: js.UndefOr[NodeMessageParts] = js.native
}
object NodeMessageInFlow {
  
  @scala.inline
  def apply(_msgid: String): NodeMessageInFlow = {
    val __obj = js.Dynamic.literal(_msgid = _msgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMessageInFlow]
  }
  
  @scala.inline
  implicit class NodeMessageInFlowOps[Self <: NodeMessageInFlow] (val x: Self) extends AnyVal {
    
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
    def setParts(value: NodeMessageParts): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
  }
}
