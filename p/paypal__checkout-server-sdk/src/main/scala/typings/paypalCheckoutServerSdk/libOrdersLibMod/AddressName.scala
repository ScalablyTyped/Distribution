package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.AddressDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressName extends StObject {
  
  var address_details: js.UndefOr[AddressDetails] = js.undefined
  
  var address_line_1: js.UndefOr[String] = js.undefined
  
  var address_line_2: js.UndefOr[String] = js.undefined
  
  var address_line_3: js.UndefOr[String] = js.undefined
  
  var addressee: js.UndefOr[String] = js.undefined
  
  var admin_area_1: js.UndefOr[String] = js.undefined
  
  var admin_area_2: js.UndefOr[String] = js.undefined
  
  var admin_area_3: js.UndefOr[String] = js.undefined
  
  var admin_area_4: js.UndefOr[String] = js.undefined
  
  var country_code: String
  
  var postal_code: js.UndefOr[String] = js.undefined
}
object AddressName {
  
  inline def apply(country_code: String): AddressName = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressName]
  }
  
  extension [Self <: AddressName](x: Self) {
    
    inline def setAddress_details(value: AddressDetails): Self = StObject.set(x, "address_details", value.asInstanceOf[js.Any])
    
    inline def setAddress_detailsUndefined: Self = StObject.set(x, "address_details", js.undefined)
    
    inline def setAddress_line_1(value: String): Self = StObject.set(x, "address_line_1", value.asInstanceOf[js.Any])
    
    inline def setAddress_line_1Undefined: Self = StObject.set(x, "address_line_1", js.undefined)
    
    inline def setAddress_line_2(value: String): Self = StObject.set(x, "address_line_2", value.asInstanceOf[js.Any])
    
    inline def setAddress_line_2Undefined: Self = StObject.set(x, "address_line_2", js.undefined)
    
    inline def setAddress_line_3(value: String): Self = StObject.set(x, "address_line_3", value.asInstanceOf[js.Any])
    
    inline def setAddress_line_3Undefined: Self = StObject.set(x, "address_line_3", js.undefined)
    
    inline def setAddressee(value: String): Self = StObject.set(x, "addressee", value.asInstanceOf[js.Any])
    
    inline def setAddresseeUndefined: Self = StObject.set(x, "addressee", js.undefined)
    
    inline def setAdmin_area_1(value: String): Self = StObject.set(x, "admin_area_1", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_1Undefined: Self = StObject.set(x, "admin_area_1", js.undefined)
    
    inline def setAdmin_area_2(value: String): Self = StObject.set(x, "admin_area_2", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_2Undefined: Self = StObject.set(x, "admin_area_2", js.undefined)
    
    inline def setAdmin_area_3(value: String): Self = StObject.set(x, "admin_area_3", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_3Undefined: Self = StObject.set(x, "admin_area_3", js.undefined)
    
    inline def setAdmin_area_4(value: String): Self = StObject.set(x, "admin_area_4", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_4Undefined: Self = StObject.set(x, "admin_area_4", js.undefined)
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
  }
}
