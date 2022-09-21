package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in 'number' | 'cvv' | 'expirationDate' | 'expirationMonth' | 'expirationYear' | 'postalCode' ]:? {  container :std.HTMLElement,   isEmpty :boolean,   isFocused :boolean,   isPotentiallyValid :boolean,   isValid :boolean}} */
trait keyinnumbercvvexpirationD extends StObject {
  
  var cvv: js.UndefOr[Container] = js.undefined
  
  var expirationDate: js.UndefOr[Container] = js.undefined
  
  var expirationMonth: js.UndefOr[Container] = js.undefined
  
  var expirationYear: js.UndefOr[Container] = js.undefined
  
  var number: js.UndefOr[Container] = js.undefined
  
  var postalCode: js.UndefOr[Container] = js.undefined
}
object keyinnumbercvvexpirationD {
  
  inline def apply(): keyinnumbercvvexpirationD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinnumbercvvexpirationD]
  }
  
  extension [Self <: keyinnumbercvvexpirationD](x: Self) {
    
    inline def setCvv(value: Container): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    inline def setExpirationDate(value: Container): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExpirationMonth(value: Container): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: Container): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setNumber(value: Container): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPostalCode(value: Container): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
  }
}
