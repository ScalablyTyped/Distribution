package typings.postcssNestedAncestors

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-nested-ancestors", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  trait Options extends StObject {
    
    /**
      * Symbol to move up a level of nesting
      * @default '^'
      */
    var levelSymbol: js.UndefOr[String] = js.undefined
    
    /**
      * Symbol to target parent
      * @default '&'
      */
    var parentSymbol: js.UndefOr[String] = js.undefined
    
    /**
      * Ancestor selector pattern (utility option to automatically set both `levelSymbol` and `parentSymbol`)
      * @default '^&'
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * @experimental
      * Whether to look through CSS for nested ancestor symbols and replace them with the relevant tag
      * @see {@link <https://github.com/toomuchdesign/postcss-nested-ancestors#replacedeclarations-experimental>}
      * @default false
      */
    var replaceDeclarations: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLevelSymbol(value: String): Self = StObject.set(x, "levelSymbol", value.asInstanceOf[js.Any])
      
      inline def setLevelSymbolUndefined: Self = StObject.set(x, "levelSymbol", js.undefined)
      
      inline def setParentSymbol(value: String): Self = StObject.set(x, "parentSymbol", value.asInstanceOf[js.Any])
      
      inline def setParentSymbolUndefined: Self = StObject.set(x, "parentSymbol", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReplaceDeclarations(value: Boolean): Self = StObject.set(x, "replaceDeclarations", value.asInstanceOf[js.Any])
      
      inline def setReplaceDeclarationsUndefined: Self = StObject.set(x, "replaceDeclarations", js.undefined)
    }
  }
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
}
