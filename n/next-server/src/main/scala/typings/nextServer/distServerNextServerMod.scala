package typings.nextServer

import typings.nextServer.anon.AmpBindInitData
import typings.nextServer.anon.Amphtml
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerNextServerMod {
  
  @JSImport("next-server/dist/server/next-server", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Server {
    def this(hasDirStaticMarkupQuietConf: ServerConstructor) = this()
  }
  
  type NextConfig = Any
  
  @js.native
  trait Server extends StObject {
    
    /* private */ val _isLikeServerless: Any = js.native
    
    var buildId: String = js.native
    
    /* private */ var close: Any = js.native
    
    /* private */ var compression: Any = js.native
    
    /* private */ var currentPhase: Any = js.native
    
    var dir: String = js.native
    
    var distDir: String = js.native
    
    /* private */ var dynamicRoutes: Any = js.native
    
    /* private */ var findPageComponents: Any = js.native
    
    /* private */ var generatePublicRoutes: Any = js.native
    
    /* private */ var generateRoutes: Any = js.native
    
    /* private */ var getDynamicRoutes: Any = js.native
    
    def getRequestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
        js.Promise[Unit]
      ] = js.native
    
    /**
      * Resolves `API` request, in development builds on demand
      * @param req http request
      * @param res http response
      * @param pathname path of request
      */
    /* private */ var handleApiRequest: Any = js.native
    
    /* private */ var handleCompression: Any = js.native
    
    /* private */ var handleRequest: Any = js.native
    
    /* private */ var isServeableUrl: Any = js.native
    
    /* private */ var logError: Any = js.native
    
    var nextConfig: NextConfig = js.native
    
    var pagesManifest: String = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    var publicDir: String = js.native
    
    var quiet: Boolean = js.native
    
    /* private */ var readBuildId: Any = js.native
    
    def render(req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    def render(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    
    def render404(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
    def render404(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    def renderError(err: js.Error, req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: js.Error,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[Unit] = js.native
    def renderError(err: Null, req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[Unit] = js.native
    def renderError(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[Unit] = js.native
    
    def renderErrorToHTML(err: js.Error, req: IncomingMessage, res: ServerResponse[IncomingMessage], _pathname: String): js.Promise[Any] = js.native
    def renderErrorToHTML(
      err: js.Error,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      _pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[Any] = js.native
    def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse[IncomingMessage], _pathname: String): js.Promise[Any] = js.native
    def renderErrorToHTML(
      err: Null,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      _pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[Any] = js.native
    
    var renderOpts: AmpBindInitData = js.native
    
    def renderToHTML(req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      hasAmphtmlDataOnlyHasAmp: Amphtml
    ): js.Promise[String | Null] = js.native
    def renderToHTML(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      pathname: String,
      query: Unit,
      hasAmphtmlDataOnlyHasAmp: Amphtml
    ): js.Promise[String | Null] = js.native
    
    /* private */ var renderToHTMLWithComponents: Any = js.native
    
    /**
      * Resolves path to resolver function
      * @param pathname path of request
      */
    /* private */ var resolveApiRequest: Any = js.native
    
    var router: typings.nextServer.distServerRouterMod.default = js.native
    
    /* private */ var run: Any = js.native
    
    /* private */ var sendHTML: Any = js.native
    
    def serveStatic(req: IncomingMessage, res: ServerResponse[IncomingMessage], path: String): js.Promise[Unit] = js.native
    def serveStatic(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      path: String,
      parsedUrl: UrlWithParsedQuery
    ): js.Promise[Unit] = js.native
    
    def setAssetPrefix(): Unit = js.native
    def setAssetPrefix(prefix: String): Unit = js.native
    
    /* private */ var setImmutableAssetCacheControl: Any = js.native
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
