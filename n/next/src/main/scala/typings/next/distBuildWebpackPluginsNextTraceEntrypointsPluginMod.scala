package typings.next

import typings.next.anon.EsmExternals
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsNextTraceEntrypointsPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("next/dist/build/webpack/plugins/next-trace-entrypoints-plugin", "TraceEntryPointsPlugin")
  @js.native
  open class TraceEntryPointsPlugin protected () extends StObject {
    def this(param0: EsmExternals) = this()
    
    /* private */ var appDir: Any = js.native
    
    /* private */ var appDirEnabled: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var chunksToTrace: Any = js.native
    
    def createTraceAssets(compilation: Any, assets: Any, span: Span, readlink: Any, stat: Any): js.Promise[Unit] = js.native
    
    /* private */ var entryTraces: Any = js.native
    
    /* private */ var esmExternals: Any = js.native
    
    /* private */ var excludeFiles: Any = js.native
    
    def tapfinishModules(
      compilation: Compilation,
      traceEntrypointsPluginSpan: Span,
      doResolve: js.Function4[
          /* request */ String, 
          /* parent */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_node-file-trace.Job */ /* job */ Any, 
          /* isEsmRequested */ Boolean, 
          js.Promise[String]
        ],
      readlink: Any,
      stat: Any
    ): Unit = js.native
    
    /* private */ var tracingRoot: Any = js.native
    
    /* private */ var turbotrace: Any = js.native
    
    /* private */ var turbotraceFiles: Any = js.native
    
    /* private */ var turbotraceOutputPath: Any = js.native
  }
}
