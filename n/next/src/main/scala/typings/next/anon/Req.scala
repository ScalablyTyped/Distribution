package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req extends StObject {
  
  var req: Any
  
  var res: Any
  
  var resBuffers: js.Array[typings.node.bufferMod.global.Buffer]
  
  var streamPromise: js.Promise[Any]
}
object Req {
  
  inline def apply(
    req: Any,
    res: Any,
    resBuffers: js.Array[typings.node.bufferMod.global.Buffer],
    streamPromise: js.Promise[Any]
  ): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], resBuffers = resBuffers.asInstanceOf[js.Any], streamPromise = streamPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  extension [Self <: Req](x: Self) {
    
    inline def setReq(value: Any): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setRes(value: Any): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResBuffers(value: js.Array[typings.node.bufferMod.global.Buffer]): Self = StObject.set(x, "resBuffers", value.asInstanceOf[js.Any])
    
    inline def setResBuffersVarargs(value: typings.node.bufferMod.global.Buffer*): Self = StObject.set(x, "resBuffers", js.Array(value*))
    
    inline def setStreamPromise(value: js.Promise[Any]): Self = StObject.set(x, "streamPromise", value.asInstanceOf[js.Any])
  }
}
