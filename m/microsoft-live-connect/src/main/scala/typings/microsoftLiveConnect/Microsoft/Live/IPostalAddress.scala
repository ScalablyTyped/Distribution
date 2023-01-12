package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about one postal address.
  */
trait IPostalAddress extends StObject {
  
  /**
    * The city of the address, or null if one is not specified.
    */
  var city: String
  
  /**
    * The postal code of the address, or null if one is not specified.
    */
  var postal_code: String
  
  /**
    * The region of the address, or null if one is not specified.
    */
  var region: String
  
  /**
    * The state of the address, or null if one is not specified.
    */
  var state: String
  
  /**
    * The street address, or null if one is not specified.
    */
  var street: String
  
  /**
    * The second line of the street address, or null if one is not
    * specified.
    */
  var street_2: String
}
object IPostalAddress {
  
  inline def apply(city: String, postal_code: String, region: String, state: String, street: String, street_2: String): IPostalAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], street_2 = street_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostalAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPostalAddress] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreet_2(value: String): Self = StObject.set(x, "street_2", value.asInstanceOf[js.Any])
  }
}
