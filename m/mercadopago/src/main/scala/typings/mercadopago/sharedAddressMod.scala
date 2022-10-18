package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedAddressMod {
  
  trait Address
    extends StObject
       with SimpleAddress {
    
    var apartment: js.UndefOr[String] = js.undefined
    
    var floor: js.UndefOr[String] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
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
    
    inline def apply(city_name: String, state_name: String): CompleteAddress = {
      val __obj = js.Dynamic.literal(city_name = city_name.asInstanceOf[js.Any], state_name = state_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteAddress]
    }
    
    extension [Self <: CompleteAddress](x: Self) {
      
      inline def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
      
      inline def setState_name(value: String): Self = StObject.set(x, "state_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleAddress extends StObject {
    
    var street_name: js.UndefOr[String] = js.undefined
    
    var street_number: js.UndefOr[Double] = js.undefined
    
    var zip_code: js.UndefOr[String] = js.undefined
  }
  object SimpleAddress {
    
    inline def apply(): SimpleAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleAddress]
    }
    
    extension [Self <: SimpleAddress](x: Self) {
      
      inline def setStreet_name(value: String): Self = StObject.set(x, "street_name", value.asInstanceOf[js.Any])
      
      inline def setStreet_nameUndefined: Self = StObject.set(x, "street_name", js.undefined)
      
      inline def setStreet_number(value: Double): Self = StObject.set(x, "street_number", value.asInstanceOf[js.Any])
      
      inline def setStreet_numberUndefined: Self = StObject.set(x, "street_number", js.undefined)
      
      inline def setZip_code(value: String): Self = StObject.set(x, "zip_code", value.asInstanceOf[js.Any])
      
      inline def setZip_codeUndefined: Self = StObject.set(x, "zip_code", js.undefined)
    }
  }
  
  trait SimpleAddressId
    extends StObject
       with SimpleAddress {
    
    /** Identificador do endereço do cliente. */
    var id: js.UndefOr[String] = js.undefined
  }
  object SimpleAddressId {
    
    inline def apply(): SimpleAddressId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleAddressId]
    }
    
    extension [Self <: SimpleAddressId](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
