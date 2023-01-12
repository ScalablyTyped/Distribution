package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import typings.openpay.mod.SDK.Customers.Subscriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customers extends StObject {
  
  var bankaccounts: typings.openpay.mod.SDK.Customers.BankAccounts
  
  var cards: typings.openpay.mod.SDK.Customers.Cards
  
  var charges: typings.openpay.mod.SDK.Customers.Charges
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(customerId: String, callback: Callback[Any]): Unit
  
  def get(customerId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
  
  var payouts: typings.openpay.mod.SDK.Customers.Payouts
  
  var subscriptions: Subscriptions
  
  var transfers: typings.openpay.mod.SDK.Customers.Transfers
  
  def update(customerId: String, callback: Callback[Any]): Unit
}
object Customers {
  
  inline def apply(
    bankaccounts: typings.openpay.mod.SDK.Customers.BankAccounts,
    cards: typings.openpay.mod.SDK.Customers.Cards,
    charges: typings.openpay.mod.SDK.Customers.Charges,
    create: (Any, Callback[Any]) => Unit,
    delete: (String, Callback[Any]) => Unit,
    get: (String, Callback[Any]) => Unit,
    list: (Any, Callback[Any]) => Unit,
    payouts: typings.openpay.mod.SDK.Customers.Payouts,
    subscriptions: Subscriptions,
    transfers: typings.openpay.mod.SDK.Customers.Transfers,
    update: (String, Callback[Any]) => Unit
  ): Customers = {
    val __obj = js.Dynamic.literal(bankaccounts = bankaccounts.asInstanceOf[js.Any], cards = cards.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), list = js.Any.fromFunction2(list), payouts = payouts.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Customers]
  }
  
  trait BankAccounts extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, bankId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, bankId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object BankAccounts {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => Unit,
      delete: (String, String, Callback[Any]) => Unit,
      get: (String, String, Callback[Any]) => Unit,
      list: (String, Any, Callback[Any]) => Unit
    ): typings.openpay.mod.SDK.Customers.BankAccounts = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Customers.BankAccounts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.openpay.mod.SDK.Customers.BankAccounts] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setDelete(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
    }
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
    ): typings.openpay.mod.SDK.Customers.Cards = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Customers.Cards]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.openpay.mod.SDK.Customers.Cards] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setDelete(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
    }
  }
  
  trait Charges extends StObject {
    
    def capture(customerId: String, transactionId: String, captureRequest: js.Object, callback: Callback[Any]): Unit
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def get(customerId: String, transactionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def refund(customerId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Charges {
    
    inline def apply(
      capture: (String, String, js.Object, Callback[Any]) => Unit,
      create: (String, Any, Callback[Any]) => Unit,
      get: (String, String, Callback[Any]) => Unit,
      list: (String, Any, Callback[Any]) => Unit,
      refund: (String, String, Any, Callback[Any]) => Unit
    ): typings.openpay.mod.SDK.Customers.Charges = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction4(capture), create = js.Any.fromFunction3(create), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list), refund = js.Any.fromFunction4(refund))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Customers.Charges]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.openpay.mod.SDK.Customers.Charges] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (String, String, js.Object, Callback[Any]) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction4(value))
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
      
      inline def setRefund(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "refund", js.Any.fromFunction4(value))
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customers] (val x: Self) extends AnyVal {
    
    inline def setBankaccounts(value: typings.openpay.mod.SDK.Customers.BankAccounts): Self = StObject.set(x, "bankaccounts", value.asInstanceOf[js.Any])
    
    inline def setCards(value: typings.openpay.mod.SDK.Customers.Cards): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCharges(value: typings.openpay.mod.SDK.Customers.Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setDelete(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setGet(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setList(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
    
    inline def setPayouts(value: typings.openpay.mod.SDK.Customers.Payouts): Self = StObject.set(x, "payouts", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setTransfers(value: typings.openpay.mod.SDK.Customers.Transfers): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
  
  trait Payouts extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def get(customerId: String, transactionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Payouts {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => Unit,
      get: (String, String, Callback[Any]) => Unit,
      list: (String, Any, Callback[Any]) => Unit
    ): typings.openpay.mod.SDK.Customers.Payouts = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Customers.Payouts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.openpay.mod.SDK.Customers.Payouts] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
    }
  }
  
  trait Subscriptions extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def update(customerId: String, subscriptionId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Subscriptions {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => Unit,
      delete: (String, String, Callback[Any]) => Unit,
      get: (String, String, Callback[Any]) => Unit,
      list: (String, Any, Callback[Any]) => Unit,
      update: (String, String, Any, Callback[Any]) => Unit
    ): Subscriptions = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list), update = js.Any.fromFunction4(update))
      __obj.asInstanceOf[Subscriptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscriptions] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setDelete(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
      
      inline def setUpdate(value: (String, String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    }
  }
  
  trait Transfers extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def get(customerId: String, transactionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Transfers {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => Unit,
      get: (String, String, Callback[Any]) => Unit,
      list: (String, Any, Callback[Any]) => Unit
    ): typings.openpay.mod.SDK.Customers.Transfers = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), get = js.Any.fromFunction3(get), list = js.Any.fromFunction3(list))
      __obj.asInstanceOf[typings.openpay.mod.SDK.Customers.Transfers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.openpay.mod.SDK.Customers.Transfers] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setGet(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setList(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction3(value))
    }
  }
}
