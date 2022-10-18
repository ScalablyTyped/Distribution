package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseCode extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "ResponseCode")
@js.native
object ResponseCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResponseCode & String] = js.native
  
  @js.native
  sealed trait ACCOUNT_NOT_ON_FILE
    extends StObject
       with ResponseCode
  /* "6300" */ val ACCOUNT_NOT_ON_FILE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ACCOUNT_NOT_ON_FILE & String = js.native
  
  @js.native
  sealed trait ADULT_GAMING_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPAG" */ val ADULT_GAMING_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ADULT_GAMING_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait AMEX_DENIED
    extends StObject
       with ResponseCode
  /* "PPSE" */ val AMEX_DENIED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMEX_DENIED & String = js.native
  
  @js.native
  sealed trait AMEX_DISABLED
    extends StObject
       with ResponseCode
  /* "PPAE" */ val AMEX_DISABLED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMEX_DISABLED & String = js.native
  
  @js.native
  sealed trait AMOUNT_EXCEEDED
    extends StObject
       with ResponseCode
  /* "PPAX" */ val AMOUNT_EXCEEDED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMOUNT_EXCEEDED & String = js.native
  
  @js.native
  sealed trait AMOUNT_INCOMPATIBLE
    extends StObject
       with ResponseCode
  /* "PPAI" */ val AMOUNT_INCOMPATIBLE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMOUNT_INCOMPATIBLE & String = js.native
  
  @js.native
  sealed trait AMOUNT_MISMATCH
    extends StObject
       with ResponseCode
  /* "PPS6" */ val AMOUNT_MISMATCH: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMOUNT_MISMATCH & String = js.native
  
  @js.native
  sealed trait APPROVED
    extends StObject
       with ResponseCode
  /* "0000" */ val APPROVED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.APPROVED & String = js.native
  
  @js.native
  sealed trait APPROVED_NON_CAPTURE
    extends StObject
       with ResponseCode
  /* "7600" */ val APPROVED_NON_CAPTURE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.APPROVED_NON_CAPTURE & String = js.native
  
  @js.native
  sealed trait ARC_AVS
    extends StObject
       with ResponseCode
  /* "PPAV" */ val ARC_AVS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ARC_AVS & String = js.native
  
  @js.native
  sealed trait ARC_CVV
    extends StObject
       with ResponseCode
  /* "PPC2" */ val ARC_CVV: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ARC_CVV & String = js.native
  
  @js.native
  sealed trait ARC_SCORE
    extends StObject
       with ResponseCode
  /* "PPSC" */ val ARC_SCORE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ARC_SCORE & String = js.native
  
  @js.native
  sealed trait AUTHENTICATION_FAILED
    extends StObject
       with ResponseCode
  /* "7710" */ val AUTHENTICATION_FAILED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AUTHENTICATION_FAILED & String = js.native
  
  @js.native
  sealed trait AUTH_MESSAGE
    extends StObject
       with ResponseCode
  /* "PPDV" */ val AUTH_MESSAGE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AUTH_MESSAGE & String = js.native
  
  @js.native
  sealed trait AUTH_RESULT
    extends StObject
       with ResponseCode
  /* "PPAR" */ val AUTH_RESULT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AUTH_RESULT & String = js.native
  
  @js.native
  sealed trait AVS_FAILURE
    extends StObject
       with ResponseCode
  /* "5170" */ val AVS_FAILURE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AVS_FAILURE & String = js.native
  
  @js.native
  sealed trait BAD_GAMING
    extends StObject
       with ResponseCode
  /* "PPBG" */ val BAD_GAMING: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BAD_GAMING & String = js.native
  
  @js.native
  sealed trait BAD_PROCESSING_CODE
    extends StObject
       with ResponseCode
  /* "1360" */ val BAD_PROCESSING_CODE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BAD_PROCESSING_CODE & String = js.native
  
  @js.native
  sealed trait BAD_RESPONSE_REVERSAL_REQUIRED
    extends StObject
       with ResponseCode
  /* "0800" */ val BAD_RESPONSE_REVERSAL_REQUIRED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BAD_RESPONSE_REVERSAL_REQUIRED & String = js.native
  
  @js.native
  sealed trait BANKAUTH_EXPIRED
    extends StObject
       with ResponseCode
  /* "PPS3" */ val BANKAUTH_EXPIRED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_EXPIRED & String = js.native
  
  @js.native
  sealed trait BANKAUTH_ROW_MISMATCH
    extends StObject
       with ResponseCode
  /* "PPS0" */ val BANKAUTH_ROW_MISMATCH: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_ROW_MISMATCH & String = js.native
  
  @js.native
  sealed trait BANKAUTH_ROW_SETTLED
    extends StObject
       with ResponseCode
  /* "PPS1" */ val BANKAUTH_ROW_SETTLED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_ROW_SETTLED & String = js.native
  
  @js.native
  sealed trait BANKAUTH_ROW_VOIDED
    extends StObject
       with ResponseCode
  /* "PPS2" */ val BANKAUTH_ROW_VOIDED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_ROW_VOIDED & String = js.native
  
  @js.native
  sealed trait BILLING_ADDRESS
    extends StObject
       with ResponseCode
  /* "PPAD" */ val BILLING_ADDRESS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BILLING_ADDRESS & String = js.native
  
  @js.native
  sealed trait BIN_ERROR
    extends StObject
       with ResponseCode
  /* "7800" */ val BIN_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BIN_ERROR & String = js.native
  
  @js.native
  sealed trait BLOCKED_Mastercard
    extends StObject
       with ResponseCode
  /* "PPMC" */ val BLOCKED_Mastercard: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BLOCKED_Mastercard & String = js.native
  
  @js.native
  sealed trait CARD_CLOSED
    extends StObject
       with ResponseCode
  /* "5140" */ val CARD_CLOSED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CARD_CLOSED & String = js.native
  
  @js.native
  sealed trait CARD_NOT_ACTIVATED
    extends StObject
       with ResponseCode
  /* "5930" */ val CARD_NOT_ACTIVATED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CARD_NOT_ACTIVATED & String = js.native
  
  @js.native
  sealed trait CARD_TYPE_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPCT" */ val CARD_TYPE_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CARD_TYPE_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait CE_REGISTRATION_INCOMPLETE
    extends StObject
       with ResponseCode
  /* "PPCE" */ val CE_REGISTRATION_INCOMPLETE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CE_REGISTRATION_INCOMPLETE & String = js.native
  
  @js.native
  sealed trait CONFIGURATION_ERROR
    extends StObject
       with ResponseCode
  /* "8020" */ val CONFIGURATION_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CONFIGURATION_ERROR & String = js.native
  
  @js.native
  sealed trait COUNTRY
    extends StObject
       with ResponseCode
  /* "PPCO" */ val COUNTRY: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.COUNTRY & String = js.native
  
  @js.native
  sealed trait CREDITCARD_MISMATCH
    extends StObject
       with ResponseCode
  /* "PPS5" */ val CREDITCARD_MISMATCH: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CREDITCARD_MISMATCH & String = js.native
  
  @js.native
  sealed trait CREDIT_ERROR
    extends StObject
       with ResponseCode
  /* "PPCR" */ val CREDIT_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CREDIT_ERROR & String = js.native
  
  @js.native
  sealed trait CURRENCY_CODE_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPUC" */ val CURRENCY_CODE_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CURRENCY_CODE_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait CURRENCY_MISMATCH
    extends StObject
       with ResponseCode
  /* "PPS4" */ val CURRENCY_MISMATCH: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CURRENCY_MISMATCH & String = js.native
  
  @js.native
  sealed trait CURRENCY_USED_INVALID
    extends StObject
       with ResponseCode
  /* "PPCU" */ val CURRENCY_USED_INVALID: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CURRENCY_USED_INVALID & String = js.native
  
  @js.native
  sealed trait CVV2_FAILURE
    extends StObject
       with ResponseCode
  /* "5110" */ val CVV2_FAILURE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CVV2_FAILURE & String = js.native
  
  @js.native
  sealed trait CVV_FAILURE
    extends StObject
       with ResponseCode
  /* "PCVV" */ val CVV_FAILURE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CVV_FAILURE & String = js.native
  
  @js.native
  sealed trait DCC_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPDC" */ val DCC_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DCC_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait DECLINED_PLEASE_RETRY
    extends StObject
       with ResponseCode
  /* "9100" */ val DECLINED_PLEASE_RETRY: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DECLINED_PLEASE_RETRY & String = js.native
  
  @js.native
  sealed trait DINERS_REJECT
    extends StObject
       with ResponseCode
  /* "PPDI" */ val DINERS_REJECT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DINERS_REJECT & String = js.native
  
  @js.native
  sealed trait DO_NOT_HONOR
    extends StObject
       with ResponseCode
  /* "0500" */ val DO_NOT_HONOR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DO_NOT_HONOR & String = js.native
  
  @js.native
  sealed trait DUPLICATE_TRANSACTION
    extends StObject
       with ResponseCode
  /* "5200" */ val DUPLICATE_TRANSACTION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DUPLICATE_TRANSACTION & String = js.native
  
  @js.native
  sealed trait ERROR_3DS
    extends StObject
       with ResponseCode
  /* "7700" */ val ERROR_3DS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ERROR_3DS & String = js.native
  
  @js.native
  sealed trait EXCEEDS_FREQUENCY_LIMIT
    extends StObject
       with ResponseCode
  /* "PPEL" */ val EXCEEDS_FREQUENCY_LIMIT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXCEEDS_FREQUENCY_LIMIT & String = js.native
  
  @js.native
  sealed trait EXPIRED_CARD
    extends StObject
       with ResponseCode
  /* "5400" */ val EXPIRED_CARD: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXPIRED_CARD & String = js.native
  
  @js.native
  sealed trait EXPIRED_FUNDING_INSTRUMENT
    extends StObject
       with ResponseCode
  /* "PPEF" */ val EXPIRED_FUNDING_INSTRUMENT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXPIRED_FUNDING_INSTRUMENT & String = js.native
  
  @js.native
  sealed trait EXPIRY_DATE
    extends StObject
       with ResponseCode
  /* "PPEX" */ val EXPIRY_DATE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXPIRY_DATE & String = js.native
  
  @js.native
  sealed trait FATAL_COMMUNICATION_ERROR
    extends StObject
       with ResponseCode
  /* "8100" */ val FATAL_COMMUNICATION_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.FATAL_COMMUNICATION_ERROR & String = js.native
  
  @js.native
  sealed trait FIELD_VALIDATION_FAILED
    extends StObject
       with ResponseCode
  /* "PPFV" */ val FIELD_VALIDATION_FAILED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.FIELD_VALIDATION_FAILED & String = js.native
  
  @js.native
  sealed trait FUNDING_SOURCE_ALREADY_EXISTS
    extends StObject
       with ResponseCode
  /* "PPFE" */ val FUNDING_SOURCE_ALREADY_EXISTS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.FUNDING_SOURCE_ALREADY_EXISTS & String = js.native
  
  @js.native
  sealed trait GAMING_REFUND_ERROR
    extends StObject
       with ResponseCode
  /* "PPGR" */ val GAMING_REFUND_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.GAMING_REFUND_ERROR & String = js.native
  
  @js.native
  sealed trait GENERIC_DECLINE
    extends StObject
       with ResponseCode
  /* "5100" */ val GENERIC_DECLINE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.GENERIC_DECLINE & String = js.native
  
  @js.native
  sealed trait H1_ERROR
    extends StObject
       with ResponseCode
  /* "PPH1" */ val H1_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.H1_ERROR & String = js.native
  
  @js.native
  sealed trait HOLD_CALL_CENTER
    extends StObject
       with ResponseCode
  /* "9530" */ val HOLD_CALL_CENTER: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.HOLD_CALL_CENTER & String = js.native
  
  @js.native
  sealed trait HOST_KEY_ERROR
    extends StObject
       with ResponseCode
  /* "8010" */ val HOST_KEY_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.HOST_KEY_ERROR & String = js.native
  
  @js.native
  sealed trait IDEMPOTENCY_FAILURE
    extends StObject
       with ResponseCode
  /* "PPIF" */ val IDEMPOTENCY_FAILURE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.IDEMPOTENCY_FAILURE & String = js.native
  
  @js.native
  sealed trait ID_MISMATCH
    extends StObject
       with ResponseCode
  /* "PPIM" */ val ID_MISMATCH: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ID_MISMATCH & String = js.native
  
  @js.native
  sealed trait INCORRECT_PIN_REENTER
    extends StObject
       with ResponseCode
  /* "5500" */ val INCORRECT_PIN_REENTER: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INCORRECT_PIN_REENTER & String = js.native
  
  @js.native
  sealed trait INSUFFICIENT_FUNDS
    extends StObject
       with ResponseCode
  /* "5120" */ val INSUFFICIENT_FUNDS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INSUFFICIENT_FUNDS & String = js.native
  
  @js.native
  sealed trait INTERNAL_SYSTEM_ERROR
    extends StObject
       with ResponseCode
  /* "PPER" */ val INTERNAL_SYSTEM_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INTERNAL_SYSTEM_ERROR & String = js.native
  
  @js.native
  sealed trait INVALID_ACCOUNT
    extends StObject
       with ResponseCode
  /* "1330" */ val INVALID_ACCOUNT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ACCOUNT & String = js.native
  
  @js.native
  sealed trait INVALID_ACCOUNT_RECURRING
    extends StObject
       with ResponseCode
  /* "1335" */ val INVALID_ACCOUNT_RECURRING: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ACCOUNT_RECURRING & String = js.native
  
  @js.native
  sealed trait INVALID_AMOUNT
    extends StObject
       with ResponseCode
  /* "1310" */ val INVALID_AMOUNT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_AMOUNT & String = js.native
  
  @js.native
  sealed trait INVALID_CAPTURE_DATE
    extends StObject
       with ResponseCode
  /* "1317" */ val INVALID_CAPTURE_DATE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_CAPTURE_DATE & String = js.native
  
  @js.native
  sealed trait INVALID_CARD_VERIFICATION_VALUE
    extends StObject
       with ResponseCode
  /* "1382" */ val INVALID_CARD_VERIFICATION_VALUE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_CARD_VERIFICATION_VALUE & String = js.native
  
  @js.native
  sealed trait INVALID_CURRENCY_CODE
    extends StObject
       with ResponseCode
  /* "1320" */ val INVALID_CURRENCY_CODE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_CURRENCY_CODE & String = js.native
  
  @js.native
  sealed trait INVALID_DATA_FORMAT
    extends StObject
       with ResponseCode
  /* "1300" */ val INVALID_DATA_FORMAT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_DATA_FORMAT & String = js.native
  
  @js.native
  sealed trait INVALID_EXPIRATION
    extends StObject
       with ResponseCode
  /* "1380" */ val INVALID_EXPIRATION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_EXPIRATION & String = js.native
  
  @js.native
  sealed trait INVALID_FUNDING_INSTRUMENT
    extends StObject
       with ResponseCode
  /* "PPFI" */ val INVALID_FUNDING_INSTRUMENT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_FUNDING_INSTRUMENT & String = js.native
  
  @js.native
  sealed trait INVALID_INPUT_FAILURE
    extends StObject
       with ResponseCode
  /* "PPII" */ val INVALID_INPUT_FAILURE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_INPUT_FAILURE & String = js.native
  
  @js.native
  sealed trait INVALID_ISSUE
    extends StObject
       with ResponseCode
  /* "5900" */ val INVALID_ISSUE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ISSUE & String = js.native
  
  @js.native
  sealed trait INVALID_LIFE_CYCLE_OF_TRANSACTION
    extends StObject
       with ResponseCode
  /* "1384" */ val INVALID_LIFE_CYCLE_OF_TRANSACTION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_LIFE_CYCLE_OF_TRANSACTION & String = js.native
  
  @js.native
  sealed trait INVALID_MCC
    extends StObject
       with ResponseCode
  /* "1370" */ val INVALID_MCC: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_MCC & String = js.native
  
  @js.native
  sealed trait INVALID_MERCHANT
    extends StObject
       with ResponseCode
  /* "1350" */ val INVALID_MERCHANT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_MERCHANT & String = js.native
  
  @js.native
  sealed trait INVALID_ORDER
    extends StObject
       with ResponseCode
  /* "1390" */ val INVALID_ORDER: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ORDER & String = js.native
  
  @js.native
  sealed trait INVALID_OR_RESTRICTED_CARD
    extends StObject
       with ResponseCode
  /* "5180" */ val INVALID_OR_RESTRICTED_CARD: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_OR_RESTRICTED_CARD & String = js.native
  
  @js.native
  sealed trait INVALID_PARENT_TRANSACTION_STATUS
    extends StObject
       with ResponseCode
  /* "PPRF" */ val INVALID_PARENT_TRANSACTION_STATUS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PARENT_TRANSACTION_STATUS & String = js.native
  
  @js.native
  sealed trait INVALID_PAYMENT_METHOD
    extends StObject
       with ResponseCode
  /* "PPPM" */ val INVALID_PAYMENT_METHOD: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PAYMENT_METHOD & String = js.native
  
  @js.native
  sealed trait INVALID_PIN
    extends StObject
       with ResponseCode
  /* "5130" */ val INVALID_PIN: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PIN & String = js.native
  
  @js.native
  sealed trait INVALID_PRODUCT
    extends StObject
       with ResponseCode
  /* "PPPI" */ val INVALID_PRODUCT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PRODUCT & String = js.native
  
  @js.native
  sealed trait INVALID_TERMINAL
    extends StObject
       with ResponseCode
  /* "1340" */ val INVALID_TERMINAL: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TERMINAL & String = js.native
  
  @js.native
  sealed trait INVALID_TRACE_ID
    extends StObject
       with ResponseCode
  /* "PPIT" */ val INVALID_TRACE_ID: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRACE_ID & String = js.native
  
  @js.native
  sealed trait INVALID_TRACE_REFERENCE
    extends StObject
       with ResponseCode
  /* "PPTF" */ val INVALID_TRACE_REFERENCE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRACE_REFERENCE & String = js.native
  
  @js.native
  sealed trait INVALID_TRANSACTION
    extends StObject
       with ResponseCode
  /* "5210" */ val INVALID_TRANSACTION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRANSACTION & String = js.native
  
  @js.native
  sealed trait INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER
    extends StObject
       with ResponseCode
  /* "1312" */ val INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER & String = js.native
  
  @js.native
  sealed trait INVALID_TRANSACTION_ID
    extends StObject
       with ResponseCode
  /* "PPTI" */ val INVALID_TRANSACTION_ID: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRANSACTION_ID & String = js.native
  
  @js.native
  sealed trait INVALID_VERIFICATION_TOKEN
    extends StObject
       with ResponseCode
  /* "PPTV" */ val INVALID_VERIFICATION_TOKEN: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_VERIFICATION_TOKEN & String = js.native
  
  @js.native
  sealed trait ISSUER_NOT_AVAILABLE_NOT_RETRIABLE
    extends StObject
       with ResponseCode
  /* "5910" */ val ISSUER_NOT_AVAILABLE_NOT_RETRIABLE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ISSUER_NOT_AVAILABLE_NOT_RETRIABLE & String = js.native
  
  @js.native
  sealed trait ISSUER_NOT_AVAILABLE_RETRIABLE
    extends StObject
       with ResponseCode
  /* "5920" */ val ISSUER_NOT_AVAILABLE_RETRIABLE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ISSUER_NOT_AVAILABLE_RETRIABLE & String = js.native
  
  @js.native
  sealed trait LARGE_STATUS_CODE
    extends StObject
       with ResponseCode
  /* "PPLS" */ val LARGE_STATUS_CODE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.LARGE_STATUS_CODE & String = js.native
  
  @js.native
  sealed trait LATE_REVERSAL
    extends StObject
       with ResponseCode
  /* "PPLR" */ val LATE_REVERSAL: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.LATE_REVERSAL & String = js.native
  
  @js.native
  sealed trait LOST_OR_STOLEN
    extends StObject
       with ResponseCode
  /* "9520" */ val LOST_OR_STOLEN: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.LOST_OR_STOLEN & String = js.native
  
  @js.native
  sealed trait MCC_CODE
    extends StObject
       with ResponseCode
  /* "PPAU" */ val MCC_CODE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.MCC_CODE & String = js.native
  
  @js.native
  sealed trait MERCHANT_NOT_REGISTERED
    extends StObject
       with ResponseCode
  /* "PPRR" */ val MERCHANT_NOT_REGISTERED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.MERCHANT_NOT_REGISTERED & String = js.native
  
  @js.native
  sealed trait NETWORK_ERROR
    extends StObject
       with ResponseCode
  /* "PPNT" */ val NETWORK_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.NETWORK_ERROR & String = js.native
  
  @js.native
  sealed trait NOT_SUPPORTED_NRC
    extends StObject
       with ResponseCode
  /* "PPNC" */ val NOT_SUPPORTED_NRC: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.NOT_SUPPORTED_NRC & String = js.native
  
  @js.native
  sealed trait NO_PHONE_FOR_DCC_TRANSACTION
    extends StObject
       with ResponseCode
  /* "PPPH" */ val NO_PHONE_FOR_DCC_TRANSACTION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.NO_PHONE_FOR_DCC_TRANSACTION & String = js.native
  
  @js.native
  sealed trait PARTIAL_AUTHORIZATION
    extends StObject
       with ResponseCode
  /* "1000" */ val PARTIAL_AUTHORIZATION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PARTIAL_AUTHORIZATION & String = js.native
  
  @js.native
  sealed trait PICKUP_CARD_SPECIAL_CONDITIONS
    extends StObject
       with ResponseCode
  /* "5150" */ val PICKUP_CARD_SPECIAL_CONDITIONS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PICKUP_CARD_SPECIAL_CONDITIONS & String = js.native
  
  @js.native
  sealed trait PIN_ERROR
    extends StObject
       with ResponseCode
  /* "7900" */ val PIN_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PIN_ERROR & String = js.native
  
  @js.native
  sealed trait PPMD
    extends StObject
       with ResponseCode
  /* "PPMD" */ val PPMD: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PPMD & String = js.native
  
  @js.native
  sealed trait PROCESSOR_SYSTEM_ERROR
    extends StObject
       with ResponseCode
  /* "8000" */ val PROCESSOR_SYSTEM_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PROCESSOR_SYSTEM_ERROR & String = js.native
  
  @js.native
  sealed trait QUASI_CASH_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPQC" */ val QUASI_CASH_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.QUASI_CASH_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait REFERRAL
    extends StObject
       with ResponseCode
  /* "0100" */ val REFERRAL: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.REFERRAL & String = js.native
  
  @js.native
  sealed trait REFUSED_CARD
    extends StObject
       with ResponseCode
  /* "9540" */ val REFUSED_CARD: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.REFUSED_CARD & String = js.native
  
  @js.native
  sealed trait RESTRICTED_FUNDING_INSTRUMENT
    extends StObject
       with ResponseCode
  /* "PPFR" */ val RESTRICTED_FUNDING_INSTRUMENT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.RESTRICTED_FUNDING_INSTRUMENT & String = js.native
  
  @js.native
  sealed trait RETRIABLE_COMMUNICATION_ERROR
    extends StObject
       with ResponseCode
  /* "8110" */ val RETRIABLE_COMMUNICATION_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.RETRIABLE_COMMUNICATION_ERROR & String = js.native
  
  @js.native
  sealed trait REVERSAL_REJECTED
    extends StObject
       with ResponseCode
  /* "5800" */ val REVERSAL_REJECTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.REVERSAL_REJECTED & String = js.native
  
  @js.native
  sealed trait SECURE_ERROR_3DS
    extends StObject
       with ResponseCode
  /* "PPD3" */ val SECURE_ERROR_3DS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SECURE_ERROR_3DS & String = js.native
  
  @js.native
  sealed trait SECURITY_VIOLATION
    extends StObject
       with ResponseCode
  /* "9510" */ val SECURITY_VIOLATION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SECURITY_VIOLATION & String = js.native
  
  @js.native
  sealed trait SOFT_AVS
    extends StObject
       with ResponseCode
  /* "5190" */ val SOFT_AVS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SOFT_AVS & String = js.native
  
  @js.native
  sealed trait STATUS_DESCRIPTION
    extends StObject
       with ResponseCode
  /* "PPSD" */ val STATUS_DESCRIPTION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.STATUS_DESCRIPTION & String = js.native
  
  @js.native
  sealed trait SUSPECTED_FRAUD
    extends StObject
       with ResponseCode
  /* "9500" */ val SUSPECTED_FRAUD: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SUSPECTED_FRAUD & String = js.native
  
  @js.native
  sealed trait SYSTEM_UNAVAILABLE
    extends StObject
       with ResponseCode
  /* "8220" */ val SYSTEM_UNAVAILABLE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SYSTEM_UNAVAILABLE & String = js.native
  
  @js.native
  sealed trait TRANSACTION_CANNOT_BE_COMPLETED
    extends StObject
       with ResponseCode
  /* "1393" */ val TRANSACTION_CANNOT_BE_COMPLETED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.TRANSACTION_CANNOT_BE_COMPLETED & String = js.native
  
  @js.native
  sealed trait TRANSACTION_NOT_PERMITTED
    extends StObject
       with ResponseCode
  /* "5700" */ val TRANSACTION_NOT_PERMITTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.TRANSACTION_NOT_PERMITTED & String = js.native
  
  @js.native
  sealed trait TRANSACTION_TYPE_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPTT" */ val TRANSACTION_TYPE_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.TRANSACTION_TYPE_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait UNAUTHORIZED_USER
    extends StObject
       with ResponseCode
  /* "5160" */ val UNAUTHORIZED_USER: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNAUTHORIZED_USER & String = js.native
  
  @js.native
  sealed trait UNRECOGNIZED_RESPONSE_CODE
    extends StObject
       with ResponseCode
  /* "9600" */ val UNRECOGNIZED_RESPONSE_CODE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNRECOGNIZED_RESPONSE_CODE & String = js.native
  
  @js.native
  sealed trait UNSUPPORTED_OPERATION
    extends StObject
       with ResponseCode
  /* "8030" */ val UNSUPPORTED_OPERATION: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORTED_OPERATION & String = js.native
  
  @js.native
  sealed trait UNSUPPORTED_REVERSAL
    extends StObject
       with ResponseCode
  /* "PPUR" */ val UNSUPPORTED_REVERSAL: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORTED_REVERSAL & String = js.native
  
  @js.native
  sealed trait UNSUPPORT_ENTITY
    extends StObject
       with ResponseCode
  /* "PPUE" */ val UNSUPPORT_ENTITY: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_ENTITY & String = js.native
  
  @js.native
  sealed trait UNSUPPORT_INSTALLMENT
    extends StObject
       with ResponseCode
  /* "PPUI" */ val UNSUPPORT_INSTALLMENT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_INSTALLMENT & String = js.native
  
  @js.native
  sealed trait UNSUPPORT_POS_FLAG
    extends StObject
       with ResponseCode
  /* "PPUP" */ val UNSUPPORT_POS_FLAG: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_POS_FLAG & String = js.native
  
  @js.native
  sealed trait UNSUPPORT_REFUND_ON_PENDING_BC
    extends StObject
       with ResponseCode
  /* "PPRE" */ val UNSUPPORT_REFUND_ON_PENDING_BC: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_REFUND_ON_PENDING_BC & String = js.native
  
  @js.native
  sealed trait USER_NOT_AUTHORIZED
    extends StObject
       with ResponseCode
  /* "PPUA" */ val USER_NOT_AUTHORIZED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.USER_NOT_AUTHORIZED & String = js.native
  
  @js.native
  sealed trait VALIDATE_CURRENCY
    extends StObject
       with ResponseCode
  /* "PPVC" */ val VALIDATE_CURRENCY: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VALIDATE_CURRENCY & String = js.native
  
  @js.native
  sealed trait VALIDATION_ERROR
    extends StObject
       with ResponseCode
  /* "PPVE" */ val VALIDATION_ERROR: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VALIDATION_ERROR & String = js.native
  
  @js.native
  sealed trait VERIFICATION_TOKEN_EXPIRED
    extends StObject
       with ResponseCode
  /* "PPTE" */ val VERIFICATION_TOKEN_EXPIRED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VERIFICATION_TOKEN_EXPIRED & String = js.native
  
  @js.native
  sealed trait VERIFICATION_TOKEN_REVOKED
    extends StObject
       with ResponseCode
  /* "PPTR" */ val VERIFICATION_TOKEN_REVOKED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VERIFICATION_TOKEN_REVOKED & String = js.native
  
  @js.native
  sealed trait VIRTUAL_TERMINAL_UNSUPPORTED
    extends StObject
       with ResponseCode
  /* "PPVT" */ val VIRTUAL_TERMINAL_UNSUPPORTED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VIRTUAL_TERMINAL_UNSUPPORTED & String = js.native
}
