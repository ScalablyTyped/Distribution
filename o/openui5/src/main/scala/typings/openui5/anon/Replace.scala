package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replace extends StObject {
  
  /**
    * Switch for the `replace` type which specifies that an item within the array has been changed
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function to calculate substitute symbols for array items
    */
  var symbol: js.UndefOr[js.Function] = js.undefined
}
object Replace {
  
  inline def apply(): Replace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replace]
  }
  
  extension [Self <: Replace](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setSymbol(value: js.Function): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
