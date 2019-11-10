package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILostContext[C /* <: IClient */] extends js.Object {
  var client: C
  var cn: String
  var dc: js.Any
  var start: Date
}

object ILostContext {
  @scala.inline
  def apply[C /* <: IClient */](client: C, cn: String, dc: js.Any, start: Date): ILostContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn, dc = dc, start = start)
  
    __obj.asInstanceOf[ILostContext[C]]
  }
}

