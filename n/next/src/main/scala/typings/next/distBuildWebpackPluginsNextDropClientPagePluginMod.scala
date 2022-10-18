package typings.next

import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsNextDropClientPagePluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("next/dist/build/webpack/plugins/next-drop-client-page-plugin", "DropClientPage")
  @js.native
  open class DropClientPage () extends StObject {
    
    var ampPages: Set[Any] = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  @JSImport("next/dist/build/webpack/plugins/next-drop-client-page-plugin", "ampFirstEntryNamesMap")
  @js.native
  val ampFirstEntryNamesMap: WeakMap[Compilation, js.Array[String]] = js.native
}
