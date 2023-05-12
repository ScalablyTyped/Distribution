package typings.postcssPresetEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPostcssInitialPluginOptionsMod {
  
  trait pluginOptions extends StObject {
    
    /** Preserve the original notation. default: false */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Describes what subset of rules should be unsetted with all property (to reduce code weight).
      * Possible subsets: all, inherited.
      * default: 'all'.
      * */
    var reset: js.UndefOr[String] = js.undefined
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
      
      inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    }
  }
}
