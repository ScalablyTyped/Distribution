package typings.polka

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.Params
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.Url
import typings.std.Error
import typings.std.RegExp
import typings.trouter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a Polka HTTP router.
    *
    * @see https://github.com/lukeed/polka
    */
  @JSImport("polka", JSImport.Namespace)
  @js.native
  def apply(): Polka = js.native
  @JSImport("polka", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Polka = js.native
  
  /**
    * A middleware function
    */
  type Middleware[P /* <: Params */, ResBody, ReqBody, ReqQuery] = RequestHandler[P, ResBody, ReqBody, ReqQuery]
  
  /**
    * Calls the next middleware function in the chain, or throws an error.
    */
  type Next = js.Function1[/* err */ js.UndefOr[String | Error], Unit]
  
  /**
    * Polka options
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * A catch-all error handler; executed whenever a middleware throws an error.
      */
    var onError: js.UndefOr[
        js.Function4[/* err */ Error, /* req */ Request, /* res */ ServerResponse, /* next */ Next, Unit]
      ] = js.native
    
    /**
      * A handler when no route definitions were matched.
      */
    var onNoMatch: js.UndefOr[js.Function2[/* req */ Request, /* res */ ServerResponse, Unit]] = js.native
    
    /**
      * The server instance to use when `polka.listen()` is called.
      */
    var server: js.UndefOr[Server] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnError(value: (/* err */ Error, /* req */ Request, /* res */ ServerResponse, /* next */ Next) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnNoMatch(value: (/* req */ Request, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onNoMatch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNoMatchUndefined: Self = StObject.set(x, "onNoMatch", js.undefined)
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  /**
    * An instance of the Polka router.
    */
  @js.native
  trait Polka
    extends ^[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] {
    
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
  
  /**
    * An `http.IncomingMessage`, extended by Polka
    */
  @js.native
  trait Request extends IncomingMessage {
    
    /**
      * The originally-requested URL, including parent router segments.
      */
    var originalUrl: String = js.native
    
    /**
      * The values of named parameters within your route pattern
      */
    var params: StringDictionary[String] = js.native
    
    /**
      * The path portion of the requested URL.
      */
    var path: String = js.native
    
    /**
      * The parsed querystring
      */
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    /**
      * The un-parsed querystring
      */
    var search: String | Null = js.native
  }
}
