package typings.postcssModulesLocalByDefault

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssModulesLocalByDefault.mod.localByDefault.Options
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.global
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.local
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.pure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-local-by-default", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
  
  object localByDefault {
    
    trait Options extends StObject {
      
      var mode: js.UndefOr[global | local | pure] = js.undefined
      
      var rewriteUrl: js.UndefOr[js.Function2[/* global */ Boolean, /* url */ String, String]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setMode(value: global | local | pure): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setRewriteUrl(value: (/* global */ Boolean, /* url */ String) => String): Self = StObject.set(x, "rewriteUrl", js.Any.fromFunction2(value))
        
        inline def setRewriteUrlUndefined: Self = StObject.set(x, "rewriteUrl", js.undefined)
      }
    }
  }
}
