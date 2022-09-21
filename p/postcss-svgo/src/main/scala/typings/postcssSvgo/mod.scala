package typings.postcssSvgo

import typings.postcss.mod.Plugin
import typings.postcssSvgo.postcssSvgoBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {{encode?: boolean, plugins?: object[]} & import('svgo').OptimizeOptions} Options */
  /**
    * @type {import('postcss').PluginCreator<Options>}
    * @param {Options} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(opts: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-svgo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-svgo", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_svgo.OptimizeOptions * / any */ trait Options extends StObject {
    
    var encode: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
