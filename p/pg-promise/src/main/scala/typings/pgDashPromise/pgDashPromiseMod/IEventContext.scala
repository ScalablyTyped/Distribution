package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
trait IEventContext[C /* <: IClient */] extends js.Object {
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
}

