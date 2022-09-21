package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalseatsconsumed extends StObject {
  
  var total_seats_consumed: js.UndefOr[Double] = js.undefined
  
  var total_seats_purchased: js.UndefOr[Double] = js.undefined
  
  var users: js.UndefOr[js.Array[Enterpriseserveremails]] = js.undefined
}
object Totalseatsconsumed {
  
  inline def apply(): Totalseatsconsumed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Totalseatsconsumed]
  }
  
  extension [Self <: Totalseatsconsumed](x: Self) {
    
    inline def setTotal_seats_consumed(value: Double): Self = StObject.set(x, "total_seats_consumed", value.asInstanceOf[js.Any])
    
    inline def setTotal_seats_consumedUndefined: Self = StObject.set(x, "total_seats_consumed", js.undefined)
    
    inline def setTotal_seats_purchased(value: Double): Self = StObject.set(x, "total_seats_purchased", value.asInstanceOf[js.Any])
    
    inline def setTotal_seats_purchasedUndefined: Self = StObject.set(x, "total_seats_purchased", js.undefined)
    
    inline def setUsers(value: js.Array[Enterpriseserveremails]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: Enterpriseserveremails*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
