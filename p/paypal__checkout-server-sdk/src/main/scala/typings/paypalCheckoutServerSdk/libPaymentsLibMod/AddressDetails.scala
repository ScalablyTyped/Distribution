package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressDetails extends StObject {
  
  var building_name: String
  
  var delivery_service: String
  
  var street_name: String
  
  var street_number: String
  
  var street_type: String
  
  var sub_building: String
}
object AddressDetails {
  
  inline def apply(
    building_name: String,
    delivery_service: String,
    street_name: String,
    street_number: String,
    street_type: String,
    sub_building: String
  ): AddressDetails = {
    val __obj = js.Dynamic.literal(building_name = building_name.asInstanceOf[js.Any], delivery_service = delivery_service.asInstanceOf[js.Any], street_name = street_name.asInstanceOf[js.Any], street_number = street_number.asInstanceOf[js.Any], street_type = street_type.asInstanceOf[js.Any], sub_building = sub_building.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressDetails]
  }
  
  extension [Self <: AddressDetails](x: Self) {
    
    inline def setBuilding_name(value: String): Self = StObject.set(x, "building_name", value.asInstanceOf[js.Any])
    
    inline def setDelivery_service(value: String): Self = StObject.set(x, "delivery_service", value.asInstanceOf[js.Any])
    
    inline def setStreet_name(value: String): Self = StObject.set(x, "street_name", value.asInstanceOf[js.Any])
    
    inline def setStreet_number(value: String): Self = StObject.set(x, "street_number", value.asInstanceOf[js.Any])
    
    inline def setStreet_type(value: String): Self = StObject.set(x, "street_type", value.asInstanceOf[js.Any])
    
    inline def setSub_building(value: String): Self = StObject.set(x, "sub_building", value.asInstanceOf[js.Any])
  }
}
