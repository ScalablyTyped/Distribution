package typings.postcssModulesScope

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssModulesScope.anon.Key
import typings.postcssModulesScope.mod.scope.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-scope", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
  
  object scope {
    
    trait Options extends StObject {
      
      var generateExportEntry: js.UndefOr[
            js.Function4[/* name */ String, /* scopedName */ String, /* path */ String, /* css */ String, Key]
          ] = js.undefined
      
      var generateScopedName: js.UndefOr[js.Function3[/* name */ String, /* path */ String, /* css */ String, String]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setGenerateExportEntry(value: (/* name */ String, /* scopedName */ String, /* path */ String, /* css */ String) => Key): Self = StObject.set(x, "generateExportEntry", js.Any.fromFunction4(value))
        
        inline def setGenerateExportEntryUndefined: Self = StObject.set(x, "generateExportEntry", js.undefined)
        
        inline def setGenerateScopedName(value: (/* name */ String, /* path */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
        
        inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
      }
    }
  }
}
