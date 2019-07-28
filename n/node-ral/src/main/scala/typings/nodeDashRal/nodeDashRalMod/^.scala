package typings.nodeDashRal.nodeDashRalMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.nodeDashRal.nodeDashRalMod.RALNs.RalRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Config: typings.nodeDashRal.nodeDashRalMod.Config = js.native
  val Logger: LoggerFactory = js.native
  def Middleware(): js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, Unit] = js.native
  def Middleware(options: Service): js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, Unit] = js.native
  def RAL(serviceName: String): RalRunner = js.native
  def RAL(serviceName: String, options: js.Object): RalRunner = js.native
  def RALPromise[T](name: String): js.Promise[T] = js.native
  def RALPromise[T](name: String, options: js.Object): js.Promise[T] = js.native
}

