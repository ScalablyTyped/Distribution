package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalsMaximum extends StObject {
  
  /**
    * Largest number of decimals allowed for this type
    */
  var decimals: js.UndefOr[float] = js.undefined
  
  /**
    * Largest value allowed for this type
    */
  var maximum: js.UndefOr[float] = js.undefined
  
  /**
    * Smallest value allowed for this type
    */
  var minimum: js.UndefOr[float] = js.undefined
}
object DecimalsMaximum {
  
  inline def apply(): DecimalsMaximum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalsMaximum]
  }
  
  extension [Self <: DecimalsMaximum](x: Self) {
    
    inline def setDecimals(value: float): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setMaximum(value: float): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: float): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
