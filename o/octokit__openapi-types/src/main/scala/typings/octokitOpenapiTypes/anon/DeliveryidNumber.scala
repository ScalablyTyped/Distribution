package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryidNumber extends StObject {
  
  var delivery_id: Double
}
object DeliveryidNumber {
  
  inline def apply(delivery_id: Double): DeliveryidNumber = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryidNumber]
  }
  
  extension [Self <: DeliveryidNumber](x: Self) {
    
    inline def setDelivery_id(value: Double): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
  }
}
