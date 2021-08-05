package typings.postcssGapProperties

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import typings.postcssGapProperties.mod.GapProperties.GapPropertiesPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-gap-properties", JSImport.Namespace)
  @js.native
  val ^ : GapPropertiesPlugin = js.native
  
  object GapProperties {
    
    type GapPropertiesPlugin = Plugin_[Options]
    
    trait Options extends StObject {
      
      /**
        * @default true
        */
      var preserve: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
        
        inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      }
    }
  }
  
  type _To = GapPropertiesPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GapPropertiesPlugin = ^
}
