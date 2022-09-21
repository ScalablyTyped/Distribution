package typings.postcssHeader

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-header", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Header = js.native
  
  type Header = Plugin
  
  trait Options extends StObject {
    
    /**
      * The string which will be put at the beginning of the css file.
      */
    var banner: js.UndefOr[String] = js.undefined
    
    /**
      * The string which will be put at the beginning of the css file.
      * @default ''
      */
    var header: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  type _To = js.Object & Header
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Header = ^
}
