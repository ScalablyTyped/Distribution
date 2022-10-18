package typings.mercadopago

import typings.mercadopago.modelsCustomersCreatePayloadDotmodelMod.CreateCustomerPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsCustomersUpdatePayloadDotmodelMod {
  
  trait UpdateCustomerPayload
    extends StObject
       with CreateCustomerPayload {
    
    /** Customer's id. */
    var id: String
  }
  object UpdateCustomerPayload {
    
    inline def apply(id: String): UpdateCustomerPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCustomerPayload]
    }
    
    extension [Self <: UpdateCustomerPayload](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
