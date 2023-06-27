package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayerAPI extends StObject {
  
  var address: js.UndefOr[PayerAddressAPI] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var entity_type: js.UndefOr[EntityType] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var identification: js.UndefOr[PayerIdentification] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
}
object PayerAPI {
  
  inline def apply(): PayerAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayerAPI] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: PayerAddressAPI): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEntity_type(value: EntityType): Self = StObject.set(x, "entity_type", value.asInstanceOf[js.Any])
    
    inline def setEntity_typeUndefined: Self = StObject.set(x, "entity_type", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setIdentification(value: PayerIdentification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
    
    inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
  }
}
