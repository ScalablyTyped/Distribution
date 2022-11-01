package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceOptions extends StObject {
  
  var orders: js.UndefOr[String] = js.undefined
  
  var sourcecrs: js.UndefOr[CoordinatesType] = js.undefined
  
  var targetcrs: js.UndefOr[CoordinatesType] = js.undefined
}
object ServiceOptions {
  
  inline def apply(): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions]
  }
  
  extension [Self <: ServiceOptions](x: Self) {
    
    inline def setOrders(value: String): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    inline def setSourcecrs(value: CoordinatesType): Self = StObject.set(x, "sourcecrs", value.asInstanceOf[js.Any])
    
    inline def setSourcecrsUndefined: Self = StObject.set(x, "sourcecrs", js.undefined)
    
    inline def setTargetcrs(value: CoordinatesType): Self = StObject.set(x, "targetcrs", value.asInstanceOf[js.Any])
    
    inline def setTargetcrsUndefined: Self = StObject.set(x, "targetcrs", js.undefined)
  }
}
