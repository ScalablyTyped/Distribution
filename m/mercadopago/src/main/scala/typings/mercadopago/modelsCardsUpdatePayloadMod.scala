package typings.mercadopago

import typings.mercadopago.modelsCardsCreatePayloadMod.CreateCardPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsCardsUpdatePayloadMod {
  
  trait UpdateCardPayload
    extends StObject
       with CreateCardPayload {
    
    /** Card id */
    var id: Double | String
  }
  object UpdateCardPayload {
    
    inline def apply(customer_id: String, id: Double | String, token: String): UpdateCardPayload = {
      val __obj = js.Dynamic.literal(customer_id = customer_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCardPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateCardPayload] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
