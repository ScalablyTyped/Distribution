package typings.postcssPresetEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPostcssClampPluginOptionsMod {
  
  trait pluginOptions extends StObject {
    
    /**
      * The precalculate option determines whether values with the same unit should be precalculated.
      * default: false
      */
    var precalculate: js.UndefOr[Boolean] = js.undefined
    
    /** Preserve the original notation. default: false */
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setPrecalculate(value: Boolean): Self = StObject.set(x, "precalculate", value.asInstanceOf[js.Any])
      
      inline def setPrecalculateUndefined: Self = StObject.set(x, "precalculate", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}
