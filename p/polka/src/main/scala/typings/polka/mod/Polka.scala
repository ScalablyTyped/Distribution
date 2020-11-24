package typings.polka.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.Url
import typings.std.RegExp
import typings.trouter.mod.Trouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of the Polka router.
  */
@js.native
trait Polka
  extends Trouter[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] {
  
  /**
    * The main Polka `IncomingMessage` handler.
    * It receives all requests and tries to match the incoming URL against known routes.
    */
  def handler(req: Request, res: ServerResponse): Unit = js.native
  def handler(req: Request, res: ServerResponse, parsed: Url): Unit = js.native
  
  /**
    * Boots (or creates) the underlying `http.Server` for the first time.
    */
  def listen(): this.type = js.native
  /**
    * Boots (or creates) the underlying `http.Server` for the first time.
    * All arguments are passed to server.listen directly with no changes.
    */
  def listen(args: js.Any*): this.type = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: String): this.type = js.native
  def listen(port: Double): this.type = js.native
  def listen(port: Double, hostname: String): this.type = js.native
  
  /**
    * Parses the `req.url` property of the given request.
    */
  def parse(req: Request): Url = js.native
  
  /**
    * Attach middleware(s) and/or sub-application(s) to the server.
    * These will execute before your routes' handlers.
    */
  def use(handlers: (RequestHandler[ParamsDictionary, _, _, Query])*): this.type = js.native
  /**
    * Attach middleware(s) and/or sub-application(s) to the server.
    * These will execute before your routes' handlers.
    */
  def use(
    pattern: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param handlers because its type Array<RequestHandler> | Array<Polka> is not an array type */ handlers: js.Array[Polka | (RequestHandler[ParamsDictionary, _, _, Query])]
  ): this.type = js.native
  def use(
    pattern: RegExp,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param handlers because its type Array<RequestHandler> | Array<Polka> is not an array type */ handlers: js.Array[Polka | (RequestHandler[ParamsDictionary, _, _, Query])]
  ): this.type = js.native
}
