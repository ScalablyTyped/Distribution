package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisSubscriptionsSubscriptionsMod.CreateSubscriptionRequestBody
import typings.paypalPaypalJs.typesApisSubscriptionsSubscriptionsMod.ReviseSubscriptionRequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revise extends StObject {
  
  /** Used to create a subscription for client-side integrations. Accepts the same options as the request body of the [/v1/billing/subscription api](https://developer.paypal.com/docs/api/subscriptions/v1#subscriptions-create-request-body). */
  def create(options: CreateSubscriptionRequestBody): js.Promise[String]
  
  /** Used to revise an existing subscription for client-side integrations. Accepts the same options as the request body of the [/v1/billing/subscription/{id}/revise api](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_revise). */
  def revise(subscriptionID: String, options: ReviseSubscriptionRequestBody): js.Promise[String]
}
object Revise {
  
  inline def apply(
    create: CreateSubscriptionRequestBody => js.Promise[String],
    revise: (String, ReviseSubscriptionRequestBody) => js.Promise[String]
  ): Revise = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), revise = js.Any.fromFunction2(revise))
    __obj.asInstanceOf[Revise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Revise] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: CreateSubscriptionRequestBody => js.Promise[String]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setRevise(value: (String, ReviseSubscriptionRequestBody) => js.Promise[String]): Self = StObject.set(x, "revise", js.Any.fromFunction2(value))
  }
}
