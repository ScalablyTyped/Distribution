package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionsRoot extends StObject {
  
  var bookingBusinesses: js.UndefOr[NullableOption[js.Array[BookingBusiness]]] = js.undefined
  
  var bookingCurrencies: js.UndefOr[NullableOption[js.Array[BookingCurrency]]] = js.undefined
}
object SolutionsRoot {
  
  inline def apply(): SolutionsRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionsRoot]
  }
  
  extension [Self <: SolutionsRoot](x: Self) {
    
    inline def setBookingBusinesses(value: NullableOption[js.Array[BookingBusiness]]): Self = StObject.set(x, "bookingBusinesses", value.asInstanceOf[js.Any])
    
    inline def setBookingBusinessesNull: Self = StObject.set(x, "bookingBusinesses", null)
    
    inline def setBookingBusinessesUndefined: Self = StObject.set(x, "bookingBusinesses", js.undefined)
    
    inline def setBookingBusinessesVarargs(value: BookingBusiness*): Self = StObject.set(x, "bookingBusinesses", js.Array(value*))
    
    inline def setBookingCurrencies(value: NullableOption[js.Array[BookingCurrency]]): Self = StObject.set(x, "bookingCurrencies", value.asInstanceOf[js.Any])
    
    inline def setBookingCurrenciesNull: Self = StObject.set(x, "bookingCurrencies", null)
    
    inline def setBookingCurrenciesUndefined: Self = StObject.set(x, "bookingCurrencies", js.undefined)
    
    inline def setBookingCurrenciesVarargs(value: BookingCurrency*): Self = StObject.set(x, "bookingCurrencies", js.Array(value*))
  }
}
