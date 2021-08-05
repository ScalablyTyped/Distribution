package typings.nextServer

import typings.nextServer.anon.AmpBindInitData
import typings.nextServer.anon.Amphtml
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextServerMod {
  
  @JSImport("next-server/dist/server/next-server", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Server {
    def this(hasDirStaticMarkupQuietConf: ServerConstructor) = this()
  }
  
  type NextConfig = js.Any
  
  @js.native
  trait Server extends StObject {
    
    /* private */ val _isLikeServerless: js.Any = js.native
    
    var buildId: String = js.native
    
    /* private */ var close: js.Any = js.native
    
    /* private */ var compression: js.Any = js.native
    
    /* private */ var currentPhase: js.Any = js.native
    
    var dir: String = js.native
    
    var distDir: String = js.native
    
    /* private */ var dynamicRoutes: js.Any = js.native
    
    /* private */ var findPageComponents: js.Any = js.native
    
    /* private */ var generatePublicRoutes: js.Any = js.native
    
    /* private */ var generateRoutes: js.Any = js.native
    
    /* private */ var getDynamicRoutes: js.Any = js.native
    
    def getRequestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
        js.Promise[Unit]
      ] = js.native
    
    /**
      * Resolves `API` request, in development builds on demand
      * @param req http request
      * @param res http response
      * @param pathname path of request
      */
    /* private */ var handleApiRequest: js.Any = js.native
    
    /* private */ var handleCompression: js.Any = js.native
    
    /* private */ var handleRequest: js.Any = js.native
    
    /* private */ var isServeableUrl: js.Any = js.native
    
    /* private */ var logError: js.Any = js.native
    
    var nextConfig: NextConfig = js.native
    
    var pagesManifest: String = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    var publicDir: String = js.native
    
    var quiet: Boolean = js.native
    
    /* private */ var readBuildId: js.Any = js.native
    
    def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: Unit,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: ParsedUrlQuery,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    
    def render404(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
    def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
    
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[js.Any] = js.native
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[js.Any] = js.native
    def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[js.Any] = js.native
    def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[js.Any] = js.native
    
    var renderOpts: AmpBindInitData = js.native
    
    def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: Unit,
      hasAmphtmlDataOnlyHasAmp: Amphtml
    ): js.Promise[String | Null] = js.native
    def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: ParsedUrlQuery,
      hasAmphtmlDataOnlyHasAmp: Amphtml
    ): js.Promise[String | Null] = js.native
    
    /* private */ var renderToHTMLWithComponents: js.Any = js.native
    
    /**
      * Resolves path to resolver function
      * @param pathname path of request
      */
    /* private */ var resolveApiRequest: js.Any = js.native
    
    var router: typings.nextServer.serverRouterMod.default = js.native
    
    /* private */ var run: js.Any = js.native
    
    /* private */ var sendHTML: js.Any = js.native
    
    def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
    def serveStatic(req: IncomingMessage, res: ServerResponse, path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    def setAssetPrefix(): Unit = js.native
    def setAssetPrefix(prefix: String): Unit = js.native
    
    /* private */ var setImmutableAssetCacheControl: js.Any = js.native
  }
  
  trait ServerConstructor extends StObject {
    
    /**
      * Object what you would use in next.config.js - @default {}
      */
    var conf: js.UndefOr[NextConfig] = js.undefined
    
    /**
      * Where the Next project is located - @default '.'
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * Hide error messages containing server information - @default false
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var staticMarkup: js.UndefOr[Boolean] = js.undefined
  }
  object ServerConstructor {
    
    inline def apply(): ServerConstructor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerConstructor]
    }
    
    extension [Self <: ServerConstructor](x: Self) {
      
      inline def setConf(value: NextConfig): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      inline def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
      
      inline def setStaticMarkupUndefined: Self = StObject.set(x, "staticMarkup", js.undefined)
    }
  }
}
