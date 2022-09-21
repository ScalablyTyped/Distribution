package typings.postcssNormalizeCharset

import typings.postcss.mod.Plugin
import typings.postcssNormalizeCharset.postcssNormalizeCharsetBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {{add?: boolean}} Options
    */
  /**
    * @type {import('postcss').PluginCreator<Options>}
    * @param {Options} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(opts: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-normalize-charset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-normalize-charset", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var add: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    }
  }
}
