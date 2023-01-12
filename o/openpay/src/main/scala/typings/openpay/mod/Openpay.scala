package typings.openpay.mod

import typings.openpay.mod.SDK.Cards
import typings.openpay.mod.SDK.Charges
import typings.openpay.mod.SDK.Customers
import typings.openpay.mod.SDK.Fees
import typings.openpay.mod.SDK.Groups
import typings.openpay.mod.SDK.Merchant
import typings.openpay.mod.SDK.Payouts
import typings.openpay.mod.SDK.Plans
import typings.openpay.mod.SDK.Webhooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Openpay extends StObject {
  
  var cards: Cards
  
  var charges: Charges
  
  var customers: Customers
  
  var fees: Fees
  
  var groups: Groups
  
  var merchant: Merchant
  
  var payouts: Payouts
  
  var plans: Plans
  
  /**
    * Change the merchant ID in runtime
    * @param merchantId Your merchant ID
    */
  def setMerchantId(merchantId: String): Unit
  
  /**
    * Change the private key in runtime
    * @param privateKey Your API private key
    */
  def setPrivateKey(privateKey: String): Unit
  
  /**
    * Change the SDK environment mode in runtime
    * @param isProductionReady Environment mode flag. Use true to indicate the SDK is running in production mode, use false for sandbox
    */
  def setProductionReady(isProductionReady: Boolean): Unit
  
  /**
    * Change the request timeout in runtime
    * @param timeout The desired timeout in milliseconds for HTTP requests
    */
  def setTimeout(timeout: Double): Unit
  
  var webhooks: Webhooks
}
object Openpay {
  
  inline def apply(
    cards: Cards,
    charges: Charges,
    customers: Customers,
    fees: Fees,
    groups: Groups,
    merchant: Merchant,
    payouts: Payouts,
    plans: Plans,
    setMerchantId: String => Unit,
    setPrivateKey: String => Unit,
    setProductionReady: Boolean => Unit,
    setTimeout: Double => Unit,
    webhooks: Webhooks
  ): Openpay = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any], fees = fees.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], payouts = payouts.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], setMerchantId = js.Any.fromFunction1(setMerchantId), setPrivateKey = js.Any.fromFunction1(setPrivateKey), setProductionReady = js.Any.fromFunction1(setProductionReady), setTimeout = js.Any.fromFunction1(setTimeout), webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Openpay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Openpay] (val x: Self) extends AnyVal {
    
    inline def setCards(value: Cards): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCharges(value: Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    inline def setCustomers(value: Customers): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setFees(value: Fees): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: Groups): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setMerchant(value: Merchant): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    inline def setPayouts(value: Payouts): Self = StObject.set(x, "payouts", value.asInstanceOf[js.Any])
    
    inline def setPlans(value: Plans): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setSetMerchantId(value: String => Unit): Self = StObject.set(x, "setMerchantId", js.Any.fromFunction1(value))
    
    inline def setSetPrivateKey(value: String => Unit): Self = StObject.set(x, "setPrivateKey", js.Any.fromFunction1(value))
    
    inline def setSetProductionReady(value: Boolean => Unit): Self = StObject.set(x, "setProductionReady", js.Any.fromFunction1(value))
    
    inline def setSetTimeout(value: Double => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    inline def setWebhooks(value: Webhooks): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
  }
}
