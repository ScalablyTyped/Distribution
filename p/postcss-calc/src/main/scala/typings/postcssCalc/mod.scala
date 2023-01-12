package typings.postcssCalc

import typings.postcss.mod.Plugin
import typings.postcssCalc.postcssCalcBooleans.`false`
import typings.postcssCalc.postcssCalcBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {{precision?: number | false,
    *          preserve?: boolean,
    *          warnWhenCannotResolve?: boolean,
    *          mediaQueries?: boolean,
    *          selectors?: boolean}} PostCssCalcOptions
    */
  /**
    * @type {import('postcss').PluginCreator<PostCssCalcOptions>}
    * @param {PostCssCalcOptions} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(opts: PostCssCalcOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-calc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-calc", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  trait PostCssCalcOptions extends StObject {
    
    var mediaQueries: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double | `false`] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var selectors: js.UndefOr[Boolean] = js.undefined
    
    var warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
  }
  object PostCssCalcOptions {
    
    inline def apply(): PostCssCalcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostCssCalcOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostCssCalcOptions] (val x: Self) extends AnyVal {
      
      inline def setMediaQueries(value: Boolean): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
      
      inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
      
      inline def setPrecision(value: Double | `false`): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSelectors(value: Boolean): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setWarnWhenCannotResolve(value: Boolean): Self = StObject.set(x, "warnWhenCannotResolve", value.asInstanceOf[js.Any])
      
      inline def setWarnWhenCannotResolveUndefined: Self = StObject.set(x, "warnWhenCannotResolve", js.undefined)
    }
  }
}
