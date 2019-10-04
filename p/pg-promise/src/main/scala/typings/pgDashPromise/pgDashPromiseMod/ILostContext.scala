package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILostContext extends js.Object {
  var client: IClient
  var cn: String
  var dc: js.Any
  var start: Date
}

object ILostContext {
  @scala.inline
  def apply(client: IClient, cn: String, dc: js.Any, start: Date): ILostContext = {
    val __obj = js.Dynamic.literal(client = client, cn = cn, dc = dc, start = start)
  
    __obj.asInstanceOf[ILostContext]
  }
}

