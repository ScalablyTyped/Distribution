package typings.momentLocalesWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IgnoreInvalidLocales extends StObject {
    
    /** Ignore invalid or unsupported locales in `localesToKeep`. */
    var ignoreInvalidLocales: js.UndefOr[Boolean] = js.undefined
    
    /** An array of locales to keep bundled (other locales are removed). */
    var localesToKeep: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IgnoreInvalidLocales {
    
    inline def apply(): IgnoreInvalidLocales = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreInvalidLocales]
    }
    
    extension [Self <: IgnoreInvalidLocales](x: Self) {
      
      inline def setIgnoreInvalidLocales(value: Boolean): Self = StObject.set(x, "ignoreInvalidLocales", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInvalidLocalesUndefined: Self = StObject.set(x, "ignoreInvalidLocales", js.undefined)
      
      inline def setLocalesToKeep(value: js.Array[String]): Self = StObject.set(x, "localesToKeep", value.asInstanceOf[js.Any])
      
      inline def setLocalesToKeepUndefined: Self = StObject.set(x, "localesToKeep", js.undefined)
      
      inline def setLocalesToKeepVarargs(value: String*): Self = StObject.set(x, "localesToKeep", js.Array(value :_*))
    }
  }
}
