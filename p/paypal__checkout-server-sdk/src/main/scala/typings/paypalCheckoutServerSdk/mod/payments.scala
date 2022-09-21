package typings.paypalCheckoutServerSdk.mod

import typings.paypalCheckoutServerSdk.paymentsLibMod.BasePaymentHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payments {
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AVSCode")
  @js.native
  object AVSCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode & String] = js.native
    
    /* "A" */ val A: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.A & String = js.native
    
    /* "B" */ val B: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.B & String = js.native
    
    /* "C" */ val C: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.C & String = js.native
    
    /* "D" */ val D: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.D & String = js.native
    
    /* "E" */ val E: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.E & String = js.native
    
    /* "F" */ val F: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.F & String = js.native
    
    /* "G" */ val G: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.G & String = js.native
    
    /* "I" */ val I: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.I & String = js.native
    
    /* "M" */ val M: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.M & String = js.native
    
    /* "0" */ val MAESTRO_ALL_MATCHES: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.MAESTRO_ALL_MATCHES & String = js.native
    
    /* "1" */ val MAESTRO_NONE_MATCHES: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.MAESTRO_NONE_MATCHES & String = js.native
    
    /* "4" */ val MAESTRO_NOT_AVAILABLE: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.MAESTRO_NOT_AVAILABLE & String = js.native
    
    /* "3" */ val MAESTRO_NOT_PROCESSED: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.MAESTRO_NOT_PROCESSED & String = js.native
    
    /* "Null" */ val MAESTRO_NOT_RESPONSE: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.MAESTRO_NOT_RESPONSE & String = js.native
    
    /* "2" */ val MAESTRO_PART_MATCHES: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.MAESTRO_PART_MATCHES & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.N & String = js.native
    
    /* "P" */ val P: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.P & String = js.native
    
    /* "R" */ val R: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.R & String = js.native
    
    /* "S" */ val S: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.S & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.U & String = js.native
    
    /* "W" */ val W: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.W & String = js.native
    
    /* "X" */ val X: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.X & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.Y & String = js.native
    
    /* "Z" */ val Z: typings.paypalCheckoutServerSdk.paymentsLibMod.AVSCode.Z & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AccountType")
  @js.native
  object AccountType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.AccountType & String] = js.native
    
    /* "CHECKING" */ val CHECKING: typings.paypalCheckoutServerSdk.paymentsLibMod.AccountType.CHECKING & String = js.native
    
    /* "SAVINGS" */ val SAVINGS: typings.paypalCheckoutServerSdk.paymentsLibMod.AccountType.SAVINGS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsCaptureRequest")
  @js.native
  open class AuthorizationsCaptureRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsCaptureRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsGetRequest")
  @js.native
  open class AuthorizationsGetRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsGetRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsReauthorizeRequest")
  @js.native
  open class AuthorizationsReauthorizeRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsReauthorizeRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsVoidRequest")
  @js.native
  open class AuthorizationsVoidRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsVoidRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.BasePaymentRequest")
  @js.native
  open class BasePaymentRequest[H /* <: BasePaymentHeaders */, D] protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.BasePaymentRequest[H, D] {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CVVCode")
  @js.native
  object CVVCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode & String] = js.native
    
    /* "All others" */ val ALL_OTHERS: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.ALL_OTHERS & String = js.native
    
    /* "E" */ val E: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.E & String = js.native
    
    /* "I" */ val I: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.I & String = js.native
    
    /* "M" */ val M: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.M & String = js.native
    
    /* "0" */ val Maestro_matched: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.Maestro_matched & String = js.native
    
    /* "4" */ val Maestro_not_available: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.Maestro_not_available & String = js.native
    
    /* "2" */ val Maestro_not_implemented: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.Maestro_not_implemented & String = js.native
    
    /* "1" */ val Maestro_not_match: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.Maestro_not_match & String = js.native
    
    /* "3" */ val Maestro_not_present: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.Maestro_not_present & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.N & String = js.native
    
    /* "P" */ val P: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.P & String = js.native
    
    /* "S" */ val S: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.S & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.U & String = js.native
    
    /* "X" */ val X: typings.paypalCheckoutServerSdk.paymentsLibMod.CVVCode.X & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CapturesGetRequest")
  @js.native
  open class CapturesGetRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.CapturesGetRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CapturesRefundRequest")
  @js.native
  open class CapturesRefundRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.CapturesRefundRequest {
    def this(captureId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CardBrand")
  @js.native
  object CardBrand extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand & String] = js.native
    
    /* "AMEX" */ val AMEX: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.AMEX & String = js.native
    
    /* "CB_NATIONALE" */ val CB_NATIONALE: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CB_NATIONALE & String = js.native
    
    /* "CETELEM" */ val CETELEM: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CETELEM & String = js.native
    
    /* "CHINA_UNION_PAY" */ val CHINA_UNION_PAY: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CHINA_UNION_PAY & String = js.native
    
    /* "CONFIDIS" */ val CONFIDIS: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CONFIDIS & String = js.native
    
    /* "CONFIGOGA" */ val CONFIGOGA: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CONFIGOGA & String = js.native
    
    /* "DELTA" */ val DELTA: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.DELTA & String = js.native
    
    /* "DISCOVER" */ val DISCOVER: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.DISCOVER & String = js.native
    
    /* "ELECTRON" */ val ELECTRON: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.ELECTRON & String = js.native
    
    /* "JCB" */ val JCB: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.JCB & String = js.native
    
    /* "MAESTRO" */ val MAESTRO: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.MAESTRO & String = js.native
    
    /* "MASTERCARD" */ val MASTERCARD: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.MASTERCARD & String = js.native
    
    /* "SOLO" */ val SOLO: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.SOLO & String = js.native
    
    /* "STAR" */ val STAR: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.STAR & String = js.native
    
    /* "SWITCH" */ val SWITCH: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.SWITCH & String = js.native
    
    /* "VISA" */ val VISA: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.VISA & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CardType")
  @js.native
  object CardType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.CardType & String] = js.native
    
    /* "CREDIT" */ val CREDIT: typings.paypalCheckoutServerSdk.paymentsLibMod.CardType.CREDIT & String = js.native
    
    /* "DEBIT" */ val DEBIT: typings.paypalCheckoutServerSdk.paymentsLibMod.CardType.DEBIT & String = js.native
    
    /* "PREPAID" */ val PREPAID: typings.paypalCheckoutServerSdk.paymentsLibMod.CardType.PREPAID & String = js.native
    
    /* "STORE" */ val STORE: typings.paypalCheckoutServerSdk.paymentsLibMod.CardType.STORE & String = js.native
    
    /* "UNKNOWN" */ val UNKNOWN: typings.paypalCheckoutServerSdk.paymentsLibMod.CardType.UNKNOWN & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.DisbursementMode")
  @js.native
  object DisbursementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.DisbursementMode & String] = js.native
    
    /* "DELAYED" */ val DELAYED: typings.paypalCheckoutServerSdk.paymentsLibMod.DisbursementMode.DELAYED & String = js.native
    
    /* "INSTANT" */ val INSTANT: typings.paypalCheckoutServerSdk.paymentsLibMod.DisbursementMode.INSTANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.DisputeCategory")
  @js.native
  object DisputeCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.DisputeCategory & String] = js.native
    
    /* "ITEM_NOT_RECEIVED" */ val ITEM_NOT_RECEIVED: typings.paypalCheckoutServerSdk.paymentsLibMod.DisputeCategory.ITEM_NOT_RECEIVED & String = js.native
    
    /* "UNAUTHORIZED_TRANSACTION" */ val UNAUTHORIZED_TRANSACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.DisputeCategory.UNAUTHORIZED_TRANSACTION & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.Method")
  @js.native
  object Method extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.Method & String] = js.native
    
    /* "CONNECT" */ val CONNECT: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.CONNECT & String = js.native
    
    /* "DELETE" */ val DELETE: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.DELETE & String = js.native
    
    /* "GET" */ val GET: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.GET & String = js.native
    
    /* "HEAD" */ val HEAD: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.HEAD & String = js.native
    
    /* "OPTIONS" */ val OPTIONS: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.OPTIONS & String = js.native
    
    /* "PATCH" */ val PATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.PATCH & String = js.native
    
    /* "POST" */ val POST: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.POST & String = js.native
    
    /* "PUT" */ val PUT: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.PUT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.PaymentAdviceCode")
  @js.native
  object PaymentAdviceCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentAdviceCode & String] = js.native
    
    /* "03" */ val MASTERCARD_ACCOUNT_CLOSED: typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentAdviceCode.MASTERCARD_ACCOUNT_CLOSED & String = js.native
    
    /* "02" */ val MASTERCARD_CREDIT_LIMIT: typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentAdviceCode.MASTERCARD_CREDIT_LIMIT & String = js.native
    
    /* "01" */ val MASTERCARD_EXPIRED: typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentAdviceCode.MASTERCARD_EXPIRED & String = js.native
    
    /* "21" */ val MASTERCARD_UNSUCCESSFUL: typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentAdviceCode.MASTERCARD_UNSUCCESSFUL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.Reason")
  @js.native
  object Reason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.Reason & String] = js.native
    
    /* "BUYER_COMPLAINT" */ val BUYER_COMPLAINT: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.BUYER_COMPLAINT & String = js.native
    
    /* "CHARGEBACK" */ val CHARGEBACK: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.CHARGEBACK & String = js.native
    
    /* "ECHECK" */ val ECHECK: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.ECHECK & String = js.native
    
    /* "INTERNATIONAL_WITHDRAWAL" */ val INTERNATIONAL_WITHDRAWAL: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.INTERNATIONAL_WITHDRAWAL & String = js.native
    
    /* "OTHER" */ val OTHER: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.OTHER & String = js.native
    
    /* "PENDING_REVIEW" */ val PENDING_REVIEW: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.PENDING_REVIEW & String = js.native
    
    /* "RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION" */ val RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION & String = js.native
    
    /* "REFUNDED" */ val REFUNDED: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.REFUNDED & String = js.native
    
    /* "TRANSACTION_APPROVED_AWAITING_FUNDING" */ val TRANSACTION_APPROVED_AWAITING_FUNDING: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.TRANSACTION_APPROVED_AWAITING_FUNDING & String = js.native
    
    /* "UNILATERAL" */ val UNILATERAL: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.UNILATERAL & String = js.native
    
    /* "VERIFICATION_REQUIRED" */ val VERIFICATION_REQUIRED: typings.paypalCheckoutServerSdk.paymentsLibMod.Reason.VERIFICATION_REQUIRED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.RefundsGetRequest")
  @js.native
  open class RefundsGetRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.payments.RefundsGetRequest {
    def this(refundId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.ResponseCode")
  @js.native
  object ResponseCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode & String] = js.native
    
    /* "6300" */ val ACCOUNT_NOT_ON_FILE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ACCOUNT_NOT_ON_FILE & String = js.native
    
    /* "PPAG" */ val ADULT_GAMING_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ADULT_GAMING_UNSUPPORTED & String = js.native
    
    /* "PPSE" */ val AMEX_DENIED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AMEX_DENIED & String = js.native
    
    /* "PPAE" */ val AMEX_DISABLED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AMEX_DISABLED & String = js.native
    
    /* "PPAX" */ val AMOUNT_EXCEEDED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AMOUNT_EXCEEDED & String = js.native
    
    /* "PPAI" */ val AMOUNT_INCOMPATIBLE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AMOUNT_INCOMPATIBLE & String = js.native
    
    /* "PPS6" */ val AMOUNT_MISMATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AMOUNT_MISMATCH & String = js.native
    
    /* "0000" */ val APPROVED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.APPROVED & String = js.native
    
    /* "7600" */ val APPROVED_NON_CAPTURE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.APPROVED_NON_CAPTURE & String = js.native
    
    /* "PPAV" */ val ARC_AVS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ARC_AVS & String = js.native
    
    /* "PPC2" */ val ARC_CVV: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ARC_CVV & String = js.native
    
    /* "PPSC" */ val ARC_SCORE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ARC_SCORE & String = js.native
    
    /* "7710" */ val AUTHENTICATION_FAILED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AUTHENTICATION_FAILED & String = js.native
    
    /* "PPDV" */ val AUTH_MESSAGE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AUTH_MESSAGE & String = js.native
    
    /* "PPAR" */ val AUTH_RESULT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AUTH_RESULT & String = js.native
    
    /* "5170" */ val AVS_FAILURE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.AVS_FAILURE & String = js.native
    
    /* "PPBG" */ val BAD_GAMING: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BAD_GAMING & String = js.native
    
    /* "1360" */ val BAD_PROCESSING_CODE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BAD_PROCESSING_CODE & String = js.native
    
    /* "0800" */ val BAD_RESPONSE_REVERSAL_REQUIRED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BAD_RESPONSE_REVERSAL_REQUIRED & String = js.native
    
    /* "PPS3" */ val BANKAUTH_EXPIRED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BANKAUTH_EXPIRED & String = js.native
    
    /* "PPS0" */ val BANKAUTH_ROW_MISMATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BANKAUTH_ROW_MISMATCH & String = js.native
    
    /* "PPS1" */ val BANKAUTH_ROW_SETTLED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BANKAUTH_ROW_SETTLED & String = js.native
    
    /* "PPS2" */ val BANKAUTH_ROW_VOIDED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BANKAUTH_ROW_VOIDED & String = js.native
    
    /* "PPAD" */ val BILLING_ADDRESS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BILLING_ADDRESS & String = js.native
    
    /* "7800" */ val BIN_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BIN_ERROR & String = js.native
    
    /* "PPMC" */ val BLOCKED_Mastercard: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.BLOCKED_Mastercard & String = js.native
    
    /* "5140" */ val CARD_CLOSED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CARD_CLOSED & String = js.native
    
    /* "5930" */ val CARD_NOT_ACTIVATED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CARD_NOT_ACTIVATED & String = js.native
    
    /* "PPCT" */ val CARD_TYPE_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CARD_TYPE_UNSUPPORTED & String = js.native
    
    /* "PPCE" */ val CE_REGISTRATION_INCOMPLETE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CE_REGISTRATION_INCOMPLETE & String = js.native
    
    /* "8020" */ val CONFIGURATION_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CONFIGURATION_ERROR & String = js.native
    
    /* "PPCO" */ val COUNTRY: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.COUNTRY & String = js.native
    
    /* "PPS5" */ val CREDITCARD_MISMATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CREDITCARD_MISMATCH & String = js.native
    
    /* "PPCR" */ val CREDIT_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CREDIT_ERROR & String = js.native
    
    /* "PPUC" */ val CURRENCY_CODE_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CURRENCY_CODE_UNSUPPORTED & String = js.native
    
    /* "PPS4" */ val CURRENCY_MISMATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CURRENCY_MISMATCH & String = js.native
    
    /* "PPCU" */ val CURRENCY_USED_INVALID: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CURRENCY_USED_INVALID & String = js.native
    
    /* "5110" */ val CVV2_FAILURE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CVV2_FAILURE & String = js.native
    
    /* "PCVV" */ val CVV_FAILURE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.CVV_FAILURE & String = js.native
    
    /* "PPDC" */ val DCC_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.DCC_UNSUPPORTED & String = js.native
    
    /* "9100" */ val DECLINED_PLEASE_RETRY: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.DECLINED_PLEASE_RETRY & String = js.native
    
    /* "PPDI" */ val DINERS_REJECT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.DINERS_REJECT & String = js.native
    
    /* "0500" */ val DO_NOT_HONOR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.DO_NOT_HONOR & String = js.native
    
    /* "5200" */ val DUPLICATE_TRANSACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.DUPLICATE_TRANSACTION & String = js.native
    
    /* "7700" */ val ERROR_3DS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ERROR_3DS & String = js.native
    
    /* "PPEL" */ val EXCEEDS_FREQUENCY_LIMIT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.EXCEEDS_FREQUENCY_LIMIT & String = js.native
    
    /* "5400" */ val EXPIRED_CARD: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.EXPIRED_CARD & String = js.native
    
    /* "PPEF" */ val EXPIRED_FUNDING_INSTRUMENT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.EXPIRED_FUNDING_INSTRUMENT & String = js.native
    
    /* "PPEX" */ val EXPIRY_DATE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.EXPIRY_DATE & String = js.native
    
    /* "8100" */ val FATAL_COMMUNICATION_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.FATAL_COMMUNICATION_ERROR & String = js.native
    
    /* "PPFV" */ val FIELD_VALIDATION_FAILED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.FIELD_VALIDATION_FAILED & String = js.native
    
    /* "PPFE" */ val FUNDING_SOURCE_ALREADY_EXISTS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.FUNDING_SOURCE_ALREADY_EXISTS & String = js.native
    
    /* "PPGR" */ val GAMING_REFUND_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.GAMING_REFUND_ERROR & String = js.native
    
    /* "5100" */ val GENERIC_DECLINE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.GENERIC_DECLINE & String = js.native
    
    /* "PPH1" */ val H1_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.H1_ERROR & String = js.native
    
    /* "9530" */ val HOLD_CALL_CENTER: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.HOLD_CALL_CENTER & String = js.native
    
    /* "8010" */ val HOST_KEY_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.HOST_KEY_ERROR & String = js.native
    
    /* "PPIF" */ val IDEMPOTENCY_FAILURE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.IDEMPOTENCY_FAILURE & String = js.native
    
    /* "PPIM" */ val ID_MISMATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ID_MISMATCH & String = js.native
    
    /* "5500" */ val INCORRECT_PIN_REENTER: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INCORRECT_PIN_REENTER & String = js.native
    
    /* "5120" */ val INSUFFICIENT_FUNDS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INSUFFICIENT_FUNDS & String = js.native
    
    /* "PPER" */ val INTERNAL_SYSTEM_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INTERNAL_SYSTEM_ERROR & String = js.native
    
    /* "1330" */ val INVALID_ACCOUNT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_ACCOUNT & String = js.native
    
    /* "1335" */ val INVALID_ACCOUNT_RECURRING: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_ACCOUNT_RECURRING & String = js.native
    
    /* "1310" */ val INVALID_AMOUNT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_AMOUNT & String = js.native
    
    /* "1317" */ val INVALID_CAPTURE_DATE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_CAPTURE_DATE & String = js.native
    
    /* "1382" */ val INVALID_CARD_VERIFICATION_VALUE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_CARD_VERIFICATION_VALUE & String = js.native
    
    /* "1320" */ val INVALID_CURRENCY_CODE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_CURRENCY_CODE & String = js.native
    
    /* "1300" */ val INVALID_DATA_FORMAT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_DATA_FORMAT & String = js.native
    
    /* "1380" */ val INVALID_EXPIRATION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_EXPIRATION & String = js.native
    
    /* "PPFI" */ val INVALID_FUNDING_INSTRUMENT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_FUNDING_INSTRUMENT & String = js.native
    
    /* "PPII" */ val INVALID_INPUT_FAILURE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_INPUT_FAILURE & String = js.native
    
    /* "5900" */ val INVALID_ISSUE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_ISSUE & String = js.native
    
    /* "1384" */ val INVALID_LIFE_CYCLE_OF_TRANSACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_LIFE_CYCLE_OF_TRANSACTION & String = js.native
    
    /* "1370" */ val INVALID_MCC: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_MCC & String = js.native
    
    /* "1350" */ val INVALID_MERCHANT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_MERCHANT & String = js.native
    
    /* "1390" */ val INVALID_ORDER: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_ORDER & String = js.native
    
    /* "5180" */ val INVALID_OR_RESTRICTED_CARD: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_OR_RESTRICTED_CARD & String = js.native
    
    /* "PPRF" */ val INVALID_PARENT_TRANSACTION_STATUS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_PARENT_TRANSACTION_STATUS & String = js.native
    
    /* "PPPM" */ val INVALID_PAYMENT_METHOD: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_PAYMENT_METHOD & String = js.native
    
    /* "5130" */ val INVALID_PIN: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_PIN & String = js.native
    
    /* "PPPI" */ val INVALID_PRODUCT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_PRODUCT & String = js.native
    
    /* "1340" */ val INVALID_TERMINAL: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_TERMINAL & String = js.native
    
    /* "PPIT" */ val INVALID_TRACE_ID: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_TRACE_ID & String = js.native
    
    /* "PPTF" */ val INVALID_TRACE_REFERENCE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_TRACE_REFERENCE & String = js.native
    
    /* "5210" */ val INVALID_TRANSACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_TRANSACTION & String = js.native
    
    /* "1312" */ val INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER & String = js.native
    
    /* "PPTI" */ val INVALID_TRANSACTION_ID: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_TRANSACTION_ID & String = js.native
    
    /* "PPTV" */ val INVALID_VERIFICATION_TOKEN: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.INVALID_VERIFICATION_TOKEN & String = js.native
    
    /* "5910" */ val ISSUER_NOT_AVAILABLE_NOT_RETRIABLE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ISSUER_NOT_AVAILABLE_NOT_RETRIABLE & String = js.native
    
    /* "5920" */ val ISSUER_NOT_AVAILABLE_RETRIABLE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.ISSUER_NOT_AVAILABLE_RETRIABLE & String = js.native
    
    /* "PPLS" */ val LARGE_STATUS_CODE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.LARGE_STATUS_CODE & String = js.native
    
    /* "PPLR" */ val LATE_REVERSAL: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.LATE_REVERSAL & String = js.native
    
    /* "9520" */ val LOST_OR_STOLEN: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.LOST_OR_STOLEN & String = js.native
    
    /* "PPAU" */ val MCC_CODE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.MCC_CODE & String = js.native
    
    /* "PPRR" */ val MERCHANT_NOT_REGISTERED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.MERCHANT_NOT_REGISTERED & String = js.native
    
    /* "PPNT" */ val NETWORK_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.NETWORK_ERROR & String = js.native
    
    /* "PPNC" */ val NOT_SUPPORTED_NRC: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.NOT_SUPPORTED_NRC & String = js.native
    
    /* "PPPH" */ val NO_PHONE_FOR_DCC_TRANSACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.NO_PHONE_FOR_DCC_TRANSACTION & String = js.native
    
    /* "1000" */ val PARTIAL_AUTHORIZATION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.PARTIAL_AUTHORIZATION & String = js.native
    
    /* "5150" */ val PICKUP_CARD_SPECIAL_CONDITIONS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.PICKUP_CARD_SPECIAL_CONDITIONS & String = js.native
    
    /* "7900" */ val PIN_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.PIN_ERROR & String = js.native
    
    /* "PPMD" */ val PPMD: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.PPMD & String = js.native
    
    /* "8000" */ val PROCESSOR_SYSTEM_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.PROCESSOR_SYSTEM_ERROR & String = js.native
    
    /* "PPQC" */ val QUASI_CASH_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.QUASI_CASH_UNSUPPORTED & String = js.native
    
    /* "0100" */ val REFERRAL: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.REFERRAL & String = js.native
    
    /* "9540" */ val REFUSED_CARD: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.REFUSED_CARD & String = js.native
    
    /* "PPFR" */ val RESTRICTED_FUNDING_INSTRUMENT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.RESTRICTED_FUNDING_INSTRUMENT & String = js.native
    
    /* "8110" */ val RETRIABLE_COMMUNICATION_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.RETRIABLE_COMMUNICATION_ERROR & String = js.native
    
    /* "5800" */ val REVERSAL_REJECTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.REVERSAL_REJECTED & String = js.native
    
    /* "PPD3" */ val SECURE_ERROR_3DS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.SECURE_ERROR_3DS & String = js.native
    
    /* "9510" */ val SECURITY_VIOLATION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.SECURITY_VIOLATION & String = js.native
    
    /* "5190" */ val SOFT_AVS: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.SOFT_AVS & String = js.native
    
    /* "PPSD" */ val STATUS_DESCRIPTION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.STATUS_DESCRIPTION & String = js.native
    
    /* "9500" */ val SUSPECTED_FRAUD: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.SUSPECTED_FRAUD & String = js.native
    
    /* "8220" */ val SYSTEM_UNAVAILABLE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.SYSTEM_UNAVAILABLE & String = js.native
    
    /* "1393" */ val TRANSACTION_CANNOT_BE_COMPLETED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.TRANSACTION_CANNOT_BE_COMPLETED & String = js.native
    
    /* "5700" */ val TRANSACTION_NOT_PERMITTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.TRANSACTION_NOT_PERMITTED & String = js.native
    
    /* "PPTT" */ val TRANSACTION_TYPE_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.TRANSACTION_TYPE_UNSUPPORTED & String = js.native
    
    /* "5160" */ val UNAUTHORIZED_USER: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNAUTHORIZED_USER & String = js.native
    
    /* "9600" */ val UNRECOGNIZED_RESPONSE_CODE: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNRECOGNIZED_RESPONSE_CODE & String = js.native
    
    /* "8030" */ val UNSUPPORTED_OPERATION: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNSUPPORTED_OPERATION & String = js.native
    
    /* "PPUR" */ val UNSUPPORTED_REVERSAL: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNSUPPORTED_REVERSAL & String = js.native
    
    /* "PPUE" */ val UNSUPPORT_ENTITY: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNSUPPORT_ENTITY & String = js.native
    
    /* "PPUI" */ val UNSUPPORT_INSTALLMENT: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNSUPPORT_INSTALLMENT & String = js.native
    
    /* "PPUP" */ val UNSUPPORT_POS_FLAG: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNSUPPORT_POS_FLAG & String = js.native
    
    /* "PPRE" */ val UNSUPPORT_REFUND_ON_PENDING_BC: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.UNSUPPORT_REFUND_ON_PENDING_BC & String = js.native
    
    /* "PPUA" */ val USER_NOT_AUTHORIZED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.USER_NOT_AUTHORIZED & String = js.native
    
    /* "PPVC" */ val VALIDATE_CURRENCY: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.VALIDATE_CURRENCY & String = js.native
    
    /* "PPVE" */ val VALIDATION_ERROR: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.VALIDATION_ERROR & String = js.native
    
    /* "PPTE" */ val VERIFICATION_TOKEN_EXPIRED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.VERIFICATION_TOKEN_EXPIRED & String = js.native
    
    /* "PPTR" */ val VERIFICATION_TOKEN_REVOKED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.VERIFICATION_TOKEN_REVOKED & String = js.native
    
    /* "PPVT" */ val VIRTUAL_TERMINAL_UNSUPPORTED: typings.paypalCheckoutServerSdk.paymentsLibMod.ResponseCode.VIRTUAL_TERMINAL_UNSUPPORTED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.ShippingType")
  @js.native
  object ShippingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType & String] = js.native
    
    /* "PICKUP" */ val PICKUP: typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType.PICKUP & String = js.native
    
    /* "PICKUP_IN_PERSON" */ val PICKUP_IN_PERSON: typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType.PICKUP_IN_PERSON & String = js.native
    
    /* "SHIPPING" */ val SHIPPING: typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType.SHIPPING & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.Status & String] = js.native
    
    /* "CANCELLED" */ val CANCELLED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.CANCELLED & String = js.native
    
    /* "CAPTURED" */ val CAPTURED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.CAPTURED & String = js.native
    
    /* "COMPLETED" */ val COMPLETED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.COMPLETED & String = js.native
    
    /* "CREATED" */ val CREATED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.CREATED & String = js.native
    
    /* "DECLINED" */ val DECLINED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.DECLINED & String = js.native
    
    /* "DENIED" */ val DENIED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.DENIED & String = js.native
    
    /* "ELIGIBLE" */ val ELIGIBLE: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.ELIGIBLE & String = js.native
    
    /* "EXPIRED" */ val EXPIRED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.EXPIRED & String = js.native
    
    /* "FAILED" */ val FAILED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.FAILED & String = js.native
    
    /* "NOT_ELIGIBLE" */ val NOT_ELIGIBLE: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.NOT_ELIGIBLE & String = js.native
    
    /* "PARTIALLY_CAPTURED" */ val PARTIALLY_CAPTURED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.PARTIALLY_CAPTURED & String = js.native
    
    /* "PARTIALLY_CREATED" */ val PARTIALLY_CREATED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.PARTIALLY_CREATED & String = js.native
    
    /* "PARTIALLY_ELIGIBLE" */ val PARTIALLY_ELIGIBLE: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.PARTIALLY_ELIGIBLE & String = js.native
    
    /* "PARTIALLY_REFUNDED" */ val PARTIALLY_REFUNDED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.PARTIALLY_REFUNDED & String = js.native
    
    /* "PENDING" */ val PENDING: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.PENDING & String = js.native
    
    /* "REFUNDED" */ val REFUNDED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.REFUNDED & String = js.native
    
    /* "VOIDED" */ val VOIDED: typings.paypalCheckoutServerSdk.paymentsLibMod.Status.VOIDED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.TaxIdType")
  @js.native
  object TaxIdType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.TaxIdType & String] = js.native
    
    /* "BR_CNPJ" */ val BR_CNPJ: typings.paypalCheckoutServerSdk.paymentsLibMod.TaxIdType.BR_CNPJ & String = js.native
    
    /* "BR_CPF" */ val BR_CPF: typings.paypalCheckoutServerSdk.paymentsLibMod.TaxIdType.BR_CPF & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.paymentsLibMod.TokenType & String] = js.native
    
    /* "BILLING_AGREEMENT" */ val BILLING_AGREEMENT: typings.paypalCheckoutServerSdk.paymentsLibMod.TokenType.BILLING_AGREEMENT & String = js.native
  }
}
