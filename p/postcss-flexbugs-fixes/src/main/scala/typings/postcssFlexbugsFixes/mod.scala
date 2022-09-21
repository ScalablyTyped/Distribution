package typings.postcssFlexbugsFixes

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-flexbugs-fixes", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PostcssFlexbugsFixesPlugin = js.native
  
  trait Options extends StObject {
    
    /**
      * @default true
      */
    var bug4: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var bug6: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var bug81a: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBug4(value: Boolean): Self = StObject.set(x, "bug4", value.asInstanceOf[js.Any])
      
      inline def setBug4Undefined: Self = StObject.set(x, "bug4", js.undefined)
      
      inline def setBug6(value: Boolean): Self = StObject.set(x, "bug6", value.asInstanceOf[js.Any])
      
      inline def setBug6Undefined: Self = StObject.set(x, "bug6", js.undefined)
      
      inline def setBug81a(value: Boolean): Self = StObject.set(x, "bug81a", value.asInstanceOf[js.Any])
      
      inline def setBug81aUndefined: Self = StObject.set(x, "bug81a", js.undefined)
    }
  }
  
  type PostcssFlexbugsFixesPlugin = Plugin
  
  type _To = js.Object & PostcssFlexbugsFixesPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & PostcssFlexbugsFixesPlugin = ^
}
