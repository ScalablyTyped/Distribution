package typings.next

import typings.next.anon.AdjustFontFallback
import typings.next.anon.Once
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextFontLoaderPostcssFontLoaderMod {
  
  object default {
    
    inline def apply(param0: AdjustFontFallback): Once = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Once]
    
    @JSImport("next/dist/build/webpack/loaders/next-font-loader/postcss-font-loader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/build/webpack/loaders/next-font-loader/postcss-font-loader", "default.postcss")
    @js.native
    def postcss: Boolean = js.native
    inline def postcss_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  }
}
