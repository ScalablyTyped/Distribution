package typings.nodeDashRal.nodeDashRalMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Middleware")
@js.native
object Middleware extends js.Object {
  def apply(): js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(options: Service): js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, Unit] = js.native
}

