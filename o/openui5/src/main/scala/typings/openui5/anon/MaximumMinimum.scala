package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumMinimum extends StObject {
  
  /**
    * Largest value allowed for this type. Values for constraints must use the same type as configured via
    * `oFormatOptions.source`.
    */
  var maximum: js.UndefOr[js.Date | String] = js.undefined
  
  /**
    * Smallest value allowed for this type. Values for constraints must use the same type as configured via
    * `oFormatOptions.source`.
    */
  var minimum: js.UndefOr[js.Date | String] = js.undefined
}
object MaximumMinimum {
  
  inline def apply(): MaximumMinimum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumMinimum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaximumMinimum] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: js.Date | String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: js.Date | String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
