package typings.postcssImageSetFunction

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssImageSetFunction.postcssImageSetFunctionBooleans.`false`
import typings.postcssImageSetFunction.postcssImageSetFunctionStrings.`throw`
import typings.postcssImageSetFunction.postcssImageSetFunctionStrings.ignore
import typings.postcssImageSetFunction.postcssImageSetFunctionStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-image-set-function", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    /**
      * Determine how invalid usage of `image-set()` should be handled.
      * By default, invalid usages of `image-set()` are ignored.
      * They can be configured to emit a warning with `warn` or throw an exception with `throw`.
      * default: 'ignore'
      */
    var onInvalid: js.UndefOr[warn | `throw` | ignore | `false`] = js.undefined
    
    /** Preserve the original notation. default: true */
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setOnInvalid(value: warn | `throw` | ignore | `false`): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}
