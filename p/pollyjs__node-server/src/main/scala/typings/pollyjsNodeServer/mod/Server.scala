package typings.pollyjsNodeServer.mod

import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pollyjsNodeServer.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", "Server")
@js.native
class Server () extends js.Object {
  def this(options: PartialConfig) = this()
  @JSName("app")
  var app_Original: Express = js.native
  var config: Config = js.native
  var server: js.UndefOr[typings.node.httpMod.Server] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, Query], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, Query], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def listen(): typings.node.httpMod.Server = js.native
  def listen(port: Double): typings.node.httpMod.Server = js.native
  def listen(port: Double, host: String): typings.node.httpMod.Server = js.native
}

