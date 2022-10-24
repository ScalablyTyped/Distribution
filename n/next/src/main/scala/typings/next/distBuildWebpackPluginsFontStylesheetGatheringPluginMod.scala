package typings.next

import typings.next.anon.AdjustFontFallbacks
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.next.distServerFontUtilsMod.FontManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFontStylesheetGatheringPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/font-stylesheet-gathering-plugin", "FontStylesheetGatheringPlugin")
  @js.native
  open class FontStylesheetGatheringPlugin protected () extends StObject {
    def this(param0: AdjustFontFallbacks) = this()
    
    var adjustFontFallbacks: js.UndefOr[Boolean] = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    var compiler: js.UndefOr[Compiler] = js.native
    
    var gatheredStylesheets: js.Array[String] = js.native
    
    var isLikeServerless: Boolean = js.native
    
    var manifestContent: FontManifest = js.native
    
    /* private */ var parserHandler: Any = js.native
  }
}
