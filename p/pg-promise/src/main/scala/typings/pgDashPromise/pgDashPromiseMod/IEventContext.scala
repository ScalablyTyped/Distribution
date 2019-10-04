package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
trait IEventContext extends js.Object {
  var client: IClient
  var cn: js.Any
  var ctx: ITaskContext
  var dc: js.Any
  var params: js.Any
  var query: js.Any
}

object IEventContext {
  @scala.inline
  def apply(client: IClient, cn: js.Any, ctx: ITaskContext, dc: js.Any, params: js.Any, query: js.Any): IEventContext = {
    val __obj = js.Dynamic.literal(client = client, cn = cn, ctx = ctx, dc = dc, params = params, query = query)
  
    __obj.asInstanceOf[IEventContext]
  }
}

