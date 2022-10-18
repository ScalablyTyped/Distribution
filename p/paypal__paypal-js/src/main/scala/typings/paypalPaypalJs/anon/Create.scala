package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisOrdersMod.CreateOrderRequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  /** Used to create an order for client-side integrations. Accepts the same options as the request body of the [/v2/checkout/orders api](https://developer.paypal.com/docs/api/orders/v2/#orders-create-request-body). */
  def create(options: CreateOrderRequestBody): js.Promise[String]
}
object Create {
  
  inline def apply(create: CreateOrderRequestBody => js.Promise[String]): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create]
  }
  
  extension [Self <: Create](x: Self) {
    
    inline def setCreate(value: CreateOrderRequestBody => js.Promise[String]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
