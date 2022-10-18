package typings.next

import typings.next.anon.ClientOnly
import typings.next.anon.CompilerType
import typings.next.anon.Finished
import typings.next.anon.PreviewProps
import typings.next.anon.Verbose
import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import typings.next.distCompiledWebpackWebpackMod.webpack.MultiCompiler
import typings.next.distCompiledWebpackWebpackMod.webpack.Stats
import typings.next.distLibCoalescedFunctionMod.UnwrapPromise
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlObject
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevHotReloaderMod {
  
  @JSImport("next/dist/server/dev/hot-reloader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/dev/hot-reloader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HotReloader {
    def this(dir: String, hasConfigPagesDirDistDirBuildIdPreviewPropsRewritesAppDir: PreviewProps) = this()
  }
  
  inline def renderScriptError(res: ServerResponse[IncomingMessage], error: js.Error): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderScriptError")(res.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def renderScriptError(res: ServerResponse[IncomingMessage], error: js.Error, hasVerbose: Verbose): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderScriptError")(res.asInstanceOf[js.Any], error.asInstanceOf[js.Any], hasVerbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait HotReloader extends StObject {
    
    var activeConfigs: js.UndefOr[
        js.Array[
          UnwrapPromise[
            ReturnType[
              js.Function2[
                /* dir */ String, 
                /* hasBuildIdConfigCompilerTypeDevEntrypointsHasReactRootIsDevFallbackPagesDirReactProductionProfilingRewritesRunWebpackSpanTargetAppDirMiddlewareMatchers */ CompilerType, 
                js.Promise[Configuration]
              ]
            ]
          ]
        ]
      ] = js.native
    
    /* private */ var appDir: Any = js.native
    
    def buildFallbackError(): js.Promise[Unit] = js.native
    
    /* private */ var buildId: Any = js.native
    
    /* private */ var clean: Any = js.native
    
    /* private */ var clientError: Any = js.native
    
    var clientStats: Stats | Null = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var dir: Any = js.native
    
    /* private */ var distDir: Any = js.native
    
    var edgeServerStats: Stats | Null = js.native
    
    def ensurePage(hasPageClientOnlyAppPaths: ClientOnly): js.Promise[Unit] = js.native
    
    /* private */ var fallbackWatcher: Any = js.native
    
    def getCompilationErrors(page: String): js.Promise[js.Array[Any]] = js.native
    
    /* private */ var getWebpackConfig: Any = js.native
    
    var hasReactRoot: Boolean = js.native
    
    var hasServerComponents: Boolean = js.native
    
    /* private */ var hotReloaderSpan: Any = js.native
    
    /* private */ var interceptors: Any = js.native
    
    def invalidate(): Unit = js.native
    
    var multiCompiler: js.UndefOr[MultiCompiler] = js.native
    
    /* private */ var onDemandEntries: Any = js.native
    
    def onHMR(req: IncomingMessage, _res: ServerResponse[IncomingMessage], head: Buffer): Unit = js.native
    
    /* private */ var pagesDir: Any = js.native
    
    /* private */ var pagesMapping: Any = js.native
    
    /* private */ var prevChunkNames: Any = js.native
    
    /* private */ var previewProps: Any = js.native
    
    /* private */ var rewrites: Any = js.native
    
    def run(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: UrlObject): js.Promise[Finished] = js.native
    
    def send(action: String, args: Any*): Unit = js.native
    def send(action: Any, args: Any*): Unit = js.native
    def send(action: Unit, args: Any*): Unit = js.native
    
    /* private */ var serverError: Any = js.native
    
    /* private */ var serverPrevDocumentHash: Any = js.native
    
    var serverStats: Stats | Null = js.native
    
    def start(): js.Promise[Unit] = js.native
    def start(initial: Boolean): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    /* private */ var watcher: Any = js.native
    
    /* private */ var webpackHotMiddleware: Any = js.native
  }
}
