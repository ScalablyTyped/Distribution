package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  trait Address
    extends StObject
       with SimpleAddress {
    
    var apartment: js.UndefOr[String] = js.undefined
    
    var floor: js.UndefOr[String] = js.undefined
  }
  object Address {
    
    inline def apply(street_name: String, street_number: String, zip_code: String): Address = {
      val __obj = js.Dynamic.literal(street_name = street_name.asInstanceOf[js.Any], street_number = street_number.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setApartment(value: String): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
      
      inline def setApartmentUndefined: Self = StObject.set(x, "apartment", js.undefined)
      
      inline def setFloor(value: String): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    }
  }
  
  trait CompleteAddress
    extends StObject
       with Address {
    
    var city_name: String
    
    var state_name: String
  }
  object CompleteAddress {
    
    inline def apply(
      city_name: String,
      state_name: String,
      street_name: String,
      street_number: String,
      zip_code: String
    ): CompleteAddress = {
      val __obj = js.Dynamic.literal(city_name = city_name.asInstanceOf[js.Any], state_name = state_name.asInstanceOf[js.Any], street_name = street_name.asInstanceOf[js.Any], street_number = street_number.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteAddress]
    }
    
    extension [Self <: CompleteAddress](x: Self) {
      
      inline def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
      
      inline def setState_name(value: String): Self = StObject.set(x, "state_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleAddress extends StObject {
    
    var street_name: String
    
    var street_number: String
    
    var zip_code: String
  }
  object SimpleAddress {
    
    inline def apply(street_name: String, street_number: String, zip_code: String): SimpleAddress = {
      val __obj = js.Dynamic.literal(street_name = street_name.asInstanceOf[js.Any], street_number = street_number.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleAddress]
    }
    
    extension [Self <: SimpleAddress](x: Self) {
      
      inline def setStreet_name(value: String): Self = StObject.set(x, "street_name", value.asInstanceOf[js.Any])
      
      inline def setStreet_number(value: String): Self = StObject.set(x, "street_number", value.asInstanceOf[js.Any])
      
      inline def setZip_code(value: String): Self = StObject.set(x, "zip_code", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleAddressId
    extends StObject
       with SimpleAddress {
    
    /** Identificador do endereço do cliente. */
    var id: js.UndefOr[String] = js.undefined
  }
  object SimpleAddressId {
    
    inline def apply(street_name: String, street_number: String, zip_code: String): SimpleAddressId = {
      val __obj = js.Dynamic.literal(street_name = street_name.asInstanceOf[js.Any], street_number = street_number.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleAddressId]
    }
    
    extension [Self <: SimpleAddressId](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
