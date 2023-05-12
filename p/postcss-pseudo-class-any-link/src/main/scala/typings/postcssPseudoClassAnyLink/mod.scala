package typings.postcssPseudoClassAnyLink

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssPseudoClassAnyLink.anon.AreaHrefNeedsFixing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-pseudo-class-any-link", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    /** Preserve the original notation. default: true */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /** Add an extra fallback for the "<area>" element in IE and Edge. default: false */
    var subFeatures: js.UndefOr[AreaHrefNeedsFixing] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSubFeatures(value: AreaHrefNeedsFixing): Self = StObject.set(x, "subFeatures", value.asInstanceOf[js.Any])
      
      inline def setSubFeaturesUndefined: Self = StObject.set(x, "subFeatures", js.undefined)
    }
  }
}
