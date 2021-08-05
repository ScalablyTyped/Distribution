package typings.postcssModulesExtractImports

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-extract-imports", JSImport.Namespace)
  @js.native
  val ^ : ExtractImports = js.native
  
  type ExtractImports = Plugin_[Options]
  
  trait Options extends StObject {
    
    var createImportedName: js.UndefOr[js.Function2[/* importName */ String, /* importPath */ String, String]] = js.undefined
    
    var failOnWrongOrder: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCreateImportedName(value: (/* importName */ String, /* importPath */ String) => String): Self = StObject.set(x, "createImportedName", js.Any.fromFunction2(value))
      
      inline def setCreateImportedNameUndefined: Self = StObject.set(x, "createImportedName", js.undefined)
      
      inline def setFailOnWrongOrder(value: Boolean): Self = StObject.set(x, "failOnWrongOrder", value.asInstanceOf[js.Any])
      
      inline def setFailOnWrongOrderUndefined: Self = StObject.set(x, "failOnWrongOrder", js.undefined)
    }
  }
  
  type _To = ExtractImports
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ExtractImports = ^
}
