package typings.oauthShim.mod

import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import typings.oauthShim.AnonCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler
  extends RequestHandler[ParamsDictionary, js.Any, js.Any] {
  var credentials: AnonCb = js.native
  @JSName("interpret")
  var interpret_Original: typings.express.mod.RequestHandler[ParamsDictionary] = js.native
  @JSName("proxy")
  var proxy_Original: typings.express.mod.RequestHandler[ParamsDictionary] = js.native
  @JSName("redirect")
  var redirect_Original: typings.express.mod.RequestHandler[ParamsDictionary] = js.native
  @JSName("unhandled")
  var unhandled_Original: typings.express.mod.RequestHandler[ParamsDictionary] = js.native
  def init(configs: js.Array[Config]): Unit = js.native
  def interpret(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def proxy(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def redirect(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def unhandled(
    req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
}

