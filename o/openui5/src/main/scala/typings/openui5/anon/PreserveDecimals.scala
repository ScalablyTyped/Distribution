package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveDecimals extends StObject {
  
  /**
    * Whether the empty string and `null` are parsed to `0` if the `nullable` constraint is set to `false`;
    * see {@link #parseValue parseValue}; since 1.115.0
    */
  var parseEmptyValueToZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * by default decimals are preserved, unless `oFormatOptions.style` is given as "short" or "long"; since
    * 1.89.0
    */
  var preserveDecimals: js.UndefOr[Boolean] = js.undefined
}
object PreserveDecimals {
  
  inline def apply(): PreserveDecimals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveDecimals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreserveDecimals] (val x: Self) extends AnyVal {
    
    inline def setParseEmptyValueToZero(value: Boolean): Self = StObject.set(x, "parseEmptyValueToZero", value.asInstanceOf[js.Any])
    
    inline def setParseEmptyValueToZeroUndefined: Self = StObject.set(x, "parseEmptyValueToZero", js.undefined)
    
    inline def setPreserveDecimals(value: Boolean): Self = StObject.set(x, "preserveDecimals", value.asInstanceOf[js.Any])
    
    inline def setPreserveDecimalsUndefined: Self = StObject.set(x, "preserveDecimals", js.undefined)
  }
}
