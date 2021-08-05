package typings.postcssModulesScope

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-scope", JSImport.Namespace)
  @js.native
  val ^ : Scope = js.native
  
  trait Options extends StObject {
    
    var generateScopedName: js.UndefOr[
        js.Function3[/* exportedName */ String, /* path */ String, /* css */ String, String]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGenerateScopedName(value: (/* exportedName */ String, /* path */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
      
      inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
    }
  }
  
  type Scope = Plugin_[Options]
  
  type _To = Scope
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Scope = ^
}
