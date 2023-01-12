package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisSubscriptionsSubscriptionsMod.CreateSubscriptionRequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  /** Used to create a subscription for client-side integrations. Accepts the same options as the request body of the [/v1/billing/subscription api](https://developer.paypal.com/docs/api/subscriptions/v1#subscriptions-create-request-body). */
  def create(options: CreateSubscriptionRequestBody): js.Promise[String]
}
object `1` {
  
  inline def apply(create: CreateSubscriptionRequestBody => js.Promise[String]): `1` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: CreateSubscriptionRequestBody => js.Promise[String]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
