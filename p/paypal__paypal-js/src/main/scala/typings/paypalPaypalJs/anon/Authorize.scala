package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisOrdersMod.OrderResponseBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorize extends StObject {
  
  /**
    * Authorizes payment for an order.
    * To successfully authorize payment for an order,
    * the buyer must first approve the order or a valid payment_source must be provided in the request
    */
  def authorize(): js.Promise[OrderResponseBody]
  
  /**
    * Captures payment for an order.
    * To successfully capture payment for an order,the buyer must first
    * approve the order or a valid `payment_source` must be provided in the request
    */
  def capture(): js.Promise[OrderResponseBody]
  
  /**
    * Shows details for an order, by ID
    */
  def get(): js.Promise[OrderResponseBody]
  
  /**
    * Updates an order with a `CREATED` or `APPROVED` status.
    * You cannot update an order with the `COMPLETED` status
    */
  def patch(): js.Promise[Unit]
}
object Authorize {
  
  inline def apply(
    authorize: () => js.Promise[OrderResponseBody],
    capture: () => js.Promise[OrderResponseBody],
    get: () => js.Promise[OrderResponseBody],
    patch: () => js.Promise[Unit]
  ): Authorize = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction0(authorize), capture = js.Any.fromFunction0(capture), get = js.Any.fromFunction0(get), patch = js.Any.fromFunction0(patch))
    __obj.asInstanceOf[Authorize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authorize] (val x: Self) extends AnyVal {
    
    inline def setAuthorize(value: () => js.Promise[OrderResponseBody]): Self = StObject.set(x, "authorize", js.Any.fromFunction0(value))
    
    inline def setCapture(value: () => js.Promise[OrderResponseBody]): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => js.Promise[OrderResponseBody]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setPatch(value: () => js.Promise[Unit]): Self = StObject.set(x, "patch", js.Any.fromFunction0(value))
  }
}
