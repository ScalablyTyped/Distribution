package typings.next

import typings.next.anon.Col
import typings.next.anon.FinishedBoolean
import typings.next.anon.LoadStaticPaths
import typings.next.anon.MiddlewareList
import typings.next.anon.Params
import typings.next.anon.Pathname
import typings.next.distServerBaseHttpNodeMod.NodeNextRequest
import typings.next.distServerBaseHttpNodeMod.NodeNextResponse
import typings.next.distServerBaseServerMod.FindComponentsResult
import typings.next.distServerConfigSharedMod.NextConfig
import typings.next.distServerWebTypesMod.FetchEventResult
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevNextDevServerMod {
  
  @JSImport("next/dist/server/dev/next-dev-server", JSImport.Default)
  @js.native
  open class default protected () extends DevServer {
    def this(options: Options) = this()
  }
  
  @js.native
  trait DevServer
    extends typings.next.distServerNextServerMod.default {
    
    /* private */ var _devCachedPreviewProps: Any = js.native
    
    def _filterAmpDevelopmentScript(html: String, event: Col): Boolean = js.native
    
    /* private */ var actualMiddlewareFile: Any = js.native
    
    def addExportPathMapRoutes(): js.Promise[Unit] = js.native
    
    /* private */ var addedUpgradeListener: Any = js.native
    
    /* private */ var appDir: Any = js.native
    
    /* private */ var devReady: Any = js.native
    
    /* private */ var edgeFunctions: Any = js.native
    
    /* protected */ def findPageComponents(param0: Pathname): js.Promise[FindComponentsResult | Null] = js.native
    
    def getCompilationError(page: String): js.Promise[Any] = js.native
    
    /* private */ var getStaticPathsWorker: Any = js.native
    
    /* protected */ def hasMiddleware(): js.Promise[Boolean] = js.native
    
    def hasPublicFile(path: String): js.Promise[Boolean] = js.native
    
    /* private */ var hotReloader: Any = js.native
    
    /* private */ var isCustomServer: Any = js.native
    
    /* private */ var logErrorWithOriginalStack: Any = js.native
    
    /* private */ var middleware: Any = js.native
    
    /* private */ var pagesDir: Any = js.native
    
    def run(req: NodeNextRequest, res: NodeNextResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    def runEdgeFunction(params: Params): js.Promise[FetchEventResult | Null] = js.native
    
    def runMiddleware(params: MiddlewareList): js.Promise[FetchEventResult | FinishedBoolean] = js.native
    
    /* private */ var servePublic: Any = js.native
    
    /* private */ var setDevReady: Any = js.native
    
    /* private */ var setupWebSocketHandler: Any = js.native
    
    /* protected */ var sortedRoutes: js.UndefOr[js.Array[String]] = js.native
    
    def startWatcher(): js.Promise[Unit] = js.native
    
    /* protected */ var staticPathsWorker: js.UndefOr[LoadStaticPaths] = js.native
    
    def stopWatcher(): js.Promise[Unit] = js.native
    
    /* private */ var usingTypeScript: Any = js.native
    
    /* private */ var verifyTypeScript: Any = js.native
    
    /* private */ var verifyingTypeScript: Any = js.native
    
    /* private */ var webpackWatcher: Any = js.native
  }
  
  trait Options
    extends StObject
       with typings.next.distServerBaseServerMod.Options {
    
    /**
      * Tells of Next.js is running from the `next dev` command
      */
    var isNextDevCommand: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(conf: NextConfig): Options = {
      val __obj = js.Dynamic.literal(conf = conf.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIsNextDevCommand(value: Boolean): Self = StObject.set(x, "isNextDevCommand", value.asInstanceOf[js.Any])
      
      inline def setIsNextDevCommandUndefined: Self = StObject.set(x, "isNextDevCommand", js.undefined)
    }
  }
}
