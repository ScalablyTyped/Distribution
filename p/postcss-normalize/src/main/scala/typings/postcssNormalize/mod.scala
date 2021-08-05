package typings.postcssNormalize

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import typings.postcssNormalize.mod.Normalize.NormalizePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-normalize", JSImport.Namespace)
  @js.native
  val ^ : NormalizePlugin = js.native
  
  object Normalize {
    
    type NormalizePlugin = Plugin_[Options]
    
    trait Options extends StObject {
      
      /**
        * @default false
        */
      var allowDuplicates: js.UndefOr[Boolean] = js.undefined
      
      /**
        * @default null
        */
      var browsers: js.UndefOr[String] = js.undefined
      
      /**
        * @default null
        */
      var forceImport: js.UndefOr[Boolean | String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
        
        inline def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
        
        inline def setBrowsers(value: String): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
        
        inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
        
        inline def setForceImport(value: Boolean | String): Self = StObject.set(x, "forceImport", value.asInstanceOf[js.Any])
        
        inline def setForceImportUndefined: Self = StObject.set(x, "forceImport", js.undefined)
      }
    }
  }
  
  type _To = NormalizePlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NormalizePlugin = ^
}
