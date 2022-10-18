package typings.next

import typings.next.anon.AppDirEnabled
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsBuildManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/build-manifest-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/build/webpack/plugins/build-manifest-plugin", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BuildManifestPlugin {
    def this(options: AppDirEnabled) = this()
    
    /* private */ /* CompleteClass */
    var appDirEnabled: Any = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* private */ /* CompleteClass */
    var buildId: Any = js.native
    
    /* CompleteClass */
    override def createAssets(compiler: Any, compilation: Any, assets: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var exportRuntime: Any = js.native
    
    /* private */ /* CompleteClass */
    var isDevFallback: Any = js.native
    
    /* private */ /* CompleteClass */
    var rewrites: Any = js.native
  }
  
  inline def getEntrypointFiles(entrypoint: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntrypointFiles")(entrypoint.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait BuildManifestPlugin extends StObject {
    
    /* private */ var appDirEnabled: Any
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /* private */ var buildId: Any
    
    def createAssets(compiler: Any, compilation: Any, assets: Any): Any
    
    /* private */ var exportRuntime: Any
    
    /* private */ var isDevFallback: Any
    
    /* private */ var rewrites: Any
  }
  object BuildManifestPlugin {
    
    inline def apply(
      appDirEnabled: Any,
      apply: Compiler => Unit,
      buildId: Any,
      createAssets: (Any, Any, Any) => Any,
      exportRuntime: Any,
      isDevFallback: Any,
      rewrites: Any
    ): BuildManifestPlugin = {
      val __obj = js.Dynamic.literal(appDirEnabled = appDirEnabled.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), buildId = buildId.asInstanceOf[js.Any], createAssets = js.Any.fromFunction3(createAssets), exportRuntime = exportRuntime.asInstanceOf[js.Any], isDevFallback = isDevFallback.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildManifestPlugin]
    }
    
    extension [Self <: BuildManifestPlugin](x: Self) {
      
      inline def setAppDirEnabled(value: Any): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setBuildId(value: Any): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setCreateAssets(value: (Any, Any, Any) => Any): Self = StObject.set(x, "createAssets", js.Any.fromFunction3(value))
      
      inline def setExportRuntime(value: Any): Self = StObject.set(x, "exportRuntime", value.asInstanceOf[js.Any])
      
      inline def setIsDevFallback(value: Any): Self = StObject.set(x, "isDevFallback", value.asInstanceOf[js.Any])
      
      inline def setRewrites(value: Any): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    }
  }
  
  type ClientBuildManifest = Record[String, js.Array[String]]
}
