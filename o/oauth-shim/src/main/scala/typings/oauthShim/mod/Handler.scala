package typings.oauthShim.mod

import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import typings.oauthShim.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler
  extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  var credentials: Get = js.native
  @JSName("interpret")
  var interpret_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSName("proxy")
  var proxy_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSName("redirect")
  var redirect_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSName("unhandled")
  var unhandled_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def init(configs: js.Array[Config]): Unit = js.native
  def interpret(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def proxy(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def redirect(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def unhandled(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
}

