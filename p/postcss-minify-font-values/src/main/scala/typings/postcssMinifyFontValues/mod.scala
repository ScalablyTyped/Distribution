package typings.postcssMinifyFontValues

import typings.postcss.mod.Plugin
import typings.postcssMinifyFontValues.postcssMinifyFontValuesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {{removeAfterKeyword?: boolean, removeDuplicates?: boolean, removeQuotes?: boolean}} Options */
  /**
    * @type {import('postcss').PluginCreator<Options>}
    * @param {Options} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(opts: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-minify-font-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-minify-font-values", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var removeAfterKeyword: js.UndefOr[Boolean] = js.undefined
    
    var removeDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var removeQuotes: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRemoveAfterKeyword(value: Boolean): Self = StObject.set(x, "removeAfterKeyword", value.asInstanceOf[js.Any])
      
      inline def setRemoveAfterKeywordUndefined: Self = StObject.set(x, "removeAfterKeyword", js.undefined)
      
      inline def setRemoveDuplicates(value: Boolean): Self = StObject.set(x, "removeDuplicates", value.asInstanceOf[js.Any])
      
      inline def setRemoveDuplicatesUndefined: Self = StObject.set(x, "removeDuplicates", js.undefined)
      
      inline def setRemoveQuotes(value: Boolean): Self = StObject.set(x, "removeQuotes", value.asInstanceOf[js.Any])
      
      inline def setRemoveQuotesUndefined: Self = StObject.set(x, "removeQuotes", js.undefined)
    }
  }
}
