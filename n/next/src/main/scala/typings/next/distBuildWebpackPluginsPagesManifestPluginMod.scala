package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.IsEdgeRuntime
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsPagesManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/pages-manifest-plugin", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PagesManifestPlugin {
    def this(hasServerlessDevIsEdgeRuntimeAppDirEnabled: IsEdgeRuntime) = this()
    
    /* CompleteClass */
    var appDirEnabled: Boolean = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def createAssets(compilation: Any, assets: Any): Unit = js.native
    
    /* CompleteClass */
    var dev: Boolean = js.native
    
    /* CompleteClass */
    var isEdgeRuntime: Boolean = js.native
    
    /* CompleteClass */
    var serverless: Boolean = js.native
  }
  
  type PagesManifest = StringDictionary[String]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait PagesManifestPlugin extends StObject {
    
    var appDirEnabled: Boolean
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    def createAssets(compilation: Any, assets: Any): Unit
    
    var dev: Boolean
    
    var isEdgeRuntime: Boolean
    
    var serverless: Boolean
  }
  object PagesManifestPlugin {
    
    inline def apply(
      appDirEnabled: Boolean,
      apply: Compiler => Unit,
      createAssets: (Any, Any) => Unit,
      dev: Boolean,
      isEdgeRuntime: Boolean,
      serverless: Boolean
    ): PagesManifestPlugin = {
      val __obj = js.Dynamic.literal(appDirEnabled = appDirEnabled.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), createAssets = js.Any.fromFunction2(createAssets), dev = dev.asInstanceOf[js.Any], isEdgeRuntime = isEdgeRuntime.asInstanceOf[js.Any], serverless = serverless.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagesManifestPlugin]
    }
    
    extension [Self <: PagesManifestPlugin](x: Self) {
      
      inline def setAppDirEnabled(value: Boolean): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setCreateAssets(value: (Any, Any) => Unit): Self = StObject.set(x, "createAssets", js.Any.fromFunction2(value))
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setIsEdgeRuntime(value: Boolean): Self = StObject.set(x, "isEdgeRuntime", value.asInstanceOf[js.Any])
      
      inline def setServerless(value: Boolean): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
    }
  }
}
