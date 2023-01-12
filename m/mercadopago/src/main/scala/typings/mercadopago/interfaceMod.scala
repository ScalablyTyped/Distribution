package typings.mercadopago

import typings.mercadopago.configurationMod.ConfigOptions
import typings.mercadopago.configurationMod.MercadoPagoConfig
import typings.mercadopago.resourcesCardsMod.MercadoPagoCard
import typings.mercadopago.resourcesCustomersMod.MercadoPagoCustomer
import typings.mercadopago.resourcesMerchantOrdersMod.MercadoPagoMerchantOrder
import typings.mercadopago.resourcesPaymentMod.MercadoPagoPayment
import typings.mercadopago.resourcesPreapprovalMod.MercadoPagoPreApproval
import typings.mercadopago.resourcesPreferencesMod.MercadoPagoPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait MercadoPago extends StObject {
    
    var card: MercadoPagoCard
    
    var card_token: Any
    
    var configurations: MercadoPagoConfig
    
    def configure(options: ConfigOptions): Unit
    @JSName("configure")
    var configure_Original: js.Function1[/* options */ ConfigOptions, Unit]
    
    var connect: Any
    
    var customers: MercadoPagoCustomer
    
    var discount_campaign: Any
    
    var ipn: Any
    
    var merchant_orders: MercadoPagoMerchantOrder
    
    var money_requests: Any
    
    var payment: MercadoPagoPayment
    
    var preapproval: MercadoPagoPreApproval
    
    var preferences: MercadoPagoPreference
    
    var refund: Any
    
    var utils: Any
  }
  object MercadoPago {
    
    inline def apply(
      card: MercadoPagoCard,
      card_token: Any,
      configurations: MercadoPagoConfig,
      configure: /* options */ ConfigOptions => Unit,
      connect: Any,
      customers: MercadoPagoCustomer,
      discount_campaign: Any,
      ipn: Any,
      merchant_orders: MercadoPagoMerchantOrder,
      money_requests: Any,
      payment: MercadoPagoPayment,
      preapproval: MercadoPagoPreApproval,
      preferences: MercadoPagoPreference,
      refund: Any,
      utils: Any
    ): MercadoPago = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], card_token = card_token.asInstanceOf[js.Any], configurations = configurations.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), connect = connect.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any], discount_campaign = discount_campaign.asInstanceOf[js.Any], ipn = ipn.asInstanceOf[js.Any], merchant_orders = merchant_orders.asInstanceOf[js.Any], money_requests = money_requests.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], preapproval = preapproval.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any], refund = refund.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
      __obj.asInstanceOf[MercadoPago]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MercadoPago] (val x: Self) extends AnyVal {
      
      inline def setCard(value: MercadoPagoCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCard_token(value: Any): Self = StObject.set(x, "card_token", value.asInstanceOf[js.Any])
      
      inline def setConfigurations(value: MercadoPagoConfig): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      inline def setConfigure(value: /* options */ ConfigOptions => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      inline def setConnect(value: Any): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setCustomers(value: MercadoPagoCustomer): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
      
      inline def setDiscount_campaign(value: Any): Self = StObject.set(x, "discount_campaign", value.asInstanceOf[js.Any])
      
      inline def setIpn(value: Any): Self = StObject.set(x, "ipn", value.asInstanceOf[js.Any])
      
      inline def setMerchant_orders(value: MercadoPagoMerchantOrder): Self = StObject.set(x, "merchant_orders", value.asInstanceOf[js.Any])
      
      inline def setMoney_requests(value: Any): Self = StObject.set(x, "money_requests", value.asInstanceOf[js.Any])
      
      inline def setPayment(value: MercadoPagoPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      inline def setPreapproval(value: MercadoPagoPreApproval): Self = StObject.set(x, "preapproval", value.asInstanceOf[js.Any])
      
      inline def setPreferences(value: MercadoPagoPreference): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
      
      inline def setRefund(value: Any): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: Any): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    }
  }
}
