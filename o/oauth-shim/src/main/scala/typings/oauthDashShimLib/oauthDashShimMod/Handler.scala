package typings
package oauthDashShimLib.oauthDashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler {
  var credentials: oauthDashShimLib.Anon_Cb = js.native
  @JSName("interpret")
  var interpret_Original: expressLib.expressMod.RequestHandler = js.native
  @JSName("proxy")
  var proxy_Original: expressLib.expressMod.RequestHandler = js.native
  @JSName("redirect")
  var redirect_Original: expressLib.expressMod.RequestHandler = js.native
  @JSName("unhandled")
  var unhandled_Original: expressLib.expressMod.RequestHandler = js.native
  def init(configs: js.Array[Config]): scala.Unit = js.native
  def interpret(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    next: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
  def proxy(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    next: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
  def redirect(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    next: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
  def unhandled(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    next: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
}

