package typings.paystack

import org.scalablytyped.runtime.StringDictionary
import typings.paystack.anon.Charge
import typings.paystack.anon.Create
import typings.paystack.anon.Disable
import typings.paystack.anon.Get
import typings.paystack.anon.List
import typings.paystack.anon.Listbanks
import typings.paystack.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("paystack", JSImport.Namespace)
  @js.native
  def apply(secret_key: String): Object = js.native
  
  @js.native
  trait Object extends StObject {
    
    var customer: Create = js.native
    
    var misc: Listbanks = js.native
    
    var page: Get = js.native
    
    var plan: List = js.native
    
    var subaccount: Update = js.native
    
    var subscription: Disable = js.native
    
    var transaction: Charge = js.native
  }
  object Object {
    
    @scala.inline
    def apply(
      customer: Create,
      misc: Listbanks,
      page: Get,
      plan: List,
      subaccount: Update,
      subscription: Disable,
      transaction: Charge
    ): Object = {
      val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subaccount = subaccount.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: Create): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMisc(value: Listbanks): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Get): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan(value: List): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubaccount(value: Update): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: Disable): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction(value: Charge): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  // Transactions initialization success object
  @js.native
  trait Response
    extends /* others */ StringDictionary[js.Any] {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var message: String = js.native
    
    var status: Boolean = js.native
  }
  object Response {
    
    @scala.inline
    def apply(message: String, status: Boolean): Response = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
