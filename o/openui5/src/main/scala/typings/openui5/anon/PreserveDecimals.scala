package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveDecimals extends StObject {
  
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
  
  extension [Self <: PreserveDecimals](x: Self) {
    
    inline def setPreserveDecimals(value: Boolean): Self = StObject.set(x, "preserveDecimals", value.asInstanceOf[js.Any])
    
    inline def setPreserveDecimalsUndefined: Self = StObject.set(x, "preserveDecimals", js.undefined)
  }
}
