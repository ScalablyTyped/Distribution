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

@JSImport("openpay", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with Openpay {
  /**
    * Initializes the SDK in sandbox mode
    * @param merchantId Your merchant ID
    * @param privateKey Your private API key
    * @param isProductionReady Optional environment mode flag, set to true to initialize the SDK in production mode. Default is false
    */
  def this(merchantId: String, privateKey: String) = this()
  def this(merchantId: String, privateKey: String, isProductionReady: Boolean) = this()
  
  /* CompleteClass */
  var cards: Cards = js.native
  
  /* CompleteClass */
  var charges: Charges = js.native
  
  /* CompleteClass */
  var customers: Customers = js.native
  
  /* CompleteClass */
  var fees: Fees = js.native
  
  /* CompleteClass */
  var groups: Groups = js.native
  
  /* CompleteClass */
  var merchant: Merchant = js.native
  
  /* CompleteClass */
  var payouts: Payouts = js.native
  
  /* CompleteClass */
  var plans: Plans = js.native
  
  /**
    * Change the merchant ID in runtime
    * @param merchantId Your merchant ID
    */
  /* CompleteClass */
  override def setMerchantId(merchantId: String): Unit = js.native
  
  /**
    * Change the private key in runtime
    * @param privateKey Your API private key
    */
  /* CompleteClass */
  override def setPrivateKey(privateKey: String): Unit = js.native
  
  /**
    * Change the SDK environment mode in runtime
    * @param isProductionReady Environment mode flag. Use true to indicate the SDK is running in production mode, use false for sandbox
    */
  /* CompleteClass */
  override def setProductionReady(isProductionReady: Boolean): Unit = js.native
  
  /**
    * Change the request timeout in runtime
    * @param timeout The desired timeout in milliseconds for HTTP requests
    */
  /* CompleteClass */
  override def setTimeout(timeout: Double): Unit = js.native
  
  /* CompleteClass */
  var webhooks: Webhooks = js.native
}
