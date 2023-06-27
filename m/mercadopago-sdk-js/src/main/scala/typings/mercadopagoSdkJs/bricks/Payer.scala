package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payer extends StObject {
  
  var address: js.UndefOr[PayerAddress] = js.undefined
  
  var cardsIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var customerId: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var entityType: js.UndefOr[EntityType] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var identification: js.UndefOr[PayerIdentification] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
}
object Payer {
  
  inline def apply(): Payer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payer] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: PayerAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCardsIds(value: js.Array[String]): Self = StObject.set(x, "cardsIds", value.asInstanceOf[js.Any])
    
    inline def setCardsIdsUndefined: Self = StObject.set(x, "cardsIds", js.undefined)
    
    inline def setCardsIdsVarargs(value: String*): Self = StObject.set(x, "cardsIds", js.Array(value*))
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setIdentification(value: PayerIdentification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
    
    inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
  }
}
