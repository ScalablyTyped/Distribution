package typings.postcssModulesResolveImports

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-resolve-imports", JSImport.Namespace)
  @js.native
  val ^ : ResolveImports = js.native
  
  @js.native
  trait Options extends StObject {
    
    var icssExports: js.UndefOr[Boolean] = js.native
    
    var resolve: js.UndefOr[Resolve] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcssExports(value: Boolean): Self = StObject.set(x, "icssExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcssExportsUndefined: Self = StObject.set(x, "icssExports", js.undefined)
      
      @scala.inline
      def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  @js.native
  trait Resolve extends StObject {
    
    var alias: js.UndefOr[StringDictionary[String]] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var mainFile: js.UndefOr[String] = js.native
    
    var modules: js.UndefOr[js.Array[String]] = js.native
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.native
  }
  object Resolve {
    
    @scala.inline
    def apply(): Resolve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolve]
    }
    
    @scala.inline
    implicit class ResolveMutableBuilder[Self <: Resolve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: StringDictionary[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setMainFile(value: String): Self = StObject.set(x, "mainFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFileUndefined: Self = StObject.set(x, "mainFile", js.undefined)
      
      @scala.inline
      def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
      
      @scala.inline
      def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    }
  }
  
  type ResolveImports = Plugin_[Options]
  
  type _To = ResolveImports
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ResolveImports = ^
}
