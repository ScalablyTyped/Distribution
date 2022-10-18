package typings.pgPromise.mod

import typings.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
trait IEventContext[C /* <: IClient */] extends StObject {
  
  var client: C
  
  var cn: Any
  
  var ctx: ITaskContext
  
  var dc: Any
  
  var params: Any
  
  var query: Any
}
object IEventContext {
  
  inline def apply[C /* <: IClient */](client: C, cn: Any, ctx: ITaskContext, dc: Any, params: Any, query: Any): IEventContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventContext[C]]
  }
  
  extension [Self <: IEventContext[?], C /* <: IClient */](x: Self & IEventContext[C]) {
    
    inline def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCn(value: Any): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: ITaskContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setDc(value: Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
