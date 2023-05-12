package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayerAddressAPI extends StObject {
  
  var city: String
  
  var federal_unit: String
  
  var neighborhood: String
  
  var street_name: String
  
  var street_number: String
  
  var zip_code: String
}
object PayerAddressAPI {
  
  inline def apply(
    city: String,
    federal_unit: String,
    neighborhood: String,
    street_name: String,
    street_number: String,
    zip_code: String
  ): PayerAddressAPI = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], federal_unit = federal_unit.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], street_name = street_name.asInstanceOf[js.Any], street_number = street_number.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayerAddressAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayerAddressAPI] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setFederal_unit(value: String): Self = StObject.set(x, "federal_unit", value.asInstanceOf[js.Any])
    
    inline def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
    
    inline def setStreet_name(value: String): Self = StObject.set(x, "street_name", value.asInstanceOf[js.Any])
    
    inline def setStreet_number(value: String): Self = StObject.set(x, "street_number", value.asInstanceOf[js.Any])
    
    inline def setZip_code(value: String): Self = StObject.set(x, "zip_code", value.asInstanceOf[js.Any])
  }
}
