package typings.nodeBarion

import typings.nodeBarion.mod.BankAccount
import typings.nodeBarion.mod.BillingAddress
import typings.nodeBarion.mod.Money
import typings.nodeBarion.mod.PayerAccountInformation
import typings.nodeBarion.mod.PaymentTransaction
import typings.nodeBarion.mod.PurchaseInformation
import typings.nodeBarion.mod.ShippingAddress
import typings.nodeBarion.mod.TransactionToFinish
import typings.nodeBarion.mod.TransactionToRefund
import typings.nodeBarion.nodeBarionStrings.All
import typings.nodeBarion.nodeBarionStrings.ApplePay
import typings.nodeBarion.nodeBarionStrings.Balance
import typings.nodeBarion.nodeBarionStrings.BankCard
import typings.nodeBarion.nodeBarionStrings.BankTransfer
import typings.nodeBarion.nodeBarionStrings.CZK
import typings.nodeBarion.nodeBarionStrings.ChallengeRequired
import typings.nodeBarion.nodeBarionStrings.DelayedCapture
import typings.nodeBarion.nodeBarionStrings.EUR
import typings.nodeBarion.nodeBarionStrings.GooglePay
import typings.nodeBarion.nodeBarionStrings.HUF
import typings.nodeBarion.nodeBarionStrings.Immediate
import typings.nodeBarion.nodeBarionStrings.MerchantInitiatedPayment
import typings.nodeBarion.nodeBarionStrings.NoChallengeNeeded
import typings.nodeBarion.nodeBarionStrings.NoPreference
import typings.nodeBarion.nodeBarionStrings.OneClickPayment
import typings.nodeBarion.nodeBarionStrings.RecurringPayment
import typings.nodeBarion.nodeBarionStrings.Reservation
import typings.nodeBarion.nodeBarionStrings.USD
import typings.nodeBarion.nodeBarionStrings.`cs-CZ`
import typings.nodeBarion.nodeBarionStrings.`de-DE`
import typings.nodeBarion.nodeBarionStrings.`en-US`
import typings.nodeBarion.nodeBarionStrings.`es-ES`
import typings.nodeBarion.nodeBarionStrings.`fr-FR`
import typings.nodeBarion.nodeBarionStrings.`hu-HU`
import typings.nodeBarion.nodeBarionStrings.`sk-SK`
import typings.nodeBarion.nodeBarionStrings.`sl-SI`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<node-barion.node-barion.BankTransferRequest> */
  trait PartialBankTransferReques extends StObject {
    
    var Amount: js.UndefOr[Double] = js.undefined
    
    var BankAccount: js.UndefOr[typings.nodeBarion.mod.BankAccount] = js.undefined
    
    var Comment: js.UndefOr[String] = js.undefined
    
    var Currency: js.UndefOr[CZK | EUR | HUF | USD] = js.undefined
    
    var Password: js.UndefOr[String] = js.undefined
    
    var RecipientName: js.UndefOr[String] = js.undefined
    
    var UserName: js.UndefOr[String] = js.undefined
  }
  object PartialBankTransferReques {
    
    inline def apply(): PartialBankTransferReques = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBankTransferReques]
    }
    
    extension [Self <: PartialBankTransferReques](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
      
      inline def setBankAccount(value: BankAccount): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
      
      inline def setBankAccountUndefined: Self = StObject.set(x, "BankAccount", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
      
      inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
      
      inline def setRecipientName(value: String): Self = StObject.set(x, "RecipientName", value.asInstanceOf[js.Any])
      
      inline def setRecipientNameUndefined: Self = StObject.set(x, "RecipientName", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.CancelAuthorizationRequest> */
  trait PartialCancelAuthorizatio extends StObject {
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PaymentId: js.UndefOr[String] = js.undefined
  }
  object PartialCancelAuthorizatio {
    
    inline def apply(): PartialCancelAuthorizatio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCancelAuthorizatio]
    }
    
    extension [Self <: PartialCancelAuthorizatio](x: Self) {
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "PaymentId", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.CapturePaymentRequest> */
  trait PartialCapturePaymentRequ extends StObject {
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PaymentId: js.UndefOr[String] = js.undefined
    
    var Transactions: js.UndefOr[js.Array[TransactionToFinish]] = js.undefined
  }
  object PartialCapturePaymentRequ {
    
    inline def apply(): PartialCapturePaymentRequ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCapturePaymentRequ]
    }
    
    extension [Self <: PartialCapturePaymentRequ](x: Self) {
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "PaymentId", js.undefined)
      
      inline def setTransactions(value: js.Array[TransactionToFinish]): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsUndefined: Self = StObject.set(x, "Transactions", js.undefined)
      
      inline def setTransactionsVarargs(value: TransactionToFinish*): Self = StObject.set(x, "Transactions", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.CompletePaymentRequest> */
  trait PartialCompletePaymentReq extends StObject {
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PaymentId: js.UndefOr[String] = js.undefined
  }
  object PartialCompletePaymentReq {
    
    inline def apply(): PartialCompletePaymentReq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCompletePaymentReq]
    }
    
    extension [Self <: PartialCompletePaymentReq](x: Self) {
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "PaymentId", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.EmailTransferRequest> */
  trait PartialEmailTransferReque extends StObject {
    
    var Amount: js.UndefOr[Money] = js.undefined
    
    var Comment: js.UndefOr[String] = js.undefined
    
    var Password: js.UndefOr[String] = js.undefined
    
    var SourceAccountId: js.UndefOr[String] = js.undefined
    
    var TargetEmail: js.UndefOr[String] = js.undefined
    
    var UserName: js.UndefOr[String] = js.undefined
  }
  object PartialEmailTransferReque {
    
    inline def apply(): PartialEmailTransferReque = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEmailTransferReque]
    }
    
    extension [Self <: PartialEmailTransferReque](x: Self) {
      
      inline def setAmount(value: Money): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
      
      inline def setSourceAccountId(value: String): Self = StObject.set(x, "SourceAccountId", value.asInstanceOf[js.Any])
      
      inline def setSourceAccountIdUndefined: Self = StObject.set(x, "SourceAccountId", js.undefined)
      
      inline def setTargetEmail(value: String): Self = StObject.set(x, "TargetEmail", value.asInstanceOf[js.Any])
      
      inline def setTargetEmailUndefined: Self = StObject.set(x, "TargetEmail", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.FinishReservationRequest> */
  trait PartialFinishReservationR extends StObject {
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PaymentId: js.UndefOr[String] = js.undefined
    
    var Transactions: js.UndefOr[js.Array[TransactionToFinish]] = js.undefined
  }
  object PartialFinishReservationR {
    
    inline def apply(): PartialFinishReservationR = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFinishReservationR]
    }
    
    extension [Self <: PartialFinishReservationR](x: Self) {
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "PaymentId", js.undefined)
      
      inline def setTransactions(value: js.Array[TransactionToFinish]): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsUndefined: Self = StObject.set(x, "Transactions", js.undefined)
      
      inline def setTransactionsVarargs(value: TransactionToFinish*): Self = StObject.set(x, "Transactions", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.GetAccountsRequest> */
  trait PartialGetAccountsRequest extends StObject {
    
    var Password: js.UndefOr[String] = js.undefined
    
    var UserName: js.UndefOr[String] = js.undefined
  }
  object PartialGetAccountsRequest {
    
    inline def apply(): PartialGetAccountsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGetAccountsRequest]
    }
    
    extension [Self <: PartialGetAccountsRequest](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.GetPaymentStateRequest> */
  trait PartialGetPaymentStateReq extends StObject {
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PaymentId: js.UndefOr[String] = js.undefined
  }
  object PartialGetPaymentStateReq {
    
    inline def apply(): PartialGetPaymentStateReq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGetPaymentStateReq]
    }
    
    extension [Self <: PartialGetPaymentStateReq](x: Self) {
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "PaymentId", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.PaymentRefundRequest> */
  trait PartialPaymentRefundReque extends StObject {
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PaymentId: js.UndefOr[String] = js.undefined
    
    var TransactionsToRefund: js.UndefOr[js.Array[TransactionToRefund]] = js.undefined
  }
  object PartialPaymentRefundReque {
    
    inline def apply(): PartialPaymentRefundReque = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPaymentRefundReque]
    }
    
    extension [Self <: PartialPaymentRefundReque](x: Self) {
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "PaymentId", js.undefined)
      
      inline def setTransactionsToRefund(value: js.Array[TransactionToRefund]): Self = StObject.set(x, "TransactionsToRefund", value.asInstanceOf[js.Any])
      
      inline def setTransactionsToRefundUndefined: Self = StObject.set(x, "TransactionsToRefund", js.undefined)
      
      inline def setTransactionsToRefundVarargs(value: TransactionToRefund*): Self = StObject.set(x, "TransactionsToRefund", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.StartPaymentRequest> */
  trait PartialStartPaymentReques extends StObject {
    
    var BillingAddress: js.UndefOr[typings.nodeBarion.mod.BillingAddress] = js.undefined
    
    var CallbackUrl: js.UndefOr[String] = js.undefined
    
    var CardHolderNameHint: js.UndefOr[String] = js.undefined
    
    var ChallengePreference: js.UndefOr[NoPreference | ChallengeRequired | NoChallengeNeeded] = js.undefined
    
    var Currency: js.UndefOr[CZK | EUR | HUF | USD] = js.undefined
    
    var DelayedCapturePeriod: js.UndefOr[String] = js.undefined
    
    var FundingSources: js.UndefOr[js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]] = js.undefined
    
    var GuestCheckOut: js.UndefOr[Boolean] = js.undefined
    
    var InitiateRecurrence: js.UndefOr[Boolean] = js.undefined
    
    var Locale: js.UndefOr[`cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`] = js.undefined
    
    var OrderNumber: js.UndefOr[String] = js.undefined
    
    var POSKey: js.UndefOr[String] = js.undefined
    
    var PayerAccount: js.UndefOr[PayerAccountInformation] = js.undefined
    
    var PayerHint: js.UndefOr[String] = js.undefined
    
    var PayerHomeNumber: js.UndefOr[String] = js.undefined
    
    var PayerPhoneNumber: js.UndefOr[String] = js.undefined
    
    var PayerWorkPhoneNumber: js.UndefOr[String] = js.undefined
    
    var PaymentRequestId: js.UndefOr[String] = js.undefined
    
    var PaymentType: js.UndefOr[Immediate | Reservation | DelayedCapture] = js.undefined
    
    var PaymentWindow: js.UndefOr[String] = js.undefined
    
    var PurchaseInformation: js.UndefOr[typings.nodeBarion.mod.PurchaseInformation] = js.undefined
    
    var RecurrenceId: js.UndefOr[String] = js.undefined
    
    var RecurrenceType: js.UndefOr[OneClickPayment | MerchantInitiatedPayment | RecurringPayment] = js.undefined
    
    var RedirectUrl: js.UndefOr[String] = js.undefined
    
    var ReservationPeriod: js.UndefOr[String] = js.undefined
    
    var ShippingAddress: js.UndefOr[typings.nodeBarion.mod.ShippingAddress] = js.undefined
    
    var TraceId: js.UndefOr[String] = js.undefined
    
    var Transactions: js.UndefOr[js.Array[PaymentTransaction]] = js.undefined
  }
  object PartialStartPaymentReques {
    
    inline def apply(): PartialStartPaymentReques = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStartPaymentReques]
    }
    
    extension [Self <: PartialStartPaymentReques](x: Self) {
      
      inline def setBillingAddress(value: BillingAddress): Self = StObject.set(x, "BillingAddress", value.asInstanceOf[js.Any])
      
      inline def setBillingAddressUndefined: Self = StObject.set(x, "BillingAddress", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "CallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "CallbackUrl", js.undefined)
      
      inline def setCardHolderNameHint(value: String): Self = StObject.set(x, "CardHolderNameHint", value.asInstanceOf[js.Any])
      
      inline def setCardHolderNameHintUndefined: Self = StObject.set(x, "CardHolderNameHint", js.undefined)
      
      inline def setChallengePreference(value: NoPreference | ChallengeRequired | NoChallengeNeeded): Self = StObject.set(x, "ChallengePreference", value.asInstanceOf[js.Any])
      
      inline def setChallengePreferenceUndefined: Self = StObject.set(x, "ChallengePreference", js.undefined)
      
      inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
      
      inline def setDelayedCapturePeriod(value: String): Self = StObject.set(x, "DelayedCapturePeriod", value.asInstanceOf[js.Any])
      
      inline def setDelayedCapturePeriodUndefined: Self = StObject.set(x, "DelayedCapturePeriod", js.undefined)
      
      inline def setFundingSources(value: js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]): Self = StObject.set(x, "FundingSources", value.asInstanceOf[js.Any])
      
      inline def setFundingSourcesUndefined: Self = StObject.set(x, "FundingSources", js.undefined)
      
      inline def setFundingSourcesVarargs(value: (All | Balance | BankCard | GooglePay | ApplePay | BankTransfer)*): Self = StObject.set(x, "FundingSources", js.Array(value*))
      
      inline def setGuestCheckOut(value: Boolean): Self = StObject.set(x, "GuestCheckOut", value.asInstanceOf[js.Any])
      
      inline def setGuestCheckOutUndefined: Self = StObject.set(x, "GuestCheckOut", js.undefined)
      
      inline def setInitiateRecurrence(value: Boolean): Self = StObject.set(x, "InitiateRecurrence", value.asInstanceOf[js.Any])
      
      inline def setInitiateRecurrenceUndefined: Self = StObject.set(x, "InitiateRecurrence", js.undefined)
      
      inline def setLocale(value: `cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
      
      inline def setOrderNumber(value: String): Self = StObject.set(x, "OrderNumber", value.asInstanceOf[js.Any])
      
      inline def setOrderNumberUndefined: Self = StObject.set(x, "OrderNumber", js.undefined)
      
      inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
      
      inline def setPOSKeyUndefined: Self = StObject.set(x, "POSKey", js.undefined)
      
      inline def setPayerAccount(value: PayerAccountInformation): Self = StObject.set(x, "PayerAccount", value.asInstanceOf[js.Any])
      
      inline def setPayerAccountUndefined: Self = StObject.set(x, "PayerAccount", js.undefined)
      
      inline def setPayerHint(value: String): Self = StObject.set(x, "PayerHint", value.asInstanceOf[js.Any])
      
      inline def setPayerHintUndefined: Self = StObject.set(x, "PayerHint", js.undefined)
      
      inline def setPayerHomeNumber(value: String): Self = StObject.set(x, "PayerHomeNumber", value.asInstanceOf[js.Any])
      
      inline def setPayerHomeNumberUndefined: Self = StObject.set(x, "PayerHomeNumber", js.undefined)
      
      inline def setPayerPhoneNumber(value: String): Self = StObject.set(x, "PayerPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPayerPhoneNumberUndefined: Self = StObject.set(x, "PayerPhoneNumber", js.undefined)
      
      inline def setPayerWorkPhoneNumber(value: String): Self = StObject.set(x, "PayerWorkPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPayerWorkPhoneNumberUndefined: Self = StObject.set(x, "PayerWorkPhoneNumber", js.undefined)
      
      inline def setPaymentRequestId(value: String): Self = StObject.set(x, "PaymentRequestId", value.asInstanceOf[js.Any])
      
      inline def setPaymentRequestIdUndefined: Self = StObject.set(x, "PaymentRequestId", js.undefined)
      
      inline def setPaymentType(value: Immediate | Reservation | DelayedCapture): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setPaymentTypeUndefined: Self = StObject.set(x, "PaymentType", js.undefined)
      
      inline def setPaymentWindow(value: String): Self = StObject.set(x, "PaymentWindow", value.asInstanceOf[js.Any])
      
      inline def setPaymentWindowUndefined: Self = StObject.set(x, "PaymentWindow", js.undefined)
      
      inline def setPurchaseInformation(value: PurchaseInformation): Self = StObject.set(x, "PurchaseInformation", value.asInstanceOf[js.Any])
      
      inline def setPurchaseInformationUndefined: Self = StObject.set(x, "PurchaseInformation", js.undefined)
      
      inline def setRecurrenceId(value: String): Self = StObject.set(x, "RecurrenceId", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceIdUndefined: Self = StObject.set(x, "RecurrenceId", js.undefined)
      
      inline def setRecurrenceType(value: OneClickPayment | MerchantInitiatedPayment | RecurringPayment): Self = StObject.set(x, "RecurrenceType", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceTypeUndefined: Self = StObject.set(x, "RecurrenceType", js.undefined)
      
      inline def setRedirectUrl(value: String): Self = StObject.set(x, "RedirectUrl", value.asInstanceOf[js.Any])
      
      inline def setRedirectUrlUndefined: Self = StObject.set(x, "RedirectUrl", js.undefined)
      
      inline def setReservationPeriod(value: String): Self = StObject.set(x, "ReservationPeriod", value.asInstanceOf[js.Any])
      
      inline def setReservationPeriodUndefined: Self = StObject.set(x, "ReservationPeriod", js.undefined)
      
      inline def setShippingAddress(value: ShippingAddress): Self = StObject.set(x, "ShippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUndefined: Self = StObject.set(x, "ShippingAddress", js.undefined)
      
      inline def setTraceId(value: String): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
      
      inline def setTraceIdUndefined: Self = StObject.set(x, "TraceId", js.undefined)
      
      inline def setTransactions(value: js.Array[PaymentTransaction]): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsUndefined: Self = StObject.set(x, "Transactions", js.undefined)
      
      inline def setTransactionsVarargs(value: PaymentTransaction*): Self = StObject.set(x, "Transactions", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<node-barion.node-barion.StatementDownloadRequest> */
  trait PartialStatementDownloadR extends StObject {
    
    var Currency: js.UndefOr[CZK | EUR | HUF | USD] = js.undefined
    
    var Day: js.UndefOr[Double] = js.undefined
    
    var Month: js.UndefOr[Double] = js.undefined
    
    var Password: js.UndefOr[String] = js.undefined
    
    var UserName: js.UndefOr[String] = js.undefined
    
    var Year: js.UndefOr[Double] = js.undefined
  }
  object PartialStatementDownloadR {
    
    inline def apply(): PartialStatementDownloadR = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStatementDownloadR]
    }
    
    extension [Self <: PartialStatementDownloadR](x: Self) {
      
      inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
      
      inline def setDay(value: Double): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "Day", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "Month", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "Year", js.undefined)
    }
  }
}
