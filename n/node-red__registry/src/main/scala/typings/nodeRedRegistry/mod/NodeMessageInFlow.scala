package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMessageInFlow
  extends StObject
     with NodeMessage {
  
  @JSName("_msgid")
  var _msgid_NodeMessageInFlow: String
  
  /**
    * If there is a message sequence, then each message in a sequence has the ```parts``` property.
    * More info: https://nodered.org/docs/user-guide/messages#understanding-msgparts
    */
  var parts: js.UndefOr[NodeMessageParts] = js.undefined
}
object NodeMessageInFlow {
  
  @scala.inline
  def apply(_msgid: String): NodeMessageInFlow = {
    val __obj = js.Dynamic.literal(_msgid = _msgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMessageInFlow]
  }
  
  @scala.inline
  implicit class NodeMessageInFlowMutableBuilder[Self <: NodeMessageInFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParts(value: NodeMessageParts): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    @scala.inline
    def set_msgid(value: String): Self = StObject.set(x, "_msgid", value.asInstanceOf[js.Any])
  }
}
