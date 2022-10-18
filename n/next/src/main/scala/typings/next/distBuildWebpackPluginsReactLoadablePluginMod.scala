package typings.next

import typings.next.anon.PagesDir
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsReactLoadablePluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/react-loadable-plugin", "ReactLoadablePlugin")
  @js.native
  open class ReactLoadablePlugin protected () extends StObject {
    def this(opts: PagesDir) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def createAssets(compiler: Any, compilation: Any, assets: Any): Any = js.native
    
    /* private */ var dev: Any = js.native
    
    /* private */ var filename: Any = js.native
    
    /* private */ var pagesDir: Any = js.native
    
    /* private */ var runtimeAsset: Any = js.native
  }
}
