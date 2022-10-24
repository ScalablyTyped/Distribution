package typings.next

import typings.next.anon.CacheKey
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsCopyFilePluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/copy-file-plugin", "CopyFilePlugin")
  @js.native
  open class CopyFilePlugin protected () extends StObject {
    def this(param0: CacheKey) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var cacheKey: Any = js.native
    
    /* private */ var filePath: Any = js.native
    
    /* private */ var info: Any = js.native
    
    /* private */ var name: Any = js.native
  }
}
