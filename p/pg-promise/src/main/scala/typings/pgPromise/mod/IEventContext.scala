package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
@js.native
trait IEventContext[C /* <: IClient */] extends js.Object {
  
  var client: C = js.native
  
  var cn: js.Any = js.native
  
  var ctx: ITaskContext = js.native
  
  var dc: js.Any = js.native
  
  var params: js.Any = js.native
  
  var query: js.Any = js.native
}
object IEventContext {
  
  @scala.inline
  def apply[C /* <: IClient */](client: C, cn: js.Any, ctx: ITaskContext, dc: js.Any, params: js.Any, query: js.Any): IEventContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventContext[C]]
  }
  
  @scala.inline
  implicit class IEventContextOps[Self <: IEventContext[_], C /* <: IClient */] (val x: Self with IEventContext[C]) extends AnyVal {
    
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
    def setClient(value: C): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCn(value: js.Any): Self = this.set("cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: ITaskContext): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = this.set("dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
