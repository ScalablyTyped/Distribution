package typings.postcssFocusWithin

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-focus-within", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    /** Disable the selector prefix that is used to prevent a flash of incorrectly styled content. default: false */
    var disablePolyfillReadyClass: js.UndefOr[Boolean] = js.undefined
    
    /** Preserve the original notation. default: true */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /** The replacement class to be used in the polyfill. default: "[focus-within]" */
    var replaceWith: js.UndefOr[String] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setDisablePolyfillReadyClass(value: Boolean): Self = StObject.set(x, "disablePolyfillReadyClass", value.asInstanceOf[js.Any])
      
      inline def setDisablePolyfillReadyClassUndefined: Self = StObject.set(x, "disablePolyfillReadyClass", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    }
  }
}
