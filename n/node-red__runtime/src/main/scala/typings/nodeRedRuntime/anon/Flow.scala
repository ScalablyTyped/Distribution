package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flow extends StObject {
  
  var flow: js.Object
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object Flow {
  
  inline def apply(flow: js.Object): Flow = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: js.Object): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
