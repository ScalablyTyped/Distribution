package typings.paypalPaypalJs

import typings.paypalPaypalJs.anon.Attribute
import typings.paypalPaypalJs.anon.Brand
import typings.paypalPaypalJs.anon.ClassName
import typings.paypalPaypalJs.anon.Code
import typings.paypalPaypalJs.anon.Company
import typings.paypalPaypalJs.anon.Eligible
import typings.paypalPaypalJs.anon.Field
import typings.paypalPaypalJs.anon.keyinnumbercvvexpirationD
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesComponentsHostedFieldsMod {
  
  trait AvailableInstallments extends StObject {
    
    var configuration_owner_account: String
    
    var financing_options: js.Array[Record[String, Any]]
  }
  object AvailableInstallments {
    
    inline def apply(configuration_owner_account: String, financing_options: js.Array[Record[String, Any]]): AvailableInstallments = {
      val __obj = js.Dynamic.literal(configuration_owner_account = configuration_owner_account.asInstanceOf[js.Any], financing_options = financing_options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableInstallments]
    }
    
    extension [Self <: AvailableInstallments](x: Self) {
      
      inline def setConfiguration_owner_account(value: String): Self = StObject.set(x, "configuration_owner_account", value.asInstanceOf[js.Any])
      
      inline def setFinancing_options(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "financing_options", value.asInstanceOf[js.Any])
      
      inline def setFinancing_optionsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "financing_options", js.Array(value*))
    }
  }
  
  trait HostedFieldsCardState extends StObject {
    
    var cards: js.Array[Code]
    
    var fields: keyinnumbercvvexpirationD
  }
  object HostedFieldsCardState {
    
    inline def apply(cards: js.Array[Code], fields: keyinnumbercvvexpirationD): HostedFieldsCardState = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsCardState]
    }
    
    extension [Self <: HostedFieldsCardState](x: Self) {
      
      inline def setCards(value: js.Array[Code]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCardsVarargs(value: Code*): Self = StObject.set(x, "cards", js.Array(value*))
      
      inline def setFields(value: keyinnumbercvvexpirationD): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in 'amex' | 'discover' | 'elo' | 'hiper' | 'jcb' | 'mastercard' | 'visa' ]: {  eligible :boolean,   valuable :boolean}} */
  trait HostedFieldsCardTypes extends StObject {
    
    var amex: Eligible
    
    var discover: Eligible
    
    var elo: Eligible
    
    var hiper: Eligible
    
    var jcb: Eligible
    
    var mastercard: Eligible
    
    var visa: Eligible
  }
  object HostedFieldsCardTypes {
    
    inline def apply(
      amex: Eligible,
      discover: Eligible,
      elo: Eligible,
      hiper: Eligible,
      jcb: Eligible,
      mastercard: Eligible,
      visa: Eligible
    ): HostedFieldsCardTypes = {
      val __obj = js.Dynamic.literal(amex = amex.asInstanceOf[js.Any], discover = discover.asInstanceOf[js.Any], elo = elo.asInstanceOf[js.Any], hiper = hiper.asInstanceOf[js.Any], jcb = jcb.asInstanceOf[js.Any], mastercard = mastercard.asInstanceOf[js.Any], visa = visa.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsCardTypes]
    }
    
    extension [Self <: HostedFieldsCardTypes](x: Self) {
      
      inline def setAmex(value: Eligible): Self = StObject.set(x, "amex", value.asInstanceOf[js.Any])
      
      inline def setDiscover(value: Eligible): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
      
      inline def setElo(value: Eligible): Self = StObject.set(x, "elo", value.asInstanceOf[js.Any])
      
      inline def setHiper(value: Eligible): Self = StObject.set(x, "hiper", value.asInstanceOf[js.Any])
      
      inline def setJcb(value: Eligible): Self = StObject.set(x, "jcb", value.asInstanceOf[js.Any])
      
      inline def setMastercard(value: Eligible): Self = StObject.set(x, "mastercard", value.asInstanceOf[js.Any])
      
      inline def setVisa(value: Eligible): Self = StObject.set(x, "visa", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HostedFieldsHandler extends StObject {
    
    /**
      * Add a class to a field. Useful for updating field styles when events occur elsewhere in your checkout.
      */
    def addClass(field: String, className: String): js.Promise[Unit] = js.native
    
    /**
      * Clear the value of a field.
      */
    def clear(field: String): js.Promise[Unit] = js.native
    
    /**
      * Programmatically focus a field.
      */
    def focus(field: String): js.Promise[Unit] = js.native
    
    /**
      * Get supported card types configured in the Braintree Control Panel.
      */
    def getCardTypes(): HostedFieldsCardTypes = js.native
    
    /**
      * Get the state of all the rendered fields.
      */
    def getState(): HostedFieldsCardState = js.native
    
    /**
      * Removes a supported attribute from a field.
      */
    def removeAttribute(options: Attribute): js.Promise[Unit] = js.native
    
    /**
      * Removes a class to a field. Useful for updating field styles when events occur elsewhere in your checkout.
      */
    def removeClass(options: ClassName): js.Promise[Unit] = js.native
    
    /**
      * Sets an attribute of a field. Supported attributes are aria-invalid,
      * aria-required, disabled, and placeholder.
      */
    def setAttribute(options: Field): js.Promise[Unit] = js.native
    
    /**
      * Sets a visually hidden message (for screen readers) on a field.
      */
    def setMessage(options: Attribute): Unit = js.native
    
    /**
      * Sets the month options for the expiration month field when presented as a select element.
      */
    def setMonthOptions(options: Any): js.Promise[Unit] = js.native
    
    /**
      * Sets the placeholder from a field.
      */
    def setPlaceholder(field: String, placeholder: String): js.Promise[Unit] = js.native
    
    /**
      * Submit the form if is valid
      */
    def submit(): js.Promise[HostedFieldsSubmitResponse] = js.native
    def submit(options: Record[String, Any]): js.Promise[HostedFieldsSubmitResponse] = js.native
    
    /**
      * Clean all the fields from the DOM
      */
    def teardown(): js.Promise[Unit] = js.native
    
    /**
      * Tokenize fields and returns a nonce payload.
      */
    def tokenize(options: HostedFieldsTokenize): js.Promise[Record[String, Any]] = js.native
  }
  
  trait HostedFieldsSubmitResponse extends StObject {
    
    var authenticationReason: js.UndefOr[String] = js.undefined
    
    var authenticationStatus: js.UndefOr[String] = js.undefined
    
    var card: Brand
    
    var liabilityShift: js.UndefOr[String] = js.undefined
    
    var liabilityShifted: js.UndefOr[Boolean] = js.undefined
    
    var orderId: String
  }
  object HostedFieldsSubmitResponse {
    
    inline def apply(card: Brand, orderId: String): HostedFieldsSubmitResponse = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], orderId = orderId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsSubmitResponse]
    }
    
    extension [Self <: HostedFieldsSubmitResponse](x: Self) {
      
      inline def setAuthenticationReason(value: String): Self = StObject.set(x, "authenticationReason", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationReasonUndefined: Self = StObject.set(x, "authenticationReason", js.undefined)
      
      inline def setAuthenticationStatus(value: String): Self = StObject.set(x, "authenticationStatus", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationStatusUndefined: Self = StObject.set(x, "authenticationStatus", js.undefined)
      
      inline def setCard(value: Brand): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShift(value: String): Self = StObject.set(x, "liabilityShift", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShiftUndefined: Self = StObject.set(x, "liabilityShift", js.undefined)
      
      inline def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShiftedUndefined: Self = StObject.set(x, "liabilityShifted", js.undefined)
      
      inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedFieldsTokenize extends StObject {
    
    var authenticationInsight: js.UndefOr[Any] = js.undefined
    
    var billingAddress: js.UndefOr[Company] = js.undefined
    
    var cardholderName: js.UndefOr[String] = js.undefined
    
    var fieldsToTokenize: js.UndefOr[js.Array[String]] = js.undefined
    
    var vault: js.UndefOr[Boolean] = js.undefined
  }
  object HostedFieldsTokenize {
    
    inline def apply(): HostedFieldsTokenize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedFieldsTokenize]
    }
    
    extension [Self <: HostedFieldsTokenize](x: Self) {
      
      inline def setAuthenticationInsight(value: Any): Self = StObject.set(x, "authenticationInsight", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationInsightUndefined: Self = StObject.set(x, "authenticationInsight", js.undefined)
      
      inline def setBillingAddress(value: Company): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
      
      inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
      
      inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
      
      inline def setFieldsToTokenize(value: js.Array[String]): Self = StObject.set(x, "fieldsToTokenize", value.asInstanceOf[js.Any])
      
      inline def setFieldsToTokenizeUndefined: Self = StObject.set(x, "fieldsToTokenize", js.undefined)
      
      inline def setFieldsToTokenizeVarargs(value: String*): Self = StObject.set(x, "fieldsToTokenize", js.Array(value*))
      
      inline def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
      
      inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
    }
  }
  
  trait Installments extends StObject {
    
    /**
      * Handle and use installments options
      */
    def onInstallmentsAvailable(installments: AvailableInstallments): Unit
    
    /**
      * Handle fetching installments errors
      */
    var onInstallmentsError: js.UndefOr[js.Function1[/* error */ Record[String, Any], Unit]] = js.undefined
    
    /**
      * Defines the installments configuration
      */
    def onInstallmentsRequested(): js.Promise[InstallmentsConfiguration] | InstallmentsConfiguration
  }
  object Installments {
    
    inline def apply(
      onInstallmentsAvailable: AvailableInstallments => Unit,
      onInstallmentsRequested: () => js.Promise[InstallmentsConfiguration] | InstallmentsConfiguration
    ): Installments = {
      val __obj = js.Dynamic.literal(onInstallmentsAvailable = js.Any.fromFunction1(onInstallmentsAvailable), onInstallmentsRequested = js.Any.fromFunction0(onInstallmentsRequested))
      __obj.asInstanceOf[Installments]
    }
    
    extension [Self <: Installments](x: Self) {
      
      inline def setOnInstallmentsAvailable(value: AvailableInstallments => Unit): Self = StObject.set(x, "onInstallmentsAvailable", js.Any.fromFunction1(value))
      
      inline def setOnInstallmentsError(value: /* error */ Record[String, Any] => Unit): Self = StObject.set(x, "onInstallmentsError", js.Any.fromFunction1(value))
      
      inline def setOnInstallmentsErrorUndefined: Self = StObject.set(x, "onInstallmentsError", js.undefined)
      
      inline def setOnInstallmentsRequested(value: () => js.Promise[InstallmentsConfiguration] | InstallmentsConfiguration): Self = StObject.set(x, "onInstallmentsRequested", js.Any.fromFunction0(value))
    }
  }
  
  trait InstallmentsConfiguration extends StObject {
    
    var amount: String
    
    var billingCountryCode: js.UndefOr[String] = js.undefined
    
    var currencyCode: String
    
    var financingCountryCode: js.UndefOr[String] = js.undefined
  }
  object InstallmentsConfiguration {
    
    inline def apply(amount: String, currencyCode: String): InstallmentsConfiguration = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallmentsConfiguration]
    }
    
    extension [Self <: InstallmentsConfiguration](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBillingCountryCode(value: String): Self = StObject.set(x, "billingCountryCode", value.asInstanceOf[js.Any])
      
      inline def setBillingCountryCodeUndefined: Self = StObject.set(x, "billingCountryCode", js.undefined)
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setFinancingCountryCode(value: String): Self = StObject.set(x, "financingCountryCode", value.asInstanceOf[js.Any])
      
      inline def setFinancingCountryCodeUndefined: Self = StObject.set(x, "financingCountryCode", js.undefined)
    }
  }
  
  trait PayPalHostedFieldsComponent extends StObject {
    
    def isEligible(): Boolean
    
    def render(options: PayPalHostedFieldsComponentOptions): js.Promise[HostedFieldsHandler]
  }
  object PayPalHostedFieldsComponent {
    
    inline def apply(
      isEligible: () => Boolean,
      render: PayPalHostedFieldsComponentOptions => js.Promise[HostedFieldsHandler]
    ): PayPalHostedFieldsComponent = {
      val __obj = js.Dynamic.literal(isEligible = js.Any.fromFunction0(isEligible), render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[PayPalHostedFieldsComponent]
    }
    
    extension [Self <: PayPalHostedFieldsComponent](x: Self) {
      
      inline def setIsEligible(value: () => Boolean): Self = StObject.set(x, "isEligible", js.Any.fromFunction0(value))
      
      inline def setRender(value: PayPalHostedFieldsComponentOptions => js.Promise[HostedFieldsHandler]): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  trait PayPalHostedFieldsComponentOptions extends StObject {
    
    def createOrder(): js.Promise[String]
    
    var fields: js.UndefOr[Record[String, Any]] = js.undefined
    
    var installments: js.UndefOr[Installments] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* err */ Record[String, Any], Unit]] = js.undefined
    
    var styles: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object PayPalHostedFieldsComponentOptions {
    
    inline def apply(createOrder: () => js.Promise[String]): PayPalHostedFieldsComponentOptions = {
      val __obj = js.Dynamic.literal(createOrder = js.Any.fromFunction0(createOrder))
      __obj.asInstanceOf[PayPalHostedFieldsComponentOptions]
    }
    
    extension [Self <: PayPalHostedFieldsComponentOptions](x: Self) {
      
      inline def setCreateOrder(value: () => js.Promise[String]): Self = StObject.set(x, "createOrder", js.Any.fromFunction0(value))
      
      inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setInstallments(value: Installments): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
      
      inline def setInstallmentsUndefined: Self = StObject.set(x, "installments", js.undefined)
      
      inline def setOnError(value: /* err */ Record[String, Any] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setStyles(value: Record[String, Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
