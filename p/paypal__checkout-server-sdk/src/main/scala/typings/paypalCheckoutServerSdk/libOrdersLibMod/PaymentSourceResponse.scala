package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentSourceResponse extends StObject {
  
  var card: CardResponse
}
object PaymentSourceResponse {
  
  inline def apply(card: CardResponse): PaymentSourceResponse = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setCard(value: CardResponse): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
  }
}
