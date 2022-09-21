package typings.postcssDiscardComments

import typings.postcss.mod.Plugin
import typings.postcssDiscardComments.postcssDiscardCommentsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {object} Options
    *  @property {boolean=} removeAll
    *  @property {boolean=} removeAllButFirst
    *  @property {(s: string) => boolean=} remove
    */
  /**
    * @type {import('postcss').PluginCreator<Options>}
    * @param {Options} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(opts: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-discard-comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-discard-comments", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var remove: js.UndefOr[js.Function1[/* s */ String, Boolean]] = js.undefined
    
    var removeAll: js.UndefOr[Boolean] = js.undefined
    
    var removeAllButFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRemove(value: /* s */ String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAll(value: Boolean): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllButFirst(value: Boolean): Self = StObject.set(x, "removeAllButFirst", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllButFirstUndefined: Self = StObject.set(x, "removeAllButFirst", js.undefined)
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
}
