package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Context
import typings.next.anon.SriEnabled
import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.AssetBinding
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.next.nextInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsMiddlewarePluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/middleware-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/build/webpack/plugins/middleware-plugin", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MiddlewarePlugin {
    def this(param0: SriEnabled) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* private */ /* CompleteClass */
    override val dev: Any = js.native
    
    /* private */ /* CompleteClass */
    override val sriEnabled: Any = js.native
  }
  
  inline def handleWebpackExtenalForEdgeRuntime(param0: Context): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleWebpackExtenalForEdgeRuntime")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  trait EdgeFunctionDefinition extends StObject {
    
    var assets: js.UndefOr[js.Array[AssetBinding]] = js.undefined
    
    var env: js.Array[String]
    
    var files: js.Array[String]
    
    var matchers: js.Array[MiddlewareMatcher]
    
    var name: String
    
    var page: String
    
    var wasm: js.UndefOr[js.Array[AssetBinding]] = js.undefined
  }
  object EdgeFunctionDefinition {
    
    inline def apply(
      env: js.Array[String],
      files: js.Array[String],
      matchers: js.Array[MiddlewareMatcher],
      name: String,
      page: String
    ): EdgeFunctionDefinition = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], matchers = matchers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeFunctionDefinition]
    }
    
    extension [Self <: EdgeFunctionDefinition](x: Self) {
      
      inline def setAssets(value: js.Array[AssetBinding]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      inline def setAssetsVarargs(value: AssetBinding*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setWasm(value: js.Array[AssetBinding]): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
      
      inline def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
      
      inline def setWasmVarargs(value: AssetBinding*): Self = StObject.set(x, "wasm", js.Array(value*))
    }
  }
  
  trait MiddlewareManifest extends StObject {
    
    var functions: StringDictionary[EdgeFunctionDefinition]
    
    var middleware: StringDictionary[EdgeFunctionDefinition]
    
    var sortedMiddleware: js.Array[String]
    
    var version: `2`
  }
  object MiddlewareManifest {
    
    inline def apply(
      functions: StringDictionary[EdgeFunctionDefinition],
      middleware: StringDictionary[EdgeFunctionDefinition],
      sortedMiddleware: js.Array[String]
    ): MiddlewareManifest = {
      val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], sortedMiddleware = sortedMiddleware.asInstanceOf[js.Any], version = 2)
      __obj.asInstanceOf[MiddlewareManifest]
    }
    
    extension [Self <: MiddlewareManifest](x: Self) {
      
      inline def setFunctions(value: StringDictionary[EdgeFunctionDefinition]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setMiddleware(value: StringDictionary[EdgeFunctionDefinition]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setSortedMiddleware(value: js.Array[String]): Self = StObject.set(x, "sortedMiddleware", value.asInstanceOf[js.Any])
      
      inline def setSortedMiddlewareVarargs(value: String*): Self = StObject.set(x, "sortedMiddleware", js.Array(value*))
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiddlewarePlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /* private */ val dev: Any
    
    /* private */ val sriEnabled: Any
  }
  object MiddlewarePlugin {
    
    inline def apply(apply: Compiler => Unit, dev: Any, sriEnabled: Any): MiddlewarePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), dev = dev.asInstanceOf[js.Any], sriEnabled = sriEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewarePlugin]
    }
    
    extension [Self <: MiddlewarePlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setDev(value: Any): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setSriEnabled(value: Any): Self = StObject.set(x, "sriEnabled", value.asInstanceOf[js.Any])
    }
  }
}
