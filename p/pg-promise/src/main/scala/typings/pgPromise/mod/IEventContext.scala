package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
trait IEventContext[C /* <: IClient */] extends StObject {
  
  var client: C
  
  var cn: js.Any
  
  var ctx: ITaskContext
  
  var dc: js.Any
  
  var params: js.Any
  
  var query: js.Any
}
object IEventContext {
  
  @scala.inline
  def apply[C /* <: IClient */](client: C, cn: js.Any, ctx: ITaskContext, dc: js.Any, params: js.Any, query: js.Any): IEventContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventContext[C]]
  }
  
  @scala.inline
  implicit class IEventContextMutableBuilder[Self <: IEventContext[?], C /* <: IClient */] (val x: Self & IEventContext[C]) extends AnyVal {
    
    @scala.inline
    def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCn(value: js.Any): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: ITaskContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
