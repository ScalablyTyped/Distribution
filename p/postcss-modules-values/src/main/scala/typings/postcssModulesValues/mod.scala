package typings.postcssModulesValues

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssModulesValues.mod.values.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-values", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
  
  object values {
    
    trait Options extends StObject {
      
      def createImportedName(name: String): String
    }
    object Options {
      
      inline def apply(createImportedName: String => String): Options = {
        val __obj = js.Dynamic.literal(createImportedName = js.Any.fromFunction1(createImportedName))
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCreateImportedName(value: String => String): Self = StObject.set(x, "createImportedName", js.Any.fromFunction1(value))
      }
    }
  }
}
