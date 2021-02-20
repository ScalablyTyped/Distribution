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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextServerMod {
  
  @JSImport("next-server/dist/server/next-server", JSImport.Default)
  @js.native
  class default () extends Server {
    def this(hasDirStaticMarkupQuietConf: ServerConstructor) = this()
  }
  
  type NextConfig = js.Any
  
  @js.native
  trait Server extends StObject {
    
    val _isLikeServerless: js.Any = js.native
    
    var buildId: String = js.native
    
    var close: js.Any = js.native
    
    var compression: js.Any = js.native
    
    var currentPhase: js.Any = js.native
    
    var dir: String = js.native
    
    var distDir: String = js.native
    
    var dynamicRoutes: js.Any = js.native
    
    var findPageComponents: js.Any = js.native
    
    var generatePublicRoutes: js.Any = js.native
    
    var generateRoutes: js.Any = js.native
    
    var getDynamicRoutes: js.Any = js.native
    
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
    var handleApiRequest: js.Any = js.native
    
    var handleCompression: js.Any = js.native
    
    var handleRequest: js.Any = js.native
    
    var isServeableUrl: js.Any = js.native
    
    var logError: js.Any = js.native
    
    var nextConfig: NextConfig = js.native
    
    var pagesManifest: String = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    var publicDir: String = js.native
    
    var quiet: Boolean = js.native
    
    var readBuildId: js.Any = js.native
    
    def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: js.UndefOr[scala.Nothing],
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
    
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[_] = js.native
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[_] = js.native
    def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[_] = js.native
    def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[_] = js.native
    
    var renderOpts: AmpBindInitData = js.native
    
    def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse,
      pathname: String,
      query: js.UndefOr[scala.Nothing],
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
    
    var renderToHTMLWithComponents: js.Any = js.native
    
    /**
      * Resolves path to resolver function
      * @param pathname path of request
      */
    var resolveApiRequest: js.Any = js.native
    
    var router: typings.nextServer.serverRouterMod.default = js.native
    
    var run: js.Any = js.native
    
    var sendHTML: js.Any = js.native
    
    def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
    def serveStatic(req: IncomingMessage, res: ServerResponse, path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    def setAssetPrefix(): Unit = js.native
    def setAssetPrefix(prefix: String): Unit = js.native
    
    var setImmutableAssetCacheControl: js.Any = js.native
  }
  
  @js.native
  trait ServerConstructor extends StObject {
    
    /**
      * Object what you would use in next.config.js - @default {}
      */
    var conf: js.UndefOr[NextConfig] = js.native
    
    /**
      * Where the Next project is located - @default '.'
      */
    var dir: js.UndefOr[String] = js.native
    
    /**
      * Hide error messages containing server information - @default false
      */
    var quiet: js.UndefOr[Boolean] = js.native
    
    var staticMarkup: js.UndefOr[Boolean] = js.native
  }
  object ServerConstructor {
    
    @scala.inline
    def apply(): ServerConstructor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerConstructor]
    }
    
    @scala.inline
    implicit class ServerConstructorMutableBuilder[Self <: ServerConstructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConf(value: NextConfig): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticMarkupUndefined: Self = StObject.set(x, "staticMarkup", js.undefined)
    }
  }
}
