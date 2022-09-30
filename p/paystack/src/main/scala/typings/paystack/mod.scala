package typings.paystack

import org.scalablytyped.runtime.StringDictionary
import typings.paystack.anon.Charge
import typings.paystack.anon.Create
import typings.paystack.anon.Disable
import typings.paystack.anon.Get
import typings.paystack.anon.Listbanks
import typings.paystack.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(secret_key: String): Object = ^.asInstanceOf[js.Dynamic].apply(secret_key.asInstanceOf[js.Any]).asInstanceOf[Object]
  
  @JSImport("paystack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Object extends StObject {
    
    var customer: Create
    
    var misc: Listbanks
    
    var page: Get
    
    var plan: typings.paystack.anon.List
    
    var subaccount: Update
    
    var subscription: Disable
    
    var transaction: Charge
  }
  object Object {
    
    inline def apply(
      customer: Create,
      misc: Listbanks,
      page: Get,
      plan: typings.paystack.anon.List,
      subaccount: Update,
      subscription: Disable,
      transaction: Charge
    ): Object = {
      val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subaccount = subaccount.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    extension [Self <: Object](x: Self) {
      
      inline def setCustomer(value: Create): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setMisc(value: Listbanks): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Get): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: typings.paystack.anon.List): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setSubaccount(value: Update): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubscription(value: Disable): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: Charge): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  // Transactions initialization success object
  trait Response
    extends StObject
       with /* others */ StringDictionary[Any] {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var message: String
    
    var status: Boolean
  }
  object Response {
    
    inline def apply(message: String, status: Boolean): Response = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
