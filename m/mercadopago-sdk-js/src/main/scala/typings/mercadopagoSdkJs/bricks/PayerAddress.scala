package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayerAddress extends StObject {
  
  var city: js.UndefOr[String] = js.undefined
  
  var complement: js.UndefOr[String] = js.undefined
  
  var federalUnit: js.UndefOr[String] = js.undefined
  
  var neighborhood: js.UndefOr[String] = js.undefined
  
  var streetName: js.UndefOr[String] = js.undefined
  
  var streetNumber: js.UndefOr[String] = js.undefined
  
  var zipCode: js.UndefOr[String] = js.undefined
}
object PayerAddress {
  
  inline def apply(): PayerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayerAddress] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setComplement(value: String): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
    
    inline def setComplementUndefined: Self = StObject.set(x, "complement", js.undefined)
    
    inline def setFederalUnit(value: String): Self = StObject.set(x, "federalUnit", value.asInstanceOf[js.Any])
    
    inline def setFederalUnitUndefined: Self = StObject.set(x, "federalUnit", js.undefined)
    
    inline def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
    
    inline def setNeighborhoodUndefined: Self = StObject.set(x, "neighborhood", js.undefined)
    
    inline def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
    
    inline def setStreetNameUndefined: Self = StObject.set(x, "streetName", js.undefined)
    
    inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
    
    inline def setStreetNumberUndefined: Self = StObject.set(x, "streetNumber", js.undefined)
    
    inline def setZipCode(value: String): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    
    inline def setZipCodeUndefined: Self = StObject.set(x, "zipCode", js.undefined)
  }
}
