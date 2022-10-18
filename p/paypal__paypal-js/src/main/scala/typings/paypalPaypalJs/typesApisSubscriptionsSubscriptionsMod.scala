package typings.paypalPaypalJs

import typings.paypalPaypalJs.anon.PartialidstringstatusStat
import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApisSubscriptionsSubscriptionsMod {
  
  trait CreateSubscriptionRequestBody extends StObject {
    
    var application_context: js.UndefOr[Record[String, Any]] = js.undefined
    
    var auto_renewal: js.UndefOr[Boolean] = js.undefined
    
    var custom_id: js.UndefOr[String] = js.undefined
    
    var plan: js.UndefOr[Record[String, Any]] = js.undefined
    
    var plan_id: String
    
    var quantity: js.UndefOr[String] = js.undefined
    
    var shipping_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
    
    var start_time: js.UndefOr[String] = js.undefined
    
    var subscriber: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object CreateSubscriptionRequestBody {
    
    inline def apply(plan_id: String): CreateSubscriptionRequestBody = {
      val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSubscriptionRequestBody]
    }
    
    extension [Self <: CreateSubscriptionRequestBody](x: Self) {
      
      inline def setApplication_context(value: Record[String, Any]): Self = StObject.set(x, "application_context", value.asInstanceOf[js.Any])
      
      inline def setApplication_contextUndefined: Self = StObject.set(x, "application_context", js.undefined)
      
      inline def setAuto_renewal(value: Boolean): Self = StObject.set(x, "auto_renewal", value.asInstanceOf[js.Any])
      
      inline def setAuto_renewalUndefined: Self = StObject.set(x, "auto_renewal", js.undefined)
      
      inline def setCustom_id(value: String): Self = StObject.set(x, "custom_id", value.asInstanceOf[js.Any])
      
      inline def setCustom_idUndefined: Self = StObject.set(x, "custom_id", js.undefined)
      
      inline def setPlan(value: Record[String, Any]): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setShipping_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "shipping_amount", value.asInstanceOf[js.Any])
      
      inline def setShipping_amountUndefined: Self = StObject.set(x, "shipping_amount", js.undefined)
      
      inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
      
      inline def setSubscriber(value: Record[String, Any]): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
      
      inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    }
  }
  
  trait SubscriptionDetail extends StObject {
    
    var dispatching: Boolean
    
    var errorHandled: Boolean
    
    var handlers: js.Array[Any]
    
    var rejected: Boolean
    
    var resolve: Boolean
    
    var value: PartialidstringstatusStat
  }
  object SubscriptionDetail {
    
    inline def apply(
      dispatching: Boolean,
      errorHandled: Boolean,
      handlers: js.Array[Any],
      rejected: Boolean,
      resolve: Boolean,
      value: PartialidstringstatusStat
    ): SubscriptionDetail = {
      val __obj = js.Dynamic.literal(dispatching = dispatching.asInstanceOf[js.Any], errorHandled = errorHandled.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionDetail]
    }
    
    extension [Self <: SubscriptionDetail](x: Self) {
      
      inline def setDispatching(value: Boolean): Self = StObject.set(x, "dispatching", value.asInstanceOf[js.Any])
      
      inline def setErrorHandled(value: Boolean): Self = StObject.set(x, "errorHandled", value.asInstanceOf[js.Any])
      
      inline def setHandlers(value: js.Array[Any]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersVarargs(value: Any*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setRejected(value: Boolean): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PartialidstringstatusStat): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
