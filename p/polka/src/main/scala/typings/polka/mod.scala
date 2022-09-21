package typings.polka

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.node.urlMod.Url
import typings.std.Record
import typings.trouter.mod.FindResult
import typings.trouter.mod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a Polka HTTP router.
    *
    * @see https://github.com/lukeed/polka
    */
  inline def apply(): Polka = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Polka]
  inline def apply(opts: Options): Polka = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Polka]
  
  @JSImport("polka", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A middleware function
    */
  type Middleware[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Params */ Any */, ResBody, ReqBody, ReqQuery] = RequestHandler[P, ResBody, ReqBody, ReqQuery, Record[String, Any]]
  
  /**
    * Calls the next middleware function in the chain, or throws an error.
    */
  type Next = js.Function1[/* err */ js.UndefOr[String | js.Error], Unit]
  
  /**
    * Polka options
    */
  trait Options extends StObject {
    
    /**
      * A catch-all error handler; executed whenever a middleware throws an error.
      */
    var onError: js.UndefOr[
        js.Function4[
          /* err */ js.Error, 
          /* req */ Request, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ Next, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A handler when no route definitions were matched.
      */
    var onNoMatch: js.UndefOr[js.Function2[/* req */ Request, /* res */ ServerResponse[IncomingMessage], Unit]] = js.undefined
    
    /**
      * The server instance to use when `polka.listen()` is called.
      */
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnError(
        value: (/* err */ js.Error, /* req */ Request, /* res */ ServerResponse[IncomingMessage], /* next */ Next) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNoMatch(value: (/* req */ Request, /* res */ ServerResponse[IncomingMessage]) => Unit): Self = StObject.set(x, "onNoMatch", js.Any.fromFunction2(value))
      
      inline def setOnNoMatchUndefined: Self = StObject.set(x, "onNoMatch", js.undefined)
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  /**
    * An instance of the Polka router.
    */
  @js.native
  trait Polka extends StObject {
    
    def add(
      method: HTTPMethod,
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def add(
      method: HTTPMethod,
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    def all(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def all(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    def connect(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def connect(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    def delete(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def delete(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    def find(method: HTTPMethod, url: String): FindResult[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.native
    
    def get(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def get(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    /**
      * The main Polka `IncomingMessage` handler.
      * It receives all requests and tries to match the incoming URL against known routes.
      */
    def handler(req: Request, res: ServerResponse[IncomingMessage]): Unit = js.native
    def handler(req: Request, res: ServerResponse[IncomingMessage], parsed: Url): Unit = js.native
    
    def head(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def head(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    /**
      * Boots (or creates) the underlying `http.Server` for the first time.
      */
    def listen(): this.type = js.native
    /**
      * Boots (or creates) the underlying `http.Server` for the first time.
      * All arguments are passed to server.listen directly with no changes.
      */
    def listen(args: Any*): this.type = js.native
    def listen(port: Double): this.type = js.native
    def listen(port: Double, hostname: String): this.type = js.native
    def listen(port: Unit, hostname: String): this.type = js.native
    
    def options(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def options(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    /**
      * Parses the `req.url` property of the given request.
      */
    def parse(req: Request): Url = js.native
    
    def patch(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def patch(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    def post(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def post(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    def put(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def put(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    /**
      * The instantiated `server` Polka creates when `listen()` is called.
      * `server` is only created if a server was not provided via `option.server`
      * `server` will be undefined until polka.listen is invoked or if a server was provided.
      */
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    
    def trace(
      pattern: String,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    def trace(
      pattern: js.RegExp,
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    
    /**
      * Attach middleware(s) and/or sub-application(s) to the server.
      * These will execute before your routes' handlers.
      */
    def use(
      handlers: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])*
    ): this.type = js.native
    /**
      * Attach middleware(s) and/or sub-application(s) to the server.
      * These will execute before your routes' handlers.
      */
    def use(
      pattern: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param handlers because its type Array<RequestHandler> | Array<Polka> is not an array type */ handlers: js.Array[
          Polka | (RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ])
        ]
    ): this.type = js.native
    def use(
      pattern: js.RegExp,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param handlers because its type Array<RequestHandler> | Array<Polka> is not an array type */ handlers: js.Array[
          Polka | (RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ])
        ]
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
