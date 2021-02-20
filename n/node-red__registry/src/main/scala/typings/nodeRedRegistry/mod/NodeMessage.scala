package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMessage extends StObject {
  
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
  implicit class NodeMessageMutableBuilder[Self <: NodeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def set_msgid(value: String): Self = StObject.set(x, "_msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_msgidUndefined: Self = StObject.set(x, "_msgid", js.undefined)
  }
}
