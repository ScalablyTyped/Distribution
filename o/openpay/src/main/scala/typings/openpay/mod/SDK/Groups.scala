package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import typings.openpay.mod.SDK.Groups.Customers.Subscriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var charges: typings.openpay.mod.SDK.Groups.Charges
  
  var customers: typings.openpay.mod.SDK.Groups.Customers
}
object Groups {
  
  inline def apply(
    charges: typings.openpay.mod.SDK.Groups.Charges,
    customers: typings.openpay.mod.SDK.Groups.Customers
  ): Groups = {
    val __obj = js.Dynamic.literal(charges = charges.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  trait Charges extends StObject {
    
    def capture(merchantId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
    
    def create(merchantId: String, data: Any, callback: Callback[Any]): Unit
    
    def refund(merchantId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Charges {
    
    inline def apply(
      capture: (String, String, Any, Callback[Any]) => Unit,
      create: (String, Any, Callback[Any]) => Unit,
      refund: (String, String, Any, Callback[Any]) => Unit
    ): typings.openpay.mod.SDK.Groups.Charges = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction4(capture), create = js.Any.fromFunction3(create), refund = js.Any.fromFunction4(refund))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Groups.Charges]
    }
    
    extension [Self <: typings.openpay.mod.SDK.Groups.Charges](x: Self) {
      
      inline def setCapture(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction4(value))
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setRefund(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "refund", js.Any.fromFunction4(value))
    }
  }
  
  trait Customers extends StObject {
    
    var cards: typings.openpay.mod.SDK.Groups.Customers.Cards
    
    var charges: typings.openpay.mod.SDK.Groups.Customers.Charges
    
    def create(data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, callback: Callback[Any]): Unit
    
    def list(data: Any, callback: Callback[Any]): Unit
    
    var subscriptions: Subscriptions
    
    def update(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Customers {
    
    inline def apply(
      cards: typings.openpay.mod.SDK.Groups.Customers.Cards,
      charges: typings.openpay.mod.SDK.Groups.Customers.Charges,
      create: (Any, Callback[Any]) => Unit,
      delete: (String, Callback[Any]) => Unit,
      get: (String, Callback[Any]) => Unit,
      list: (Any, Callback[Any]) => Unit,
      subscriptions: Subscriptions,
      update: (String, Any, Callback[Any]) => Unit
    ): typings.openpay.mod.SDK.Groups.Customers = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), list = js.Any.fromFunction2(list), subscriptions = subscriptions.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Groups.Customers]
    }
    
    trait Cards extends StObject {
      
      def create(customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def delete(customerId: String, cardId: String, callback: Callback[Any]): Unit
      
      def get(customerId: String, cardId: String, callback: Callback[Any]): Unit
      
      def list(customerId: String, data: Any, callback: Callback[Any]): Unit
    }
    object Cards {
      
      inline def apply(
        create: (String, Any, Callback[Any]) => Unit,
        delete: (String, String, Callback[Any]) => Unit,
        get: (String, String, Callback[Any]) => Unit,
        list: (String, Any, Callback[Any]) => Unit
      ): typings.openpay.mod.SDK.Groups.Customers.Cards = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list))
        __obj.asInstanceOf[typings.openpay.mod.SDK.Groups.Customers.Cards]
      }
      
      extension [Self <: typings.openpay.mod.SDK.Groups.Customers.Cards](x: Self) {
        
        inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
        
        inline def setDelete(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
        
        inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
        
        inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
      }
    }
    
    trait Charges extends StObject {
      
      def capture(merchantId: String, customerId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
      
      def create(merchantId: String, customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def refund(merchantId: String, customerId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
    }
    object Charges {
      
      inline def apply(
        capture: (String, String, String, Any, Callback[Any]) => Unit,
        create: (String, String, Any, Callback[Any]) => Unit,
        refund: (String, String, String, Any, Callback[Any]) => Unit
      ): typings.openpay.mod.SDK.Groups.Customers.Charges = {
        val __obj = js.Dynamic.literal(capture = js.Any.fromFunction5(capture), create = js.Any.fromFunction4(create), refund = js.Any.fromFunction5(refund))
        __obj.asInstanceOf[typings.openpay.mod.SDK.Groups.Customers.Charges]
      }
      
      extension [Self <: typings.openpay.mod.SDK.Groups.Customers.Charges](x: Self) {
        
        inline def setCapture(value: (String, String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction5(value))
        
        inline def setCreate(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
        
        inline def setRefund(value: (String, String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "refund", js.Any.fromFunction5(value))
      }
    }
    
    extension [Self <: typings.openpay.mod.SDK.Groups.Customers](x: Self) {
      
      inline def setCards(value: typings.openpay.mod.SDK.Groups.Customers.Cards): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCharges(value: typings.openpay.mod.SDK.Groups.Customers.Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setDelete(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setGet(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setList(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
      
      inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
    
    trait Subscriptions extends StObject {
      
      def create(merchantId: String, customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def delete(merchantId: String, customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
      
      def get(merchantId: String, customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
      
      def list(merchantId: String, customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def update(merchantId: String, customerId: String, subscriptionId: String, data: Any, callback: Callback[Any]): Unit
    }
    object Subscriptions {
      
      inline def apply(
        create: (String, String, Any, Callback[Any]) => Unit,
        delete: (String, String, String, Callback[Any]) => Unit,
        get: (String, String, String, Callback[Any]) => Unit,
        list: (String, String, Any, Callback[Any]) => Unit,
        update: (String, String, String, Any, Callback[Any]) => Unit
      ): Subscriptions = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction4(delete), get = js.Any.fromFunction4(get), list = js.Any.fromFunction4(list), update = js.Any.fromFunction5(update))
        __obj.asInstanceOf[Subscriptions]
      }
      
      extension [Self <: Subscriptions](x: Self) {
        
        inline def setCreate(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
        
        inline def setDelete(value: (String, String, String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction4(value))
        
        inline def setGet(value: (String, String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction4(value))
        
        inline def setList(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction4(value))
        
        inline def setUpdate(value: (String, String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
      }
    }
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setCharges(value: typings.openpay.mod.SDK.Groups.Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    inline def setCustomers(value: typings.openpay.mod.SDK.Groups.Customers): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
  }
}
