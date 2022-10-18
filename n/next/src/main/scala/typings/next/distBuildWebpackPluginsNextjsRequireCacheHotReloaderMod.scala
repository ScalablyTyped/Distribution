package typings.next

import typings.next.anon.HasServerComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsNextjsRequireCacheHotReloaderMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("next/dist/build/webpack/plugins/nextjs-require-cache-hot-reloader", "NextJsRequireCacheHotReloader")
  @js.native
  open class NextJsRequireCacheHotReloader protected () extends StObject {
    def this(opts: HasServerComponents) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    var hasServerComponents: Boolean = js.native
    
    var prevAssets: Any = js.native
  }
  
  type Compiler = typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
  
  type WebpackPluginInstance = typings.next.distCompiledWebpackWebpackMod.webpack.WebpackPluginInstance
}
