package typings.oauthDashShim.oauthDashShimMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.oauthDashShim.Anon_Cb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler extends RequestHandler[ParamsDictionary] {
  var credentials: Anon_Cb = js.native
  @JSName("interpret")
  var interpret_Original: typings.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  @JSName("proxy")
  var proxy_Original: typings.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  @JSName("redirect")
  var redirect_Original: typings.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  @JSName("unhandled")
  var unhandled_Original: typings.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  def init(configs: js.Array[Config]): Unit = js.native
  def interpret(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary],
    res: Response,
    next: NextFunction
  ): js.Any = js.native
  def proxy(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary],
    res: Response,
    next: NextFunction
  ): js.Any = js.native
  def redirect(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary],
    res: Response,
    next: NextFunction
  ): js.Any = js.native
  def unhandled(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary],
    res: Response,
    next: NextFunction
  ): js.Any = js.native
}

