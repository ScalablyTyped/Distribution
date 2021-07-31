package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowId extends StObject {
  
  var flow: js.Object
  
  var id: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object FlowId {
  
  @scala.inline
  def apply(flow: js.Object, id: String): FlowId = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowId]
  }
  
  @scala.inline
  implicit class FlowIdMutableBuilder[Self <: FlowId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: js.Object): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
