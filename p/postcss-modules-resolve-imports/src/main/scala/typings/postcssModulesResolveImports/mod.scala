package typings.postcssModulesResolveImports

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-resolve-imports", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ResolveImports = js.native
  
  trait Options extends StObject {
    
    var icssExports: js.UndefOr[Boolean] = js.undefined
    
    var resolve: js.UndefOr[Resolve] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIcssExports(value: Boolean): Self = StObject.set(x, "icssExports", value.asInstanceOf[js.Any])
      
      inline def setIcssExportsUndefined: Self = StObject.set(x, "icssExports", js.undefined)
      
      inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  trait Resolve extends StObject {
    
    var alias: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var mainFile: js.UndefOr[String] = js.undefined
    
    var modules: js.UndefOr[js.Array[String]] = js.undefined
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  }
  object Resolve {
    
    inline def apply(): Resolve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolve]
    }
    
    extension [Self <: Resolve](x: Self) {
      
      inline def setAlias(value: StringDictionary[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setMainFile(value: String): Self = StObject.set(x, "mainFile", value.asInstanceOf[js.Any])
      
      inline def setMainFileUndefined: Self = StObject.set(x, "mainFile", js.undefined)
      
      inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    }
  }
  
  type ResolveImports = Plugin
  
  type _To = js.Object & ResolveImports
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ResolveImports = ^
}
