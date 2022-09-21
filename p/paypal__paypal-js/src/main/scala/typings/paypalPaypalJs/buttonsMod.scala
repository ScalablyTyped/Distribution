package typings.paypalPaypalJs

import typings.paypalPaypalJs.anon.Activate
import typings.paypalPaypalJs.anon.Authorize
import typings.paypalPaypalJs.anon.Color
import typings.paypalPaypalJs.anon.Create
import typings.paypalPaypalJs.anon.Patch
import typings.paypalPaypalJs.anon.`1`
import typings.paypalPaypalJs.fundingEligibilityMod.FUNDING_SOURCE
import typings.paypalPaypalJs.shippingMod.SelectedShippingOption
import typings.paypalPaypalJs.shippingMod.ShippingAddress
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonsMod {
  
  trait CreateOrderActions extends StObject {
    
    var order: Create
  }
  object CreateOrderActions {
    
    inline def apply(order: Create): CreateOrderActions = {
      val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOrderActions]
    }
    
    extension [Self <: CreateOrderActions](x: Self) {
      
      inline def setOrder(value: Create): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateOrderData extends StObject {
    
    var paymentSource: FUNDING_SOURCE
  }
  object CreateOrderData {
    
    inline def apply(paymentSource: FUNDING_SOURCE): CreateOrderData = {
      val __obj = js.Dynamic.literal(paymentSource = paymentSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOrderData]
    }
    
    extension [Self <: CreateOrderData](x: Self) {
      
      inline def setPaymentSource(value: FUNDING_SOURCE): Self = StObject.set(x, "paymentSource", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateSubscriptionActions extends StObject {
    
    var subscription: `1`
  }
  object CreateSubscriptionActions {
    
    inline def apply(subscription: `1`): CreateSubscriptionActions = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSubscriptionActions]
    }
    
    extension [Self <: CreateSubscriptionActions](x: Self) {
      
      inline def setSubscription(value: `1`): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnApproveActions extends StObject {
    
    var order: js.UndefOr[Authorize] = js.undefined
    
    def redirect(redirectURL: String): Unit
    
    def restart(): Unit
    
    var subscription: js.UndefOr[Activate] = js.undefined
  }
  object OnApproveActions {
    
    inline def apply(redirect: String => Unit, restart: () => Unit): OnApproveActions = {
      val __obj = js.Dynamic.literal(redirect = js.Any.fromFunction1(redirect), restart = js.Any.fromFunction0(restart))
      __obj.asInstanceOf[OnApproveActions]
    }
    
    extension [Self <: OnApproveActions](x: Self) {
      
      inline def setOrder(value: Authorize): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setRedirect(value: String => Unit): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
      
      inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
      
      inline def setSubscription(value: Activate): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    }
  }
  
  trait OnApproveData extends StObject {
    
    var authCode: js.UndefOr[String | Null] = js.undefined
    
    var billingToken: js.UndefOr[String | Null] = js.undefined
    
    var facilitatorAccessToken: String
    
    var orderID: String
    
    var payerID: js.UndefOr[String | Null] = js.undefined
    
    var paymentID: js.UndefOr[String | Null] = js.undefined
    
    var subscriptionID: js.UndefOr[String | Null] = js.undefined
  }
  object OnApproveData {
    
    inline def apply(facilitatorAccessToken: String, orderID: String): OnApproveData = {
      val __obj = js.Dynamic.literal(facilitatorAccessToken = facilitatorAccessToken.asInstanceOf[js.Any], orderID = orderID.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnApproveData]
    }
    
    extension [Self <: OnApproveData](x: Self) {
      
      inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      inline def setAuthCodeNull: Self = StObject.set(x, "authCode", null)
      
      inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
      
      inline def setBillingToken(value: String): Self = StObject.set(x, "billingToken", value.asInstanceOf[js.Any])
      
      inline def setBillingTokenNull: Self = StObject.set(x, "billingToken", null)
      
      inline def setBillingTokenUndefined: Self = StObject.set(x, "billingToken", js.undefined)
      
      inline def setFacilitatorAccessToken(value: String): Self = StObject.set(x, "facilitatorAccessToken", value.asInstanceOf[js.Any])
      
      inline def setOrderID(value: String): Self = StObject.set(x, "orderID", value.asInstanceOf[js.Any])
      
      inline def setPayerID(value: String): Self = StObject.set(x, "payerID", value.asInstanceOf[js.Any])
      
      inline def setPayerIDNull: Self = StObject.set(x, "payerID", null)
      
      inline def setPayerIDUndefined: Self = StObject.set(x, "payerID", js.undefined)
      
      inline def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
      
      inline def setPaymentIDNull: Self = StObject.set(x, "paymentID", null)
      
      inline def setPaymentIDUndefined: Self = StObject.set(x, "paymentID", js.undefined)
      
      inline def setSubscriptionID(value: String): Self = StObject.set(x, "subscriptionID", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIDNull: Self = StObject.set(x, "subscriptionID", null)
      
      inline def setSubscriptionIDUndefined: Self = StObject.set(x, "subscriptionID", js.undefined)
    }
  }
  
  trait OnCancelledActions extends StObject {
    
    def redirect(): Unit
  }
  object OnCancelledActions {
    
    inline def apply(redirect: () => Unit): OnCancelledActions = {
      val __obj = js.Dynamic.literal(redirect = js.Any.fromFunction0(redirect))
      __obj.asInstanceOf[OnCancelledActions]
    }
    
    extension [Self <: OnCancelledActions](x: Self) {
      
      inline def setRedirect(value: () => Unit): Self = StObject.set(x, "redirect", js.Any.fromFunction0(value))
    }
  }
  
  trait OnClickActions extends StObject {
    
    def reject(): js.Promise[Unit]
    
    def resolve(): js.Promise[Unit]
  }
  object OnClickActions {
    
    inline def apply(reject: () => js.Promise[Unit], resolve: () => js.Promise[Unit]): OnClickActions = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
      __obj.asInstanceOf[OnClickActions]
    }
    
    extension [Self <: OnClickActions](x: Self) {
      
      inline def setReject(value: () => js.Promise[Unit]): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setResolve(value: () => js.Promise[Unit]): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
    }
  }
  
  trait OnInitActions extends StObject {
    
    def disable(): js.Promise[Unit]
    
    def enable(): js.Promise[Unit]
  }
  object OnInitActions {
    
    inline def apply(disable: () => js.Promise[Unit], enable: () => js.Promise[Unit]): OnInitActions = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[OnInitActions]
    }
    
    extension [Self <: OnInitActions](x: Self) {
      
      inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
  
  trait OnShippingChangeActions extends StObject {
    
    var order: Patch
    
    def reject(): js.Promise[Unit]
    
    def resolve(): js.Promise[Unit]
  }
  object OnShippingChangeActions {
    
    inline def apply(order: Patch, reject: () => js.Promise[Unit], resolve: () => js.Promise[Unit]): OnShippingChangeActions = {
      val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
      __obj.asInstanceOf[OnShippingChangeActions]
    }
    
    extension [Self <: OnShippingChangeActions](x: Self) {
      
      inline def setOrder(value: Patch): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setReject(value: () => js.Promise[Unit]): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setResolve(value: () => js.Promise[Unit]): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
    }
  }
  
  trait OnShippingChangeData extends StObject {
    
    var buyerAccessToken: js.UndefOr[String] = js.undefined
    
    var forceRestAPI: Boolean
    
    var orderID: js.UndefOr[String] = js.undefined
    
    var paymentID: js.UndefOr[String] = js.undefined
    
    var paymentToken: js.UndefOr[String] = js.undefined
    
    var selected_shipping_option: js.UndefOr[SelectedShippingOption] = js.undefined
    
    var shipping_address: js.UndefOr[ShippingAddress] = js.undefined
  }
  object OnShippingChangeData {
    
    inline def apply(forceRestAPI: Boolean): OnShippingChangeData = {
      val __obj = js.Dynamic.literal(forceRestAPI = forceRestAPI.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnShippingChangeData]
    }
    
    extension [Self <: OnShippingChangeData](x: Self) {
      
      inline def setBuyerAccessToken(value: String): Self = StObject.set(x, "buyerAccessToken", value.asInstanceOf[js.Any])
      
      inline def setBuyerAccessTokenUndefined: Self = StObject.set(x, "buyerAccessToken", js.undefined)
      
      inline def setForceRestAPI(value: Boolean): Self = StObject.set(x, "forceRestAPI", value.asInstanceOf[js.Any])
      
      inline def setOrderID(value: String): Self = StObject.set(x, "orderID", value.asInstanceOf[js.Any])
      
      inline def setOrderIDUndefined: Self = StObject.set(x, "orderID", js.undefined)
      
      inline def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
      
      inline def setPaymentIDUndefined: Self = StObject.set(x, "paymentID", js.undefined)
      
      inline def setPaymentToken(value: String): Self = StObject.set(x, "paymentToken", value.asInstanceOf[js.Any])
      
      inline def setPaymentTokenUndefined: Self = StObject.set(x, "paymentToken", js.undefined)
      
      inline def setSelected_shipping_option(value: SelectedShippingOption): Self = StObject.set(x, "selected_shipping_option", value.asInstanceOf[js.Any])
      
      inline def setSelected_shipping_optionUndefined: Self = StObject.set(x, "selected_shipping_option", js.undefined)
      
      inline def setShipping_address(value: ShippingAddress): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
      
      inline def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
    }
  }
  
  @js.native
  trait PayPalButtonsComponent extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def isEligible(): Boolean = js.native
    
    def render(container: String): js.Promise[Unit] = js.native
    def render(container: HTMLElement): js.Promise[Unit] = js.native
  }
  
  trait PayPalButtonsComponentOptions extends StObject {
    
    /**
      * Called on button click. Often used for [Braintree vault integrations](https://developers.braintreepayments.com/guides/paypal/vault/javascript/v3).
      */
    var createBillingAgreement: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
    
    /**
      * Called on button click to set up a one-time payment. [createOrder docs](https://developer.paypal.com/docs/business/javascript-sdk/javascript-sdk-reference/#createorder).
      */
    var createOrder: js.UndefOr[
        js.Function2[/* data */ CreateOrderData, /* actions */ CreateOrderActions, js.Promise[String]]
      ] = js.undefined
    
    /**
      * Called on button click to set up a recurring payment. [createSubscription docs](https://developer.paypal.com/docs/business/javascript-sdk/javascript-sdk-reference/#createsubscription).
      */
    var createSubscription: js.UndefOr[
        js.Function2[
          /* data */ Record[String, Any], 
          /* actions */ CreateSubscriptionActions, 
          js.Promise[String]
        ]
      ] = js.undefined
    
    /**
      * Used for defining a standalone button.
      * Learn more about [configuring the funding source for standalone buttons](https://developer.paypal.com/docs/business/checkout/configure-payments/standalone-buttons/#4-funding-sources).
      */
    var fundingSource: js.UndefOr[FUNDING_SOURCE] = js.undefined
    
    /**
      * Called when finalizing the transaction. Often used to inform the buyer that the transaction is complete. [onApprove docs](https://developer.paypal.com/docs/business/javascript-sdk/javascript-sdk-reference/#onapprove).
      */
    var onApprove: js.UndefOr[
        js.Function2[/* data */ OnApproveData, /* actions */ OnApproveActions, js.Promise[Unit]]
      ] = js.undefined
    
    /**
      * Called when the buyer cancels the transaction.
      * Often used to show the buyer a [cancellation page](https://developer.paypal.com/docs/business/checkout/add-capabilities/buyer-experience/#3-show-cancellation-page).
      */
    var onCancel: js.UndefOr[
        js.Function2[/* data */ Record[String, Any], /* actions */ OnCancelledActions, Unit]
      ] = js.undefined
    
    /**
      * Called when the button is clicked. Often used for [validation](https://developer.paypal.com/docs/checkout/integration-features/validation/).
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* data */ Record[String, Any], 
          /* actions */ OnClickActions, 
          js.Promise[Unit] | Unit
        ]
      ] = js.undefined
    
    /**
      * Catch all for errors preventing buyer checkout.
      * Often used to show the buyer an [error page](https://developer.paypal.com/docs/checkout/integration-features/handle-errors/).
      */
    var onError: js.UndefOr[js.Function1[/* err */ Record[String, Any], Unit]] = js.undefined
    
    /**
      * Called when the buttons are initialized. The component is initialized after the iframe has successfully loaded.
      */
    var onInit: js.UndefOr[js.Function2[/* data */ Record[String, Any], /* actions */ OnInitActions, Unit]] = js.undefined
    
    /**
      * Called when the buyer changes their shipping address on PayPal.
      */
    var onShippingChange: js.UndefOr[
        js.Function2[
          /* data */ OnShippingChangeData, 
          /* actions */ OnShippingChangeActions, 
          js.Promise[Unit]
        ]
      ] = js.undefined
    
    /**
      * [Styling options](https://developer.paypal.com/docs/business/checkout/reference/style-guide/#customize-the-payment-buttons) for customizing the button appearance.
      */
    var style: js.UndefOr[Color] = js.undefined
  }
  object PayPalButtonsComponentOptions {
    
    inline def apply(): PayPalButtonsComponentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayPalButtonsComponentOptions]
    }
    
    extension [Self <: PayPalButtonsComponentOptions](x: Self) {
      
      inline def setCreateBillingAgreement(value: () => js.Promise[String]): Self = StObject.set(x, "createBillingAgreement", js.Any.fromFunction0(value))
      
      inline def setCreateBillingAgreementUndefined: Self = StObject.set(x, "createBillingAgreement", js.undefined)
      
      inline def setCreateOrder(value: (/* data */ CreateOrderData, /* actions */ CreateOrderActions) => js.Promise[String]): Self = StObject.set(x, "createOrder", js.Any.fromFunction2(value))
      
      inline def setCreateOrderUndefined: Self = StObject.set(x, "createOrder", js.undefined)
      
      inline def setCreateSubscription(
        value: (/* data */ Record[String, Any], /* actions */ CreateSubscriptionActions) => js.Promise[String]
      ): Self = StObject.set(x, "createSubscription", js.Any.fromFunction2(value))
      
      inline def setCreateSubscriptionUndefined: Self = StObject.set(x, "createSubscription", js.undefined)
      
      inline def setFundingSource(value: FUNDING_SOURCE): Self = StObject.set(x, "fundingSource", value.asInstanceOf[js.Any])
      
      inline def setFundingSourceUndefined: Self = StObject.set(x, "fundingSource", js.undefined)
      
      inline def setOnApprove(value: (/* data */ OnApproveData, /* actions */ OnApproveActions) => js.Promise[Unit]): Self = StObject.set(x, "onApprove", js.Any.fromFunction2(value))
      
      inline def setOnApproveUndefined: Self = StObject.set(x, "onApprove", js.undefined)
      
      inline def setOnCancel(value: (/* data */ Record[String, Any], /* actions */ OnCancelledActions) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClick(value: (/* data */ Record[String, Any], /* actions */ OnClickActions) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnError(value: /* err */ Record[String, Any] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnInit(value: (/* data */ Record[String, Any], /* actions */ OnInitActions) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnShippingChange(
        value: (/* data */ OnShippingChangeData, /* actions */ OnShippingChangeActions) => js.Promise[Unit]
      ): Self = StObject.set(x, "onShippingChange", js.Any.fromFunction2(value))
      
      inline def setOnShippingChangeUndefined: Self = StObject.set(x, "onShippingChange", js.undefined)
      
      inline def setStyle(value: Color): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
